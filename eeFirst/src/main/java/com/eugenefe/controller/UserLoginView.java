package com.eugenefe.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

@Named
@SessionScoped
public class UserLoginView  implements Serializable{
	private static final long serialVersionUID = 1L;

	private String username;
    
    private String password;
    
    private boolean loggedIn;
    
    
    public UserLoginView() {
	}

    @PostConstruct
    public void init(){
    	loggedIn = false;
    }
    
	public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public void login() {
//        RequestContext context = RequestContext.getCurrentInstance();
//        FacesMessage message = null;
         
        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
//            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
//            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
         
//        FacesContext.getCurrentInstance().addMessage(null, message);
//        context.addCallbackParam("loggedIn", loggedIn);
    } 
	
	public void logout() {
//      RequestContext context = RequestContext.getCurrentInstance();
//      FacesMessage message = null;
       
          loggedIn = false;
//          message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
       
//      FacesContext.getCurrentInstance().addMessage(null, message);
//      context.addCallbackParam("loggedIn", loggedIn);
  } 
	
	public String goToRegister() {
		System.out.println("in the register");
		return "/temp/v800Settings.xhtml?faces-redirect=true";
	}
}
