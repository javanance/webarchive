package com.eugenefe.util;

import java.io.IOException;

import javax.faces.FacesException;
import javax.faces.application.ViewHandler;
import javax.faces.application.ViewHandlerWrapper;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.slf4j.Logger;

public class CustomViewHandler extends ViewHandlerWrapper {
	@Inject 
	private Logger logger;
	
//	@Inject
//	private ViewStore viewStore;
	
	private ViewHandler wrapped;
	

	public CustomViewHandler(ViewHandler wrapped) {
		this.wrapped = wrapped;
	}


	@Override
	public ViewHandler getWrapped() {
		// TODO Auto-generated method stub
		return wrapped;
	}

	@Override
	public UIViewRoot restoreView(FacesContext context, String viewId) {
		logger.info("ViewHandler restroeView : {}", viewId);
//		UIViewRoot theView = theView = viewStore.get(viewId);
//		if(theView ==null){
//			theView = getWrapped().restoreView(context, viewId);
//		}
		UIViewRoot theView = getWrapped().restoreView(context, viewId);
		return theView;
	}
	
	@Override
	public void renderView(FacesContext context, UIViewRoot viewToRender)    throws IOException, FacesException{
//		viewStore.put(viewToRender.getId(), viewToRender);.
		logger.info("ViewHandler Render : {}", viewToRender.getViewId());
		getWrapped().renderView(context, viewToRender);
	}
	
	
}
