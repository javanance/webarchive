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

import org.primefaces.event.SelectEvent;
import org.slf4j.Logger;

import com.eugenefe.model.QueryStatement;
import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.OraTakionEm;

import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.util.SelectUtils;

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

	@Inject
	private LoginBean loginBean;
	
	private String inputQueryText;
	private String queryText;
	private QueryStatement selectedHistoryQuery;
	private QueryStatement selectedListQuery;
	
	
	
	public QueryStatement getSelectedHistoryQuery() {
		return selectedHistoryQuery;
	}

	public void setSelectedHistoryQuery(QueryStatement selectedHistoryQuery) {
		this.selectedHistoryQuery = selectedHistoryQuery;
	}

	public QueryStatement getSelectedListQuery() {
		return selectedListQuery;
	}

	public void setSelectedListQuery(QueryStatement selectedListQuery) {
		this.selectedListQuery = selectedListQuery;
	}

	
	private List<QueryStatement> queryList = new ArrayList<QueryStatement>();
	private List<QueryStatement> queryHistory = new ArrayList<QueryStatement>();
	
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
		logger.info("Post Construct DataTableQuery : {}, {}", loginBean.getLoginUser().getUserId());
		
		
//		queryList = em.createQuery("from QueryStatement a where a.userId = :userId").setParameter("userId", user.getUserId()).getResultList();
		queryList = em.createQuery("from QueryStatement a where a.userId = :userId").setParameter("userId", loginBean.getLoginUser().getUserId()).getResultList();
		
	}

	public List<QueryStatement> getQueryHistory() {
		return queryHistory;
	}

	public void setQueryHistory(List<QueryStatement> queryHistory) {
		this.queryHistory = queryHistory;
	}

	public List<QueryStatement> getQueryList() {
		return queryList;
	}

	public void setQueryList(List<QueryStatement> queryList) {
		this.queryList = queryList;
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
		
		FacesContext context = FacesContext.getCurrentInstance();
		logger.info("Query Input: {}, {}",  inputQueryText);
		queryHistory.add(new QueryStatement(queryHistory.size()+1, "takion77", inputQueryText));
		
		try {
			
			Select select = (Select) CCJSqlParserUtil.parse(inputQueryText);
			logger.info("Query Parser: {}, {}",  select.getSelectBody(), select.toString());
			SelectUtils.addExpression(select, new Column("1 as dummy"));
			queryText = select.toString().toUpperCase();
			logger.info("Query Parser1: {}, {}",  select.getSelectBody(),select.getWithItemsList());
			
		} catch (Exception e) {
			logger.info("Query Syntax Error: {}, {}", e, inputQueryText);
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Query Syntax Error", ""));
			return;
			// TODO: handle exception
		}
		
//		queryText= trimQuery(inputQueryText);
//		queryText = inputQueryText;
		logger.info("Query Trim: {}, {}", queryText);
		try {
			rstList.clear();
			rstList = em.createNativeQuery(queryText).getResultList();
		} catch (Exception e) {
			logger.info("JPA error : {}, {}", e, inputQueryText);
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Query Syntax Error", e.getCause().getLocalizedMessage()));
			return;
			// TODO: handle exception
		}

		tableColumnList.clear();
		String[] defCols = new String[rstList.get(0).length];
		TableColumn temp;
		int j = 0;
		for (int i = 0; i < defCols.length-1; i++) {
			temp = new TableColumn();
			temp.setColumnId(i);
			j = j + 1;
			temp.setColumnName("Col_" + j);
			temp.setAlingType("left");
			tableColumnList.add(temp);
		}
		
		String[] cols = queryText.split("FROM")[0].split("SELECT")[1].split(",");
		if (defCols.length == cols.length) {
			for (int i = 0; i < cols.length-1; i++) {
				logger.info("columns : {}, {}", cols[i], cols.length);
				tableColumnList.get(i).setColumnName(extractAlias(cols[i]));
			}
		}
		logger.info("Run Sql: {}, {}", queryText);
		
		
		
	}
	
	public void onSelectEvent(SelectEvent event){
		logger.info("on Select Event : {}, {}", inputQueryText, selectedHistoryQuery.getQueryStatement());
		inputQueryText = selectedHistoryQuery.getQueryStatement();
	}
	
	public void delete(){
		logger.info("on delete : {}, {}",  selectedHistoryQuery.getQueryStatement());
		queryHistory.remove(selectedHistoryQuery);
	}
	public void deleteAll(){
		queryHistory.clear();
	}
	
	public void saveAll(){
		
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
	
	public List<String> completeArea(String query) {
        List<String> results = new ArrayList<String>();
         
        if(query.toLowerCase().contains("sel")) {
            results.add("Select ");
            results.add("Select *");
        }
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }
         
        return results;
    }
//	****************************************private*************************************
	private String extractAlias(String projectioin) {
		String[] parsedString = projectioin.split(" AS ");
		return parsedString[parsedString.length - 1];

	}
	private String trimQuery(String inputQuery){
		String[] lineString =  inputQuery.split("\n");
		String trimString = "";
		String rtnText="";
		for(int j=0; j< lineString.length; j++){
//			trimString = lineString[j].replaceAll("\t", " ").replaceAll("\n", " ").replaceAll("\\s", " ").replaceAll(";", "").replaceAll("--.*", "").replaceAll("select ", "select rownum as defaultz, ");;
			trimString = lineString[j].replaceAll("\t", " ").replaceAll("\n", " ").replaceAll("\\s", " ").replaceAll(";", "").replaceAll("--.*", "");
			logger.info("Trim Query: {}, {}", trimString, lineString[j]);
			rtnText = rtnText + trimString;
		}
		return rtnText;
	}
}
