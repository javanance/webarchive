package com.eugenefe.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

import com.eugenefe.entity.takion.WebUser;
import com.eugenefe.entity.takion.WebUserMenu;
import com.eugenefe.qualifiers.OraTakionEm;

//@SessionScoped
//@ViewScoped
//@RequestScoped
@Stateless
//@Stateful
public class UserDbService implements Serializable {
	@Inject
	private Logger logger;

	@Inject
//	@OraTakionExtendedEm
	@OraTakionEm
	private EntityManager entityManager;

	private List<WebUser> userList;
	private Map<String, WebUser> userMap;
	
	public UserDbService() {
		System.out.println("UserDbService Generated");
	}

	@PostConstruct
	public void init(){
		userList = fetchUserList();
		userMap = fetchUserMap();
	}
	
	public List<WebUser> fetchUserList(){
		logger.info("fetch User List");
//		userList = entityManager.createQuery("from WebUser a left join fetch a.userMenuList").getResultList();
		userList = entityManager.createQuery("from WebUser a").getResultList();
		return userList;
	}
	
	public Map<String, WebUser> fetchUserMap(){
		logger.info("Fetch UserMap");
		userMap = new HashMap<String, WebUser>();
		for(WebUser aa : fetchUserList()){
			userMap.put(aa.getUserId(), aa);
		}
		return userMap;
	}
	
	public List<WebUserMenu> fetchUserMenuList(String userId){
		return entityManager.createQuery("from WebUserMenu a where a.userId=:userId").setParameter("userId", userId).getResultList();
	}
//****************************	crud*************************
	public void merge(WebUser  newUser){
		logger.info("merge in dbService : {}, {}", entityManager.contains(newUser), newUser.toString());
			entityManager.merge(newUser);
	}
	
	public  void persist(WebUser  newUser){
		logger.info("persist in dbService : {}, {}", entityManager.contains(newUser), newUser.toString());
		entityManager.persist(newUser);
	}
	
	public void remove(WebUser  removedUser){
		logger.info("remove in dbService : {}, {}", entityManager.contains(removedUser), removedUser.getUserId());
		entityManager.remove(entityManager.contains(removedUser) ? removedUser : entityManager.merge(removedUser));
	}


	// *****************************************getter and setter*******************************************
	public List<WebUser> getUserList() {
		return userList;
	}
	public void setUserList(List<WebUser> userList) {
		this.userList = userList;
	}


	public Map<String, WebUser> getUserMap() {
		return userMap;
	}
	public void setUserMap(Map<String, WebUser> userMap) {
		this.userMap = userMap;
	}


	// ******************************************* private method************


	
	
}
