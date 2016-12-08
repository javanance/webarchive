package com.eugenefe.old;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;

import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.qualifiers.SelectedTable;

//@SessionScoped
//@ViewScoped
public class DataProducer implements Serializable{
	@Inject
	private Logger logger;
	
//	@Inject
//	@QueryResource
	private ResourceBundle queries;
	
	@Inject
	@SecondEm
	private EntityManager entityManager;
	
	private List<TableColumn>  tableColumns;
	
	private List<Object> tableContents;
	
	

	public List<TableColumn> getTableColumns() {
		logger.info("GetTableColumn : {}", tableColumns.size());
		return tableColumns;
	}

	public void setTableColumns(List<TableColumn> tableColumns) {
		this.tableColumns = tableColumns;
	}

	public List<Object> getTableContents() {
		logger.info("GetTableContents : {}", tableContents.size());
		return tableContents;
	}

	public void setTableContents(List<Object> tableContents) {
		this.tableContents = tableContents;
	}

	public DataProducer() {
		System.out.println("DataProducer Generated");
	}

	public List<String> getTableList(){
		return  entityManager.createNativeQuery(queries.getString("tableList"))
				    	     .setParameter("owner", "NCM")
							 .getResultList();
	}
	
	public List<TableColumn> getAllColumnList(){
//		return entityManager.createQuery(queries.getString("jpqlAllColumnList")).getResultList();
		return entityManager.createQuery("from TableColumn a where a.owner= 'NCM'").getResultList();
	}
	
	public void onChange( String tableName){
//		public void onChange(@Observes @SelectedTable String tableName){	
		tableColumns = getColumnList1(tableName);
		tableContents = getDynamicTable1(tableName);
		logger.info("OnChange : {},{}", tableName);
	}
	
	/*public List<TableColumn> getColumnList(@Observes @SelectedTable String tableName1){
		if(tableName1 ==null || tableName1 ==""){
			tableName1 ="NCM_MST_PROD_TYPE";
		}
		System.out.println("DataProducer_getColumnList_"+ tableName1);
//		return entityManager.createQuery(queries.getString("jpqlColumnList")).setParameter("tableName", tableName).getResultList();
		return entityManager.createQuery("from TableColumn a where a.owner= 'NCM' and a.tableName = :tableName order by a.columnId").setParameter("tableName", tableName1).getResultList();
		
	}
	
	public <T> List<T> getDynamicTable(@Observes @SelectedTable String tabelName1){
		if(tabelName1 == null || tabelName1 ==""){
			System.out.println("DataProducer_getDynamicTable_NUll_"+ tabelName1);
			tabelName1 ="NCM_MST_PROD_TYPE";
		}
		System.out.println("DataProducer_getDynamicTable_"+ tabelName1);
		String entityName = WordUtils.capitalizeFully(tabelName1, new char[]{'_'}).replaceAll("_", "");
		String queryString = "from " + entityName;
		return entityManager.createQuery("from " + entityName).getResultList();
	};*/
	
	public  List<Object> getDynamicTable1(String tabelName1){
		if(tabelName1 == null || tabelName1 ==""){
			tabelName1 ="NCM_MST_PROD_TYPE";
		}
		System.out.println("DataProducer_getDynamicTable1_"+ tabelName1);
		String entityName = WordUtils.capitalizeFully(tabelName1, new char[]{'_'}).replaceAll("_", "");
		String queryString = "from " + entityName;
		return entityManager.createQuery("from " + entityName).getResultList();
	};
	
	public List<TableColumn> getColumnList1(String tableName1){
		if(tableName1 ==null || tableName1 ==""){
			tableName1 ="NCM_MST_PROD_TYPE";
		}
		System.out.println("DataProducer_getColumnList_"+ tableName1);
//		return entityManager.createQuery(queries.getString("jpqlColumnList")).setParameter("tableName", tableName).getResultList();
		return entityManager.createQuery("from TableColumn a where a.owner= 'NCM' and a.tableName = :tableName order by a.columnId").setParameter("tableName", tableName1).getResultList();
		
	}
	
}
