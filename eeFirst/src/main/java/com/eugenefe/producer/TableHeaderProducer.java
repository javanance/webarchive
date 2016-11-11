package com.eugenefe.producer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;

import org.primefaces.model.TreeNode;

import com.eugenefe.converter.TableDynamicColumn;
import com.eugenefe.qualifiers.InitPivotTableHeader;

public class TableHeaderProducer {

//	@Produces
//	@SessionScoped
//	@InitPivotTableHeader
	private void initHeader(List<TreeNode> childrenNodes){
		List<TableDynamicColumn> initPivotTableHeader = new ArrayList<TableDynamicColumn>();
		List<TableDynamicColumn> initDetailTab = new ArrayList<TableDynamicColumn>();
		Map<String, List<TableDynamicColumn>> initDetailModelHeaderMap = new HashMap<String, List<TableDynamicColumn>>();
		List<TableDynamicColumn> tempList ;
		
		TableDynamicColumn temp;
		TableDynamicColumn subTemp;
		 
		
		TableDynamicColumn tempHeader;		
		for (TreeNode node : childrenNodes) {
			tempHeader = ((TableDynamicColumn) node.getData());
			if(tempHeader.getColumnType().isCollection()){
				initDetailTab.add(tempHeader);
//				for(TreeNode subNode : node.getChildren()){
					tempList = new ArrayList<TableDynamicColumn>();
					initRec(tempList,node.getChildren());
					initDetailModelHeaderMap.put(tempHeader.getColumnId(), tempList);
//				}
			}
			else if (node.isLeaf() ){
					initPivotTableHeader.add(tempHeader);
			}
		}	
		
	}
	
	private void initRec(List<TableDynamicColumn> list, List<TreeNode> nodes){
		TableDynamicColumn tempHeader;		
		for(TreeNode node : nodes) {
			tempHeader = ((TableDynamicColumn) node.getData());

			switch (tempHeader.getColumnType()){
			case Entity : 
				initRec(list, node.getChildren());
			case List:
				break;
			
			case Map:
				break;
			default :
				list.add(new TableDynamicColumn(tempHeader.getColumnId().replace(tempHeader.getColumnId()+"_", "")
							, tempHeader.getColumnName(), tempHeader.getColumnType(), tempHeader, tempHeader.getColumnLevel(), false
							, tempHeader.getColumnOrder(), false, tempHeader.getAlignFormat()));
					
			}	

		}
	}
}
