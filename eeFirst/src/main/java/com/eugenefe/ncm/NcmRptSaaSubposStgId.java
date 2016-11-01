package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmRptSaaSubposStgId generated by hbm2java
 */
@Embeddable
public class NcmRptSaaSubposStgId implements java.io.Serializable {

	private String baseDate;
	private String prodTypeCd;
	private String matCd;
	private String acctDivCd;
	private String cptlDivCd;
	private String mngOrgCorpNo;
	private String issuCorpNo;
	private String subProdTypeCd;
	private String saaCd;

	public NcmRptSaaSubposStgId() {
	}

	public NcmRptSaaSubposStgId(String baseDate, String prodTypeCd, String matCd, String acctDivCd, String cptlDivCd,
			String mngOrgCorpNo, String issuCorpNo, String subProdTypeCd, String saaCd) {
		this.baseDate = baseDate;
		this.prodTypeCd = prodTypeCd;
		this.matCd = matCd;
		this.acctDivCd = acctDivCd;
		this.cptlDivCd = cptlDivCd;
		this.mngOrgCorpNo = mngOrgCorpNo;
		this.issuCorpNo = issuCorpNo;
		this.subProdTypeCd = subProdTypeCd;
		this.saaCd = saaCd;
	}

	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Column(name = "PROD_TYPE_CD", nullable = false, length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;
	}

	@Column(name = "MAT_CD", nullable = false, length = 10)
	public String getMatCd() {
		return this.matCd;
	}

	public void setMatCd(String matCd) {
		this.matCd = matCd;
	}

	@Column(name = "ACCT_DIV_CD", nullable = false, length = 10)
	public String getAcctDivCd() {
		return this.acctDivCd;
	}

	public void setAcctDivCd(String acctDivCd) {
		this.acctDivCd = acctDivCd;
	}

	@Column(name = "CPTL_DIV_CD", nullable = false, length = 10)
	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;
	}

	@Column(name = "MNG_ORG_CORP_NO", nullable = false, length = 20)
	public String getMngOrgCorpNo() {
		return this.mngOrgCorpNo;
	}

	public void setMngOrgCorpNo(String mngOrgCorpNo) {
		this.mngOrgCorpNo = mngOrgCorpNo;
	}

	@Column(name = "ISSU_CORP_NO", nullable = false, length = 20)
	public String getIssuCorpNo() {
		return this.issuCorpNo;
	}

	public void setIssuCorpNo(String issuCorpNo) {
		this.issuCorpNo = issuCorpNo;
	}

	@Column(name = "SUB_PROD_TYPE_CD", nullable = false, length = 10)
	public String getSubProdTypeCd() {
		return this.subProdTypeCd;
	}

	public void setSubProdTypeCd(String subProdTypeCd) {
		this.subProdTypeCd = subProdTypeCd;
	}

	@Column(name = "SAA_CD", nullable = false, length = 20)
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
		if (!(other instanceof NcmRptSaaSubposStgId))
			return false;
		NcmRptSaaSubposStgId castOther = (NcmRptSaaSubposStgId) other;

		return ((this.getBaseDate() == castOther.getBaseDate()) || (this.getBaseDate() != null
				&& castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getProdTypeCd() == castOther.getProdTypeCd()) || (this.getProdTypeCd() != null
						&& castOther.getProdTypeCd() != null && this.getProdTypeCd().equals(castOther.getProdTypeCd())))
				&& ((this.getMatCd() == castOther.getMatCd()) || (this.getMatCd() != null
						&& castOther.getMatCd() != null && this.getMatCd().equals(castOther.getMatCd())))
				&& ((this.getAcctDivCd() == castOther.getAcctDivCd()) || (this.getAcctDivCd() != null
						&& castOther.getAcctDivCd() != null && this.getAcctDivCd().equals(castOther.getAcctDivCd())))
				&& ((this.getCptlDivCd() == castOther.getCptlDivCd()) || (this.getCptlDivCd() != null
						&& castOther.getCptlDivCd() != null && this.getCptlDivCd().equals(castOther.getCptlDivCd())))
				&& ((this.getMngOrgCorpNo() == castOther.getMngOrgCorpNo())
						|| (this.getMngOrgCorpNo() != null && castOther.getMngOrgCorpNo() != null
								&& this.getMngOrgCorpNo().equals(castOther.getMngOrgCorpNo())))
				&& ((this.getIssuCorpNo() == castOther.getIssuCorpNo()) || (this.getIssuCorpNo() != null
						&& castOther.getIssuCorpNo() != null && this.getIssuCorpNo().equals(castOther.getIssuCorpNo())))
				&& ((this.getSubProdTypeCd() == castOther.getSubProdTypeCd())
						|| (this.getSubProdTypeCd() != null && castOther.getSubProdTypeCd() != null
								&& this.getSubProdTypeCd().equals(castOther.getSubProdTypeCd())))
				&& ((this.getSaaCd() == castOther.getSaaCd()) || (this.getSaaCd() != null
						&& castOther.getSaaCd() != null && this.getSaaCd().equals(castOther.getSaaCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getProdTypeCd() == null ? 0 : this.getProdTypeCd().hashCode());
		result = 37 * result + (getMatCd() == null ? 0 : this.getMatCd().hashCode());
		result = 37 * result + (getAcctDivCd() == null ? 0 : this.getAcctDivCd().hashCode());
		result = 37 * result + (getCptlDivCd() == null ? 0 : this.getCptlDivCd().hashCode());
		result = 37 * result + (getMngOrgCorpNo() == null ? 0 : this.getMngOrgCorpNo().hashCode());
		result = 37 * result + (getIssuCorpNo() == null ? 0 : this.getIssuCorpNo().hashCode());
		result = 37 * result + (getSubProdTypeCd() == null ? 0 : this.getSubProdTypeCd().hashCode());
		result = 37 * result + (getSaaCd() == null ? 0 : this.getSaaCd().hashCode());
		return result;
	}

}
