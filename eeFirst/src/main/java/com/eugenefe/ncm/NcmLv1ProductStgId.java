package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.math.BigDecimal;
import java.util.Date;

/**
 * NcmLv1ProductStgId generated by hbm2java
 */

public class NcmLv1ProductStgId implements java.io.Serializable {

	private String finProdId;
	private String finProdNm;
	private String termTypeCd;
	private String prodTypeCd;
	private String prodTypeNm;
	private String issuCorpNo;
	private String issuerNm;
	private BigDecimal issuAmt;
	private String issuDate;
	private String matDate;
	private BigDecimal intRate;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1ProductStgId() {
	}

	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;

	}

	public String getFinProdNm() {
		return this.finProdNm;
	}

	public void setFinProdNm(String finProdNm) {
		this.finProdNm = finProdNm;

	}

	public String getTermTypeCd() {
		return this.termTypeCd;
	}

	public void setTermTypeCd(String termTypeCd) {
		this.termTypeCd = termTypeCd;

	}

	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;

	}

	public String getProdTypeNm() {
		return this.prodTypeNm;
	}

	public void setProdTypeNm(String prodTypeNm) {
		this.prodTypeNm = prodTypeNm;

	}

	public String getIssuCorpNo() {
		return this.issuCorpNo;
	}

	public void setIssuCorpNo(String issuCorpNo) {
		this.issuCorpNo = issuCorpNo;

	}

	public String getIssuerNm() {
		return this.issuerNm;
	}

	public void setIssuerNm(String issuerNm) {
		this.issuerNm = issuerNm;

	}

	public BigDecimal getIssuAmt() {
		return this.issuAmt;
	}

	public void setIssuAmt(BigDecimal issuAmt) {
		this.issuAmt = issuAmt;

	}

	public String getIssuDate() {
		return this.issuDate;
	}

	public void setIssuDate(String issuDate) {
		this.issuDate = issuDate;

	}

	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;

	}

	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;

	}

	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;

	}

	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;

	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getFinProdId());
		buffer.append("#").append(getFinProdNm());
		buffer.append("#").append(getTermTypeCd());
		buffer.append("#").append(getProdTypeCd());
		buffer.append("#").append(getProdTypeNm());
		buffer.append("#").append(getIssuCorpNo());
		buffer.append("#").append(getIssuerNm());
		buffer.append("#").append(getIssuAmt());
		buffer.append("#").append(getIssuDate());
		buffer.append("#").append(getMatDate());
		buffer.append("#").append(getIntRate());
		buffer.append("#").append(getSrcTable());
		buffer.append("#").append(getUpdateId());
		buffer.append("#").append(getLastUpdate());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1ProductStgId))
			return false;
		NcmLv1ProductStgId castOther = (NcmLv1ProductStgId) other;

		return ((this.getFinProdId() == castOther.getFinProdId())
				|| (this.getFinProdId() != null && castOther.getFinProdId() != null && this.getFinProdId().equals(castOther.getFinProdId())))
				&& ((this.getFinProdNm() == castOther.getFinProdNm())
						|| (this.getFinProdNm() != null && castOther.getFinProdNm() != null && this.getFinProdNm().equals(castOther.getFinProdNm())))
				&& ((this.getTermTypeCd() == castOther.getTermTypeCd())
						|| (this.getTermTypeCd() != null && castOther.getTermTypeCd() != null && this.getTermTypeCd().equals(castOther.getTermTypeCd())))
				&& ((this.getProdTypeCd() == castOther.getProdTypeCd())
						|| (this.getProdTypeCd() != null && castOther.getProdTypeCd() != null && this.getProdTypeCd().equals(castOther.getProdTypeCd())))
				&& ((this.getProdTypeNm() == castOther.getProdTypeNm())
						|| (this.getProdTypeNm() != null && castOther.getProdTypeNm() != null && this.getProdTypeNm().equals(castOther.getProdTypeNm())))
				&& ((this.getIssuCorpNo() == castOther.getIssuCorpNo())
						|| (this.getIssuCorpNo() != null && castOther.getIssuCorpNo() != null && this.getIssuCorpNo().equals(castOther.getIssuCorpNo())))
				&& ((this.getIssuerNm() == castOther.getIssuerNm())
						|| (this.getIssuerNm() != null && castOther.getIssuerNm() != null && this.getIssuerNm().equals(castOther.getIssuerNm())))
				&& ((this.getIssuAmt() == castOther.getIssuAmt())
						|| (this.getIssuAmt() != null && castOther.getIssuAmt() != null && this.getIssuAmt().equals(castOther.getIssuAmt())))
				&& ((this.getIssuDate() == castOther.getIssuDate())
						|| (this.getIssuDate() != null && castOther.getIssuDate() != null && this.getIssuDate().equals(castOther.getIssuDate())))
				&& ((this.getMatDate() == castOther.getMatDate())
						|| (this.getMatDate() != null && castOther.getMatDate() != null && this.getMatDate().equals(castOther.getMatDate())))
				&& ((this.getIntRate() == castOther.getIntRate())
						|| (this.getIntRate() != null && castOther.getIntRate() != null && this.getIntRate().equals(castOther.getIntRate())))
				&& ((this.getSrcTable() == castOther.getSrcTable())
						|| (this.getSrcTable() != null && castOther.getSrcTable() != null && this.getSrcTable().equals(castOther.getSrcTable())))
				&& ((this.getUpdateId() == castOther.getUpdateId())
						|| (this.getUpdateId() != null && castOther.getUpdateId() != null && this.getUpdateId().equals(castOther.getUpdateId())))
				&& ((this.getLastUpdate() == castOther.getLastUpdate())
						|| (this.getLastUpdate() != null && castOther.getLastUpdate() != null && this.getLastUpdate().equals(castOther.getLastUpdate())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFinProdId() == null ? 0 : this.getFinProdId().hashCode());
		result = 37 * result + (getFinProdNm() == null ? 0 : this.getFinProdNm().hashCode());
		result = 37 * result + (getTermTypeCd() == null ? 0 : this.getTermTypeCd().hashCode());
		result = 37 * result + (getProdTypeCd() == null ? 0 : this.getProdTypeCd().hashCode());
		result = 37 * result + (getProdTypeNm() == null ? 0 : this.getProdTypeNm().hashCode());
		result = 37 * result + (getIssuCorpNo() == null ? 0 : this.getIssuCorpNo().hashCode());
		result = 37 * result + (getIssuerNm() == null ? 0 : this.getIssuerNm().hashCode());
		result = 37 * result + (getIssuAmt() == null ? 0 : this.getIssuAmt().hashCode());
		result = 37 * result + (getIssuDate() == null ? 0 : this.getIssuDate().hashCode());
		result = 37 * result + (getMatDate() == null ? 0 : this.getMatDate().hashCode());
		result = 37 * result + (getIntRate() == null ? 0 : this.getIntRate().hashCode());
		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getUpdateId() == null ? 0 : this.getUpdateId().hashCode());
		result = 37 * result + (getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode());
		return result;
	}

}
