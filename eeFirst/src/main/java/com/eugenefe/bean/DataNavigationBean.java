package com.eugenefe.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.service.TableNameTreeService;

@Named
@ViewScoped
//@RequestScoped
// @SessionScoped
public class DataNavigationBean implements Serializable{
	 private static final long serialVersionUID = 1L;

	@Inject
	private Logger logger;

	private TreeNode rootNode;
	
	private TreeNode selectedNode;
	
	@Inject
	private TableNameTreeService treeService;

	public DataNavigationBean() {
		System.out.println("Construction DataNavigationBean");
	}
	
	@PostConstruct
	public void create(){
		logger.info("Construction Post Construct :{}", treeService.getRootNode().getChildCount());
		rootNode = treeService.getRootNode();
	}

	// ***********************************Getter and Setter*********************

	public TreeNode getRootNode() {
//		logger.info("rootNode children size: {},{}", treeService.getRootNode().getChildCount(), rootNode.getChildren().size());
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

}
