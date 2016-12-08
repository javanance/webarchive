package com.eugenefe.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.Param;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.qualifiers.SelectedTable;
import com.eugenefe.service.DataBaseService;

//import org.jboss.seam.framework.Query;

@Named
@ViewScoped
//@RequestScoped
public class DataViewerBean implements Serializable{
	@Inject 	
	private Logger logger;
	
	@Inject
	private DataBaseService dbService;
	
	@Inject @Param(pathIndex=0)
	private String selectedTableName;
	
	@Inject @Param(pathIndex=1)
	private TreeNode selectedNode;
	
	public DataViewerBean() {
		System.out.println("Construction DataViewerBean_" );
	}
	
//	@PostConstruct
//	public void init(){
//		logger.info("PostConstruct :{}", selectedTableName);
//		if(selectedTableName!=null){
//			dbService.getSelectedTable().setTableName(selectedTableName);
//			onChangeEvent(selectedTableName);
//		}
//	}
	
	@PostConstruct
	public void init(){
		logger.info("PostConstruct :{}", selectedNode);
		if(selectedNode!=null){
			dbService.getSelectedTable().setTableName(selectedNode.getData().toString());
			onChangeEvent(selectedNode.getData().toString());
		}
	}
	
	public void testPretty(){	
		String selectedTableName = "NCM_MST_PROD_TYPE";
		dbService.getSelectedTable().setTableName(selectedTableName);
//		logger.info("Selected Table: {},{}", dbService.getSelectedTable().getTableName());
		logger.info("Selected Table: {},{}", selectedTableName, dbService.getSelectedTable().getTableName());
		dbService.setTableColumns(dbService.generateColumns(selectedTableName));
		dbService.setTableContents(dbService.generateTableContents(selectedTableName));
	}
	
	public void onChangeEvent1(TreeNode selectedTabl){	
		String selectedTableName = selectedTabl.getData().toString();
		dbService.getSelectedTable().setTableName(selectedTableName);
//		logger.info("Selected Table: {},{}", dbService.getSelectedTable().getTableName());
		logger.info("Selected Table: {},{}", selectedTableName, dbService.getSelectedTable().getTableName());
		dbService.setTableColumns(dbService.generateColumns(selectedTableName));
		dbService.setTableContents(dbService.generateTableContents(selectedTableName));
	}
	
//	public void onChangeEvent(String selectedTableName){
	public void onChangeEvent(@Observes @SelectedTable String selectedTableName){	
//		this.selectedTableName = selectedTableName;
		dbService.getSelectedTable().setTableName(selectedTableName);
//		logger.info("Selected Table: {},{}", dbService.getSelectedTable().getTableName());
		logger.info("Selected Tableaaaaaaaaaaaaaaaaaaaaa: {},{}", selectedTableName, dbService.getSelectedTable().getTableName());
		dbService.setTableColumns(dbService.generateColumns(selectedTableName));
		dbService.setTableContents(dbService.generateTableContents(selectedTableName));
	}
	
//	*************************getter and setter***********************************************
	public DataBaseService getDbService() {
//		logger.info("getDbService : {}, {}", dbService.getSelectedTable().getTableName());
		return dbService;
	}

	public void setDbService(DataBaseService dbService) {
		this.dbService = dbService;
	}

	

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

	public String getSelectedTableName() {
		return selectedTableName;
	}

	public void setSelectedTableName(String selectedTableName) {
		this.selectedTableName = selectedTableName;
	}

	
}
