package com.eugenefe.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.primefaces.component.datatable.DataTable;
import org.primefaces.model.LazyDataModel;
import org.slf4j.Logger;

import com.eugenefe.converter.LazyModelMarketVariable;
import com.eugenefe.entities.MarketVariable;
import com.eugenefe.qualifiers.DefaultEm;

@Named("tableLazyMarketVariableInit")
@SessionScoped
public class TableLazyMarketVariableInit implements Serializable {
	@Inject 	private Logger logger;
	@Inject
	@DefaultEm
	private EntityManager entityManager;
	
//	@RequestParameter  
	private String flagDataTable = "Y"; 
	
//	@Inject
//	private MarketVariableTypeOptionAction mvTypeOptionAction;


	private SelectItem[] currentMvTypeOption;

	private LazyDataModel<MarketVariable> lazyModelMarketVariable;
	
	private List<MarketVariable> marketVariables;

	public TableLazyMarketVariableInit() {
		System.out.println("Construction MarketVariableInit");
	}
	
//**********************Getter and Setter *******************
	public SelectItem[] getCurrentMvTypeOption() {
		return currentMvTypeOption;
	}

	public void setCurrentMvTypeOption(SelectItem[] currentMvTypeOption) {
		this.currentMvTypeOption = currentMvTypeOption;
	}

	public LazyDataModel<MarketVariable> getLazyModelMarketVariable() {
		return lazyModelMarketVariable;
	}

	public void setLazyModelMarketVariable(LazyDataModel<MarketVariable> lazyModelMarketVariable) {
		this.lazyModelMarketVariable = lazyModelMarketVariable;
	}
//	public String getFlagDataTable() {
//		return flagDataTable;
//	}
//	public void setFlagDataTable(String flagDataTable) {
//		this.flagDataTable = flagDataTable;
//	}

	//	*****************************************
	
	@PostConstruct
	public  void  getViewFullMarketVariables() {
//		marketVariables = entityManager.createQuery(NamedQuery..getQuery()).getResultList();
		List<MarketVariable> aa = new ArrayList<MarketVariable>();
		aa.add(new MarketVariable("aaa"));
		
		
		lazyModelMarketVariable = new LazyModelMarketVariable(marketVariables);
//		currentMvTypeOption = mvTypeOptionAction.getAllMvTypeOption();
		
//		logger.info("All flag : {},{} ", currentMvTypeOption.length);
//		return lazyModelMarketVariable;
	}
	
	

	/*public void onViewFullMarketVariables() {
		marketVariables = entityManager.createQuery(NamedQuery.AllMarketVariables.getQuery()).getResultList();
		lazyModelMarketVariable = new LazyModelMarketVariable(marketVariables);
		currentMvTypeOption = mvTypeOptionAction.getAllMvTypeOption();
		
		logger.info("All flag : {},{} ", currentMvTypeOption.length);
	}*/

	/*public void onViewRiskFactor() {
		marketVariables =entityManager.createQuery(NamedQuery.RiskFactors.getQuery()).getResultList();
		lazyModelMarketVariable = new LazyModelMarketVariable(marketVariables);
		currentMvTypeOption = mvTypeOptionAction.getMvTypeOption();
		log.info("Rf flag : #0, #1,#2 ", currentMvTypeOption.length, flagDataTable);
	}*/
	
	
	/*public void onViewProduct() {
		marketVariables =entityManager.createQuery(NamedQuery.Products.getQuery()).getResultList();
		lazyModelMarketVariable = new LazyModelMarketVariable(marketVariables);
		currentMvTypeOption = mvTypeOptionAction.getProductTypeOption();
		log.info("Prod flag : #0, #1,#2 ", currentMvTypeOption.length, flagDataTable);
	}*/

	
//TODO : remove String Constant using UI Component Binding 	
//***************************************************************
	public void resetTable() {
	    DataTable dataTable = (DataTable) FacesContext.getCurrentInstance().getViewRoot()
	            .findComponent("formLazyMarketVariables:tableLazyMarketVariables");
	    if (dataTable != null) {
	    	dataTable.setValueExpression("sortBy", null);
	    	dataTable.setFirst(0);
	        dataTable.reset();
	    }
	}

	private DataTable dataTable;

	public DataTable getDataTable() {
		return dataTable;
	}
	public void setDataTable(DataTable dataTable) {
		this.dataTable = dataTable;
	}

}
