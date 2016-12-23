package com.eugenefe.embeddable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ScenarioTweek {
	private String shockType;
	private BigDecimal shockValue;
	
	
	public ScenarioTweek() {

	}
	
	@Column(name="SHOCK_TYPE")
	public String getShockType() {
		return shockType;
	}
	public void setShockType(String shockType) {
		this.shockType = shockType;
	}
	
	@Column(name="SHOCK_VALUE")
	public BigDecimal getShockValue() {
		return shockValue;
	}
	public void setShockValue(BigDecimal shockValue) {
		this.shockValue = shockValue;
	}
	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ScenarioTweek))
			return false;
		ScenarioTweek castOther = (ScenarioTweek) other;

		return ((this.getShockType() == castOther.getShockType())
				|| (this.getShockType() != null && castOther.getShockType() != null && this.getShockType().equals(castOther.getShockType())))
				&& ((this.getShockValue() == castOther.getShockValue()) || (this.getShockValue() != null && castOther.getShockValue() != null && this.getShockValue().equals(castOther.getShockValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getShockType() == null ? 0 : this.getShockType().hashCode());
		result = 37 * result + (getShockValue() == null ? 0 : this.getShockValue().hashCode());
		return result;
	}

}
