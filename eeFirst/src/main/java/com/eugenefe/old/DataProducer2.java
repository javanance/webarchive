package com.eugenefe.old;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.text.WordUtils;
import org.slf4j.Logger;

import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.qualifiers.SelectedTable;

//@SessionScoped
public class DataProducer2 implements Serializable{
	@Inject
	private Logger logger;
	
//	@Inject
//	@QueryResource
	private ResourceBundle queries;
	
	@Inject
	@SecondEm
	private EntityManager entityManager;
	
//	@Inject
//	@SelectedTable
	private String tableName;
	
	public DataProducer2() {
		
		System.out.println("DataProducer2 Generated");
	}
//	public DataProducer2(@SelectedTable String tableName) {
//		this.tableName = tableName;
//		System.out.println("DataProducer2 Generated");
//	}

	//	@Produces
	//@SessionScoped
	//@ViewScoped
//	@TableContents
	public  List<Object> getDynamicTable1(@SelectedTable String tabelName1){
		System.out.println("DataProducer_getDynamicTable_in");
		if(tabelName1 == null || tabelName1 ==""){
			tabelName1 ="NCM_MST_PROD_TYPE";
		}
		System.out.println("DataProducer_getDynamicTable_"+ tabelName1);
		String entityName = WordUtils.capitalizeFully(tabelName1, new char[]{'_'}).replaceAll("_", "");
		String queryString = "from " + entityName;
		return entityManager.createQuery("from " + entityName).getResultList();
	}
	
	
	/*public  List<Object> getDynamicTable2(NodeSelectEvent event){
		System.out.println("DataProducer_getDynamicTable2_in"+tableName);
		String entityName = WordUtils.capitalizeFully(event.getTreeNode().getData().toString(), new char[]{'_'}).replaceAll("_", "");
		String queryString = "from " + entityName;
		return entityManager.createQuery("from " + entityName).getResultList();
	}*/
}
