package com.eugenefe.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;

import com.eugenefe.enums.EViewNew;


@Named
//@SessionScoped
@ViewScoped
public class LayoutBean implements Serializable{
	@Inject	private Logger logger;
	 
//	@Inject
//	private SimpleMessage smpMsg;
//	private Map<String, String> messages;
	
	@Inject
	private FacesContext ctx;
	
	private String viewId;
	private String viewUrl;
	
	private boolean renderRight;
	private boolean renderLeft;
	private boolean renderBottom;
	private boolean renderInnerTop;
	private boolean renderInnerRight;
	private boolean renderInnerBottom;
	
	private String leftSize;
	
//	private Map<String, Renderer> rendererMap =new HashMap<String, Renderer>();
//	private Renderer renderer;

	public LayoutBean() {
		System.out.println("LayoutBean Construction");
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
	public String getLeftSize() {
		return leftSize;
	}

	public void setLeftSize(String leftSize) {
		this.leftSize = leftSize;
	}

	//***********************************************************************
//	@PostConstruct
	public void initLayout1(){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		logger.info("start layout initialize : /view/home");
    	
    }
	
	public void initLayout(String viewId){
		logger.info("start layout initialize : {}", viewId);
    	EViewNew temp = EViewNew.valueOf(viewId);
    	renderBottom = temp.isRenderBottom();
    	renderLeft = temp.isRenderLeft();
    	renderRight = temp.isRenderRight();
    	renderInnerTop = temp.isRenderInnerTop();
    	renderInnerRight =temp.isRenderInnerRight();
    	renderInnerBottom =temp.isRenderInnerBottom();
    	
    	viewUrl = temp.getUrl();
    	leftSize  = "200";
    	logger.info("Layout : {}, {}", viewId, temp.getUrl());
    }
	
	/*public void initLayout(String url){
		logger.info("start layout initialize : {}", url);
    	EViewNew temp = EViewNew.getTypeFromUrl(url);
    	renderBottom = temp.isRenderBottom();
    	renderLeft = temp.isRenderLeft();
    	renderRight = temp.isRenderRight();
    	renderInnerTop = temp.isRenderInnerTop();
    	renderInnerRight =temp.isRenderInnerRight();
    	renderInnerBottom =temp.isRenderInnerBottom();
    	
    	viewUrl = temp.getUrl();
    	leftSize  = "200";
    	logger.info("Layout : {}, {}", url, temp.getUrl());
    }*/
	
	
	public void initLayout(EViewNew eView){
    	EViewNew temp = eView;
    	renderBottom = temp.isRenderBottom();
    	renderLeft = temp.isRenderLeft();
    	renderRight = temp.isRenderRight();
    	renderInnerTop = temp.isRenderInnerTop();
    	renderInnerRight =temp.isRenderInnerRight();
    	renderInnerBottom =temp.isRenderInnerBottom();
    	
    	viewUrl = temp.getUrl();
    	leftSize  = "200";
    }
	
    public void extractViewId(ActionEvent evt){
    	logger.info("Layout : {}", evt.getComponent().getId());
    	viewId =evt.getComponent().getId();
    }
}
