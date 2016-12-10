package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.omnifaces.cdi.Param;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.qualifiers.SelectedTable;
import com.eugenefe.service.DataBaseService;

//import org.jboss.seam.framework.Query;

@Named
@ViewScoped
//@RequestScoped
public class ReportViewerBean implements Serializable{
	@Inject 	
	private Logger logger;
	
//	@Inject
//	private DataBaseService dbService;
	
	

	@Inject
	@SecondEm
	private EntityManager entityManager;
	
	private List<Object[]> rptData;
	
	private List<TableColumn> tableColumn;
	
	public ReportViewerBean() {
		System.out.println("Construction ReportViewerBean_" );
	}
	
	
	@PostConstruct
	public void init(){
		logger.info("PostConstruct :{}");
		String allColumnList = "select a.table_name, a.column_name, a.data_type  from all_tab_columns a where a.owner = :owner order by a.table_name, a.column_id";
		tableColumn = new ArrayList<TableColumn>();
		TableColumn aa = new TableColumn();
		aa.setColumnId(1);
		aa.setColumnName("aaa");
		aa.setCamelColumnName("aaaa");
		
		TableColumn bb = new TableColumn();
		bb.setColumnId(2);
		bb.setColumnName("bb");
		bb.setCamelColumnName("bb");
		
		TableColumn cc = new TableColumn();
		cc.setColumnId(3);
		cc.setColumnName("cc");
		cc.setCamelColumnName("cc");
		tableColumn.add(aa);
		tableColumn.add(bb);
		tableColumn.add(cc);
		
		rptData = entityManager.createNativeQuery(allColumnList).setParameter("owner", "NCM").getResultList();
		
		
	}

//	*************************getter and setter***********************************************

	public List<Object[]> getRptData() {
		return rptData;
	}


	public void setRptData(List<Object[]> rptData) {
		this.rptData = rptData;
	}


	public List<TableColumn> getTableColumn() {
		return tableColumn;
	}


	public void setTableColumn(List<TableColumn> tableColumn) {
		this.tableColumn = tableColumn;
	}
	
}
