package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;

import com.eugenefe.entity.takion.MenuMst;
import com.eugenefe.entity.takion.WebUserMenuMulti;
import com.eugenefe.model.MegaMenu;
import com.eugenefe.qualifiers.LoginEvent;
import com.eugenefe.service.UserMenuDbService;

@Named
//@ViewScoped
@SessionScoped
public class UserMenuBean implements Serializable {
	@Inject		
	private Logger logger;
	
	@Inject
	private UserMenuDbService dbService;
	
	@Inject 
	private MenuMstBean menuMstBean;
	
	@Inject
	private UserMegaMenuBean userMegaMenuBean;
	
	 
//	@Inject 
//	@MessageBundle
	private ResourceBundle msg;
	
	@Inject
	private LoginBean loginBean;
	
	private String	userId;
	private List<WebUserMenuMulti> userMenuList = new ArrayList<WebUserMenuMulti>();
	private List<WebUserMenuMulti> dirtyList = new ArrayList<WebUserMenuMulti>();
	
	private DataTable dataTable;
	private int rowIndex;
	private WebUserMenuMulti selectedMenu;
	
	public UserMenuBean() {
		System.out.println("UserMenuBean Gen");
	}
	
	@PostConstruct
	public void create(){
		userId = loginBean.getLoginUser().getUserId();
		userMenuList = dbService.fetchUserMenuList(userId);
		logger.info("Post UserMenuBean : {},{}", userId, userMenuList.size());
		
	}
	public void onLoginEvent(@Observes @LoginEvent String userId){
		userMenuList = dbService.fetchUserMenuList(userId);
		logger.info("On Login Event : {},{}", userId, userMenuList.size());
	}
	
	public void save(){
		for(WebUserMenuMulti aa: userMenuList){
			dbService.merge(aa);
		}
		
		userMegaMenuBean.setMegaMenuModel(userMegaMenuBean.generateMegaMenuModel(userMenuList));
	}
	
	public void fetchDefault(){
		List<WebUserMenuMulti> newMenuList = dbService.fetchUserMenuList("guest");
		
		logger.info("default Menu : {},{}", userId, userMenuList.size());
		for(WebUserMenuMulti aa: userMenuList){
			dbService.remove(aa);
		}
		userMenuList.clear();
		logger.info("default Menu1 : {},{}", userId, userMenuList.size());
		
		for(WebUserMenuMulti aa: newMenuList){
			aa.setSeqNo(null);
			aa.setUserId(userId);
			dbService.persist(aa);
			userMenuList.add(aa);
		}
		userMegaMenuBean.setMegaMenuModel(userMegaMenuBean.generateMegaMenuModel(userMenuList));
	}
	
	public void addRow(){
		WebUserMenuMulti newMenu = new WebUserMenuMulti();
		newMenu.setUserId(userId);
		newMenu.setMenuId("insert MenuId...");
		newMenu.setMenuName("insert MenuName...");
		newMenu.setMenuGroup(selectedMenu.getMenuGroup());
		newMenu.setMenuColumn(selectedMenu.getMenuColumn());
		newMenu.setIconName(selectedMenu.getIconName());
//		newMenu.setMenu(menu);
		
		userMenuList.add(rowIndex+1, newMenu);
		
	}
	public void deleteRow(){
		logger.info("delete selected Menu : {}", selectedMenu.getMenuId());
		dbService.remove(selectedMenu);
		userMenuList.remove(selectedMenu);
		
		userMegaMenuBean.setMegaMenuModel(userMegaMenuBean.generateMegaMenuModel(userMenuList));
	}
	
	
	public void onShowContext(SelectEvent event){
		dataTable = (DataTable)event.getSource();
		selectedMenu = (WebUserMenuMulti)event.getObject();
		rowIndex = userMenuList.indexOf(selectedMenu);
		
		logger.info("Context Menu Row : {},{}", ((DataTable)event.getSource()), ((MegaMenu)event.getObject()).getMenuId());
		
	}
	public void onEdit(CellEditEvent event) {
//        Object oldValue = event.getOldValue();
//        Object newValue = event.getNewValue();
		
        for(MenuMst zz : menuMstBean.getMenuList()){
        	if(zz.getMenuId().equals(userMenuList.get(event.getRowIndex()).getMenuId())){
        		userMenuList.get(event.getRowIndex()).setMenu(zz);
//        		logger.info("aaa: {},{}",userMenuList.get(event.getRowIndex()).getMenuId(),  userMenuList.get(event.getRowIndex()).getMenu().getMenuId());
        		break;
        	}
        }
        dirtyList.add(userMenuList.get(event.getRowIndex())); 
        logger.info("aaa: {}",event.getRowIndex());
    }

//	*******************getter and setter*************
	public List<WebUserMenuMulti> getUserMenuList() {
		return userMenuList;
	}

	public void setUserMenuList(List<WebUserMenuMulti> userMenuList) {
		this.userMenuList = userMenuList;
	}


	
	
}
