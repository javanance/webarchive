package com.eugenefe.enums.model;

public enum EConstant {
	hierarchy 	("HIERARCHY"),
	
	RULE_SET	("RULE_SET"),
	
	RuleSetRootNode	("RsRoot");
	
	public String name ;
	
	private EConstant ( String name){
		this.name = name;
	}
}
