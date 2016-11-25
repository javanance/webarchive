package com.eugenefe.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.qualifiers.TableNode;

@Named
//@ViewScoped
//@RequestScoped
 @SessionScoped
public class DataNavigationBean implements Serializable{
	 private static final long serialVersionUID = 1L;

	@Inject
	private Logger logger;


	@Inject
	@TableNode
	private TreeNode rootNode;

	public DataNavigationBean() {
		System.out.println("Construction DataNavigationListBean");

	}

	// ***********************************Getter and Setter*********************

	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}


}
