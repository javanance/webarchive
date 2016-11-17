package com.eugenefe.producer;

import java.util.ResourceBundle;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.eugenefe.qualifiers.ColumHeaderResource;
import com.eugenefe.qualifiers.MessageBundle;
import com.eugenefe.qualifiers.QueryResource;

@RequestScoped
public class ResourceProducer {
	
	@Inject
    FacesContext facesContext;
	
	 @Produces @MessageBundle
//   @RequestScoped
   public ResourceBundle getBundle() {
          FacesContext context = FacesContext.getCurrentInstance();
          return context.getApplication().getResourceBundle(context, "msg");
  }
	 
	/*@Produces 
	@ColumHeaderResource
    public ResourceBundle getHeaderBundle() {
         return facesContext.getApplication().getResourceBundle(facesContext, "column");	
   }*/
	
	@Produces 
//	@SessionScoped
//	@RequestScoped
	@QueryResource
    public ResourceBundle getQueryBundle() {
       /*if (bundle == null) {
           FacesContext context = FacesContext.getCurrentInstance();
           bundle = context.getApplication().getResourceBundle(context, "msgs");
       }*/
		 FacesContext context = FacesContext.getCurrentInstance();
//         return context.getApplication().getResourceBundle(context, "msg");
         return facesContext.getApplication().getResourceBundle(context, "query");	
   }
	
	
}
