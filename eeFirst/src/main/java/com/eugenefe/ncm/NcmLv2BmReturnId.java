package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmLv2BmReturnId generated by hbm2java
 */
@Embeddable
public class NcmLv2BmReturnId implements java.io.Serializable {

	private String baseDate;
	private String bmId;

	public NcmLv2BmReturnId() {
	}

	public NcmLv2BmReturnId(String baseDate, String bmId) {
		this.baseDate = baseDate;
		this.bmId = bmId;
	}

	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Column(name = "BM_ID", nullable = false, length = 20)
	public String getBmId() {
		return this.bmId;
	}

	public void setBmId(String bmId) {
		this.bmId = bmId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv2BmReturnId))
			return false;
		NcmLv2BmReturnId castOther = (NcmLv2BmReturnId) other;

		return ((this.getBaseDate() == castOther.getBaseDate()) || (this.getBaseDate() != null
				&& castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getBmId() == castOther.getBmId()) || (this.getBmId() != null && castOther.getBmId() != null
						&& this.getBmId().equals(castOther.getBmId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getBmId() == null ? 0 : this.getBmId().hashCode());
		return result;
	}

}