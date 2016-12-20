package com.eugenefe.bean;

import java.io.Serializable;

import javax.enterprise.event.Event;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.NodeSelectEvent;

import com.eugenefe.enums.EViewNew;
import com.eugenefe.qualifiers.SelectedTable;

@Named
//@SessionScoped
@ViewScoped
//@RequestScoped
public class ListenerBean implements Serializable {
//	@Inject		private Logger logger;
	public ListenerBean() {
		System.out.println("ListenerBean Gen");
	}
	
	@Inject
	@SelectedTable
	private Event<String> selectEvent;
	
	public void onChangeEvent(NodeSelectEvent event){
		System.out.println("Event Fire");
		if(event.getTreeNode().getType().equals("Leaf")){
			String tableName = event.getTreeNode().getData().toString();
			System.out.println("ListenerBean_onChangeEvent_"+ tableName);
			selectEvent.fire(tableName);
			System.out.println("End of select event");
			
		}
	}
	
	public String onChangeEvent1(NodeSelectEvent event){
		if(event.getTreeNode().getType().equals("Leaf")){
			String tableName = event.getTreeNode().getData().toString();
			System.out.println("ListenerBean_onChangeEvent_"+ tableName);
			selectEvent.fire(tableName);
			System.out.println("End of select event");
			
		}
		return EViewNew.v902.getUrl() + "?faces-redirect=true";
	}
}
