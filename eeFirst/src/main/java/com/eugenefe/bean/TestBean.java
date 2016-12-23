package com.eugenefe.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.slf4j.Logger;

//import com.eugenefe.entity.takion.Bond;
import com.eugenefe.entity.takion.ScenarioDetailTest;
import com.eugenefe.entity.takion.ScenarioTest;
import com.eugenefe.entity.temp.TempBond;
import com.eugenefe.entity.temp.TempMarketVariable;
import com.eugenefe.entity.temp.TempPosition;
import com.eugenefe.qualifiers.MyTransactional;
import com.eugenefe.qualifiers.OraTakionEm;
import com.eugenefe.service.DataBaseService;

@Named
@ViewScoped
public class TestBean implements Serializable {
	@Inject		
	private Logger logger;
	
	@Inject	@OraTakionEm	
	private EntityManager entityManager;
	
	private List<TempBond> bondList;
	
	private List<TempMarketVariable> mvList;
	
	public List<TempMarketVariable> getMvList() {
		return mvList;
	}

	public void setMvList(List<TempMarketVariable> mvList) {
		this.mvList = mvList;
	}

	private List<ScenarioTest> sceList;
	
	private List<TempPosition> posList;
	
	private List<ScenarioDetailTest> sceDetailTestList;
	public TestBean() {
		System.out.println("TestBean Gen");
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<TempPosition> getPosList() {
		return posList;
	}

	public void setPosList(List<TempPosition> posList) {
		this.posList = posList;
	}

	@PostConstruct
	public void  init() {
//		mvList = entityManager.createQuery("select a from TempMarketVariable a left join fetch a.bd left join fetch a.stock ").getResultList();
		mvList = entityManager.createQuery("select a from TempMarketVariable a  ").getResultList();
//		bondList = entityManager.createQuery("from TempBond").getResultList();
//		
//		EntityGraph graph = entityManager.getEntityGraph("graph.Scenario.Details");
//		Map hints = new HashMap<>();
//		hints.put("javax.persistence.fetchgraph", graph);
//		
//		sceList = entityManager.createQuery("from Scenario").setHint(EQueryHint.FetchGraph.getValue(), graph).getResultList();
		
//		sceList = entityManager.createQuery("from ScenarioTest").getResultList();
		
//		posList = entityManager.createQuery("from TempPosition").getResultList();
		
//		sceDetailTestList = entityManager.createQuery("from ScenarionDetailTest").getResultList();
				
		logger.info("aaa");		
// 		sceList = entityManager.createQuery("from Scenario a left join fetch a.scenarioDetails").getResultList();
	}
	@Inject
	private DataBaseService dbService;
	
//	@MyTransactional
	public void save(){
		TempBond bond = new TempBond();
		bond.setMvId("BOND_100");
		TempMarketVariable mv = new TempMarketVariable();
		mv.setMvId("BOND_100");
		mv.setBd(bond);
//		bond.setmVari(mv);
		dbService.save(mv);
//		dbService.save(bond);
		System.out.println("SAVE *****************************************");
	}
	
	
	
	
	
	
//	*******************getter and setter*************88
	public List<TempBond> getBondList() {
		return bondList;
	}

	public void setBondList(List<TempBond> bondList) {
		this.bondList = bondList;
	}

	public List<ScenarioTest> getSceList() {
		return sceList;
	}

	public void setSceList(List<ScenarioTest> sceList) {
		this.sceList = sceList;
	}

	public List<ScenarioDetailTest> getSceDetailTestList() {
		return sceDetailTestList;
	}

	public void setSceDetailTestList(List<ScenarioDetailTest> sceDetailTestList) {
		this.sceDetailTestList = sceDetailTestList;
	}

	
}
