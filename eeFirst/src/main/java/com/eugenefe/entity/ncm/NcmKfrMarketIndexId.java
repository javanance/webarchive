package com.eugenefe.entity.ncm;
// Generated Dec 21, 2016 2:18:11 PM by Hibernate Tools 5.2.0.CR1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmKfrMarketIndexId generated by hbm2java
 */

public class NcmKfrMarketIndexId implements java.io.Serializable, Navigatable {

	private String tradeday;
	private String mktcode;

	public NcmKfrMarketIndexId() {
	}

	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;

	}

	public String getMktcode() {
		return this.mktcode;
	}

	public void setMktcode(String mktcode) {
		this.mktcode = mktcode;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getTradeday());
		buffer.append("#").append(getMktcode());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmKfrMarketIndexId))
			return false;
		NcmKfrMarketIndexId castOther = (NcmKfrMarketIndexId) other;

		return ((this.getTradeday() == castOther.getTradeday())
				|| (this.getTradeday() != null && castOther.getTradeday() != null && this.getTradeday().equals(castOther.getTradeday())))
				&& ((this.getMktcode() == castOther.getMktcode())
						|| (this.getMktcode() != null && castOther.getMktcode() != null && this.getMktcode().equals(castOther.getMktcode())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getMktcode() == null ? 0 : this.getMktcode().hashCode());
		return result;
	}

}