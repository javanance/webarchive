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
 * NcmLv1Transaction generated by hbm2java
 */

@Entity
@IdClass(value = NcmLv1TransactionId.class)
@Table(name = "NCM_LV1_TRANSACTION", schema = "NCM")
public class NcmLv1Transaction implements java.io.Serializable, Navigatable {

	private String baseDate;
	private String finTxNo;
	private String bizDivCd;
	private String acctDivCd;
	private String cptlDivCd;
	private String acctNo;
	private String txTypeCd;
	private String buySellDivCd;
	private String finProdId;
	private String mngOrgCorpNo;
	private BigDecimal fstTxAmt;
	private BigDecimal bdayBal;
	private BigDecimal txAmt;
	private BigDecimal txQty;
	private BigDecimal txPrice;
	private BigDecimal intAmt;
	private BigDecimal prepayCorpTax;
	private BigDecimal prepayCorpLtax;
	private BigDecimal todayBal;
	private String bookingNo;
	private String bookingDate;
	private String fstFinTxNo;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1Transaction() {
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
	@Column(name = "FIN_TX_NO", nullable = false, length = 20)
	public String getFinTxNo() {
		return this.finTxNo;
	}

	public void setFinTxNo(String finTxNo) {
		this.finTxNo = finTxNo;
	}

	@Column(name = "BIZ_DIV_CD", length = 10)
	public String getBizDivCd() {
		return this.bizDivCd;
	}

	public void setBizDivCd(String bizDivCd) {
		this.bizDivCd = bizDivCd;

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

	@Column(name = "ACCT_NO", length = 20)
	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;

	}

	@Column(name = "TX_TYPE_CD", length = 10)
	public String getTxTypeCd() {
		return this.txTypeCd;
	}

	public void setTxTypeCd(String txTypeCd) {
		this.txTypeCd = txTypeCd;

	}

	@Column(name = "BUY_SELL_DIV_CD", length = 10)
	public String getBuySellDivCd() {
		return this.buySellDivCd;
	}

	public void setBuySellDivCd(String buySellDivCd) {
		this.buySellDivCd = buySellDivCd;

	}

	@Column(name = "FIN_PROD_ID", length = 50)
	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;

	}

	@Column(name = "MNG_ORG_CORP_NO", length = 20)
	public String getMngOrgCorpNo() {
		return this.mngOrgCorpNo;
	}

	public void setMngOrgCorpNo(String mngOrgCorpNo) {
		this.mngOrgCorpNo = mngOrgCorpNo;

	}

	@Column(name = "FST_TX_AMT", precision = 20)
	public BigDecimal getFstTxAmt() {
		return this.fstTxAmt;
	}

	public void setFstTxAmt(BigDecimal fstTxAmt) {
		this.fstTxAmt = fstTxAmt;

	}

	@Column(name = "BDAY_BAL", precision = 20)
	public BigDecimal getBdayBal() {
		return this.bdayBal;
	}

	public void setBdayBal(BigDecimal bdayBal) {
		this.bdayBal = bdayBal;

	}

	@Column(name = "TX_AMT", precision = 20)
	public BigDecimal getTxAmt() {
		return this.txAmt;
	}

	public void setTxAmt(BigDecimal txAmt) {
		this.txAmt = txAmt;

	}

	@Column(name = "TX_QTY", precision = 20)
	public BigDecimal getTxQty() {
		return this.txQty;
	}

	public void setTxQty(BigDecimal txQty) {
		this.txQty = txQty;

	}

	@Column(name = "TX_PRICE", precision = 20)
	public BigDecimal getTxPrice() {
		return this.txPrice;
	}

	public void setTxPrice(BigDecimal txPrice) {
		this.txPrice = txPrice;

	}

	@Column(name = "INT_AMT", precision = 20)
	public BigDecimal getIntAmt() {
		return this.intAmt;
	}

	public void setIntAmt(BigDecimal intAmt) {
		this.intAmt = intAmt;

	}

	@Column(name = "PREPAY_CORP_TAX", precision = 20)
	public BigDecimal getPrepayCorpTax() {
		return this.prepayCorpTax;
	}

	public void setPrepayCorpTax(BigDecimal prepayCorpTax) {
		this.prepayCorpTax = prepayCorpTax;

	}

	@Column(name = "PREPAY_CORP_LTAX", precision = 20)
	public BigDecimal getPrepayCorpLtax() {
		return this.prepayCorpLtax;
	}

	public void setPrepayCorpLtax(BigDecimal prepayCorpLtax) {
		this.prepayCorpLtax = prepayCorpLtax;

	}

	@Column(name = "TODAY_BAL", precision = 20)
	public BigDecimal getTodayBal() {
		return this.todayBal;
	}

	public void setTodayBal(BigDecimal todayBal) {
		this.todayBal = todayBal;

	}

	@Column(name = "BOOKING_NO", length = 20)
	public String getBookingNo() {
		return this.bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;

	}

	@Column(name = "BOOKING_DATE", length = 8)
	public String getBookingDate() {
		return this.bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;

	}

	@Column(name = "FST_FIN_TX_NO", length = 20)
	public String getFstFinTxNo() {
		return this.fstFinTxNo;
	}

	public void setFstFinTxNo(String fstFinTxNo) {
		this.fstFinTxNo = fstFinTxNo;

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
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getFinTxNo());

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
		if (!(other instanceof NcmLv1Transaction))
			return false;
		NcmLv1Transaction castOther = (NcmLv1Transaction) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getFinTxNo() == null ? 0 : this.getFinTxNo().hashCode());
		return result;
	}

}
