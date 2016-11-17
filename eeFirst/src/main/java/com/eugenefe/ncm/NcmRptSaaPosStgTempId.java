package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmRptSaaPosStgTempId generated by hbm2java
 */
@Embeddable
public class NcmRptSaaPosStgTempId implements java.io.Serializable {

	private String baseDate;
	private String prodTypeCd;
	private String matCd;
	private String acctDivCd;
	private String cptlDivCd;
	private String mngOrgCorpNo;
	private String issuCorpNo;
	private String saaCd;
	private String saaCdNm;
	private String upperSaaCd;
	private BigDecimal invAmt;
	private BigDecimal subInvAmt;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmRptSaaPosStgTempId() {
	}

	public NcmRptSaaPosStgTempId(String baseDate) {
		this.baseDate = baseDate;
	}

	public NcmRptSaaPosStgTempId(String baseDate, String prodTypeCd, String matCd, String acctDivCd, String cptlDivCd,
			String mngOrgCorpNo, String issuCorpNo, String saaCd, String saaCdNm, String upperSaaCd, BigDecimal invAmt,
			BigDecimal subInvAmt, String srcTable, String updateId, Date lastUpdate) {
		this.baseDate = baseDate;
		this.prodTypeCd = prodTypeCd;
		this.matCd = matCd;
		this.acctDivCd = acctDivCd;
		this.cptlDivCd = cptlDivCd;
		this.mngOrgCorpNo = mngOrgCorpNo;
		this.issuCorpNo = issuCorpNo;
		this.saaCd = saaCd;
		this.saaCdNm = saaCdNm;
		this.upperSaaCd = upperSaaCd;
		this.invAmt = invAmt;
		this.subInvAmt = subInvAmt;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Column(name = "PROD_TYPE_CD", length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;
	}

	@Column(name = "MAT_CD", length = 10)
	public String getMatCd() {
		return this.matCd;
	}

	public void setMatCd(String matCd) {
		this.matCd = matCd;
	}

	@Column(name = "ACCT_DIV_CD", length = 10)
	public String getAcctDivCd() {
		return this.acctDivCd;
	}

	public void setAcctDivCd(String acctDivCd) {
		this.acctDivCd = acctDivCd;
	}

	@Column(name = "CPTL_DIV_CD", length = 10)
	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;
	}

	@Column(name = "MNG_ORG_CORP_NO", length = 20)
	public String getMngOrgCorpNo() {
		return this.mngOrgCorpNo;
	}

	public void setMngOrgCorpNo(String mngOrgCorpNo) {
		this.mngOrgCorpNo = mngOrgCorpNo;
	}

	@Column(name = "ISSU_CORP_NO", length = 20)
	public String getIssuCorpNo() {
		return this.issuCorpNo;
	}

	public void setIssuCorpNo(String issuCorpNo) {
		this.issuCorpNo = issuCorpNo;
	}

	@Column(name = "SAA_CD", length = 20)
	public String getSaaCd() {
		return this.saaCd;
	}

	public void setSaaCd(String saaCd) {
		this.saaCd = saaCd;
	}

	@Column(name = "SAA_CD_NM", length = 100)
	public String getSaaCdNm() {
		return this.saaCdNm;
	}

	public void setSaaCdNm(String saaCdNm) {
		this.saaCdNm = saaCdNm;
	}

	@Column(name = "UPPER_SAA_CD", length = 20)
	public String getUpperSaaCd() {
		return this.upperSaaCd;
	}

	public void setUpperSaaCd(String upperSaaCd) {
		this.upperSaaCd = upperSaaCd;
	}

	@Column(name = "INV_AMT", precision = 20)
	public BigDecimal getInvAmt() {
		return this.invAmt;
	}

	public void setInvAmt(BigDecimal invAmt) {
		this.invAmt = invAmt;
	}

	@Column(name = "SUB_INV_AMT", precision = 20)
	public BigDecimal getSubInvAmt() {
		return this.subInvAmt;
	}

	public void setSubInvAmt(BigDecimal subInvAmt) {
		this.subInvAmt = subInvAmt;
	}

	@Column(name = "SRC_TABLE", length = 20)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;
	}

	@Column(name = "UPDATE_ID", length = 20)
	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	@Column(name = "LAST_UPDATE", length = 7)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmRptSaaPosStgTempId))
			return false;
		NcmRptSaaPosStgTempId castOther = (NcmRptSaaPosStgTempId) other;

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
				&& ((this.getSaaCd() == castOther.getSaaCd()) || (this.getSaaCd() != null
						&& castOther.getSaaCd() != null && this.getSaaCd().equals(castOther.getSaaCd())))
				&& ((this.getSaaCdNm() == castOther.getSaaCdNm()) || (this.getSaaCdNm() != null
						&& castOther.getSaaCdNm() != null && this.getSaaCdNm().equals(castOther.getSaaCdNm())))
				&& ((this.getUpperSaaCd() == castOther.getUpperSaaCd()) || (this.getUpperSaaCd() != null
						&& castOther.getUpperSaaCd() != null && this.getUpperSaaCd().equals(castOther.getUpperSaaCd())))
				&& ((this.getInvAmt() == castOther.getInvAmt()) || (this.getInvAmt() != null
						&& castOther.getInvAmt() != null && this.getInvAmt().equals(castOther.getInvAmt())))
				&& ((this.getSubInvAmt() == castOther.getSubInvAmt()) || (this.getSubInvAmt() != null
						&& castOther.getSubInvAmt() != null && this.getSubInvAmt().equals(castOther.getSubInvAmt())))
				&& ((this.getSrcTable() == castOther.getSrcTable()) || (this.getSrcTable() != null
						&& castOther.getSrcTable() != null && this.getSrcTable().equals(castOther.getSrcTable())))
				&& ((this.getUpdateId() == castOther.getUpdateId()) || (this.getUpdateId() != null
						&& castOther.getUpdateId() != null && this.getUpdateId().equals(castOther.getUpdateId())))
				&& ((this.getLastUpdate() == castOther.getLastUpdate())
						|| (this.getLastUpdate() != null && castOther.getLastUpdate() != null
								&& this.getLastUpdate().equals(castOther.getLastUpdate())));
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
		result = 37 * result + (getSaaCd() == null ? 0 : this.getSaaCd().hashCode());
		result = 37 * result + (getSaaCdNm() == null ? 0 : this.getSaaCdNm().hashCode());
		result = 37 * result + (getUpperSaaCd() == null ? 0 : this.getUpperSaaCd().hashCode());
		result = 37 * result + (getInvAmt() == null ? 0 : this.getInvAmt().hashCode());
		result = 37 * result + (getSubInvAmt() == null ? 0 : this.getSubInvAmt().hashCode());
		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getUpdateId() == null ? 0 : this.getUpdateId().hashCode());
		result = 37 * result + (getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode());
		return result;
	}

}