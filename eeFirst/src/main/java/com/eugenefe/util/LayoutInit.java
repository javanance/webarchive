package com.eugenefe.util;

import java.io.Serializable;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;


@Named
@SessionScoped
public class LayoutInit implements Serializable{
	@Inject	private Logger log;
	 
//	@Inject
//	private SimpleMessage smpMsg;
//	private Map<String, String> messages;
	
	private String viewId;
	private String viewUrl;
	
	private boolean renderRight;
	private boolean renderLeft;
	private boolean renderBottom;
	private boolean renderInnerTop;
	private boolean renderInnerRight;
	private boolean renderInnerBottom;
	
//	private Map<String, Renderer> rendererMap =new HashMap<String, Renderer>();
//	private Renderer renderer;

	public LayoutInit() {
		System.out.println("LayoutInit Construction");
	}

	public String getViewId() {
		return viewId;
	}
	public void setViewId(String viewId) {
		this.viewId = viewId;
	}
	
	public String getViewUrl() {
		return viewUrl;
	}
	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}
	
	public boolean isRenderRight() {
		return renderRight;
	}
	public void setRenderRight(boolean renderRight) {
		this.renderRight = renderRight;
	}
	public boolean isRenderLeft() {
		return renderLeft;
	}
	public void setRenderLeft(boolean renderLeft) {
		this.renderLeft = renderLeft;
	}
	public boolean isRenderBottom() {
		return renderBottom;
	}
	public void setRenderBottom(boolean renderBottom) {
		this.renderBottom = renderBottom;
	}
    public boolean isRenderInnerRight() {
		return renderInnerRight;
	}

	public void setRenderInnerRight(boolean renderInnerRight) {
		this.renderInnerRight = renderInnerRight;
	}

	public boolean isRenderInnerBottom() {
		return renderInnerBottom;
	}

	public void setRenderInnerBottom(boolean renderInnerBottom) {
		this.renderInnerBottom = renderInnerBottom;
	}
	
	public boolean isRenderInnerTop() {
		return renderInnerTop;
	}
	public void setRenderInnerTop(boolean renderInnerTop) {
		this.renderInnerTop = renderInnerTop;
	}

	//***********************************************************************
	public String setupLayout(){
//    	public String loadLayout(String view){    	
    	log.info("Layout : #0", viewId);
    	EViewNew temp = EViewNew.valueOf(viewId);
    	renderBottom = temp.isRenderBottom();
    	renderLeft = temp.isRenderLeft();
    	renderRight = temp.isRenderRight();
    	renderInnerTop = temp.isRenderInnerTop();
    	renderInnerRight =temp.isRenderInnerRight();
    	renderInnerBottom =temp.isRenderInnerBottom();
    	
    	viewUrl = temp.getUrl();
    	return viewId;
    }
    
//    public String loadLayout2(){
////    	public String loadLayout(String view){    	
//    	
//    	EViewNew temp = EViewNew.valueOf("v691");
//    	renderBottom = temp.isRenderBottom();
//    	renderLeft = temp.isRenderLeft();
//    	renderRight = temp.isRenderRight();
//    	return "v691";
//    }
    public void extractViewId(ActionEvent evt){
    	log.info("Layout : #0", evt.getComponent().getId());
    	viewId =evt.getComponent().getId();
    }
}
