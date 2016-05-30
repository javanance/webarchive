package com.eugenefe.controller;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named("guestPref")
public class GuestPreferences implements Serializable {

//	private String theme = "aristo"; //default
	private String theme ;
	
	@Inject
	private FacesContext ctx;
	
	@PostConstruct
	public void init() {
		theme = "sam";
	}    	

	public GuestPreferences(){
	}
	

	public String getTheme() {
//		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		Map<String, String> params = ctx.getExternalContext().getRequestParameterMap();
		
		if(params.containsKey("theme")) {
			theme = params.get("theme");
		}
		
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
}
