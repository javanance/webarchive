package com.eugenefe.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.text.WordUtils;
import org.hibernate.Session;
import org.slf4j.Logger;

import com.eugenefe.dataholder.SelectedTableNameHolder;
import com.eugenefe.enums.model.ENamingConvention;
import com.eugenefe.model.DataTableColumn;
import com.eugenefe.model.MegaMenu;
import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.OraTakionEm;
import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.util.Navigatable;

//@SessionScoped
//@ViewScoped
//@RequestScoped
@Stateless
public class MegaMenuDbService implements Serializable {
	@Inject
	private Logger logger;

	@Inject
	@OraTakionEm
	private EntityManager entityManager;

	private List<DataTableColumn> dataTableColums;

	public MegaMenuDbService() {
		System.out.println("MegaMenuDbService Generated");
	}

	public List<MegaMenu> fetchMegaMenu(){
//		List<MegaMenu> megaMenuList =entityManager.createQuery("from MegaMenu").getResultList();
//				for(MegaMenu aa : megaMenuList){
//					logger.info("Entity State : {},{}", entityManager.contains(aa));
//				}
		return entityManager.createQuery("from MegaMenu a order by a.menuId").getResultList();
	}
	
	public List<DataTableColumn> fetchMeta(String dataTable){
		return entityManager.createQuery("from DataTableColumn a where a.dataTableId = :dataTable order by a.columnNo").setParameter("dataTable", dataTable).getResultList();
	}
	
	public List<DataTableColumn> fetchMegaMenuMeta(){
		return entityManager.createQuery("from DataTableColumn a where a.dataTableId = 'megaMenu' order by a.columnNo").getResultList();
	}
	
	public void merge(MegaMenu  megaMenu){
		logger.info("merge in dbService : {}, {}", entityManager.contains(megaMenu), megaMenu.toString());
			entityManager.merge(megaMenu);
//		entityManager.flush();
		logger.info("merge1 : {}, {}", entityManager.contains(megaMenu), megaMenu.toString());
	}
	
	public  void persist(MegaMenu  megaMenu){
		logger.info("persist in dbService : {}, {}", entityManager.contains(megaMenu), megaMenu.toString());
		entityManager.persist(megaMenu);
	}
	
	public void remove(MegaMenu  megaMenu){
		logger.info("remove in dbService : {}, {}", entityManager.contains(megaMenu), megaMenu.getMenuId());
		entityManager.remove(entityManager.contains(megaMenu) ? megaMenu : entityManager.merge(megaMenu));
	}

	// *****************************************getter and setter*******************************************

	public List<DataTableColumn> getDataTableColums() {
		return dataTableColums;
	}

	public void setDataTableColums(List<DataTableColumn> dataTableColums) {
		this.dataTableColums = dataTableColums;
	}

	// ******************************************* private method************


	
	
}
