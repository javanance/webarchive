package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmMstComplianceId generated by hbm2java
 */
@Embeddable
public class NcmMstComplianceId implements java.io.Serializable {

	private String applyStDate;
	private String applyDivCd;
	private String applyCd;
	private String complTypeCd;

	public NcmMstComplianceId() {
	}

	public NcmMstComplianceId(String applyStDate, String applyDivCd, String applyCd, String complTypeCd) {
		this.applyStDate = applyStDate;
		this.applyDivCd = applyDivCd;
		this.applyCd = applyCd;
		this.complTypeCd = complTypeCd;
	}

	@Column(name = "APPLY_ST_DATE", nullable = false, length = 8)
	public String getApplyStDate() {
		return this.applyStDate;
	}

	public void setApplyStDate(String applyStDate) {
		this.applyStDate = applyStDate;
	}

	@Column(name = "APPLY_DIV_CD", nullable = false, length = 20)
	public String getApplyDivCd() {
		return this.applyDivCd;
	}

	public void setApplyDivCd(String applyDivCd) {
		this.applyDivCd = applyDivCd;
	}

	@Column(name = "APPLY_CD", nullable = false, length = 20)
	public String getApplyCd() {
		return this.applyCd;
	}

	public void setApplyCd(String applyCd) {
		this.applyCd = applyCd;
	}

	@Column(name = "COMPL_TYPE_CD", nullable = false, length = 50)
	public String getComplTypeCd() {
		return this.complTypeCd;
	}

	public void setComplTypeCd(String complTypeCd) {
		this.complTypeCd = complTypeCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMstComplianceId))
			return false;
		NcmMstComplianceId castOther = (NcmMstComplianceId) other;

		return ((this.getApplyStDate() == castOther.getApplyStDate()) || (this.getApplyStDate() != null
				&& castOther.getApplyStDate() != null && this.getApplyStDate().equals(castOther.getApplyStDate())))
				&& ((this.getApplyDivCd() == castOther.getApplyDivCd()) || (this.getApplyDivCd() != null
						&& castOther.getApplyDivCd() != null && this.getApplyDivCd().equals(castOther.getApplyDivCd())))
				&& ((this.getApplyCd() == castOther.getApplyCd()) || (this.getApplyCd() != null
						&& castOther.getApplyCd() != null && this.getApplyCd().equals(castOther.getApplyCd())))
				&& ((this.getComplTypeCd() == castOther.getComplTypeCd())
						|| (this.getComplTypeCd() != null && castOther.getComplTypeCd() != null
								&& this.getComplTypeCd().equals(castOther.getComplTypeCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getApplyStDate() == null ? 0 : this.getApplyStDate().hashCode());
		result = 37 * result + (getApplyDivCd() == null ? 0 : this.getApplyDivCd().hashCode());
		result = 37 * result + (getApplyCd() == null ? 0 : this.getApplyCd().hashCode());
		result = 37 * result + (getComplTypeCd() == null ? 0 : this.getComplTypeCd().hashCode());
		return result;
	}

}
