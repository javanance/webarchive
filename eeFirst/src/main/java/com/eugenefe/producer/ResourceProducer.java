package com.eugenefe.producer;

import java.io.Serializable;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.eugenefe.qualifiers.ColumnHeaderBundle;
import com.eugenefe.qualifiers.MessageBundle;
import com.eugenefe.qualifiers.QueryResource;

//@RequestScoped
//@SessionScoped
public class ResourceProducer implements Serializable {

	@Inject
	FacesContext facesContext;

	@Produces
	@MessageBundle
	public ResourceBundle getBundle() {
		FacesContext context = FacesContext.getCurrentInstance();
		return context.getApplication().getResourceBundle(context, "msg");
	}

	/*@Produces
	@ColumnHeaderBundle
	public ResourceBundle getHeaderBundle() {
		return facesContext.getApplication().getResourceBundle(facesContext, "column");
	}*/

	@Produces
	@QueryResource
	public ResourceBundle getQueryBundle() {
		/*
		 * if (bundle == null) { FacesContext context =
		 * FacesContext.getCurrentInstance(); bundle =
		 * context.getApplication().getResourceBundle(context, "msgs"); }
		 */
		FacesContext context = FacesContext.getCurrentInstance();
		// return context.getApplication().getResourceBundle(context, "msg");
		return facesContext.getApplication().getResourceBundle(context, "query");
	}

}
