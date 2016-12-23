package com.eugenefe.entity.takion;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.eugenefe.util.Navigatable;

@Entity
@IdClass(value = ScenarioDetailIdTest.class)
@Table(name = "SCENARIO_DETAIL", schema = "TAKION79")
public class ScenarioDetailTest implements java.io.Serializable, Navigatable {

	private ScenarioTest scenario;
	private Bond marketVariable;
	private String shockType;
	private BigDecimal shockValue;
//	private Set<ScenarioHis> scenarioHises = new HashSet<ScenarioHis>(0);

	public ScenarioDetailTest() {
	}

	@Id
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="SCENARIO_ID" )
//	@Column(name = "SCENARIO_ID", nullable = false, length = 20)
	
	public ScenarioTest getScenario() {
		return this.scenario;
	}

	public void setScenario(ScenarioTest scenario) {
		this.scenario = scenario;
	}

	@Id
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="MV_ID")
//	@Column(name = "MV_ID", nullable = false, length = 20)
	public Bond getMarketVariable() {
		return this.marketVariable;
	}

	public void setMarketVariable(Bond marketVariable) {
		this.marketVariable = marketVariable;
	}

	@Column(name = "SHOCK_TYPE", length = 10)
	public String getShockType() {
		return this.shockType;
	}

	public void setShockType(String shockType) {
		this.shockType = shockType;

	}

	@Column(name = "SHOCK_VALUE", scale = 4)
	public BigDecimal getShockValue() {
		return this.shockValue;
	}

	public void setShockValue(BigDecimal shockValue) {
		this.shockValue = shockValue;

	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unresolved")
//	public Set<ScenarioHis> getScenarioHises() {
//		return this.scenarioHises;
//	}
//
//	public void setScenarioHises(Set<ScenarioHis> scenarioHises) {
//		this.scenarioHises = scenarioHises;
//
//	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getScenario());
		buffer.append("#").append(getMarketVariable());

		String rst = buffer.toString();

		return rst;
	}

	@Transient
	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ScenarioDetailTest))
			return false;
		ScenarioDetailTest castOther = (ScenarioDetailTest) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getScenario() == null ? 0 : this.getScenario().hashCode());
		result = 37 * result + (getMarketVariable() == null ? 0 : this.getMarketVariable().hashCode());
		return result;
	}

}