package com.eugenefe.model;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.component.util.FaceletContextConsumer;
import org.slf4j.Logger;


//User preference 로 대체해야함.==> 삭제대상
@SessionScoped
public class GuestPreferences implements Serializable {

	private String themeString ;
	
	@Inject
	private FacesContext ctx;
	
	@PostConstruct
	public void init() {
		themeString = "sam";
		Map<String, String> params = ctx.getExternalContext().getRequestParameterMap();
		if(params.containsKey("theme")) {
			themeString = params.get("theme");
		}
		
	}    	

	public GuestPreferences(){
	}
	
	
	public String getThemeString() {
		return themeString;
	}

	public void setThemeString(String themeString) {
		this.themeString = themeString;
	}
	
}
