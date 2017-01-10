package com.eugenefe.bean;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections4.map.HashedMap;
import org.slf4j.Logger;

import com.eugenefe.entity.takion.WebUser;
import com.eugenefe.qualifiers.SelectedTable;
import com.eugenefe.qualifiers.LoginEvent;
import com.eugenefe.service.UserDbService;

@Named
@SessionScoped
//@ViewScoped
public class LoginBean  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject		
	private Logger logger;
	
	@Inject
	private UserDbService dbService;
	
	@Inject
	@LoginEvent
	private Event<WebUser> loginEvent;
	
	private String userId;
    private String password;
    
    private WebUser loginUser;
    private boolean loggedIn;
    
    private Map<String, WebUser> userMap= new HashedMap<String, WebUser>();
    
    public LoginBean() {
    	System.out.println("LoginBean Gen");
    	
	}

    @PostConstruct
    public void init(){
    	userMap = dbService.fetchUserMap();
    	loginUser = userMap.get("guest");
//    	loginUser = new WebUser();
//    	userId = loginUser.getUserId();
		loggedIn = false;
		
		logger.info("LoginBean Init : {},{}", loginUser.getUserId(), loggedIn);
		logger.info("LoginBean Init : {},{}", loginUser.getUserId(), loginUser.getUserMenuList().size());
		logger.info("LoginBean Init1 : {},{}", loginUser.getUserId(), userMap.get(loginUser.getUserId()).getUserMenuList().size());

		loginEvent.fire(loginUser);
    }
    
    public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public WebUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(WebUser loginUser) {
		this.loginUser = loginUser;
	}

	/*public void login() {
		userMap = dbService.fetchUserMap();
		logger.info("LogIn0 : {}, {}", loginUser.getUserId(), userMap.get("guest").getMenuMap().size());

		if (userMap.get(userId) !=null && password.equals(userMap.get(userId).getPassword())) {
			loginUser = userMap.get(userId);
			loggedIn = true;
			logger.info("LogIn : {}, {}", loginUser.getUserId(), loggedIn);
			logger.info("LogIn : {}, {}", loginUser.getUserId(), loginUser.getMenuMap().size());
		} else {
			loggedIn = false;
		}
	}*/
	
	public void login() {
		userMap = dbService.fetchUserMap();
		logger.info("LogIn0 : {}, {}", userId, userMap.get("guest").getUserMenuList().size());
		if(userMap.get(userId)!=null){
			loginUser = userMap.get(userId);
		}
		
		if (password.equals(userMap.get(userId).getPassword())) {
//			if (userMap.get(userId) !=null && password.equals(userMap.get(userId).getPassword())) {
			loginUser = userMap.get(userId);
			loggedIn = true;
			logger.info("LogIn : {}, {}", loginUser.getUserId(), loggedIn);
			logger.info("LogIn : {}, {}", loginUser.getUserId(), loginUser.getUserMenuList().size());
			loginEvent.fire(loginUser);
		} else {
			loggedIn = false;
		}
	}

	public void logout() {
//		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		init();
		
//		loginUser = userMap.get("guest");
//		loggedIn = false;
//		loginEvent.fire(loginUser);
	}
	
	public void clear(){
		loginUser = new WebUser();
		loggedIn = false;
	}
	
	public void register(){
		logger.info("Input User : {},{}", loginUser.getUserId());
		userId = loginUser.getUserId();
		password = loginUser.getPassword();
		dbService.merge(loginUser);
		userMap.put(loginUser.getUserId(), loginUser);
		login();
	}
	
	public void update(){
		dbService.merge(loginUser);
	}
	
//	public String goToRegister() {
//		System.out.println("in the register");
//		return "/temp/v800Settings.xhtml?faces-redirect=true";
//	}
	
}
