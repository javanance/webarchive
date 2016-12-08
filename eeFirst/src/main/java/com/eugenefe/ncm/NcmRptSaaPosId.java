package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmRptSaaPosId generated by hbm2java
 */

public class NcmRptSaaPosId implements java.io.Serializable, Navigatable {

	private String baseDate;
	private String prodTypeCd;
	private String matCd;
	private String acctDivCd;
	private String cptlDivCd;
	private String mngOrgCorpNo;
	private String issuCorpNo;
	private String saaCd;

	public NcmRptSaaPosId() {
	}

	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;

	}

	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;

	}

	public String getMatCd() {
		return this.matCd;
	}

	public void setMatCd(String matCd) {
		this.matCd = matCd;

	}

	public String getAcctDivCd() {
		return this.acctDivCd;
	}

	public void setAcctDivCd(String acctDivCd) {
		this.acctDivCd = acctDivCd;

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

	public String getIssuCorpNo() {
		return this.issuCorpNo;
	}

	public void setIssuCorpNo(String issuCorpNo) {
		this.issuCorpNo = issuCorpNo;

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
		buffer.append("#").append(getProdTypeCd());
		buffer.append("#").append(getMatCd());
		buffer.append("#").append(getAcctDivCd());
		buffer.append("#").append(getCptlDivCd());
		buffer.append("#").append(getMngOrgCorpNo());
		buffer.append("#").append(getIssuCorpNo());
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
		if (!(other instanceof NcmRptSaaPosId))
			return false;
		NcmRptSaaPosId castOther = (NcmRptSaaPosId) other;

		return ((this.getBaseDate() == castOther.getBaseDate())
				|| (this.getBaseDate() != null && castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getProdTypeCd() == castOther.getProdTypeCd())
						|| (this.getProdTypeCd() != null && castOther.getProdTypeCd() != null && this.getProdTypeCd().equals(castOther.getProdTypeCd())))
				&& ((this.getMatCd() == castOther.getMatCd()) || (this.getMatCd() != null && castOther.getMatCd() != null && this.getMatCd().equals(castOther.getMatCd())))
				&& ((this.getAcctDivCd() == castOther.getAcctDivCd())
						|| (this.getAcctDivCd() != null && castOther.getAcctDivCd() != null && this.getAcctDivCd().equals(castOther.getAcctDivCd())))
				&& ((this.getCptlDivCd() == castOther.getCptlDivCd())
						|| (this.getCptlDivCd() != null && castOther.getCptlDivCd() != null && this.getCptlDivCd().equals(castOther.getCptlDivCd())))
				&& ((this.getMngOrgCorpNo() == castOther.getMngOrgCorpNo())
						|| (this.getMngOrgCorpNo() != null && castOther.getMngOrgCorpNo() != null && this.getMngOrgCorpNo().equals(castOther.getMngOrgCorpNo())))
				&& ((this.getIssuCorpNo() == castOther.getIssuCorpNo())
						|| (this.getIssuCorpNo() != null && castOther.getIssuCorpNo() != null && this.getIssuCorpNo().equals(castOther.getIssuCorpNo())))
				&& ((this.getSaaCd() == castOther.getSaaCd()) || (this.getSaaCd() != null && castOther.getSaaCd() != null && this.getSaaCd().equals(castOther.getSaaCd())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getProdTypeCd() == null ? 0 : this.getProdTypeCd().hashCode());
		result = 37 * result + (getMatCd() == null ? 0 : this.getMatCd().hashCode());
		result = 37 * result + (getAcctDivCd() == null ? 0 : this.getAcctDivCd().hashCode());
		result = 37 * result + (getCptlDivCd() == null ? 0 : this.getCptlDivCd().hashCode());
		result = 37 * result + (getMngOrgCorpNo() == null ? 0 : this.getMngOrgCorpNo().hashCode());
		result = 37 * result + (getIssuCorpNo() == null ? 0 : this.getIssuCorpNo().hashCode());
		result = 37 * result + (getSaaCd() == null ? 0 : this.getSaaCd().hashCode());
		return result;
	}

}
