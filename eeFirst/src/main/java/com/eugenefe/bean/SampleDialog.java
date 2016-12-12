package com.eugenefe.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

@Named
@RequestScoped
public class SampleDialog {

	public void view(){
		RequestContext.getCurrentInstance().openDialog("/fragment/login");
	}
	
	public void viewLogin(){
		RequestContext.getCurrentInstance().openDialog("/fragment/dialogSample2");
	}
	
	public void viewRegister(){
		RequestContext.getCurrentInstance().openDialog("/fragment/register.xhtml");
	}
	
}
