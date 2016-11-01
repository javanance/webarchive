package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmKfrFundPriceId generated by hbm2java
 */
@Embeddable
public class NcmKfrFundPriceId implements java.io.Serializable {

	private String tradeday;
	private String mgrcode;
	private String fundmgrcode;

	public NcmKfrFundPriceId() {
	}

	public NcmKfrFundPriceId(String tradeday, String mgrcode, String fundmgrcode) {
		this.tradeday = tradeday;
		this.mgrcode = mgrcode;
		this.fundmgrcode = fundmgrcode;
	}

	@Column(name = "TRADEDAY", nullable = false, length = 8)
	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;
	}

	@Column(name = "MGRCODE", nullable = false, length = 3)
	public String getMgrcode() {
		return this.mgrcode;
	}

	public void setMgrcode(String mgrcode) {
		this.mgrcode = mgrcode;
	}

	@Column(name = "FUNDMGRCODE", nullable = false, length = 30)
	public String getFundmgrcode() {
		return this.fundmgrcode;
	}

	public void setFundmgrcode(String fundmgrcode) {
		this.fundmgrcode = fundmgrcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmKfrFundPriceId))
			return false;
		NcmKfrFundPriceId castOther = (NcmKfrFundPriceId) other;

		return ((this.getTradeday() == castOther.getTradeday()) || (this.getTradeday() != null
				&& castOther.getTradeday() != null && this.getTradeday().equals(castOther.getTradeday())))
				&& ((this.getMgrcode() == castOther.getMgrcode()) || (this.getMgrcode() != null
						&& castOther.getMgrcode() != null && this.getMgrcode().equals(castOther.getMgrcode())))
				&& ((this.getFundmgrcode() == castOther.getFundmgrcode())
						|| (this.getFundmgrcode() != null && castOther.getFundmgrcode() != null
								&& this.getFundmgrcode().equals(castOther.getFundmgrcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		return result;
	}

}
