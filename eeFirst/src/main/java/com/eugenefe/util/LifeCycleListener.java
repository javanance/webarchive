package com.eugenefe.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.inject.Inject;

import org.slf4j.Logger;

public class LifeCycleListener implements PhaseListener {
	@Inject 	
	private Logger logger;
	
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	public void beforePhase(PhaseEvent event) {
		logger.info("Start of Phase : {}", event.getPhaseId());
	}

	public void afterPhase(PhaseEvent event) {
		logger.info("End of Phase : {}", event.getPhaseId());
	}

}
