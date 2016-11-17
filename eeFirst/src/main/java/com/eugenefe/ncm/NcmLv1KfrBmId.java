package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmLv1KfrBmId generated by hbm2java
 */
@Embeddable
public class NcmLv1KfrBmId implements java.io.Serializable {

	private String baseday;
	private String bmcode;

	public NcmLv1KfrBmId() {
	}

	public NcmLv1KfrBmId(String baseday, String bmcode) {
		this.baseday = baseday;
		this.bmcode = bmcode;
	}

	@Column(name = "BASEDAY", nullable = false, length = 8)
	public String getBaseday() {
		return this.baseday;
	}

	public void setBaseday(String baseday) {
		this.baseday = baseday;
	}

	@Column(name = "BMCODE", nullable = false, length = 12)
	public String getBmcode() {
		return this.bmcode;
	}

	public void setBmcode(String bmcode) {
		this.bmcode = bmcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1KfrBmId))
			return false;
		NcmLv1KfrBmId castOther = (NcmLv1KfrBmId) other;

		return ((this.getBaseday() == castOther.getBaseday()) || (this.getBaseday() != null
				&& castOther.getBaseday() != null && this.getBaseday().equals(castOther.getBaseday())))
				&& ((this.getBmcode() == castOther.getBmcode()) || (this.getBmcode() != null
						&& castOther.getBmcode() != null && this.getBmcode().equals(castOther.getBmcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseday() == null ? 0 : this.getBaseday().hashCode());
		result = 37 * result + (getBmcode() == null ? 0 : this.getBmcode().hashCode());
		return result;
	}

}