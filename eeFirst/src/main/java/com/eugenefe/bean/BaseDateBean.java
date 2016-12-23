package com.eugenefe.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

import com.eugenefe.enums.model.EMaturity;
import com.eugenefe.qualifiers.SecondEm;
import com.eugenefe.util.FnCalendar;

@Named
@SessionScoped
public class BaseDateBean implements Serializable {
	@Inject		private Logger logger;
	@Inject	@SecondEm	private EntityManager entityManager;
	

//	@In(value = "#{conversation.viewId}")
	private String viewId;

	private Date baseDate;
	private Date stDate;
	private Date endDate;

	private String bssd;
	private String stBssd;
	private String endBssd;

	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

	public BaseDateBean() {
	}

	@PostConstruct
	public void initNew() {
//		baseDate = basedateSession.getBaseDate();
//		stDate = basedateSession.getStDate();
//		endDate = basedateSession.getEndDate();
		FnCalendar cal = FnCalendar.getInstance();
//		cal = new FnCalendar(2013, 4, 29);
		
		baseDate = cal.getTime();
		endDate =cal.getTime();
		stDate = cal.minusTerm(EMaturity.Y01, true).getTime();

		bssd = format.format(baseDate);
		stBssd = format.format(stDate);
		endBssd = format.format(endDate);

	}

	// ****************************************************
/*	@Observer("evtBaseDateChange")
	public void onBaseDateChange(Date date) {
		baseDate = date;
		bssd = format.format(baseDate);

//		Events.instance().raiseEvent("evtBaseDateChange_" + viewId, bssd);
		Events.instance().raiseEvent("evtBaseDateChange_" + viewId);
		log.info("End of ChangeBssd Event:#0,#1", viewId);
	}

	@Observer("evtStartDateChange")
	public void onStartDateChange(Date date) {
		stDate = date;
		bssd = format.format(stDate);
	}

	@Observer("evtEndDateChange")
	public void onEndDateChange(Date date) {
		endDate = date;
		bssd = format.format(endDate);
	}

	// @Begin(join=true)
	public void handleDateSelect(SelectEvent event) {
		log.info("handleDateSelect Id1 :#0,#1", Conversation.instance().getId(), viewId);
		bssd = format.format(event.getObject());

		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", bssd));

		// String eventName = "changeBssd_" + facesContext.getViewRoot().getViewId();
		String eventName = "changeBssd_" + viewId;

		Events.instance().raiseEvent(eventName, bssd);
		log.info("End of ChangeBssd Event:#0,#1", viewId,facesContext.getViewRoot().getViewId());
	}

	public void handleStartDateSelect(SelectEvent event) {
		stBssd = format.format(event.getObject());
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", stBssd));

		// String eventName = "evtDateChange_" + FacesContext.getCurrentInstance().getViewRoot().getViewId();
		String eventName = "evtDateChange_" + viewId;
		Events.instance().raiseEvent(eventName, stBssd);
	}

	public void handleEndDateSelect(SelectEvent event) {
		endBssd = format.format(event.getObject());
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", endBssd));
		
		// String eventName = "evtDateChange_" +facesContext.getViewRoot().getViewId();
		String eventName = "evtDateChange_" + viewId;
		log.info("handleEndDateSelect : #0, #1", endBssd, endDate);
		Events.instance().raiseEvent(eventName, endBssd);
	}*/

	// **************************Getter and Setter**********************
	public Date getBaseDate() {
		return baseDate;
	}

	public void setBaseDate(Date baseDate) {
		this.baseDate = baseDate;
	}

	public String getBssd() {
		return bssd;
	}

	public void setBssd(String bssd) {
		this.bssd = bssd;
	}

	public Date getStDate() {
		return stDate;
	}

	public void setStDate(Date stDate) {
		this.stDate = stDate;
	}

	public String getStBssd() {
		return stBssd;
	}

	public void setStBssd(String stBssd) {
		this.stBssd = stBssd;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEndBssd() {
		return endBssd;
	}

	public void setEndBssd(String endBssd) {
		this.endBssd = endBssd;
	}
}
