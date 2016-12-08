package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmBatLogId generated by hbm2java
 */

public class NcmBatLogId implements java.io.Serializable {

	private String baseDate;
	private String batCd;

	public NcmBatLogId() {
	}

	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;

	}

	public String getBatCd() {
		return this.batCd;
	}

	public void setBatCd(String batCd) {
		this.batCd = batCd;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getBatCd());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmBatLogId))
			return false;
		NcmBatLogId castOther = (NcmBatLogId) other;

		return ((this.getBaseDate() == castOther.getBaseDate())
				|| (this.getBaseDate() != null && castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getBatCd() == castOther.getBatCd()) || (this.getBatCd() != null && castOther.getBatCd() != null && this.getBatCd().equals(castOther.getBatCd())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getBatCd() == null ? 0 : this.getBatCd().hashCode());
		return result;
	}

}
