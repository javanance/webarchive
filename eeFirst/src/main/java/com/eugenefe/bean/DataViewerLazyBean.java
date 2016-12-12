package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.cdi.Param;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.TreeNode;
import org.primefaces.model.Visibility;
import org.slf4j.Logger;

import com.eugenefe.model.LazyModelNavigatable;
import com.eugenefe.model.TableColumn;
import com.eugenefe.ncm.NcmErpTxIfr;
import com.eugenefe.qualifiers.SelectedTable;
import com.eugenefe.service.DataBaseService;
import com.eugenefe.util.Navigatable;

//import org.jboss.seam.framework.Query;

@Named
@ViewScoped
//@RequestScoped
public class DataViewerLazyBean implements Serializable{
	@Inject 	
	private Logger logger;
	
	@Inject
	private DataBaseService dbService;
	
	@Inject @Param(pathIndex=0)
	private String selectedTableName;
	
//	@Inject @Param(pathIndex=1)
	private TreeNode selectedNode;
	
	private LazyDataModel<Navigatable> navi;
//	private LazyModelTxIfr txIfr;
	
	private LazyDataModel<NcmErpTxIfr> txIfr;
	
	private Navigatable selectedRow;
	
	
	private List<Boolean> visibleColumns ;
	
	public DataViewerLazyBean() {
		System.out.println("Construction DataViewerLazyBean_" );
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
		if(selectedTableName ==null){
			selectedTableName ="NCM_MST_SAA_CODE";
		}
		logger.info("PostConstruct :{}", selectedNode);
		if(selectedNode!=null){
			dbService.getSelectedTable().setTableName(selectedNode.getData().toString());
			onChangeEvent(selectedNode.getData().toString());
		}
//		dbService.setTableColumns(dbService.generateColumns("NCM_ERP_TX_IFR"));
//		txIfr = new LazyModelTxIfr(dbService.generateTableLazyContents1("NCM_ERP_TX_IFR"));
		dbService.setTableColumns(dbService.generateColumns(selectedTableName));
		navi = new LazyModelNavigatable<Navigatable>(dbService.generateTableLazyContents(selectedTableName));
		logger.info("PostConstruct 1:{}, {}", navi, txIfr);
		setVisible();
//		
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
		this.selectedTableName = selectedTableName;
		dbService.getSelectedTable().setTableName(selectedTableName);
//		logger.info("Selected Table: {},{}", dbService.getSelectedTable().getTableName());
		logger.info("Selected Tableaaaaaaaaaaaaaaaaaaaaa: {},{}", selectedTableName, dbService.getSelectedTable().getTableName());
		dbService.setTableColumns(dbService.generateColumns(selectedTableName));
//		dbService.setTableContents(dbService.generateTableContents(selectedTableName));
		
		logger.info("Selected Naviiiiiiiiiiiiiiiiiiiiiii: {},{}", dbService.generateTableLazyContents(selectedTableName).size(), navi.getPageSize());
		
//		txIfr = new LazyModelTxIfr(dbService.generateTableLazyContents1(selectedTableName));
		navi = new LazyModelNavigatable<Navigatable>(dbService.generateTableLazyContents(selectedTableName));
		setVisible();
	}
	
	
	 public void onToggle(ToggleEvent e) {
		 visibleColumns.set((Integer) e.getData(), e.getVisibility() == Visibility.VISIBLE);
	 }
	 
	 private void setVisible(){
		 visibleColumns = new ArrayList<Boolean>();
		 for(TableColumn aa : dbService.getTableColumns()){
				visibleColumns.add(true);
			}
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

	public LazyDataModel<Navigatable> getNavi() {
		return navi;
	}

	public void setNavi(LazyDataModel<Navigatable> navi) {
		this.navi = navi;
	}

	public LazyDataModel<NcmErpTxIfr> getTxIfr() {
		return txIfr;
	}

	public void setTxIfr(LazyDataModel<NcmErpTxIfr> txIfr) {
		this.txIfr = txIfr;
	}

	public List<Boolean> getVisibleColumns() {
		return visibleColumns;
	}

	public void setVisibleColumns(List<Boolean> visibleColumns) {
		this.visibleColumns = visibleColumns;
	}

	public Navigatable getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(Navigatable selectedRow) {
		this.selectedRow = selectedRow;
	}
	
}
