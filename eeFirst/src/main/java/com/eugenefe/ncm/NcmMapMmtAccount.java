package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMapMmtAccount generated by hbm2java
 */
@Entity
@Table(name = "NCM_MAP_MMT_ACCOUNT", schema = "NCM")
public class NcmMapMmtAccount implements java.io.Serializable {

	private NcmMapMmtAccountId id;
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

	public NcmMapMmtAccount() {
	}

	public NcmMapMmtAccount(NcmMapMmtAccountId id, String srcProdTypeCd) {
		this.id = id;
		this.srcProdTypeCd = srcProdTypeCd;
	}

	public NcmMapMmtAccount(NcmMapMmtAccountId id, String srcProdTypeCd, String srcProdTypeNm, String srcCparty,
			String srcCpartyNm, String srcBuyDate, String srcMaturityDate, BigDecimal srcIssuAmt, BigDecimal srcIntRate,
			String finProdId, String updateId, Date lastUpdate) {
		this.id = id;
		this.srcProdTypeCd = srcProdTypeCd;
		this.srcProdTypeNm = srcProdTypeNm;
		this.srcCparty = srcCparty;
		this.srcCpartyNm = srcCpartyNm;
		this.srcBuyDate = srcBuyDate;
		this.srcMaturityDate = srcMaturityDate;
		this.srcIssuAmt = srcIssuAmt;
		this.srcIntRate = srcIntRate;
		this.finProdId = finProdId;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "srcTable", column = @Column(name = "SRC_TABLE", nullable = false, length = 20)),
			@AttributeOverride(name = "srcAcctNo", column = @Column(name = "SRC_ACCT_NO", nullable = false, length = 50)),
			@AttributeOverride(name = "srcFinTxNo", column = @Column(name = "SRC_FIN_TX_NO", nullable = false, length = 20)) })
	public NcmMapMmtAccountId getId() {
		return this.id;
	}

	public void setId(NcmMapMmtAccountId id) {
		this.id = id;
	}

	@Column(name = "SRC_PROD_TYPE_CD", nullable = false, length = 10)
	public String getSrcProdTypeCd() {
		return this.srcProdTypeCd;
	}

	public void setSrcProdTypeCd(String srcProdTypeCd) {
		this.srcProdTypeCd = srcProdTypeCd;
	}

	@Column(name = "SRC_PROD_TYPE_NM", length = 100)
	public String getSrcProdTypeNm() {
		return this.srcProdTypeNm;
	}

	public void setSrcProdTypeNm(String srcProdTypeNm) {
		this.srcProdTypeNm = srcProdTypeNm;
	}

	@Column(name = "SRC_CPARTY", length = 100)
	public String getSrcCparty() {
		return this.srcCparty;
	}

	public void setSrcCparty(String srcCparty) {
		this.srcCparty = srcCparty;
	}

	@Column(name = "SRC_CPARTY_NM", length = 100)
	public String getSrcCpartyNm() {
		return this.srcCpartyNm;
	}

	public void setSrcCpartyNm(String srcCpartyNm) {
		this.srcCpartyNm = srcCpartyNm;
	}

	@Column(name = "SRC_BUY_DATE", length = 8)
	public String getSrcBuyDate() {
		return this.srcBuyDate;
	}

	public void setSrcBuyDate(String srcBuyDate) {
		this.srcBuyDate = srcBuyDate;
	}

	@Column(name = "SRC_MATURITY_DATE", length = 8)
	public String getSrcMaturityDate() {
		return this.srcMaturityDate;
	}

	public void setSrcMaturityDate(String srcMaturityDate) {
		this.srcMaturityDate = srcMaturityDate;
	}

	@Column(name = "SRC_ISSU_AMT", precision = 20)
	public BigDecimal getSrcIssuAmt() {
		return this.srcIssuAmt;
	}

	public void setSrcIssuAmt(BigDecimal srcIssuAmt) {
		this.srcIssuAmt = srcIssuAmt;
	}

	@Column(name = "SRC_INT_RATE", precision = 12, scale = 8)
	public BigDecimal getSrcIntRate() {
		return this.srcIntRate;
	}

	public void setSrcIntRate(BigDecimal srcIntRate) {
		this.srcIntRate = srcIntRate;
	}

	@Column(name = "FIN_PROD_ID", length = 100)
	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;
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

}