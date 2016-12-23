package com.eugenefe.entity.temp;
// Generated Dec 22, 2016 11:17:22 AM by Hibernate Tools 5.2.0.CR1 with Custom Template_takion!!!!!! 

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.eugenefe.util.Navigatable;

/**
 * Position generated by hbm2java
 */

@Entity(name = "TempPosition")
@Table(name = "POSITION", schema = "TAKION79")
public class TempPosition implements java.io.Serializable, Navigatable {

	private String posId;
	private String posName;
	private String posSide;
//	private MarketVari prod;
//	private Bond	bond;
//	private Stock stock;
	private TempMarketVariable mv;
	private String dealerId;
	private String fundId;
	private String counterpartyId;
	private String accountId;
	private String txType;
	private String currCd;
	private String initTxDate;
	private String lastTxDate;
	private BigDecimal initTxPrice;
	private BigDecimal initFeeAmt;
	private BigDecimal initTxAmt;
	private BigDecimal holdingQty;
	private BigDecimal posAmt;

	public TempPosition() {
	}

	@Id
	@Column(name = "POS_ID", unique = true, nullable = false, length = 50)
	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;

	}

	@Column(name = "POS_NAME", length = 50)
	public String getPosName() {
		return this.posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;

	}

	@Column(name = "POS_SIDE", length = 20)
	public String getPosSide() {
		return this.posSide;
	}

	public void setPosSide(String posSide) {
		this.posSide = posSide;

	}
//	@Transient
//	@ManyToOne
//	@JoinColumn(name = "PROD_ID")
//	public MarketVari getProd() {
//		return prod;
//	}
//
//	public void setProd(MarketVari prod) {
//		this.prod = prod;
//	}
//	@Transient
//	@ManyToOne
//	@JoinColumn(name = "PROD_ID")
//	public Bond getBond() {
//		return bond;
//	}
//
//	public void setBond(Bond bond) {
//		this.bond = bond;
//	}
//	
//	@Transient
//	public Stock getStock() {
//		return stock;
//	}
//
//	public void setStock(Stock stock) {
//		this.stock = stock;
//	}
	
	@ManyToOne
	@JoinColumn(name = "PROD_ID")
	public TempMarketVariable getMv() {
		return mv;
	}

	public void setMv(TempMarketVariable mv) {
		this.mv = mv;
	}
	
	@Column(name = "DEALER_ID", length = 20)
	public String getDealerId() {
		return this.dealerId;
	}

	

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;

	}

	@Column(name = "FUND_ID", length = 20)
	public String getFundId() {
		return this.fundId;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;

	}

	@Column(name = "COUNTERPARTY_ID", length = 20)
	public String getCounterpartyId() {
		return this.counterpartyId;
	}

	public void setCounterpartyId(String counterpartyId) {
		this.counterpartyId = counterpartyId;

	}

	@Column(name = "ACCOUNT_ID", length = 20)
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;

	}

	@Column(name = "TX_TYPE", length = 20)
	public String getTxType() {
		return this.txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;

	}

	@Column(name = "CURR_CD", length = 3)
	public String getCurrCd() {
		return this.currCd;
	}

	public void setCurrCd(String currCd) {
		this.currCd = currCd;

	}

	@Column(name = "INIT_TX_DATE", length = 8)
	public String getInitTxDate() {
		return this.initTxDate;
	}

	public void setInitTxDate(String initTxDate) {
		this.initTxDate = initTxDate;

	}

	@Column(name = "LAST_TX_DATE", length = 8)
	public String getLastTxDate() {
		return this.lastTxDate;
	}

	public void setLastTxDate(String lastTxDate) {
		this.lastTxDate = lastTxDate;

	}

	@Column(name = "INIT_TX_PRICE", scale = 4)
	public BigDecimal getInitTxPrice() {
		return this.initTxPrice;
	}

	public void setInitTxPrice(BigDecimal initTxPrice) {
		this.initTxPrice = initTxPrice;

	}

	@Column(name = "INIT_FEE_AMT", scale = 4)
	public BigDecimal getInitFeeAmt() {
		return this.initFeeAmt;
	}

	public void setInitFeeAmt(BigDecimal initFeeAmt) {
		this.initFeeAmt = initFeeAmt;

	}

	@Column(name = "INIT_TX_AMT", scale = 4)
	public BigDecimal getInitTxAmt() {
		return this.initTxAmt;
	}

	public void setInitTxAmt(BigDecimal initTxAmt) {
		this.initTxAmt = initTxAmt;

	}

	@Column(name = "HOLDING_QTY", scale = 4)
	public BigDecimal getHoldingQty() {
		return this.holdingQty;
	}

	public void setHoldingQty(BigDecimal holdingQty) {
		this.holdingQty = holdingQty;

	}

	@Column(name = "POS_AMT", scale = 4)
	public BigDecimal getPosAmt() {
		return this.posAmt;
	}

	public void setPosAmt(BigDecimal posAmt) {
		this.posAmt = posAmt;

	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getPosId());

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
		if (!(other instanceof TempPosition))
			return false;
		TempPosition castOther = (TempPosition) other;

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
