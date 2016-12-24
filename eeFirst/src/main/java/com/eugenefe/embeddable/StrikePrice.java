package com.eugenefe.embeddable;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StrikePrice {
	private BigDecimal basePrice;
//	private BigDecimal strikeRate;
//	private BigDecimal strikePrice;
	private BigDecimal dividendYield;
//	private String strikeDirection;
//	private boolean hittedYn;
	
	public StrikePrice() {

	}
	
	@Column(name="BASE_PRICE", nullable = true)
	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
	
//	@Column(name="STRIKE_RATE", nullable = true)
//	public BigDecimal getStrikeRate() {
//		return strikeRate;
//	}
//
//	public void setStrikeRate(BigDecimal strikeRate) {
//		this.strikeRate = strikeRate;
//	}
	
//	@Column(name="STRIKE_PRICE", nullable = false)
//	public BigDecimal getStrikePrice() {
//		return strikePrice;
//	}
//
//	public void setStrikePrice(BigDecimal strikePrice) {
//		this.strikePrice = strikePrice;
//	}
//	
	@Column(name="DIVIDEND", nullable = true)

	public BigDecimal getDividendYield() {
		return dividendYield;
	}

	public void setDividendYield(BigDecimal dividendYield) {
		this.dividendYield = dividendYield;
	}

//
//	@Column(name="STRIKE_DIRECTION", nullable = true)
//	public String getStrikeDirection() {
//		return strikeDirection;
//	}
//
//	public void setStrikeDirection(String strikeDirection) {
//		this.strikeDirection = strikeDirection;
//	}
//
//	@Column(name="HITTED_YN", nullable = true)
//	public boolean isHittedYn() {
//		return hittedYn;
//	}
//
//	public void setHittedYn(boolean hittedYn) {
//		this.hittedYn = hittedYn;
//	}

	
	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StrikePrice))
			return false;
		StrikePrice castOther = (StrikePrice) other;
		
		return ((this.getBasePrice() == castOther.getBasePrice())
				|| (this.getBasePrice() != null && castOther.getBasePrice() != null && this.getBasePrice().equals(castOther.getBasePrice())));
	}
	
	
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getBasePrice() == null ? 0 : this.getBasePrice().hashCode());
		return result;
	}

}
