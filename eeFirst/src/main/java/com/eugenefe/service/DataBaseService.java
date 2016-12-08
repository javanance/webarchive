package com.eugenefe.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;

import com.eugenefe.dataholder.SelectedTableNameHolder;
import com.eugenefe.enums.ENamingConvention;
import com.eugenefe.model.TableColumn;
import com.eugenefe.ncm.NcmErpTxIfr;
import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.util.Navigatable;

//@SessionScoped
//@ViewScoped
//@RequestScoped
public class DataBaseService implements Serializable {
	@Inject
	private Logger logger;

	@Inject
	@QueryResource
	private ResourceBundle queries;

	@Inject
	@SecondEm
	private EntityManager entityManager;

	@Inject
	private SelectedTableNameHolder selectedTable;

	private List<TableColumn> tableColumns;

	private List<Object> tableContents;

	private List<Navigatable> tableLazyContents;

	public DataBaseService() {
		System.out.println("DataBaseService Generated");
	}

	@PostConstruct
	public void create() {
		if (selectedTable.getTableName() != null) {
			logger.info("DataBaseService PostConstruct : {},{}", selectedTable.getTableName());
			// this.tableColumns = getColumnList(selectedTable.getTableName());
			// this.tableContents =
			// getDynamicTable(selectedTable.getTableName());
			setTableColumns(generateColumns(selectedTable.getTableName()));
			setTableContents(generateTableContents(selectedTable.getTableName()));

			logger.info("DataBaseService PostConstruct1 : {},{}", tableColumns.size(), tableContents.size());
		}
	}

	// *****************************************getter and setter*******************************************
	public List<TableColumn> getTableColumns() {
		// logger.info("GetTableColumn :{}", tableColumns);
		return tableColumns;
	}

	public void setTableColumns(List<TableColumn> tableColumns) {
		this.tableColumns = tableColumns;
	}

	public List<Object> getTableContents() {
		// logger.info("GetTableContents : {}", tableContents);
		return tableContents;
	}

	public void setTableContents(List<Object> tableContents) {
		this.tableContents = tableContents;
	}

	public SelectedTableNameHolder getSelectedTable() {
		return selectedTable;
	}

	public void setSelectedTable(SelectedTableNameHolder selectedTable) {
		this.selectedTable = selectedTable;
	}
	public List<Navigatable> getTableLazyContents() {
		return tableLazyContents;
	}

	public void setTableLazyContents(List<Navigatable> tableLazyContents) {
		this.tableLazyContents = tableLazyContents;
	}

	// ******************************************* private method************

	

	public List<Object> generateTableContents(String tableName) {
		// if(tabelName1 == null || tabelName1 ==""){
		// tabelName1 ="NCM_MST_PROD_TYPE";
		// }
		// logger.info("DataBaseService_getDynamicTable : {}", tableName);
		String entityName = WordUtils.capitalizeFully(tableName, new char[] { '_' }).replaceAll("_", "");
		String queryString = "from " + entityName;
		return entityManager.createQuery("from " + entityName).getResultList();
	}

	public List<TableColumn> generateColumns(String tableName) {
		// if(tableName1 ==null || tableName1 ==""){
		// tableName1 ="NCM_MST_PROD_TYPE";
		// }
		// logger.info("DataBaseService_getDynamicTable : {}", tableName);
		return entityManager.createQuery(queries.getString("jpqlColumnList")).setParameter("tableName", tableName).getResultList();
		// return entityManager.createQuery("from TableColumn a where a.owner=
		// 'NCM' and a.tableName = :tableName order by
		// a.columnId").setParameter("tableName", tableName).getResultList();

	}
	
	public List<Navigatable> generateTableLazyContents(String tableName) {
		logger.info("DataBaseService_entity Name : {}",ENamingConvention.SNAKE_CASE.convertToCamelCase(tableName));
		String entityName = WordUtils.capitalizeFully(tableName, new char[] { '_' }).replaceAll("_", "");
		String queryString = "from " + entityName;
		List<Object> aaa = entityManager.createQuery("from " + entityName).getResultList();
		
		logger.info("DataBaseService_generateTableLazyContents : {}", aaa.size());
		
		List<Navigatable> bbb = new ArrayList<Navigatable>();
		for(Object zz : aaa){
			bbb.add((Navigatable)zz);
		}
		return bbb;
	}
	
	public List<NcmErpTxIfr> generateTableLazyContents1(String tableName) {
		logger.info("DataBaseService_entity Name : {}",ENamingConvention.SNAKE_CASE.convertToCamelCase(tableName));
		String entityName = WordUtils.capitalizeFully(tableName, new char[] { '_' }).replaceAll("_", "");
		String queryString = "from " + entityName;
		List<Object> aaa = entityManager.createQuery("from " + entityName).getResultList();
		
		logger.info("DataBaseService_generateTableLazyContents : {}", aaa.size());
		
		List<NcmErpTxIfr> bbb = new ArrayList<NcmErpTxIfr>();
		for(Object zz : aaa){
			bbb.add((NcmErpTxIfr)zz);
		}
		return bbb;
	}
}