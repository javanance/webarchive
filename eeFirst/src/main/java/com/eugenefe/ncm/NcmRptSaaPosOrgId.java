package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmRptSaaPosOrgId generated by hbm2java
 */

public class NcmRptSaaPosOrgId implements java.io.Serializable {

	private String baseDate;
	private String cptlDivCd;
	private String mngOrgCorpNo;
	private String saaCd;

	public NcmRptSaaPosOrgId() {
	}

	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;

	}

	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;

	}

	public String getMngOrgCorpNo() {
		return this.mngOrgCorpNo;
	}

	public void setMngOrgCorpNo(String mngOrgCorpNo) {
		this.mngOrgCorpNo = mngOrgCorpNo;

	}

	public String getSaaCd() {
		return this.saaCd;
	}

	public void setSaaCd(String saaCd) {
		this.saaCd = saaCd;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getCptlDivCd());
		buffer.append("#").append(getMngOrgCorpNo());
		buffer.append("#").append(getSaaCd());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmRptSaaPosOrgId))
			return false;
		NcmRptSaaPosOrgId castOther = (NcmRptSaaPosOrgId) other;

		return ((this.getBaseDate() == castOther.getBaseDate())
				|| (this.getBaseDate() != null && castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getCptlDivCd() == castOther.getCptlDivCd())
						|| (this.getCptlDivCd() != null && castOther.getCptlDivCd() != null && this.getCptlDivCd().equals(castOther.getCptlDivCd())))
				&& ((this.getMngOrgCorpNo() == castOther.getMngOrgCorpNo())
						|| (this.getMngOrgCorpNo() != null && castOther.getMngOrgCorpNo() != null && this.getMngOrgCorpNo().equals(castOther.getMngOrgCorpNo())))
				&& ((this.getSaaCd() == castOther.getSaaCd()) || (this.getSaaCd() != null && castOther.getSaaCd() != null && this.getSaaCd().equals(castOther.getSaaCd())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getCptlDivCd() == null ? 0 : this.getCptlDivCd().hashCode());
		result = 37 * result + (getMngOrgCorpNo() == null ? 0 : this.getMngOrgCorpNo().hashCode());
		result = 37 * result + (getSaaCd() == null ? 0 : this.getSaaCd().hashCode());
		return result;
	}

}
