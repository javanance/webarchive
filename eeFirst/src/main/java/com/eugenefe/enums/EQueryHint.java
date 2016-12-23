package com.eugenefe.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.eugenefe.util.FnCalendar;

//import com.eugene.element.FnCalendar;
//import com.eugene.entity.CashFlow;

public enum EQueryHint {
	FetchGraph ("javax.persistence.fetchgraph"),
	RetrieveMode("javax.persistence.cache.retrieveMode"),
	StoreMode("javax.persistence.cache.storeMode"),
	LoadGraph("javax.persistence.loadgraph"),
	ReadOnly("org.hibernate.readOnly"),
	Cacheable("org.hibernagte.cacheable");


	private String value;
	
	private EQueryHint(String value){
		this.value =value;
	}

	public String getValue() {
		return value;
	}
	public static List<EQueryHint> getList(){
		return  Arrays.asList(EQueryHint.values());
	}
}
