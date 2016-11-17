package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmKfrMarketIndexId generated by hbm2java
 */
@Embeddable
public class NcmKfrMarketIndexId implements java.io.Serializable {

	private String tradeday;
	private String mktcode;

	public NcmKfrMarketIndexId() {
	}

	public NcmKfrMarketIndexId(String tradeday, String mktcode) {
		this.tradeday = tradeday;
		this.mktcode = mktcode;
	}

	@Column(name = "TRADEDAY", nullable = false, length = 8)
	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;
	}

	@Column(name = "MKTCODE", nullable = false, length = 10)
	public String getMktcode() {
		return this.mktcode;
	}

	public void setMktcode(String mktcode) {
		this.mktcode = mktcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmKfrMarketIndexId))
			return false;
		NcmKfrMarketIndexId castOther = (NcmKfrMarketIndexId) other;

		return ((this.getTradeday() == castOther.getTradeday()) || (this.getTradeday() != null
				&& castOther.getTradeday() != null && this.getTradeday().equals(castOther.getTradeday())))
				&& ((this.getMktcode() == castOther.getMktcode()) || (this.getMktcode() != null
						&& castOther.getMktcode() != null && this.getMktcode().equals(castOther.getMktcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getMktcode() == null ? 0 : this.getMktcode().hashCode());
		return result;
	}

}