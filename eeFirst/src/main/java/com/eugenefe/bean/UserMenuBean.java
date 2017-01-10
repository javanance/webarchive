package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;

import com.eugenefe.entity.takion.MenuMst;
import com.eugenefe.entity.takion.WebUser;
import com.eugenefe.entity.takion.WebUserMenuMulti;
import com.eugenefe.qualifiers.EventUserMenu;
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
	@EventUserMenu
	private Event<List<WebUserMenuMulti>> eventUserMenu;
	
//	@Inject 
//	@MessageBundle
	private ResourceBundle msg;
	
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
//		userId = loginBean.getLoginUser().getUserId();
//		userId ="guest";
		userMenuList = dbService.fetchUserMenuList(userId);
		logger.info("Post UserMenuBean : {},{}", userId, userMenuList.size());
		
	}
	
	public void onUserChange(@Observes @LoginEvent WebUser loginUser){
		this.userId = loginUser.getUserId();
		userMenuList = dbService.fetchUserMenuList(userId);
		logger.info("On User Change Menu Table : {},{}", userId, userMenuList.size());
	}
	
	public void save(){
		for(WebUserMenuMulti aa: userMenuList){
			dbService.merge(aa);
		}
		eventUserMenu.fire(userMenuList);
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
		eventUserMenu.fire(userMenuList);
	}
	
	public void addRow(){
		WebUserMenuMulti newMenu = new WebUserMenuMulti();
		newMenu.setUserId(userId);
		
		newMenu.setMenuId("insert MenuId...");
		newMenu.setMenuName("insert MenuName...");
		newMenu.setMenuGroupOrder(selectedMenu.getMenuGroupOrder());
		newMenu.setMenuGroup(selectedMenu.getMenuGroup());
		newMenu.setMenuColumn(selectedMenu.getMenuColumn());
		newMenu.setIconName(selectedMenu.getIconName());
//		newMenu.setMenu(menu);
		
		userMenuList.add(rowIndex+1, newMenu);
//		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Add :", newMenu.getMenuName() + "for " + userId));
		
	}
	public void deleteRow(){
		logger.info("delete selected Menu : {}", selectedMenu.getMenuId());
		dbService.remove(selectedMenu);
		userMenuList.remove(selectedMenu);
//		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("delete1 :", selectedMenu.getMenuId()));
		eventUserMenu.fire(userMenuList);
	}
	
	public void addNavigationMenu(String tableName){
		logger.info("Add Navigation Menu : {}", userMenuList.size());
		for(WebUserMenuMulti aa : userMenuList){
			if("v902".equals(aa.getMenuId())){
				selectedMenu = aa;
				break;
			}
		}
		WebUserMenuMulti newMenu = new WebUserMenuMulti();
		newMenu.setUserId(userId);
		
		newMenu.setMenuId("v902");
		newMenu.setMenuName(tableName);
		newMenu.setMenuGroupOrder(selectedMenu.getMenuGroupOrder());
		newMenu.setMenuGroup(selectedMenu.getMenuGroup());
		newMenu.setMenuColumn(selectedMenu.getMenuColumn());
		newMenu.setIconName(selectedMenu.getIconName());
		newMenu.setMenu(selectedMenu.getMenu());
		newMenu.setUrlParam(tableName);
		
		userMenuList.add(newMenu);
		logger.info("Add Navigation Menu12 : {}, {}", selectedMenu.getMenuId(), dbService.toString());
		dbService.merge(newMenu);
		
//		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Add Navi:", userId));
		eventUserMenu.fire(userMenuList);
		logger.info("Add Navigation Menu1 : {}", userMenuList.size());
	}
	
	public void onShowContext(SelectEvent event){
		dataTable = (DataTable)event.getSource();
		selectedMenu = (WebUserMenuMulti)event.getObject();
		rowIndex = userMenuList.indexOf(selectedMenu);
		
		logger.info("Context Menu Row : {},{}", ((DataTable)event.getSource()), ((WebUserMenuMulti)event.getObject()).getMenuId());
		
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
