package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmLv1Product generated by hbm2java
 */

@Entity
@Table(name = "NCM_LV1_PRODUCT", schema = "NCM")
public class NcmLv1Product implements java.io.Serializable {

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

	public NcmLv1Product() {
	}

	@Id
	@Column(name = "FIN_PROD_ID", unique = true, nullable = false, length = 50)
	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;

	}

	@Column(name = "FIN_PROD_NM", length = 100)
	public String getFinProdNm() {
		return this.finProdNm;
	}

	public void setFinProdNm(String finProdNm) {
		this.finProdNm = finProdNm;

	}

	@Column(name = "TERM_TYPE_CD", length = 20)
	public String getTermTypeCd() {
		return this.termTypeCd;
	}

	public void setTermTypeCd(String termTypeCd) {
		this.termTypeCd = termTypeCd;

	}

	@Column(name = "PROD_TYPE_CD", length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;

	}

	@Column(name = "PROD_TYPE_NM", length = 100)
	public String getProdTypeNm() {
		return this.prodTypeNm;
	}

	public void setProdTypeNm(String prodTypeNm) {
		this.prodTypeNm = prodTypeNm;

	}

	@Column(name = "ISSU_CORP_NO", length = 20)
	public String getIssuCorpNo() {
		return this.issuCorpNo;
	}

	public void setIssuCorpNo(String issuCorpNo) {
		this.issuCorpNo = issuCorpNo;

	}

	@Column(name = "ISSUER_NM", length = 100)
	public String getIssuerNm() {
		return this.issuerNm;
	}

	public void setIssuerNm(String issuerNm) {
		this.issuerNm = issuerNm;

	}

	@Column(name = "ISSU_AMT", precision = 20)
	public BigDecimal getIssuAmt() {
		return this.issuAmt;
	}

	public void setIssuAmt(BigDecimal issuAmt) {
		this.issuAmt = issuAmt;

	}

	@Column(name = "ISSU_DATE", length = 8)
	public String getIssuDate() {
		return this.issuDate;
	}

	public void setIssuDate(String issuDate) {
		this.issuDate = issuDate;

	}

	@Column(name = "MAT_DATE", length = 8)
	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;

	}

	@Column(name = "INT_RATE", precision = 12, scale = 8)
	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;

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

	@Temporal(TemporalType.DATE)
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
		if (!(other instanceof NcmLv1Product))
			return false;
		NcmLv1Product castOther = (NcmLv1Product) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (idString() == null ? 0 : this.idString().hashCode());
		return result;
	}

}
