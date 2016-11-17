package com.eugenefe.bean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.omnifaces.cdi.Param;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.converter.LazyModelDynamic;
import com.eugenefe.converter.TableDynamicColumn;
import com.eugenefe.qualifiers.AnnoMethodTree;
import com.eugenefe.qualifiers.SecondEm;

//import org.jboss.seam.framework.Query;

@Named
public class TableLazyDynamicModelBean<T> {
	@Inject 	
	private Logger logger;
	
	@Inject	@SecondEm
	private EntityManager entityManager;
	
	@Inject
	private BaseDateBean basedateBean;

	@Param
	private String navigation;

	private String savedNavigation;

	private List<T> dynamicModelList;

	private Map<String, String> selectedDynamicModel;

//	@Inject
	private List<TableDynamicColumn> initPivotTableHeader;
	
	
	private List<TableDynamicColumn> pivotTableHeader;

	private List<Map<String, String>> pivotTableContent;

	
	private LazyModelDynamic lazyModelDynamic;


	public TableLazyDynamicModelBean() {
		System.out.println("Construction TableLazyDynamicModelInit");
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
		pivotTableHeader = initPivotTableHeader;
//		loadDynamicModel();

		context = FacesContext.getCurrentInstance();
		String aaaa = FacesContext.getCurrentInstance().getViewRoot().getViewId();
		
	}


	// ******************************************

	
	public void onNodeSelect(NodeSelectEvent event){
		
		logger.info("On the Selection : {}", event.getTreeNode().getData().toString());
		
	}
	private void loadDynamicModel() {
/*		Filter filter = session.enableFilter("filterBtwnDate").setParameter("stBssd", basedateBean.getStBssd())
				.setParameter("endBssd", basedateBean.getEndBssd());
		String query = "from " + savedNavigation;
		dynamicModelList = session.createQuery(query).list();
		*/
		
		String query = "from " + savedNavigation;
		dynamicModelList = entityManager.createQuery(query).getResultList();
		// logger.info("Query Result size:#0", dynamicModelList.size());
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

	
	
	
	
}
