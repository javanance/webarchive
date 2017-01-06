package com.eugenefe.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

import com.eugenefe.entity.takion.WebUserMenu;
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
		return entityManager.createQuery("from WebUserMenuMulti a left join fetch a.menu where a.userId=:userId order by a.menuGroup, a.menuColumn").setParameter("userId", userId).getResultList();
	}
//****************************	crud*************************
	public void merge(WebUserMenuMulti  newUser){
		logger.info("merge in dbService : {}, {}", entityManager.contains(newUser), newUser.getMenu().getMenuId());
			entityManager.merge(newUser.getMenu());
			entityManager.merge(newUser);
	}
	
	public  void persist(WebUserMenuMulti  newUser){
		logger.info("persist in dbService : {}, {}", entityManager.contains(newUser), newUser.toString());
		entityManager.persist(newUser);
	}
	
	public void remove(WebUserMenuMulti  removedUser){
		logger.info("remove in dbService : {}, {}", entityManager.contains(removedUser), removedUser.getUserId());
		entityManager.remove(entityManager.contains(removedUser) ? removedUser : entityManager.merge(removedUser));
	}

	public void copy(WebUserMenuMulti  newUser, String userId){
//		entityManager.remove(newUser);
//		newUser.setUserId(userId);
//		entityManager.persist(newUser);
	}

	// *****************************************getter and setter*******************************************


	// ******************************************* private method************


	
	
}
