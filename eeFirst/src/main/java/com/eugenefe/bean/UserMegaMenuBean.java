package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections4.map.HashedMap;
import org.primefaces.model.menu.DefaultMenuColumn;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuElement;
import org.primefaces.model.menu.MenuModel;
import org.slf4j.Logger;

import com.eugenefe.entity.takion.WebUserMenuMulti;
import com.eugenefe.service.UserMenuDbService;

@Named
//@ViewScoped
@SessionScoped
public class UserMegaMenuBean implements Serializable {
	@Inject		
	private Logger logger;
	@Inject
	private UserMenuDbService dbService;
	@Inject 
	private LoginBean loginBean;
	private String userId;
	private ResourceBundle msg;
	private MenuModel megaMenuModel ;

	private List<WebUserMenuMulti> megaMenuList = new ArrayList<WebUserMenuMulti>();
	
	
	public UserMegaMenuBean() {
		System.out.println("UserMegaMenuBean Gen");
	}
	
	public MenuModel getMegaMenuModel() {
		return megaMenuModel;
	}

	public void setMegaMenuModel(MenuModel megaMenuModel) {
		this.megaMenuModel = megaMenuModel;
	}
	
	@PostConstruct
	public void init(){
		FacesContext context = FacesContext.getCurrentInstance();
		msg = context.getApplication().getResourceBundle(context, "msg");
		logger.info("PostConstruct UserMegaMenuBean");
		userId = loginBean.getUserId();
		megaMenuList = dbService.fetchUserMenuList(userId);

		megaMenuModel = generateMegaMenuModel(megaMenuList);
	}
	
	public MenuModel generateMegaMenuModel(List<WebUserMenuMulti> menuList){
		Map<String, MenuElement> tempMap = new HashedMap<String, MenuElement>();
		
		DefaultMenuItem menuItem;
		DefaultSubMenu menuGroup ;
		DefaultSubMenu menuColumn ;
		DefaultMenuColumn col;
		String tempHead;
		String tempSub;
		String tempCol;
		

		MenuModel menuModel = new DefaultMenuModel();
		
		for(WebUserMenuMulti aa : menuList){
			if(aa.getMenuGroup() == null || aa.getMenuGroup().isEmpty()){
				tempSub = msg.containsKey(aa.getMenuName().trim())? msg.getString(aa.getMenuName().trim()): aa.getMenuName().trim() ;
				menuItem = new DefaultMenuItem(tempSub);
				menuItem.setIcon(aa.getIconName());
				menuItem.setOutcome(aa.getMenu().getMenuUrl());
				menuModel.addElement(menuItem);
				
			}
			else {
				tempHead = msg.containsKey(aa.getMenuGroup().trim())? msg.getString(aa.getMenuGroup().trim()): aa.getMenuGroup().trim() ;
				tempCol = aa.getMenuGroup()+ aa.getMenuColumn();
				if(tempMap.containsKey(aa.getMenuGroup())){
					menuGroup = (DefaultSubMenu)tempMap.get(aa.getMenuGroup());
				}
				else{
					menuGroup = new DefaultSubMenu(tempHead);
					menuGroup.setIcon(aa.getIconName());
					
					menuModel.addElement(menuGroup);
					tempMap.put(aa.getMenuGroup(), menuGroup);
				}	
				
				if( tempMap.containsKey(tempCol)){
					menuColumn = (DefaultSubMenu)tempMap.get(tempCol);
					col = (DefaultMenuColumn)tempMap.get(tempCol+"col");
				}
				else{
					menuColumn = new DefaultSubMenu(tempCol);
					menuColumn.setStyle("display:none");
					col = new DefaultMenuColumn();
					col.addElement(menuColumn);
					menuGroup.addElement(col);
					
					tempMap.put(tempCol+"col", col);
					tempMap.put(tempCol, menuColumn);
				}
				tempSub =  msg.containsKey(aa.getMenuName())? msg.getString(aa.getMenuName()): aa.getMenuName().trim() ;
				menuItem = new DefaultMenuItem(tempSub);
				menuItem.setOutcome(aa.getMenu().getMenuUrl());
				menuColumn.addElement(menuItem);
			}
			
		}
		return menuModel;
	}
	
	
}
