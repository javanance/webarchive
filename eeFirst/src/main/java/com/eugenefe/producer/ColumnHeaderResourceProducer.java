package com.eugenefe.producer;

import java.io.Serializable;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.eugenefe.qualifiers.ColumHeaderResource;

public class ColumnHeaderResourceProducer {
	
	@Inject
    FacesContext facesContext;
	
	@Produces 
//	@SessionScoped
	@ColumHeaderResource
    public ResourceBundle getBundle() {
       /*if (bundle == null) {
           FacesContext context = FacesContext.getCurrentInstance();
           bundle = context.getApplication().getResourceBundle(context, "msgs");
       }*/
		
         return facesContext.getApplication().getResourceBundle(facesContext, "column");	
   }
}
