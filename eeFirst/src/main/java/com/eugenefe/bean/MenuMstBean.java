package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.eugenefe.entity.takion.MenuMst;
import com.eugenefe.qualifiers.OraTakionEm;

@Named
@SessionScoped
public class MenuMstBean implements Serializable {
	
	@Inject
	@OraTakionEm
	private EntityManager em;
	
	private List<MenuMst> menuList = new ArrayList<MenuMst>();
	
	public MenuMstBean() {
		System.out.println("MenuMstBean Gen");
	}
	
	@PostConstruct
	public void create(){
		menuList = em.createQuery("from MenuMst a order by a.menuId").getResultList();
		
	}
//	*******************getter and setter*************

	public List<MenuMst> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<MenuMst> menuList) {
		this.menuList = menuList;
	}
	
	
	
	
	
	
	
	
	
}
