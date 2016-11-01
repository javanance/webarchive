package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmHstKfrFundmstId generated by hbm2java
 */
@Embeddable
public class NcmHstKfrFundmstId implements java.io.Serializable {

	private String basedate;
	private String mgrcode;
	private String fundmgrcode;

	public NcmHstKfrFundmstId() {
	}

	public NcmHstKfrFundmstId(String basedate, String mgrcode, String fundmgrcode) {
		this.basedate = basedate;
		this.mgrcode = mgrcode;
		this.fundmgrcode = fundmgrcode;
	}

	@Column(name = "BASEDATE", nullable = false, length = 8)
	public String getBasedate() {
		return this.basedate;
	}

	public void setBasedate(String basedate) {
		this.basedate = basedate;
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
		if (!(other instanceof NcmHstKfrFundmstId))
			return false;
		NcmHstKfrFundmstId castOther = (NcmHstKfrFundmstId) other;

		return ((this.getBasedate() == castOther.getBasedate()) || (this.getBasedate() != null
				&& castOther.getBasedate() != null && this.getBasedate().equals(castOther.getBasedate())))
				&& ((this.getMgrcode() == castOther.getMgrcode()) || (this.getMgrcode() != null
						&& castOther.getMgrcode() != null && this.getMgrcode().equals(castOther.getMgrcode())))
				&& ((this.getFundmgrcode() == castOther.getFundmgrcode())
						|| (this.getFundmgrcode() != null && castOther.getFundmgrcode() != null
								&& this.getFundmgrcode().equals(castOther.getFundmgrcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBasedate() == null ? 0 : this.getBasedate().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		return result;
	}

}
