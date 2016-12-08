package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * NcmMapMmtAccountTemp generated by hbm2java
 */

@Entity
@IdClass(value = NcmMapMmtAccountTempId.class)
@Table(name = "NCM_MAP_MMT_ACCOUNT_TEMP", schema = "NCM")
public class NcmMapMmtAccountTemp implements java.io.Serializable, Navigatable {

	private String srcTable;
	private String srcAcctNo;
	private String srcFinTxNo;
	private String srcProdTypeCd;
	private String srcProdTypeNm;
	private String srcCparty;
	private String srcCpartyNm;
	private String srcBuyDate;
	private String srcMaturityDate;
	private BigDecimal srcIssuAmt;
	private BigDecimal srcIntRate;
	private String finProdId;
	private String updateId;
	private Date lastUpdate;

	public NcmMapMmtAccountTemp() {
	}

	@Id
	@Column(name = "SRC_TABLE", nullable = false, length = 20)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;
	}

	@Id
	@Column(name = "SRC_ACCT_NO", nullable = false, length = 50)
	public String getSrcAcctNo() {
		return this.srcAcctNo;
	}

	public void setSrcAcctNo(String srcAcctNo) {
		this.srcAcctNo = srcAcctNo;
	}

	@Id
	@Column(name = "SRC_FIN_TX_NO", nullable = false, length = 20)
	public String getSrcFinTxNo() {
		return this.srcFinTxNo;
	}

	public void setSrcFinTxNo(String srcFinTxNo) {
		this.srcFinTxNo = srcFinTxNo;
	}

	@Id
	@Column(name = "SRC_PROD_TYPE_CD", nullable = false, length = 10)
	public String getSrcProdTypeCd() {
		return this.srcProdTypeCd;
	}

	public void setSrcProdTypeCd(String srcProdTypeCd) {
		this.srcProdTypeCd = srcProdTypeCd;
	}

	@Id
	@Column(name = "SRC_PROD_TYPE_NM", length = 100)
	public String getSrcProdTypeNm() {
		return this.srcProdTypeNm;
	}

	public void setSrcProdTypeNm(String srcProdTypeNm) {
		this.srcProdTypeNm = srcProdTypeNm;
	}

	@Id
	@Column(name = "SRC_CPARTY", length = 100)
	public String getSrcCparty() {
		return this.srcCparty;
	}

	public void setSrcCparty(String srcCparty) {
		this.srcCparty = srcCparty;
	}

	@Id
	@Column(name = "SRC_CPARTY_NM", length = 100)
	public String getSrcCpartyNm() {
		return this.srcCpartyNm;
	}

	public void setSrcCpartyNm(String srcCpartyNm) {
		this.srcCpartyNm = srcCpartyNm;
	}

	@Id
	@Column(name = "SRC_BUY_DATE", length = 8)
	public String getSrcBuyDate() {
		return this.srcBuyDate;
	}

	public void setSrcBuyDate(String srcBuyDate) {
		this.srcBuyDate = srcBuyDate;
	}

	@Id
	@Column(name = "SRC_MATURITY_DATE", length = 8)
	public String getSrcMaturityDate() {
		return this.srcMaturityDate;
	}

	public void setSrcMaturityDate(String srcMaturityDate) {
		this.srcMaturityDate = srcMaturityDate;
	}

	@Id
	@Column(name = "SRC_ISSU_AMT", precision = 20)
	public BigDecimal getSrcIssuAmt() {
		return this.srcIssuAmt;
	}

	public void setSrcIssuAmt(BigDecimal srcIssuAmt) {
		this.srcIssuAmt = srcIssuAmt;
	}

	@Id
	@Column(name = "SRC_INT_RATE", precision = 12, scale = 8)
	public BigDecimal getSrcIntRate() {
		return this.srcIntRate;
	}

	public void setSrcIntRate(BigDecimal srcIntRate) {
		this.srcIntRate = srcIntRate;
	}

	@Id
	@Column(name = "FIN_PROD_ID", length = 100)
	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;
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
		buffer.append("#").append(getSrcTable());
		buffer.append("#").append(getSrcAcctNo());
		buffer.append("#").append(getSrcFinTxNo());
		buffer.append("#").append(getSrcProdTypeCd());
		buffer.append("#").append(getSrcProdTypeNm());
		buffer.append("#").append(getSrcCparty());
		buffer.append("#").append(getSrcCpartyNm());
		buffer.append("#").append(getSrcBuyDate());
		buffer.append("#").append(getSrcMaturityDate());
		buffer.append("#").append(getSrcIssuAmt());
		buffer.append("#").append(getSrcIntRate());
		buffer.append("#").append(getFinProdId());
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
		if (!(other instanceof NcmMapMmtAccountTemp))
			return false;
		NcmMapMmtAccountTemp castOther = (NcmMapMmtAccountTemp) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getSrcAcctNo() == null ? 0 : this.getSrcAcctNo().hashCode());
		result = 37 * result + (getSrcFinTxNo() == null ? 0 : this.getSrcFinTxNo().hashCode());
		result = 37 * result + (getSrcProdTypeCd() == null ? 0 : this.getSrcProdTypeCd().hashCode());
		result = 37 * result + (getSrcProdTypeNm() == null ? 0 : this.getSrcProdTypeNm().hashCode());
		result = 37 * result + (getSrcCparty() == null ? 0 : this.getSrcCparty().hashCode());
		result = 37 * result + (getSrcCpartyNm() == null ? 0 : this.getSrcCpartyNm().hashCode());
		result = 37 * result + (getSrcBuyDate() == null ? 0 : this.getSrcBuyDate().hashCode());
		result = 37 * result + (getSrcMaturityDate() == null ? 0 : this.getSrcMaturityDate().hashCode());
		result = 37 * result + (getSrcIssuAmt() == null ? 0 : this.getSrcIssuAmt().hashCode());
		result = 37 * result + (getSrcIntRate() == null ? 0 : this.getSrcIntRate().hashCode());
		result = 37 * result + (getFinProdId() == null ? 0 : this.getFinProdId().hashCode());
		result = 37 * result + (getUpdateId() == null ? 0 : this.getUpdateId().hashCode());
		result = 37 * result + (getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode());
		return result;
	}

}
