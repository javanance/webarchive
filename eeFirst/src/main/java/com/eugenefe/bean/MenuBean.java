package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections4.map.HashedMap;
import org.omnifaces.cdi.Param;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.menu.DefaultMenuColumn;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuElement;
import org.primefaces.model.menu.MenuModel;
import org.slf4j.Logger;

import com.eugenefe.entity.takion.WebUser;
import com.eugenefe.model.DataTableColumn;
import com.eugenefe.model.MegaMenu;
import com.eugenefe.qualifiers.MessageBundle;
import com.eugenefe.service.MegaMenuDbService;

@Named
@ViewScoped
//@SessionScoped
public class MenuBean implements Serializable {
	@Inject		
	private Logger logger;
	
	@Inject
	private MegaMenuDbService dbService;
	
//	@Inject 
//	@MessageBundle
	private ResourceBundle msg;
	
	private FacesContext ctx;
	
	private MenuModel megaMenuModel ;

	private List<MegaMenu> megaMenuList ;
	private List<MegaMenu> dirtyList= new ArrayList<MegaMenu>();
	
	private List<DataTableColumn> tableColumnList;
	
	private DataTable dataTable;
	private int rowIndex;
	private MegaMenu selectedMenu;
	
	public MenuBean() {
		System.out.println("MenuBean Gen");
	}
	
	@PostConstruct
	public void create(){
		FacesContext context = FacesContext.getCurrentInstance();
		msg = context.getApplication().getResourceBundle(context, "msg");
		logger.info("PostConstruct MenuBean");
		Map<String, MenuElement> tempMap = new HashedMap<String, MenuElement>();
		
		DefaultMenuItem menuItem;
		DefaultSubMenu menuGroup ;
		DefaultSubMenu menuColumn ;
		DefaultMenuColumn col;
		String tempHead;
		String tempSub;
		String tempCol;
		
		tableColumnList = dbService.fetchMeta("megaMenu");
		megaMenuList = dbService.fetchMegaMenu();

		megaMenuModel = new DefaultMenuModel();
		
		for(MegaMenu aa : megaMenuList){
			if(aa.getMenuGroup() == null || aa.getMenuGroup().isEmpty()){
				tempSub = msg.containsKey(aa.getMenuName().trim())? msg.getString(aa.getMenuName().trim()): aa.getMenuName().trim() ;
				menuItem = new DefaultMenuItem(tempSub);
				menuItem.setIcon(aa.getIconName());
				menuItem.setOutcome(aa.getMenuUrl());
				megaMenuModel.addElement(menuItem);
				
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
					
					megaMenuModel.addElement(menuGroup);
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
				menuItem.setOutcome(aa.getMenuUrl());
				menuColumn.addElement(menuItem);
			}
			
		}
	}
	
	public void save(){
//		Session session = entityManager.unwrap(Session.class);
//		logger.info("Dirty  : {}, {}", session.isDirty(), session.contains(megaMenuList.get(2)));
//		Transaction tx = session.getTransaction();
//		tx.begin();
//		session.saveOrUpdate(megaMenuList.get(2));
//		tx.commit();
		
//		dbService.merge(megaMenuList.get(2));
		for(MegaMenu aa : dirtyList){
			dbService.merge(aa);
			logger.info("Save : {}, {}", aa.getMenuId(), aa.getMenuName());
		}
	}
	
	public void addRow(){
		MegaMenu newMenu = new MegaMenu();
		newMenu.setMenuId("insert MenuId");
		newMenu.setMenuGroup(selectedMenu.getMenuGroup());
		newMenu.setMenuColumn(selectedMenu.getMenuColumn());
		newMenu.setIconName(selectedMenu.getIconName());
		
		megaMenuList.add(rowIndex+1, newMenu);
	}
	public void deleteRow(){
		logger.info("delete selected Menu : {}", selectedMenu.getMenuId());
		dbService.remove(selectedMenu);
		megaMenuList.remove(selectedMenu);
		
	}
	
	
	public void onSelect(SelectEvent event){
		dataTable = (DataTable)event.getSource();
		selectedMenu = (MegaMenu)event.getObject();
		rowIndex = megaMenuList.indexOf(selectedMenu);
		
		logger.info("Context Menu Row : {},{}", ((DataTable)event.getSource()), ((MegaMenu)event.getObject()).getMenuId());
		
	}
	public void onEdit(CellEditEvent event) {
//        Object oldValue = event.getOldValue();
//        Object newValue = event.getNewValue();
        
        dirtyList.add(megaMenuList.get(event.getRowIndex())); 
        logger.info("aaa: {}",event.getRowIndex());
    }
	
	
	
//	*******************getter and setter*************
	
	public MenuModel getMegaMenuModel() {
		return megaMenuModel;
	}

	public List<MegaMenu> getMegaMenuList() {
		return megaMenuList;
	}

	public void setMegaMenuList(List<MegaMenu> megaMenuList) {
		this.megaMenuList = megaMenuList;
	}

	public void setMegaMenuModel(MenuModel megaMenuModel) {
		this.megaMenuModel = megaMenuModel;
	}

	public List<DataTableColumn> getTableColumnList() {
		return tableColumnList;
	}

	public void setTableColumnList(List<DataTableColumn> tableColumnList) {
		this.tableColumnList = tableColumnList;
	}

	public List<MegaMenu> getDirtyList() {
		return dirtyList;
	}

	public void setDirtyList(List<MegaMenu> dirtyList) {
		this.dirtyList = dirtyList;
	}
	
	
}
