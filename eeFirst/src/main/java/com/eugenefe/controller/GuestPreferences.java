package com.eugenefe.controller;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

@Named("guestPref")
@SessionScoped
public class GuestPreferences implements Serializable {
	@Inject
	private Logger logger;
//	private String theme = "aristo"; //default
	private String themeString ;
	
	private Theme theme;
	
	@Inject
	private FacesContext ctx;
	
	@PostConstruct
	public void init() {
		themeString = "sam";
	}    	

	public GuestPreferences(){
	}
	

	public String getTheme() {
//		Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		Map<String, String> params = ctx.getExternalContext().getRequestParameterMap();
		logger.info("param: {}, {}", themeString, params);
		if(params.containsKey("theme")) {
			logger.info("param1: {}", params.get("theme"));
			themeString = params.get("theme");
		}
		
		return themeString;
	}

	public void setTheme(String theme) {
		this.themeString = theme;
	}
}
