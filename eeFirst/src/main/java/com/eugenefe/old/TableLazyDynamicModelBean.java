package com.eugenefe.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.Dependent;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.text.WordUtils;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.NodeSelectEvent;
import org.slf4j.Logger;

import com.eugenefe.converter.LazyModelDynamic;
import com.eugenefe.converter.TableDynamicColumn;
import com.eugenefe.model.TableColumn;
import com.eugenefe.producer.DataProducer;

//import org.jboss.seam.framework.Query;

@Named
public class TableLazyDynamicModelBean<T> implements Serializable{
	@Inject 	
	private Logger logger;
	
	@Inject
	private DataProducer dataSource;
	
//	@Inject
	private BaseDateBean basedateBean;

//	@Param
	private String navigation;

	private String savedNavigation;

	
//	@Inject
//	@SelectedTable
//	Event<String> selectEvent;
	
//	@Inject
	private List<TableColumn> tableColumns;
	
	private List<T> dynamicModelList;

	private Map<String, String> selectedDynamicModel;

	
	private List<TableDynamicColumn> pivotTableHeader;

	private List<Map<String, String>> pivotTableContent;

	
	private LazyModelDynamic lazyModelDynamic;


	public TableLazyDynamicModelBean() {
		System.out.println("Construction TableLazyDynamicModelBean");
	}
	
	private FacesContext context;
	
	public FacesContext getContext() {
		return context;
	}

	public void setContext(FacesContext context) {
		this.context = context;
	}

	// *******************************************
//	@PostConstruct
	// @Begin(join = true)
	public void create() {
		if (navigation != null) {
			savedNavigation = navigation;
		}
//		loadDynamicModel();

		context = FacesContext.getCurrentInstance();
		String aaaa = FacesContext.getCurrentInstance().getViewRoot().getViewId();
		dynamicModelList =dataSource.getDynamicTable("NcmMapTxType");
		tableColumns = dataSource.getColumnList("NCM_MAP_TX_TYPE");
		logger.info("post Cons: {},{}", dynamicModelList.size());
		logger.info("post Cons: {},{}", dynamicModelList.size(), tableColumns.get(0).getCamelColumnName());
		loadTable(savedNavigation);
		
	}


	// ******************************************

	
	private void loadTable(String selectedTable){
		dynamicModelList = dataSource.getDynamicTable(selectedTable);
	}
	
	
	
	public void onNodeSelect(NodeSelectEvent event){
		String selectedTable = WordUtils.capitalizeFully(event.getTreeNode().getData().toString(), new char[]{'_'}).replaceAll("_", "");
		savedNavigation= selectedTable;
//		String selectedTable = event.getTreeNode().getData().toString();
//		String converteName = ENamingConvention.SNAKE_CASE.convertToCamelCase(selectedTable);
//		selectedTable = WordUtils.capitalizeFully(selectedTable, new char[]{'_'}).replaceAll("_", "");
		tableColumns = dataSource.getColumnList(event.getTreeNode().getData().toString());
		
		logger.info("On the Selection : {},{}", selectedTable, event.getTreeNode().getData().toString());
		logger.info("On the Selection : {},{}", dataSource.getTableList(), dataSource.getAllColumnList().size());
		
//		logger.info("On the Selection1 : {},{}", columns.get(0).getTableName(), columns.get(0).getColumnName());
		
		for( TableColumn zz : dataSource.getColumnList(event.getTreeNode().getData().toString())){
			logger.info("On the Selection1 : {},{}", zz.getColumnName(), zz.getCamelColumnName());
		}
		
		dynamicModelList = dataSource.getDynamicTable(selectedTable);
		
		logger.info("On the Selection2 : {},{}", dynamicModelList.size());
		
//		logger.info("On the Selection1 : {},{}", dataSource.getColumnList(event.getTreeNode().getData().toString()));
//		selectEvent.fire(event.getTreeNode().getData().toString());
		
	}
	private void loadDynamicModel() {
	/*  
	    Filter filter = session.enableFilter("filterBtwnDate").setParameter("stBssd", basedateBean.getStBssd())
				.setParameter("endBssd", basedateBean.getEndBssd());
		String query = "from " + savedNavigation;
		dynamicModelList = session.createQuery(query).list();
	*/
		
//		String query = "from " + savedNavigation;
//		dynamicModelList = entityManager.createQuery(query).getResultList();
		// logger.info("Query Result size:#0", dynamicModelList.size());
		
		
		/*for (T dyn : dynamicModelList) {
//			dynamicModelMap.put(dyn.getId(), dyn);
			tempContentMap = new HashMap<String, String>();
			tempListContentMap = new HashMap<String, List<Map<String, String>>>();

			for (TableDynamicColumn header : pivotTableHeader) {
				navi = dyn;
				try {
					for (String prop : header.getFullColumns()) {
						Method temp = navi.getClass().getDeclaredMethod(prop);
						// Field temp = navi.getClass().getDeclaredField(prop);
						// temp.setAccessible(true);
						// navi = temp.get(navi);
						// if(temp!=null){

						rtnType = temp.getReturnType();

						navi = temp.invoke(navi);

						tempContentMap.put(header.getColumnId(), String.valueOf(navi));
						}
				} catch (Exception e) {
					logger.info("Method Call Exception :#0", header.getFullColumns());
				}

			}
			tempContentMap.put("getStringId", dyn.toString());
			pivotTableContent.add(tempContentMap);
			filterPivotTableContent = pivotTableContent;
		}
		lazyModelDynamic = new LazyModelDynamic(pivotTableContent);*/
//		logger.info("Load Table:#0", pivotTableContent);
	}


	

	
	// ***************************************************************
	public void resetTable() {
		DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot()
				.findComponent("formDynamicModel:tableDynamicModel");
		if (dataTable != null) {
			// logger.info("In the dataTable");
			dataTable.setValueExpression("sortBy", null);
			// dataTable.setValueExpression("filterBy", null);
			dataTable.setFirst(0);
			dataTable.reset();
		}
	}

	// ****************Getter and Setter***********************

	public List<TableDynamicColumn> getPivotTableHeader() {
		return pivotTableHeader;
	}

	public void setPivotTableHeader(List<TableDynamicColumn> pivotTableHeader) {
		this.pivotTableHeader = pivotTableHeader;
	}

	public List<Map<String, String>> getPivotTableContent() {
		Map<String,String> params = context.getExternalContext().getRequestParameterMap();
		String selection = params.get("formDynamicModel:tableDynamicModel" + "_selection");
		 logger.info("FilterSelection:#0,#1",selection,params);
		return pivotTableContent;
	}

	public void setPivotTableContent(List<Map<String, String>> pivotTableContent) {
		this.pivotTableContent = pivotTableContent;
	}


	public Map<String, String> getSelectedDynamicModel() {
		return selectedDynamicModel;
	}

	public void setSelectedDynamicModel(Map<String, String> selectedDynamicModel) {
		this.selectedDynamicModel = selectedDynamicModel;
	}



	private DataTable dataTable;

	public DataTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(DataTable dataTable) {
		this.dataTable = dataTable;
	}

	public LazyModelDynamic getLazyModelDynamic() {
		return lazyModelDynamic;
	}

	public void setLazyModelDynamic(LazyModelDynamic lazyModelDynamic) {
		this.lazyModelDynamic = lazyModelDynamic;
	}
	
	private Map<String, List<Map<String, String>>> detailTableModel;

	public Map<String, List<Map<String, String>>> getDetailTableModel() {
		return detailTableModel;
	}

	public void setDetailTableModel(Map<String, List<Map<String, String>>> detailTableModel) {
		this.detailTableModel = detailTableModel;
	}
	private List<TableDynamicColumn> detailTab;
	public List<TableDynamicColumn> getDetailTab() {
		return detailTab;
	}
	public void setDetailTab(List<TableDynamicColumn> detailTab) {
		this.detailTab = detailTab;
	}

	private Map<String, List<TableDynamicColumn>> detailMdoelHeaderMap;
	
	public Map<String, List<TableDynamicColumn>> getDetailMdoelHeaderMap() {
		return detailMdoelHeaderMap;
	}

	public void setDetailMdoelHeaderMap(Map<String, List<TableDynamicColumn>> detailMdoelHeaderMap) {
		this.detailMdoelHeaderMap = detailMdoelHeaderMap;
	}

	private List<TableDynamicColumn> detailModelHeader;

	public List<TableDynamicColumn> getDetailModelHeader() {
		return detailModelHeader;
	}

	public void setDetailModelHeader(List<TableDynamicColumn> detailModelHeader) {
		this.detailModelHeader = detailModelHeader;
	}
	
	
	
	
//	private List<Map<String, String>> detailTableModel;
//
//	public List<Map<String, String>> getDetailTableModel() {
//		return detailTableModel;
//	}
//
//	public void setDetailTableModel(List<Map<String, String>> detailTableModel) {
//		this.detailTableModel = detailTableModel;
//	}

//	private Map<String,T> dynamicModelMap;
	
	
	private String defSortField = "getId";

	public String getDefSortField() {
		return defSortField;
	}

	public void setDefSortField(String defSortField) {
		this.defSortField = defSortField;
	}
	public String getSavedNavigation() {
		return savedNavigation;
	}

	public void setSavedNavigation(String savedNavigation) {
		this.savedNavigation = savedNavigation;
	}
	
	
	private Map<String, Object> contents = new HashMap<String, Object>();


	public List<TableColumn> getTableColumns() {
		return tableColumns;
	}

	public void setTableColumns(List<TableColumn> tableColumns) {
		this.tableColumns = tableColumns;
	}

	public List<T> getDynamicModelList() {
		return dynamicModelList;
	}

	public void setDynamicModelList(List<T> dynamicModelList) {
		this.dynamicModelList = dynamicModelList;
	}

	
	
	
	
}
