package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmKfrFundYieldId generated by hbm2java
 */

public class NcmKfrFundYieldId implements java.io.Serializable, Navigatable {

	private String tradeday;
	private String mgrcode;
	private String fundmgrcode;

	public NcmKfrFundYieldId() {
	}

	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;

	}

	public String getMgrcode() {
		return this.mgrcode;
	}

	public void setMgrcode(String mgrcode) {
		this.mgrcode = mgrcode;

	}

	public String getFundmgrcode() {
		return this.fundmgrcode;
	}

	public void setFundmgrcode(String fundmgrcode) {
		this.fundmgrcode = fundmgrcode;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getTradeday());
		buffer.append("#").append(getMgrcode());
		buffer.append("#").append(getFundmgrcode());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmKfrFundYieldId))
			return false;
		NcmKfrFundYieldId castOther = (NcmKfrFundYieldId) other;

		return ((this.getTradeday() == castOther.getTradeday())
				|| (this.getTradeday() != null && castOther.getTradeday() != null && this.getTradeday().equals(castOther.getTradeday())))
				&& ((this.getMgrcode() == castOther.getMgrcode())
						|| (this.getMgrcode() != null && castOther.getMgrcode() != null && this.getMgrcode().equals(castOther.getMgrcode())))
				&& ((this.getFundmgrcode() == castOther.getFundmgrcode())
						|| (this.getFundmgrcode() != null && castOther.getFundmgrcode() != null && this.getFundmgrcode().equals(castOther.getFundmgrcode())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		return result;
	}

}
