package com.eugenefe.producer;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.AllColumnList;
import com.eugenefe.qualifiers.ColumnList;
import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.qualifiers.SelectedTable;
import com.eugenefe.qualifiers.TableList;
import com.eugenefe.qualifiers.TableNode;

//@ViewScoped
public class DataProducer  {
	@Inject
	private Logger logger;
	
	@Inject
	@QueryResource
	private ResourceBundle queries;
	
	@Inject
	@SecondEm
	private EntityManager entityManager;

	public List<String> getTableList(){
		return  entityManager.createNativeQuery(queries.getString("tableList"))
				    	     .setParameter("owner", "NCM")
							 .getResultList();
	}
	
	public List<TableColumn> getAllColumnList(){
		return entityManager.createQuery(queries.getString("jpqlAllColumnList")).getResultList();
	}
	
	
	public List<TableColumn> getColumnList(@Observes @SelectedTable String tableName){
		System.out.println("AAAAAAA"+ tableName);
		return entityManager.createQuery(queries.getString("jpqlColumnList")).setParameter("tableName", tableName).getResultList();
		
	}
	
	public <T> List<T> getDynamicTable(String entityName){
		String queryString = "from " + entityName;
		return entityManager.createQuery("from " + entityName).getResultList();
	};
	
}
