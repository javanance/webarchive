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
public class ActionListenerBean implements Serializable {
	@Inject		private Logger logger;
	
	public ActionListenerBean() {
		System.out.println("ActionListenerBean Gen");
	}
	
	public void scrollToTop(){
		logger.info("ScrollToTop");
//		RequestContext context = RequestContext.getCurrentInstance();
//		RequestContext.getCurrentInstance().execute("window.scrollTo(0,0);");
//		RequestContext.getCurrentInstance().scrollTo("@form");
//		RequestContext.getCurrentInstance().scrollTo("formDynamicModel:penelNavigation");
		RequestContext.getCurrentInstance().scrollTo("formDynamicModel:aaa");
		logger.info("ScrollToTop");
	}
	
	
}
