package com.eugenefe.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import com.eugenefe.enums.EViewNew;

@Named
@SessionScoped
public class ViewUrlBean  implements Serializable{
	private static final long serialVersionUID = 1L;
	
    
    public ViewUrlBean() {
	}

    @PostConstruct
    public void init(){
    }
    
	public String getUrl(String viewId){
		EViewNew temp = EViewNew.valueOf(viewId);
		return temp.getUrl() ;
	}
	
	public String getRedirectUrl(String viewId){
		EViewNew temp = EViewNew.valueOf(viewId);
		return temp.getUrl() + "?faces-redirect=true";
	}
}
