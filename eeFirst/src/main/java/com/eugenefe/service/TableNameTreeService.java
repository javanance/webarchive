package com.eugenefe.producer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.model.TableColumn;
import com.eugenefe.qualifiers.AllColumnList;
import com.eugenefe.qualifiers.ColumnList;
import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.qualifiers.SelectedTable;
import com.eugenefe.qualifiers.TableList;
import com.eugenefe.qualifiers.TableNode;

//@SessionScoped
public class TableListProducer {
	@Inject
	private Logger logger;
	
	@Inject
	@QueryResource
	private ResourceBundle queries;
	
	@Inject
	@SecondEm
	private EntityManager entityManager;


	@Produces
//	@SessionScoped
	@ViewScoped
	@TableList
	private List<String> getTableList(){
		return  entityManager.createNativeQuery(queries.getString("tableList"))
				    	     .setParameter("owner", "NCM")
							 .getResultList();
	}
	
	@Produces
//	@SessionScoped
	@ViewScoped
	@AllColumnList
	private List<TableColumn> getAllColumnList(){
		return entityManager.createQuery(queries.getString("jpqlAllColumnList")).getResultList();
	}
	
	
//	@Produces
////	@SessionScoped
//	@ViewScoped
//	@ColumnList
	public List<TableColumn> getColumnListA(NodeSelectEvent event){
		String aa = event.getTreeNode().getData().toString();
		System.out.println("BBBBB"+ aa);
		return entityManager.createQuery(queries.getString("jpqlColumnList")).setParameter("tableName", aa).getResultList();
		
	}
	public List<TableColumn> getColumnList(@Observes @SelectedTable String aa){
		System.out.println("AAAAAAA"+ aa);
		return entityManager.createQuery(queries.getString("jpqlColumnList")).setParameter("tableName", aa).getResultList();
		
	}
	
	@Produces
//	@SessionScoped
	@ViewScoped
	@TableNode
	private TreeNode getTreeNode(){
		String[] zz;
		TreeNode rootNode;
		
		TreeNode upperNode;
		TreeNode tableName;
		Map<String, TreeNode> zzzz = new HashMap<String, TreeNode>();

		
		rootNode = new DefaultTreeNode("Root", null);
		rootNode.setExpanded(true);
		
		for (String aa : getTableList()) {
			zz = aa.split("_", 3); // level of Tree
			for (int i = 0; i < zz.length; i++) {
				if (i == 0) {
					upperNode = rootNode;
				} else {
					upperNode = zzzz.get(zz[i - 1]);
				}
				if (zzzz.get(zz[i]) == null) {
					if (i == zz.length - 1) {
						tableName = new DefaultTreeNode("Leaf", aa, upperNode);
//						logger.info("in the tree : {} ", aa);
					} else {
						tableName = new DefaultTreeNode(zz[i], upperNode);
					}

					if (i == 0) {
						tableName.setExpanded(true);
					}
					zzzz.put(zz[i], tableName);
				}
			}

		}
		
		return rootNode;
		
	}
}
