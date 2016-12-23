package com.eugenefe.enums.model;

import java.util.Arrays;
import java.util.List;

//import com.eugene.element.FnCalendar;
//import com.eugene.entity.CashFlow;

public enum EBondCfType {
	BULLET,
	DISCOUNT,
	FIXED,
	FLOATING,
	FX_AMORT,
	FL_AMORT;
	
	public static List<EBondCfType> getList(){
		return  Arrays.asList(EBondCfType.values());
	}
}
