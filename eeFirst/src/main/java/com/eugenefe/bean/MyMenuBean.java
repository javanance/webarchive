package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.omnifaces.cdi.Param;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;
import org.slf4j.Logger;

import com.eugenefe.qualifiers.SecondEm;

@Named
//@SessionScoped
public class MyMenuBean implements Serializable {
	@Inject		private Logger logger;
	@Inject	@SecondEm	private EntityManager entityManager;
	
//	@Inject @Param(pathIndex=0)
//	private String selectedTableName;
	
	private List<String> myMenuList;

	private MenuModel model;
	
	@PostConstruct
	public void init(){
		
		myMenuList = new ArrayList<String>();
		myMenuList.add("NCM_MST_PROD_TYPE");
		myMenuList.add("NCM_MST_SAA_CODE");
		
		/* model = new DefaultMenuModel();
     
        //First submenu
        DefaultSubMenu firstSubmenu = new DefaultSubMenu("Dynamic Submenu");
         
        DefaultMenuItem item = new DefaultMenuItem("External");
        item.setOutcome("/v902DataNavigation/NCM_MST_SAA_CODE");
        item.setIcon("ui-icon-home");
        firstSubmenu.addElement(item);
         
        
        DefaultMenuItem item2 = new DefaultMenuItem("External2");
        item2.setOutcome("/v902DataNavigation/NCM_MST_PROD_TYPE");
        item2.setIcon("ui-icon-home");
        
        firstSubmenu.addElement(item2);
         
        model.addElement(firstSubmenu);
        */
        System.out.println("MyMenuBean Init" );
	}
	
	 public void addMyMenu(){
		
		 
	 }
	 
	 
	 
	 
//	 ***********************getter and setter********************
	public List<String> getMyMenuList() {
		return myMenuList;
	}

	public void setMyMenuList(List<String> myMenuList) {
		this.myMenuList = myMenuList;
	}

	public MenuModel getModel() {
		return model;
	}

	public void setModel(MenuModel model) {
		this.model = model;
	}
	
	
	
	
}
