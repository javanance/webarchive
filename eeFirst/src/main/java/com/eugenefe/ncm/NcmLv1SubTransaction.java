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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmLv1SubTransaction generated by hbm2java
 */

@Entity
@IdClass(value = NcmLv1SubTransactionId.class)
@Table(name = "NCM_LV1_SUB_TRANSACTION", schema = "NCM")
public class NcmLv1SubTransaction implements java.io.Serializable, Navigatable {

	private String baseDate;
	private String txNo;
	private String finProdId;
	private String mngFinOrg;
	private String txTypeCd;
	private String hldProdId;
	private String buySellDivCd;
	private String cpartyCorpNo;
	private String cpartyCorpNm;
	private BigDecimal txAmt;
	private BigDecimal txQty;
	private BigDecimal txPrice;
	private String sttlDate;
	private BigDecimal tradePl;
	private BigDecimal tradeYield;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1SubTransaction() {
	}

	@Id
	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Id
	@Column(name = "TX_NO", nullable = false, length = 100)
	public String getTxNo() {
		return this.txNo;
	}

	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}

	@Column(name = "FIN_PROD_ID", nullable = false, length = 50)
	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;

	}

	@Column(name = "MNG_FIN_ORG", nullable = false, length = 20)
	public String getMngFinOrg() {
		return this.mngFinOrg;
	}

	public void setMngFinOrg(String mngFinOrg) {
		this.mngFinOrg = mngFinOrg;

	}

	@Column(name = "TX_TYPE_CD", nullable = false, length = 10)
	public String getTxTypeCd() {
		return this.txTypeCd;
	}

	public void setTxTypeCd(String txTypeCd) {
		this.txTypeCd = txTypeCd;

	}

	@Column(name = "HLD_PROD_ID", nullable = false, length = 20)
	public String getHldProdId() {
		return this.hldProdId;
	}

	public void setHldProdId(String hldProdId) {
		this.hldProdId = hldProdId;

	}

	@Column(name = "BUY_SELL_DIV_CD", length = 10)
	public String getBuySellDivCd() {
		return this.buySellDivCd;
	}

	public void setBuySellDivCd(String buySellDivCd) {
		this.buySellDivCd = buySellDivCd;

	}

	@Column(name = "CPARTY_CORP_NO", length = 20)
	public String getCpartyCorpNo() {
		return this.cpartyCorpNo;
	}

	public void setCpartyCorpNo(String cpartyCorpNo) {
		this.cpartyCorpNo = cpartyCorpNo;

	}

	@Column(name = "CPARTY_CORP_NM", length = 200)
	public String getCpartyCorpNm() {
		return this.cpartyCorpNm;
	}

	public void setCpartyCorpNm(String cpartyCorpNm) {
		this.cpartyCorpNm = cpartyCorpNm;

	}

	@Column(name = "TX_AMT", nullable = false, precision = 20)
	public BigDecimal getTxAmt() {
		return this.txAmt;
	}

	public void setTxAmt(BigDecimal txAmt) {
		this.txAmt = txAmt;

	}

	@Column(name = "TX_QTY", nullable = false, precision = 20)
	public BigDecimal getTxQty() {
		return this.txQty;
	}

	public void setTxQty(BigDecimal txQty) {
		this.txQty = txQty;

	}

	@Column(name = "TX_PRICE", nullable = false, precision = 20)
	public BigDecimal getTxPrice() {
		return this.txPrice;
	}

	public void setTxPrice(BigDecimal txPrice) {
		this.txPrice = txPrice;

	}

	@Column(name = "STTL_DATE", length = 8)
	public String getSttlDate() {
		return this.sttlDate;
	}

	public void setSttlDate(String sttlDate) {
		this.sttlDate = sttlDate;

	}

	@Column(name = "TRADE_PL", nullable = false, precision = 20)
	public BigDecimal getTradePl() {
		return this.tradePl;
	}

	public void setTradePl(BigDecimal tradePl) {
		this.tradePl = tradePl;

	}

	@Column(name = "TRADE_YIELD", nullable = false, precision = 12, scale = 8)
	public BigDecimal getTradeYield() {
		return this.tradeYield;
	}

	public void setTradeYield(BigDecimal tradeYield) {
		this.tradeYield = tradeYield;

	}

	@Column(name = "SRC_TABLE", length = 50)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;

	}

	@Column(name = "UPDATE_ID", length = 50)
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
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getTxNo());

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
		if (!(other instanceof NcmLv1SubTransaction))
			return false;
		NcmLv1SubTransaction castOther = (NcmLv1SubTransaction) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getTxNo() == null ? 0 : this.getTxNo().hashCode());
		return result;
	}

}
