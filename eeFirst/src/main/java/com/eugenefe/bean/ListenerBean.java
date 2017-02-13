package com.eugenefe.bean;

import java.io.Serializable;

import javax.enterprise.event.Event;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;
import org.primefaces.event.NodeSelectEvent;
import org.slf4j.Logger;

import com.eugenefe.enums.EViewNew;
import com.eugenefe.qualifiers.SelectedTable;

@Named
//@SessionScoped
@ViewScoped
//@RequestScoped
public class ListenerBean implements Serializable {
	@Inject		private Logger logger;
	
	public ListenerBean() {
		System.out.println("ListenerBean Gen");
	}
	
	@Inject
	@SelectedTable
	private Event<String> selectEvent;
	
	public void onChangeEvent(NodeSelectEvent event){
		logger.info("Listener Node Selection Event : SelectedTable");
		
		if(event.getTreeNode().getType().equals("Leaf")){
			String tableName = event.getTreeNode().getData().toString();
			logger.info("ListenerBean_onChangeEvent : {}", tableName);
			selectEvent.fire(tableName);
			logger.info("End of select event: ");
			
			
			/*if(RequestContext.getCurrentInstance().isAjaxRequest()){
				
				String outcome = "/v902DataNavigation/"+tableName;
				FacesContext context = FacesContext.getCurrentInstance();
				ExternalContext exCxt = context.getExternalContext();
				logger.info("Listener : {}", exCxt.getRequestContextPath());
				try {
					exCxt.redirect(exCxt.getRequestContextPath()+outcome);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}*/
//			context.getApplication().getNavigationHandler().handleNavigation(context, null, outcome);
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
