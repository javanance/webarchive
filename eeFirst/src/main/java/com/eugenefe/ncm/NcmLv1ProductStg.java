package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * NcmLv1ProductStg generated by hbm2java
 */

@Entity
@IdClass(value = NcmLv1ProductStgId.class)
@Table(name = "NCM_LV1_PRODUCT_STG", schema = "NCM")
public class NcmLv1ProductStg implements java.io.Serializable {

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

	public NcmLv1ProductStg() {
	}

	@Id
	@Column(name = "FIN_PROD_ID", nullable = false, length = 50)
	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;
	}

	@Id
	@Column(name = "FIN_PROD_NM", length = 100)
	public String getFinProdNm() {
		return this.finProdNm;
	}

	public void setFinProdNm(String finProdNm) {
		this.finProdNm = finProdNm;
	}

	@Id
	@Column(name = "TERM_TYPE_CD", length = 20)
	public String getTermTypeCd() {
		return this.termTypeCd;
	}

	public void setTermTypeCd(String termTypeCd) {
		this.termTypeCd = termTypeCd;
	}

	@Id
	@Column(name = "PROD_TYPE_CD", length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;
	}

	@Id
	@Column(name = "PROD_TYPE_NM", length = 100)
	public String getProdTypeNm() {
		return this.prodTypeNm;
	}

	public void setProdTypeNm(String prodTypeNm) {
		this.prodTypeNm = prodTypeNm;
	}

	@Id
	@Column(name = "ISSU_CORP_NO", length = 20)
	public String getIssuCorpNo() {
		return this.issuCorpNo;
	}

	public void setIssuCorpNo(String issuCorpNo) {
		this.issuCorpNo = issuCorpNo;
	}

	@Id
	@Column(name = "ISSUER_NM", length = 100)
	public String getIssuerNm() {
		return this.issuerNm;
	}

	public void setIssuerNm(String issuerNm) {
		this.issuerNm = issuerNm;
	}

	@Id
	@Column(name = "ISSU_AMT", precision = 20)
	public BigDecimal getIssuAmt() {
		return this.issuAmt;
	}

	public void setIssuAmt(BigDecimal issuAmt) {
		this.issuAmt = issuAmt;
	}

	@Id
	@Column(name = "ISSU_DATE", length = 8)
	public String getIssuDate() {
		return this.issuDate;
	}

	public void setIssuDate(String issuDate) {
		this.issuDate = issuDate;
	}

	@Id
	@Column(name = "MAT_DATE", length = 8)
	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;
	}

	@Id
	@Column(name = "INT_RATE", precision = 12, scale = 8)
	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;
	}

	@Id
	@Column(name = "SRC_TABLE", length = 20)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;
	}

	@Id
	@Column(name = "UPDATE_ID", length = 20)
	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	@Id
	@Column(name = "LAST_UPDATE", length = 7)
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
	@Transient
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

	@Transient
	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1ProductStg))
			return false;
		NcmLv1ProductStg castOther = (NcmLv1ProductStg) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
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
