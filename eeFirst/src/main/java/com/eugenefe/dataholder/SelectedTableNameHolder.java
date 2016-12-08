package com.eugenefe.dataholder;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import org.slf4j.Logger;

//@SessionScoped
@ViewScoped
public class SelectedTableNameHolder implements Serializable {
	@Inject		private Logger logger;
	
	private String tableName;

	public SelectedTableNameHolder() {
		System.out.println("SelectedTableNameHolder Gen");
	}
	
	
//	@PostConstruct
	public void create(){
		tableName = "NCM_MST_PROD_TYPE";
	}
	
	
//	/****************************************getter and setter*********************************
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	
}
