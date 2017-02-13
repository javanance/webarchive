package com.eugenefe.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.event.Observes;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.CheckboxTreeNode;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.model.DataTableColumn;
import com.eugenefe.qualifiers.OraTakionEm;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.qualifiers.SelectedTable;

@Named
//@SessionScoped
 @ViewScoped
public class PivotTableBeanOld2 implements Serializable {
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
	private List<DataTableColumn> origColumnList = new ArrayList<DataTableColumn>();
	
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


	public PivotTableBeanOld2() {
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

		onTableChange("NCM_MST_PROD_TYPE");
		logger.info("Post Construct DataTableQuery : {}, {}", columnList.size());
		
	}
	
	public void onTableChange(@Observes @SelectedTable String selectedTable){
		this.selectedTable = selectedTable;
		reportLabel.clear();
		columnLabel.clear();
		rowLabel.clear();
		
		reportRootNode =  new CheckboxTreeNode("Root", null);
		colRootNode =  new CheckboxTreeNode("Root", null);
		rowRootNode =  new CheckboxTreeNode("Root", null);
		
		reportRootNode.setSelected(true);
		colRootNode.setSelected(true);
		rowRootNode.setSelected(true);
		
		origColumnList = em.createQuery("from DataTableColumn a where a.dataTableId = :dataTableId order by a.columnNo").setParameter("dataTableId", selectedTable).getResultList();
		generateColumnList();
		
		logger.info("onTableChange : {}, {}", selectedTable, columnList.get(0).getColumnComment());
		
	}
	
	public void addToReport(){
		addTo(reportRootNode, reportLabel);
	}
	
	public void addToColumn(){
		addTo(colRootNode, columnLabel);
	}
	public void addToRow(){
		addTo(rowRootNode, rowLabel);
	}
	
	public void addToContent(){
		
	}
	
	
	public void moveToRow(ActionEvent event){
		
		logger.info("Move To Row Event: {}, {}", event.getSource(), event.getPhaseId());
	}
	
	
	public void onSelectChange(){
		logger.info("onSelectChange : {}, {}", selectedColumnList.size(), selectedColumn);
		logger.info("onSelectChange : {}, {}",  selectedColumnString);
		
	}
	public void onUnselectEvent(NodeUnselectEvent event){
		logger.info("onUnselectEvent : {}, {}", event.getTreeNode().getData(), event.getTreeNode());
		
	}
	public void onSelectEvent(NodeSelectEvent event){
		
		logger.info("onSelectEvent : {}, {}", event.getTreeNode().getData(), event.getTreeNode().getChildCount());
		
	}

//	****************************************private*************************************
	private void moveItems(TreeNode fromTree, List<DataTableColumn> fromArea, TreeNode toTree,  List<DataTableColumn> toArea){
		fromTree.clearParent();
		fromTree.setParent(toTree);
		
//		toArea.add(e);
//		fromArea.remove(index);
	}
	
	private void buildTree(TreeNode rootNode, List<DataTableColumn> addedColumns){
		TreeNode tempNode;
		TreeNode dataTempNode;
		List<Object> distinctList = new ArrayList<Object>();
		String query ;
		
		for(DataTableColumn bb : addedColumns){
			tempNode = new CheckboxTreeNode(bb.getColumnName(), rootNode);
			tempNode.setSelected(true);
			query = "select distinct " + bb.getColumnName() + " from " + selectedTable;
//			query = "select distinct to_char(" + bb.getColumnName() + ") from " + selectedTable;
			distinctList = ncm.createNativeQuery(query).getResultList();
			for(Object cc : distinctList){
				if(cc!=null){
					dataTempNode = new CheckboxTreeNode(cc.toString(), tempNode);
					dataTempNode.setSelected(true);
				}
			}
		}
	}
	
	private List<DataTableColumn> generateSelectedEntityList(){
		List<DataTableColumn> rstList = new ArrayList<DataTableColumn>();
		
		for(String aa : selectedColumnString){
			for(DataTableColumn bb : origColumnList){
				if(aa.equals(bb.getColumnName())){
					rstList.add(bb);
					break;
				}
			}
		}
		return rstList;
	}
	
	private void addTo(TreeNode rootNode, List<DataTableColumn> label){
		List<DataTableColumn> rstList = generateSelectedEntityList();
		label.addAll(rstList);
		columnList.removeAll(rstList);
		buildTree(rootNode, rstList);
	}

	private void generateColumnList(){
		columnList.clear();
		for(DataTableColumn aa : origColumnList){
			columnList.add(aa.getColumnNo()-1, aa);
		}
	}
	
	private DataTableColumn getEntityFrom(String columnName){
		for(DataTableColumn bb : origColumnList){
			if(columnName.equals(bb.getColumnName())){
				return bb;
			}
		}
		return null;
	}
}
