package com.eugenefe.bean;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.primefaces.context.RequestContext;
import org.primefaces.event.ToggleEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.TreeNode;
import org.primefaces.model.Visibility;
import org.slf4j.Logger;

import com.eugenefe.entity.ncm.NcmErpTxIfr;
import com.eugenefe.model.LazyModelNavigatable;
import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.HttpParam;
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
	
	@Inject
//	@SelectedTable
//	@Param
	@HttpParam
	private String selectedTableName;
	
	private String changeName;
	private String testName;
	
	
	public String getChangeName() {
		return changeName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	//	@Inject @Param(pathIndex=1)
	private TreeNode selectedNode;
	
	private LazyDataModel<Navigatable> navi;
//	private LazyModelTxIfr txIfr;
	
	private LazyDataModel<NcmErpTxIfr> txIfr;
	
	private Navigatable selectedRow;
	
	private List<Navigatable> selectedRows;
	
	
	private List<Boolean> visibleColumns ;
	
	public DataViewerLazyBean() {
		System.out.println("Construction DataViewerLazyBean_" );
	}
	
	private String queryString;
	
	@PostConstruct
	public void init1(){
		logger.info("PostConstruct1111 :{}, {}", selectedTableName, RequestContext.getCurrentInstance().isAjaxRequest());
		if(selectedTableName!=null){
			logger.info("PostConstruct000001111 :{}, {}", selectedTableName);
			dbService.getSelectedTable().setTableName(selectedTableName);
			onChangeEvent(selectedTableName);
			
		}else{
			selectedTableName = dbService.getSelectedTable().getTableName();
		}
		navi = new LazyModelNavigatable<Navigatable>(dbService.generateTableLazyContents(selectedTableName));
		setVisible();
		logger.info("PostConstruct22222222 :{}, {}", selectedTableName, RequestContext.getCurrentInstance().isAjaxRequest());
	}
	
//	@PostConstruct
	public void init(){
		logger.info("PostConstruct0 :{},{}", testName, selectedTableName);
		if(selectedTableName ==null){
			if(testName ==null){
				selectedTableName ="NCM_MST_SAA_CODE";
			}
			else{
				selectedTableName = testName;
			}
		}
		logger.info("PostConstruct :{}", selectedTableName);
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
	
	public String format(String aa, TableColumn bb){
		DecimalFormat formatter = new DecimalFormat("#,###.##");
		if(bb.getColumnType().equals("NUMBER") && !aa.isEmpty()){
			return formatter.format(Long.parseLong(aa));
		}
		return aa;
		
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
	
	
	public void onChangeEvent(String selectedTableName){
//	public void onChangeEvent(@Observes @SelectedTable String selectedTableName){	
		queryString = selectedTableName;
		logger.info("Selected Table Request: {},{}", selectedTableName,  RequestContext.getCurrentInstance().isAjaxRequest());
				
		this.selectedTableName = selectedTableName;
		dbService.getSelectedTable().setTableName(selectedTableName);
//		logger.info("Selected Table: {},{}", dbService.getSelectedTable().getTableName());
		logger.info("Selected Tableaaaaaaaaaaaaaaaaaaaaa: {},{}", selectedTableName, dbService.getSelectedTable().getTableName());
		dbService.setTableColumns(dbService.generateColumns(selectedTableName));
//		dbService.setTableContents(dbService.generateTableContents(selectedTableName));
		
//		logger.info("Selected Naviiiiiiiiiiiiiiiiiiiiiii: {},{}", dbService.generateTableLazyContents(selectedTableName).size(), navi.getPageSize());
		
//		txIfr = new LazyModelTxIfr(dbService.generateTableLazyContents1(selectedTableName));
		navi = new LazyModelNavigatable<Navigatable>(dbService.generateTableLazyContents(selectedTableName));
		setVisible();
		
	}
	
	public void  onChangeEventGo(@Observes @SelectedTable String selectedTableName){	
		logger.info("Selected Table Request go: {},{}", selectedTableName,  queryString);
		
		String outcome = "/v902DataNavigation";
		FacesContext context = FacesContext.getCurrentInstance();
		ExternalContext exCxt = context.getExternalContext();
		logger.info("Listener : {}, {}", exCxt.getRequestContextPath(), ((HttpServletRequest)exCxt.getRequest()).getQueryString());
		logger.info("Listener : {}, {}", exCxt.getRequestContextPath(), ((HttpServletRequest)exCxt.getRequest()).getRequestURL());
		
		if(RequestContext.getCurrentInstance().isAjaxRequest() && queryString != null){
			logger.info("In Listener : {}, {}", exCxt.getRequestContextPath(), ((HttpServletRequest)exCxt.getRequest()).getRequestURL());
			try {
				exCxt.redirect(exCxt.getRequestContextPath()+outcome);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		else{
			
			this.selectedTableName = selectedTableName;
			dbService.getSelectedTable().setTableName(selectedTableName);
	//		logger.info("Selected Table: {},{}", dbService.getSelectedTable().getTableName());
			logger.info("Selected Tableaaaaaaaaaaaaaaaaaaaaa: {},{}", selectedTableName, dbService.getSelectedTable().getTableName());
			dbService.setTableColumns(dbService.generateColumns(selectedTableName));
	//		dbService.setTableContents(dbService.generateTableContents(selectedTableName));
			
	//		logger.info("Selected Naviiiiiiiiiiiiiiiiiiiiiii: {},{}", dbService.generateTableLazyContents(selectedTableName).size(), navi.getPageSize());
			
	//		txIfr = new LazyModelTxIfr(dbService.generateTableLazyContents1(selectedTableName));
			navi = new LazyModelNavigatable<Navigatable>(dbService.generateTableLazyContents(selectedTableName));
			setVisible();
		}
		
		
			
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
	 
	 public void onValueChange(ValueChangeEvent aa){
		 changeName = selectedTableName;
		 logger.info("valueChange :{}", aa);
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

	public List<Navigatable> getSelectedRows() {
		return selectedRows;
	}

	public void setSelectedRows(List<Navigatable> selectedRows) {
		this.selectedRows = selectedRows;
	}
	
}
