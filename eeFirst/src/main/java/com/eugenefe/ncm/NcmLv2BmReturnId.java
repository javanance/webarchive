package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmLv2BmReturnId generated by hbm2java
 */

public class NcmLv2BmReturnId implements java.io.Serializable {

	private String baseDate;
	private String bmId;

	public NcmLv2BmReturnId() {
	}

	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;

	}

	public String getBmId() {
		return this.bmId;
	}

	public void setBmId(String bmId) {
		this.bmId = bmId;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getBmId());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv2BmReturnId))
			return false;
		NcmLv2BmReturnId castOther = (NcmLv2BmReturnId) other;

		return ((this.getBaseDate() == castOther.getBaseDate())
				|| (this.getBaseDate() != null && castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getBmId() == castOther.getBmId()) || (this.getBmId() != null && castOther.getBmId() != null && this.getBmId().equals(castOther.getBmId())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getBmId() == null ? 0 : this.getBmId().hashCode());
		return result;
	}

}
