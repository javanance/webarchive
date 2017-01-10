package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.OraTakionEm;

@Named
@SessionScoped
// @ViewScoped
public class DataTableQueryBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Logger logger;

	@Inject
	@OraTakionEm
	private EntityManager em;

	private String inputQueryText;
	private String queryText;
	private List<Object[]> rstList = new ArrayList<Object[]>();
	private List<TableColumn> tableColumnList = new ArrayList<TableColumn>();
	
	private List<String> tabList = new ArrayList<String>();
	

	public List<String> getTabList() {
		return tabList;
	}

	public void setTabList(List<String> tabList) {
		this.tabList = tabList;
	}

	public DataTableQueryBean() {
		System.out.println("DataTableQueryBean Gen");

	}

	@PostConstruct
	public void init() {
		rstList.clear();
//		tabList.clear();
		tabList.add("editor_1");
		tabList.add("+");
		// tableColumnList();
	}

	public String getInputQueryText() {
		return inputQueryText;
	}

	public void setInputQueryText(String inputQueryText) {
		this.inputQueryText = inputQueryText;
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public List<Object[]> getRstList() {
		return rstList;
	}

	public void setRstList(List<Object[]> rstList) {
		this.rstList = rstList;
	}

	public List<TableColumn> getTableColumnList() {
		return tableColumnList;
	}

	public void setTableColumnList(List<TableColumn> tableColumnList) {
		this.tableColumnList = tableColumnList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void runSql() {
		
		logger.info("Query: {}, {}",  inputQueryText);
		queryText= trimQuery(inputQueryText);
		logger.info("Query: {}, {}", queryText, inputQueryText);
		rstList = em.createNativeQuery(queryText).getResultList();

		tableColumnList.clear();
		String[] defCols = new String[rstList.get(0).length];
		TableColumn temp;
		int j = 0;
		for (int i = 1; i < defCols.length; i++) {
			temp = new TableColumn();
			temp.setColumnId(i);
			j = j + 1;
			temp.setColumnName("Col_" + j);
			temp.setAlingType("left");
			tableColumnList.add(temp);
		}

		String[] cols = queryText.split("from")[0].split("select")[1].split(",");
		if (defCols.length == cols.length) {
			for (int i = 1; i < cols.length; i++) {
				tableColumnList.get(i-1).setColumnName(extractAlias(cols[i]));
			}
		}
		logger.info("Run Sql: {}, {}", queryText, inputQueryText);
	}
	
	
	public void runSql1() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Submitted with Hotkey"));
	}
	
	public void queryUpdate(AjaxBehaviorEvent event){
		logger.info("Update Query: {}", event.getSource());
		queryText = trimQuery(inputQueryText);
	}
	
	public void queryUpdate1(){
		queryText = trimQuery(inputQueryText);
	}
//	****************************************private*************************************
	private String extractAlias(String projectioin) {
		String[] parsedString = projectioin.split(" as ");
		return parsedString[parsedString.length - 1];

	}
	private String trimQuery(String inputQuery){
		String[] lineString =  inputQuery.split("\n");
		String trimString = "";
		String rtnText="";
		for(int j=0; j< lineString.length; j++){
			trimString = lineString[j].replaceAll("\t", " ").replaceAll("\n", " ").replaceAll("\\s", " ").replaceAll(";", "").replaceAll("--.*", "").replaceAll("select ", "select rownum as defaultz, ");;
			logger.info("Trim Query: {}, {}", trimString, lineString[j]);
			rtnText = rtnText + trimString;
		}
		return rtnText;
	}
}
