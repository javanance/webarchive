package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmMstSaaWghtId generated by hbm2java
 */
@Embeddable
public class NcmMstSaaWghtId implements java.io.Serializable {

	private String applyStDate;
	private String saaCd;

	public NcmMstSaaWghtId() {
	}

	public NcmMstSaaWghtId(String applyStDate, String saaCd) {
		this.applyStDate = applyStDate;
		this.saaCd = saaCd;
	}

	@Column(name = "APPLY_ST_DATE", nullable = false, length = 8)
	public String getApplyStDate() {
		return this.applyStDate;
	}

	public void setApplyStDate(String applyStDate) {
		this.applyStDate = applyStDate;
	}

	@Column(name = "SAA_CD", nullable = false, length = 10)
	public String getSaaCd() {
		return this.saaCd;
	}

	public void setSaaCd(String saaCd) {
		this.saaCd = saaCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMstSaaWghtId))
			return false;
		NcmMstSaaWghtId castOther = (NcmMstSaaWghtId) other;

		return ((this.getApplyStDate() == castOther.getApplyStDate()) || (this.getApplyStDate() != null
				&& castOther.getApplyStDate() != null && this.getApplyStDate().equals(castOther.getApplyStDate())))
				&& ((this.getSaaCd() == castOther.getSaaCd()) || (this.getSaaCd() != null
						&& castOther.getSaaCd() != null && this.getSaaCd().equals(castOther.getSaaCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getApplyStDate() == null ? 0 : this.getApplyStDate().hashCode());
		result = 37 * result + (getSaaCd() == null ? 0 : this.getSaaCd().hashCode());
		return result;
	}

}
