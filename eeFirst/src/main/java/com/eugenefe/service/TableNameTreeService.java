package com.eugenefe.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.qualifiers.SecondEm;

//@SessionScoped
public class TableNameTreeService implements Serializable{
	@Inject
	private Logger logger;
	
	@Inject
	@QueryResource
	private ResourceBundle queries;
	
	@Inject
	@SecondEm
	private EntityManager entityManager;

	private TreeNode rootNode;
	
	public TableNameTreeService() {
		System.out.println("TableNameTreeService Gen");
	}
	
	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}
	
	@PostConstruct
	public void create(){
		
		List<String> tableList = getTableList();
		logger.info("db result :{}", tableList.size());
		String[] tableNameToken;
		String divider ="_";
		int treeDept= 3;
		
		TreeNode upperNode;
		TreeNode treeNode;
		Map<String, TreeNode> treeNodeMap = new HashMap<String, TreeNode>();

		
		rootNode = new DefaultTreeNode("Root", null);
		rootNode.setExpanded(true);
		
		for (String aa : tableList) {
			tableNameToken = aa.split(divider, treeDept); 						// level of Tree
			for (int i = 0; i < tableNameToken.length; i++) {
				
				if (i == 0) {
					upperNode = rootNode;
				} else {
					upperNode = treeNodeMap.get(tableNameToken[i - 1]);
				}
				if (treeNodeMap.get(tableNameToken[i]) == null) {
					if (i == tableNameToken.length - 1) {
						treeNode = new DefaultTreeNode("Leaf", aa, upperNode);
						treeNodeMap.put(aa, treeNode);
					} else {
						treeNode = new DefaultTreeNode(tableNameToken[i], upperNode);
						treeNodeMap.put(tableNameToken[i], treeNode);
					}

					if (i == 0) {
						treeNode.setExpanded(true);
					}
				}
			}

		}
//		logger.info("db result_rootNode :{}", getRootNode().getChildCount());
	}
	
	/*private TreeNode getTreeNode(){
		List<String> tableList = getTableList();
		String[] tableNameToken;
		String divider ="_";
		int treeDept= 3;
		
		TreeNode tempRootNode;
		TreeNode upperNode;
		TreeNode treeNode;
		Map<String, TreeNode> treeNodeMap = new HashMap<String, TreeNode>();

		
		tempRootNode = new DefaultTreeNode("Root", null);
		tempRootNode.setExpanded(true);
		
		for (String aa : tableList) {
			tableNameToken = aa.split(divider, treeDept); 						// level of Tree
			for (int i = 0; i < tableNameToken.length; i++) {
				
				if (i == 0) {
					upperNode = tempRootNode;
				} else {
					upperNode = treeNodeMap.get(tableNameToken[i - 1]);
				}
				if (treeNodeMap.get(tableNameToken[i]) == null) {
					if (i == tableNameToken.length - 1) {
						treeNode = new DefaultTreeNode("Leaf", aa, upperNode);
						treeNodeMap.put(aa, treeNode);
//						logger.info("in the leaf gen :{}", treeNode.getData().toString());	
					} else {
						treeNode = new DefaultTreeNode(tableNameToken[i], upperNode);
						treeNodeMap.put(tableNameToken[i], treeNode);
					}

					if (i == 0) {
						treeNode.setExpanded(true);
					}
				}
			}

		}
		logger.info("in the root gen :{},{}",treeNodeMap, tempRootNode.getData().toString());	
		return tempRootNode;
		
	}
	*/
	
	private List<String> getTableList(){
		return  entityManager.createNativeQuery(queries.getString("tableList"))
				    	     .setParameter("owner", "NCM")
							 .getResultList();
//		return  entityManager.createNativeQuery("select distinct a.table_name from all_tab_columns a where a.owner = :owner order by a.table_name")
//	    	     .setParameter("owner", "NCM")
//				 .getResultList();
	}

	
}
