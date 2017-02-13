package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ResourceBundle;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuItem;
import org.primefaces.model.menu.MenuModel;
import org.slf4j.Logger;

import com.eugenefe.service.UserMenuDbService;

@Named
@ViewScoped
//@SessionScoped
public class ContextMenuBean implements Serializable {
	@Inject		
	private Logger logger;

	@Inject
	private UserMenuDbService dbService;
	
	private ResourceBundle msg;
	private MenuModel pivotSelectorMenu ;
	
	public ContextMenuBean() {
		System.out.println("ContextMenuBean Gen");
		pivotSelectorMenu =  new DefaultMenuModel();
	}
	
	
	public void generatePivotSelectorMenu(SelectEvent event){
		
		MenuItem moveToReport = new DefaultMenuItem("moveToReport");
		MenuItem moveToColumn = new DefaultMenuItem("moveToColumn");
		MenuItem moveToRow    = new DefaultMenuItem("moveToRow");
		MenuItem moveToContent = new DefaultMenuItem("moveToContent");
		MenuItem remove = new DefaultMenuItem();
		
//		moveToReport.se
		pivotSelectorMenu.addElement(remove);
		pivotSelectorMenu.addElement(moveToReport);
		pivotSelectorMenu.addElement(moveToColumn);
		pivotSelectorMenu.addElement(moveToRow);
		pivotSelectorMenu.addElement(moveToContent);
		
		logger.info("PivotSelectorContextMenu :{},{}");
	}


//********************* getter and setter *************************
	public MenuModel getPivotSelectorMenu() {
		return pivotSelectorMenu;
	}


	public void setPivotSelectorMenu(MenuModel pivotSelectorMenu) {
		this.pivotSelectorMenu = pivotSelectorMenu;
	}
	
	
}	
	

