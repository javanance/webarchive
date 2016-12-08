package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmHstKfrFundmstId generated by hbm2java
 */

public class NcmHstKfrFundmstId implements java.io.Serializable, Navigatable {

	private String basedate;
	private String mgrcode;
	private String fundmgrcode;

	public NcmHstKfrFundmstId() {
	}

	public String getBasedate() {
		return this.basedate;
	}

	public void setBasedate(String basedate) {
		this.basedate = basedate;

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
		buffer.append("#").append(getBasedate());
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
		if (!(other instanceof NcmHstKfrFundmstId))
			return false;
		NcmHstKfrFundmstId castOther = (NcmHstKfrFundmstId) other;

		return ((this.getBasedate() == castOther.getBasedate())
				|| (this.getBasedate() != null && castOther.getBasedate() != null && this.getBasedate().equals(castOther.getBasedate())))
				&& ((this.getMgrcode() == castOther.getMgrcode())
						|| (this.getMgrcode() != null && castOther.getMgrcode() != null && this.getMgrcode().equals(castOther.getMgrcode())))
				&& ((this.getFundmgrcode() == castOther.getFundmgrcode())
						|| (this.getFundmgrcode() != null && castOther.getFundmgrcode() != null && this.getFundmgrcode().equals(castOther.getFundmgrcode())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBasedate() == null ? 0 : this.getBasedate().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		return result;
	}

}
