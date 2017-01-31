package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;

import com.eugenefe.model.DataTableColumn;
import com.eugenefe.model.QueryStatement;
import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.OraTakionEm;
import com.eugenefe.qualifiers.SelectedTable;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.util.SelectUtils;

@Named
@SessionScoped
// @ViewScoped
public class PivotTableBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Logger logger;

	@Inject
	@OraTakionEm
	private EntityManager em;
	
	private List<String> colList = new ArrayList<String>();
	private List<String> selColList = new ArrayList<String>();
	
	public List<String> getColList() {
		return colList;
	}


	public void setColList(List<String> colList) {
		this.colList = colList;
	}


	public List<String> getSelColList() {
		return selColList;
	}


	public void setSelColList(List<String> selColList) {
		this.selColList = selColList;
	}

	private List<DataTableColumn> columnList = new ArrayList<DataTableColumn>();
	
	private List<DataTableColumn> selectedColumnList ;
	
	private DataTableColumn selectedColumn;
	
	

	public DataTableColumn getSelectedColumn() {
		return selectedColumn;
	}


	public void setSelectedColumn(DataTableColumn selectedColumn) {
		this.selectedColumn = selectedColumn;
	}


	public List<DataTableColumn> getSelectedColumnList() {
		return selectedColumnList;
	}


	public void setSelectedColumnList(List<DataTableColumn> selectedColumnList) {
		this.selectedColumnList = selectedColumnList;
	}


	public List<DataTableColumn> getColumnList() {
		return columnList;
	}


	public void setColumnList(List<DataTableColumn> columnList) {
		this.columnList = columnList;
	}


	public PivotTableBean() {
		System.out.println("PivotTableBean Gen");

	}

	
	@PostConstruct
	public void init() {
		// tableColumnList();
//		logger.info("Post Construct DataTableQuery : {}, {}", loginBean.getLoginUser().getUserId());
		
		columnList = em.createQuery("from DataTableColumn a where a.dataTableId = :dataTableId").setParameter("dataTableId", "megaMenu").getResultList();
		colList = em.createQuery("select a.columnName from DataTableColumn a where a.dataTableId = :dataTableId").setParameter("dataTableId", "megaMenu").getResultList();
//		queryList = em.createQuery("from QueryStatement a where a.userId = :userId").setParameter("userId", loginBean.getLoginUser().getUserId()).getResultList();
		logger.info("Post Construct DataTableQuery : {}, {}", columnList.size(), colList.size());
		
	}
	
	public void onTableChange(@Observes @SelectedTable String selectedTable){
		logger.info("onTableChange : {}, {}", selectedTable);
		columnList = em.createQuery("from DataTableColumn a where a.dataTableId = :dataTableId").setParameter("dataTableId", selectedTable).getResultList();
		
	}

//	****************************************private*************************************
}
