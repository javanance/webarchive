package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.primefaces.model.CheckboxTreeNode;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.model.DataTableColumn;
import com.eugenefe.qualifiers.OraTakionEm;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.qualifiers.SelectedTable;

@Named
//@SessionScoped
 @ViewScoped
public class PivotTableBeanOld implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Logger logger;

	@Inject
	@OraTakionEm
	private EntityManager em;
	
	@Inject
	@SecondEm
	private EntityManager ncm;
	
	private List<DataTableColumn> columnList = new ArrayList<DataTableColumn>();
	
	private List<DataTableColumn> selectedColumnList = new ArrayList<DataTableColumn>();
	private List<String> selectedColumnString= new ArrayList<String>();
	private String selectedString;
	
	
	public String getSelectedString() {
		return selectedString;
	}


	public void setSelectedString(String selectedString) {
		this.selectedString = selectedString;
	}


	public List<String> getSelectedColumnString() {
		return selectedColumnString;
	}


	public void setSelectedColumnString(List<String> selectedColumnString) {
		this.selectedColumnString = selectedColumnString;
	}

	private DataTableColumn selectedColumn;
	
//	private Set<DataTableColumn> reportLabel= new HashSet<DataTableColumn>();
//	private Set<DataTableColumn> columnLabel= new HashSet<DataTableColumn>();
//	private Set<DataTableColumn> rowLabel= new HashSet<DataTableColumn>();
	private List<DataTableColumn> reportLabel= new ArrayList<DataTableColumn>();
	private List<DataTableColumn> columnLabel= new ArrayList<DataTableColumn>();
	private List<DataTableColumn> rowLabel= new ArrayList<DataTableColumn>();
	private List<DataTableColumn> contentLabel= new ArrayList<DataTableColumn>();
	
	private TreeNode reportRootNode;
	private TreeNode colRootNode;
	private TreeNode rowRootNode;
	
	private String selectedTable;
	

	public TreeNode getReportRootNode() {
		return reportRootNode;
	}


	public void setReportRootNode(TreeNode reportRootNode) {
		this.reportRootNode = reportRootNode;
	}


	public TreeNode getColRootNode() {
		return colRootNode;
	}


	public void setColRootNode(TreeNode colRootNode) {
		this.colRootNode = colRootNode;
	}


	public TreeNode getRowRootNode() {
		return rowRootNode;
	}


	public void setRowRootNode(TreeNode rowRootNode) {
		this.rowRootNode = rowRootNode;
	}


	public List<DataTableColumn> getReportLabel() {
		return reportLabel;
	}


	public void setReportLabel(List<DataTableColumn> reportLabel) {
		this.reportLabel = reportLabel;
	}


	public List<DataTableColumn> getColumnLabel() {
		return columnLabel;
	}


	public void setColumnLabel(List<DataTableColumn> columnLabel) {
		this.columnLabel = columnLabel;
	}


	public List<DataTableColumn> getRowLabel() {
		return rowLabel;
	}


	public void setRowLabel(List<DataTableColumn> rowLabel) {
		this.rowLabel = rowLabel;
	}


	public List<DataTableColumn> getContentLabel() {
		return contentLabel;
	}


	public void setContentLabel(List<DataTableColumn> contentLabel) {
		this.contentLabel = contentLabel;
	}


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


	public PivotTableBeanOld() {
		System.out.println("PivotTableBean Gen");

	}

	
	@PostConstruct
	public void init() {
		reportRootNode =  new CheckboxTreeNode("Root", null);
		colRootNode =  new CheckboxTreeNode("Root", null);
		rowRootNode =  new CheckboxTreeNode("Root", null);
		
		TreeNode nullNode = new CheckboxTreeNode("", rowRootNode);
		
		reportRootNode.setSelected(true);
		colRootNode.setSelected(true);
		rowRootNode.setSelected(true);
//		colRootNode =  new DefaultTreeNode("Root", null);
//		reportRootNode =  new DefaultTreeNode("Root", null);
//		rowRootNode =  new DefaultTreeNode("Root", null);
		
		// tableColumnList();
//		logger.info("Post Construct DataTableQuery : {}, {}", loginBean.getLoginUser().getUserId());
		
//		columnList = em.createQuery("from DataTableColumn a where a.dataTableId = :dataTableId").setParameter("dataTableId", "megaMenu").getResultList();
//		queryList = em.createQuery("from QueryStatement a where a.userId = :userId").setParameter("userId", loginBean.getLoginUser().getUserId()).getResultList();
		logger.info("Post Construct DataTableQuery : {}, {}", columnList.size());
		
	}
	
	public void onTableChange(@Observes @SelectedTable String selectedTable){
		this.selectedTable = selectedTable;
		reportLabel.clear();
		columnLabel.clear();
		rowLabel.clear();
		
		TreeNode nullNode = new CheckboxTreeNode("", rowRootNode);
		rowRootNode.getChildren().clear();
		
		reportRootNode =  new CheckboxTreeNode("Root", null);
		colRootNode =  new CheckboxTreeNode("Root", null);
		rowRootNode =  new CheckboxTreeNode("Root", null);
		
		reportRootNode.setSelected(true);
		colRootNode.setSelected(true);
		rowRootNode.setSelected(true);
		
		columnList = em.createQuery("from DataTableColumn a where a.dataTableId = :dataTableId order by a.columnNo").setParameter("dataTableId", selectedTable).getResultList();
		logger.info("onTableChange : {}, {}", selectedTable, columnList.get(0).getColumnComment());
		
	}
	
	public void addToReport(){
		TreeNode reportTempNode;
		TreeNode dataTempNode;
		
		List<Object> distinctList = new ArrayList<Object>();
		String query ;
		for(String aa : selectedColumnString){
			for(DataTableColumn bb : columnList){
				if(aa.equals(bb.getColumnName()) && !reportLabel.contains(bb)){
//					columnLabel.addAll(selectedColumnList);
					reportLabel.add(bb);
					reportTempNode = new CheckboxTreeNode(aa, reportRootNode);
					reportTempNode.setSelected(true);
					query = "select distinct " + aa + " from " + selectedTable;
					distinctList = ncm.createNativeQuery(query).getResultList();
					for(Object cc : distinctList){
						dataTempNode = new CheckboxTreeNode(cc.toString(), reportTempNode);
						dataTempNode.setSelected(true);
					}
					columnList.remove(bb);
					break;
				}
			}
		}
		
	}
	public void addToColumn(){
		addTo(colRootNode, columnLabel);
		
		TreeNode colTempNode;
		TreeNode dataTempNode;
		
/*		List<Object> distinctList = new ArrayList<Object>();
		String query ;
		for(String aa : selectedColumnString){
			for(DataTableColumn bb : columnList){
				if(aa.equals(bb.getColumnName()) && !columnLabel.contains(bb)){
					columnLabel.add(bb);
					colTempNode = new CheckboxTreeNode(aa, colRootNode);
					colTempNode.setSelected(true);
					query = "select distinct " + aa + " from " + selectedTable;
					distinctList = ncm.createNativeQuery(query).getResultList();
					for(Object cc : distinctList){
						dataTempNode = new CheckboxTreeNode(cc.toString(), colTempNode);
						dataTempNode.setSelected(true);
					}
					columnList.remove(bb);
					break;
				}
			}
		}*/
		logger.info("Add To Column : {}, {}", colRootNode.getChildCount(), columnLabel.size());
		
	}
	public void addToRow(){
		TreeNode rowTempNode;
		TreeNode dataTempNode;
		List<Object> distinctList = new ArrayList<Object>();
//		List<String> distinctList = new ArrayList<String>();
		String query ;
		for(String aa : selectedColumnString){
			for(DataTableColumn bb : columnList){
				if(aa.equals(bb.getColumnName()) && !rowLabel.contains(bb)){
//					columnLabel.addAll(selectedColumnList);
					rowLabel.add(bb);
					rowTempNode = new CheckboxTreeNode(aa, rowRootNode);
					rowTempNode.setSelected(true);
					query = "select distinct " + aa + " from " + selectedTable;
					distinctList = ncm.createNativeQuery(query).getResultList();
					for(Object cc : distinctList){
						logger.info("null check :{}", cc.toString());
						dataTempNode = new CheckboxTreeNode(cc.toString(), rowTempNode);
						dataTempNode.setSelected(true);
					}
					columnList.remove(bb);
					break;
				}
			}
		}
		
	}
	public void addToContent(){
		contentLabel.addAll(selectedColumnList);
		
	}
	
	public void onSelectChange(){
		logger.info("onSelectChange : {}, {}", selectedColumnList.size(), selectedColumn);
//		logger.info("onSelectChange : {}, {}",  selectedColumn.getColumnName());
		
	}

//	****************************************private*************************************
	
	private void addTo(TreeNode rootNode, List<DataTableColumn> label){
		TreeNode tempNode;
		TreeNode dataTempNode;
		List<Object> distinctList = new ArrayList<Object>();
//		List<String> distinctList = new ArrayList<String>();
		
		String query ;
		for(String aa : selectedColumnString){
			for(DataTableColumn bb : columnList){
				if(aa.equals(bb.getColumnName()) && !label.contains(bb)){
					label.add(bb);
					columnList.remove(bb);
					tempNode = new CheckboxTreeNode(aa, rootNode);
					tempNode.setSelected(true);
					query = "select distinct " + aa + " from " + selectedTable;
					distinctList = ncm.createNativeQuery(query).getResultList();
					for(Object cc : distinctList){
						logger.info("null check :{},{}", distinctList.size(), cc.toString());
						dataTempNode = new CheckboxTreeNode(cc.toString(), tempNode);
						dataTempNode.setSelected(true);
					}
					break;
				}
			}
		}
	}
}
