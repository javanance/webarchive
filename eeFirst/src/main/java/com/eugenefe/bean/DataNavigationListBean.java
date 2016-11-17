package com.eugenefe.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;

import com.eugenefe.qualifiers.QueryResource;
import com.eugenefe.qualifiers.SecondEm;

@Named
// @ViewScoped
@RequestScoped
// @SessionScoped
public class DataNavigationListBean {
	// private static final long serialVersionUID = 1L;

	@Inject
	private Logger logger;

	@Inject
	@SecondEm
	private EntityManager entityManager;

	@Inject
	@QueryResource
	private ResourceBundle queries;

	private List<String> tableList = new ArrayList<String>();

	private TreeNode rootNode;

	public DataNavigationListBean() {
		System.out.println("Construction DataNavigationListBean");

	}

	// *******************************************
	@PostConstruct
	public void getFetch() {
		String[] zz;
		TreeNode upperNode;
		TreeNode tableName;
		Map<String, TreeNode> zzzz = new HashMap<String, TreeNode>();

		logger.info("Query String : {}", queries.getString("tableList"));
		// tableList =
		// entityManager.createNativeQuery(queries.getString("tableList1")).getResultList();
		tableList = entityManager.createNativeQuery(queries.getString("tableList"))
								 .setParameter("owner", "NCM")
								 .getResultList();

		/*
		 * for( String aa : tableList){ zz = aa.split("_", 3); logger.info(
		 * "Fetch aa aaa : {}, {}", zz, aa.split("_")); }
		 */

		rootNode = new DefaultTreeNode("Root", null);
		rootNode.setExpanded(true);

		for (String aa : tableList) {
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
						logger.info("in the tree : {} ", aa);
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

	}

	// ***********************************Getter and Setter*********************

	public TreeNode getRootNode() {
		return rootNode;
	}

	public void setRootNode(TreeNode rootNode) {
		this.rootNode = rootNode;
	}

	//

}
