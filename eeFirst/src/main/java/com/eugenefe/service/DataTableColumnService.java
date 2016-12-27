package com.eugenefe.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;

import com.eugenefe.dataholder.SelectedTableNameHolder;
import com.eugenefe.enums.model.ENamingConvention;
import com.eugenefe.model.DataTableColumn;
import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.OraTakionEm;
import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.util.Navigatable;

//@SessionScoped
//@ViewScoped
//@RequestScoped
@Stateless
public class DataTableColumnService implements Serializable {
	@Inject
	private Logger logger;

	@Inject
	@OraTakionEm
	private EntityManager entityManager;

	
	@Inject
	private SelectedTableNameHolder selectedTable;

	private List<DataTableColumn> dataTableColums;

	public DataTableColumnService() {
		System.out.println("DataTableColumnService Generated");
	}

//	@PostConstruct
	public void create() {
		logger.info("DataBaseService PostConstruct0 : {},{}", selectedTable.getTableName());
	}
	

	// *****************************************getter and setter*******************************************

	public SelectedTableNameHolder getSelectedTable() {
		return selectedTable;
	}

	public void setSelectedTable(SelectedTableNameHolder selectedTable) {
		this.selectedTable = selectedTable;
	}

	public List<DataTableColumn> getDataTableColums() {
		return dataTableColums;
	}

	public void setDataTableColums(List<DataTableColumn> dataTableColums) {
		this.dataTableColums = dataTableColums;
	}
	// ******************************************* private method************

	

	/*public List<DataTableColumn> generateColumns(String dataTableId) {
		return entityManager.createQuery("from DataTableColumn a where a.dataTableId = :dataTableId").setParameter("dataTableId", dataTableId).getResultList();

	}*/
	
	
}
