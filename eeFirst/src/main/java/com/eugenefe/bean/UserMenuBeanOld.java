package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;

import com.eugenefe.entity.takion.WebUser;
import com.eugenefe.entity.takion.WebUserMenu;
import com.eugenefe.service.MegaMenuDbService;
import com.eugenefe.service.UserDbService;

@Named
@ViewScoped
//@SessionScoped
public class UserMenuBeanOld implements Serializable {
	@Inject		
	private Logger logger;
	
	@Inject
	private UserDbService dbService;
	
//	@Inject 
//	@MessageBundle
	private ResourceBundle msg;
	
	@Inject
	private LoginBean loginBean;
	
	private WebUser loginUser;
	
	
	public UserMenuBeanOld() {
		System.out.println("UserMenuBean Gen");
	}
	
	@PostConstruct
	public void create(){
		loginUser = loginBean.getLoginUser();
		logger.info("Loggin User : {}, {}", loginBean.getLoginUser().getUserName(), loginUser.getUserMenuList().size());
		logger.info("Loggin User : {}, {}", loginBean.getLoginUser().getUserMenuList().size(), loginUser.getUserMenuList().size());
	}
	
	public void save(){
		logger.info("save : {},{}", loginUser.getUserId(), loginUser.getUserMenuList().size());
		for(WebUserMenu aa : loginUser.getUserMenuList()){
			aa.setUser(loginUser);
			logger.info("User Menu : {}, {}",  aa.getMenuName());
			logger.info("User Menu : {}, {}",  aa.getMenuName(), aa.getUser().getUserId());
//			logger.info("User Menu : {}, {}",  aa.getMenuName(), aa.getMenu().getMenuId());
		}
		dbService.merge(loginUser);
	}
	
	public void addRow(){
		/*MegaMenu newMenu = new MegaMenu();
		newMenu.setMenuId("insert MenuId");
		newMenu.setMenuGroup(selectedMenu.getMenuGroup());
		newMenu.setMenuColumn(selectedMenu.getMenuColumn());
		newMenu.setIconName(selectedMenu.getIconName());
		
		megaMenuList.add(rowIndex+1, newMenu);*/
	}
	public void deleteRow(){
		/*logger.info("delete selected Menu : {}", selectedMenu.getMenuId());
		dbService.remove(selectedMenu);
		megaMenuList.remove(selectedMenu);*/
		
	}
	
	
	public void onSelect(SelectEvent event){
		/*dataTable = (DataTable)event.getSource();
		selectedMenu = (MegaMenu)event.getObject();
		rowIndex = megaMenuList.indexOf(selectedMenu);
		
		logger.info("Context Menu Row : {},{}", ((DataTable)event.getSource()), ((MegaMenu)event.getObject()).getMenuId());*/
		
	}
	public void onEdit(CellEditEvent event) {
//        Object oldValue = event.getOldValue();
//        Object newValue = event.getNewValue();
        
      /*  dirtyList.add(megaMenuList.get(event.getRowIndex())); 
        logger.info("aaa: {}",event.getRowIndex());*/
    }

//	*******************getter and setter*************

	public WebUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(WebUser loginUser) {
		this.loginUser = loginUser;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}
	
	
	
	
	
	
}
