package com.eugenefe.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

import com.eugenefe.entity.takion.WebUserMenuMulti;
import com.eugenefe.qualifiers.OraTakionEm;

//@SessionScoped
//@ViewScoped
//@RequestScoped
@Stateless
//@Stateful
public class UserMenuDbService implements Serializable {
	@Inject
	private Logger logger;

	@Inject
//	@OraTakionExtendedEm
	@OraTakionEm
	private EntityManager entityManager;

	
	public UserMenuDbService() {
		System.out.println("UserMenuDbService Generated");
	}

	@PostConstruct
	public void init(){
	}
	
	public List<WebUserMenuMulti> fetchUserMenuList(String userId){
		return entityManager.createQuery("from WebUserMenuMulti a left join fetch a.menu where a.userId=:userId order by a.menuGroupOrder, a.menuColumn").setParameter("userId", userId).getResultList();
	}
//****************************	crud*************************
	public void merge(WebUserMenuMulti  newUser){
		logger.info("merge in dbService : {}, {}");
		try {
			logger.info("merge in dbService : {}, {}", entityManager.contains(newUser), newUser.getMenuId());
//			entityManager.merge(newUser.getMenu());
			entityManager.merge(newUser);
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Save to Menubar", newUser.getMenuName()));
		} catch (Exception e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Exception :", e.toString()));
		}
	}
	
	public  void persist(WebUserMenuMulti  newUser){
		logger.info("persist in dbService : {}, {}", entityManager.contains(newUser), newUser.toString());
		entityManager.persist(newUser);
	}
	
	public void remove(WebUserMenuMulti  removedUser){
		logger.info("remove in dbService : {}, {}", entityManager.contains(removedUser), removedUser.getUserId());
		if(entityManager.contains(removedUser)){
			entityManager.remove(removedUser);
		}
		else{
			removedUser.setMenuGroup(null);
			entityManager.remove(entityManager.merge(removedUser));
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Deleted :", removedUser.getMenuName()));
	}

	public void copy(WebUserMenuMulti  newUser, String userId){
//		entityManager.remove(newUser);
//		newUser.setUserId(userId);
//		entityManager.persist(newUser);
	}

	// *****************************************getter and setter*******************************************


	// ******************************************* private method************


	
	
}
