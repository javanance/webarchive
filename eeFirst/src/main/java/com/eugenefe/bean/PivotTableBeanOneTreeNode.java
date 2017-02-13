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
public class PivotTableBeanOneTreeNode implements Serializable {
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
	
	
	public List<DataTableColumn> getOrigColumnList() {
		return origColumnList;
	}


	public void setOrigColumnList(List<DataTableColumn> origColumnList) {
		this.origColumnList = origColumnList;
	}

	private TreeNode selectedNode;
	
	public TreeNode getSelectedNode() {
		return selectedNode;
	}


	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}


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
	
	private TreeNode rootNode;
	
	public TreeNode getRootNode() {
		return rootNode;
	}


	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

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


	public PivotTableBeanOneTreeNode() {
		System.out.println("PivotTableBean Gen");

	}

	@PostConstruct
	public void init() {
		reportRootNode =  new CheckboxTreeNode("report", null);
		colRootNode =  new CheckboxTreeNode("column", null);
		rowRootNode =  new CheckboxTreeNode( "row", null);
		
		rootNode = new CheckboxTreeNode("root", null);
		
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
		
	/*	reportRootNode =  new CheckboxTreeNode("report", "report", null);
		colRootNode =  new CheckboxTreeNode("column","column", null);
		rowRootNode =  new CheckboxTreeNode("row", "row", null);*/
		
		reportRootNode =  new CheckboxTreeNode("report", null);
		colRootNode =  new CheckboxTreeNode("column", null);
		rowRootNode =  new CheckboxTreeNode( "row", null);
		
		reportRootNode.setSelected(true);
		colRootNode.setSelected(true);
		rowRootNode.setSelected(true);
		
		origColumnList = em.createQuery("from DataTableColumn a where a.dataTableId = :dataTableId order by a.columnNo").setParameter("dataTableId", selectedTable).getResultList();
		generateColumnList();
		
		logger.info("onTableChange : {}, {}", selectedTable, columnList.get(0).getColumnComment());
		
	}
	public void remove(String area){
		if(area.equals("column")){
			columnLabel.remove(selectedColumn);
			colRootNode.getChildren().remove(selectedNode);
			
			logger.info("remove : {}, {}", selectedColumn.getColumnName(), selectedNode.getData() );
			
		}
		else if (area.equals("row")) {
			rowLabel.remove(selectedColumn);
			rowRootNode.getChildren().remove(selectedNode);
		}
		else if (area.equals("report")) {
			reportLabel.remove(selectedColumn);
			reportRootNode.getChildren().remove(selectedNode);

		}
		else if (area.equals("content")) {
			contentLabel.remove(selectedColumn);
//			contentRootNode.getChildren().remove(selectedNode);
		}
		columnList.add(selectedColumn);
	}
	
	public void addToReport(){
//		addTo(reportRootNode, reportLabel);
		addTo("report", reportLabel);
	}
	
	public void addToColumn(){
//		addTo(colRootNode, columnLabel);
		addTo("column", columnLabel);
		logger.info("addToColumn : {}, {}",  columnLabel.size());
	}
	public void addToRow(){
//		addTo(rowRootNode, rowLabel);
		addTo("row", rowLabel);
	}
	
	public void addToContent(){
		
	}
	
	public void reset(){
		onTableChange(selectedTable);
	}
	
	public void moveToRow(ActionEvent event){
		
		logger.info("Move To Row Event: {}, {}", event.getSource(), event.getPhaseId());
	}
	
	
	public void onSelectChange(){
		for(DataTableColumn aa : selectedColumnList){
			logger.info("onSelectChange : {}, {}",  aa.getColumnName(), aa.getColumnComment());
		}
		
	}
	public void onUnselectEvent(NodeUnselectEvent event){
		if(event.getTreeNode().getType().equals("Leaf")){
			selectedNode = selectedNode.getParent();
		}else{
			selectedNode = event.getTreeNode();
		}
		selectedColumn = getEntityFrom(event.getTreeNode().toString().split(":")[0]);
		logger.info("onUnselectEvent : {}, {}", event.getTreeNode().getData(), selectedColumn);
		
	}
	public void onSelectEvent(NodeSelectEvent event){
		if(event.getTreeNode().getType().equals("Leaf")){
			selectedNode = selectedNode.getParent();
		}else{
			selectedNode = event.getTreeNode();
		}
		selectedColumn = getEntityFrom(event.getTreeNode().toString().split(":")[0]);
		logger.info("onSelectEvent : {}, {}", event.getTreeNode().getData(), selectedNode.getType());
		
	}

//	****************************************private*************************************
	private void generateColumnList(){
		columnList.clear();
		for(DataTableColumn aa : origColumnList){
//			if(aa.getColumnNo()==2) {
//				aa.setUsed(true);
//			}
//			aa.setUsed(true);
			columnList.add(aa.getColumnNo()-1, aa);
		}
	}
	
	
	
	
	private void moveItems(TreeNode fromTree, List<DataTableColumn> fromArea, TreeNode toTree,  List<DataTableColumn> toArea){
		fromTree.clearParent();
		fromTree.setParent(toTree);
		
//		toArea.add(e);
//		fromArea.remove(index);
	}
	
	private void buildTree(String area, List<DataTableColumn> addedColumns){
		TreeNode tempNode;
		TreeNode dataTempNode;
		List<Object> distinctList = new ArrayList<Object>();
		String query ;
		
		for(DataTableColumn bb : addedColumns){
			tempNode = new CheckboxTreeNode(area, bb.getColumnName()+":"+bb.getColumnComment(), rootNode);
			tempNode.setSelected(true);
			query = "select distinct " + bb.getColumnName() + " from " + selectedTable;
//			query = "select distinct to_char(" + bb.getColumnName() + ") from " + selectedTable;
			distinctList = ncm.createNativeQuery(query).getResultList();
			for(Object cc : distinctList){
				if(cc!=null){
					dataTempNode = new CheckboxTreeNode("Leaf", cc.toString(), tempNode);
					dataTempNode.setSelected(true);
				}
			}
		}
	}
	private void buildTree1(TreeNode rootNode, List<DataTableColumn> addedColumns){
		TreeNode tempNode;
		TreeNode dataTempNode;
		List<Object> distinctList = new ArrayList<Object>();
		String query ;
		
		for(DataTableColumn bb : addedColumns){
			logger.info("Build Tree : {},{}", rootNode.getData().toString(), rootNode.getData());
			tempNode = new CheckboxTreeNode(rootNode.getData().toString(), bb.getColumnName()+":"+bb.getColumnComment(), rootNode);
			tempNode.setSelected(true);
			query = "select distinct " + bb.getColumnName() + " from " + selectedTable;
//			query = "select distinct to_char(" + bb.getColumnName() + ") from " + selectedTable;
			distinctList = ncm.createNativeQuery(query).getResultList();
			for(Object cc : distinctList){
				if(cc!=null){
					dataTempNode = new CheckboxTreeNode("Leaf", cc.toString(), tempNode);
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
//		List<DataTableColumn> rstList = generateSelectedEntityList();
		List<DataTableColumn> rstList = selectedColumnList;
		label.addAll(rstList);
		columnList.removeAll(rstList);
		buildTree1(rootNode, rstList);
	}

	private void addTo(String area, List<DataTableColumn> label){
//		List<DataTableColumn> rstList = generateSelectedEntityList();
		List<DataTableColumn> rstList = selectedColumnList;
		label.addAll(rstList);
		columnList.removeAll(rstList);
		buildTree(area, rstList);
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
