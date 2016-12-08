package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmLv1PositionId generated by hbm2java
 */

public class NcmLv1PositionId implements java.io.Serializable {

	private String baseDate;
	private String posId;

	public NcmLv1PositionId() {
	}

	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;

	}

	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getPosId());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1PositionId))
			return false;
		NcmLv1PositionId castOther = (NcmLv1PositionId) other;

		return ((this.getBaseDate() == castOther.getBaseDate())
				|| (this.getBaseDate() != null && castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getPosId() == castOther.getPosId()) || (this.getPosId() != null && castOther.getPosId() != null && this.getPosId().equals(castOther.getPosId())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getPosId() == null ? 0 : this.getPosId().hashCode());
		return result;
	}

}
