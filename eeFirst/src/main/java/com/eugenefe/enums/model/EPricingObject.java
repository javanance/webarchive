package com.eugenefe.enums.model;

import java.util.Arrays;
import java.util.List;

//import com.eugene.element.FnCalendar;
//import com.eugene.entity.CashFlow;

public enum EPricingObject {
	 DEFAULT ("defalut") 
	,VALUATION ("valuation")
	,SENSITIVITY ("sensitivity")
	,VAR("valueAtRisk")
	,SIMULATION("simulation")

	;

	private String name; 
	private EPricingObject(String name){
		this.name =name;
	}

	public String getName() {
		return name;
	}
	public static List<EPricingObject> getList(){
		return  Arrays.asList(EPricingObject.values());
	}
}
