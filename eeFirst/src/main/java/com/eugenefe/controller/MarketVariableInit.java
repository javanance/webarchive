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
import com.eugenefe.enums.EMarketVariableType;
import com.eugenefe.qualifiers.DefaultEm;
import com.eugenefe.qualifiers.SecondEm;

@Named
@SessionScoped
public class MarketVariableInit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject 	private Logger logger;
	
	@Inject
//	@DefaultEm
	@SecondEm
	private EntityManager entityManager;
	
//	@RequestParameter  
	private String flagDataTable = "Y"; 
	
//	@Inject
//	private MarketVariableTypeOptionAction mvTypeOptionAction;

	private List<MarketVariable> marketVariables;
	
	private MarketVariable selectedMarketVariable;
	private List<MarketVariable> selectedMv;
	
	private MarketVariable[] selectedMvArray;
	
	public MarketVariableInit() {
		System.out.println("Construction MarketVariableInit");
	}
	
//**********************Getter and Setter *******************

	
	@PostConstruct
	public  void  getViewFullMarketVariables() {
//		marketVariables = entityManager.createQuery(NamedQuery..getQuery()).getResultList();
		List<MarketVariable> aa = new ArrayList<MarketVariable>();
		
		MarketVariable temp = new MarketVariable();
		temp.setMvId("aa");
		temp.setMvName("aa");
		temp.setMvType(EMarketVariableType.STOCK);
		
		MarketVariable temp1 = new MarketVariable();
		temp1.setMvId("bb");
		temp1.setMvName("bb");
		temp1.setMvType(EMarketVariableType.STOCK);
		
		MarketVariable temp2 = new MarketVariable();
		temp2.setMvId("cc");
		temp2.setMvName("cc");
		temp2.setMvType(EMarketVariableType.BOND);
		
		aa.add(temp);
		aa.add(temp1);
		aa.add(temp2);
		marketVariables= aa;
		
		selectedMarketVariable= temp;
//		System.out.println("Construction MarketVariableInit"+ "_"+aa);
		logger.info("mv init : {} , {}", marketVariables.size());
	}
	
	public MarketVariable getSelectedMarketVariable() {
		return selectedMarketVariable;
	}

	public void setSelectedMarketVariable(MarketVariable selectedMarketVariable) {
		this.selectedMarketVariable = selectedMarketVariable;
	}

	public MarketVariable[] getSelectedMvArray() {
		return selectedMvArray;
	}

	public void setSelectedMvArray(MarketVariable[] selectedMvArray) {
		this.selectedMvArray = selectedMvArray;
	}

	public List<MarketVariable> getSelectedMv() {
		return selectedMv;
	}

	public void setSelectedMv(List<MarketVariable> selectedMv) {
		this.selectedMv = selectedMv;
	}

	public List<MarketVariable> getMarketVariables() {
		return marketVariables;
	}

	public void setMarketVariables(List<MarketVariable> marketVariables) {
		this.marketVariables = marketVariables;
	}

	
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
