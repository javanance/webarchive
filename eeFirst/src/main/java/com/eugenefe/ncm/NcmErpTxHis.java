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
 * NcmErpTxHis generated by hbm2java
 */
@Entity
@Table(name = "NCM_ERP_TX_HIS", schema = "NCM")
public class NcmErpTxHis implements java.io.Serializable {

	private NcmErpTxHisId id;
	private String bizDiv;
	private String bizDivNm;
	private String captDiv;
	private String captDivNm;
	private String txType;
	private String txTypeNm;
	private String prodNm;
	private String fstFinTxNo;
	private String cntPrty;
	private String cntPrtyNm;
	private String acctNo;
	private String termStDate;
	private String termEdDate;
	private BigDecimal origAmt;
	private String acctCode;
	private String acctCodeNm;
	private BigDecimal payAmt;
	private BigDecimal intAmt;
	private BigDecimal corpTaxAmt;
	private BigDecimal muniTaxAmt;
	private BigDecimal residualAmt;
	private String bookingDate;
	private String bookingNo;
	private String creDttm;
	private String chgDttm;
	private String eaiPttn;
	private Date eaiCreDttm;
	private String eaiTrstType;
	private Date eaiTrstDttm;
	private String errMsg;

	public NcmErpTxHis() {
	}

	public NcmErpTxHis(NcmErpTxHisId id) {
		this.id = id;
	}

	public NcmErpTxHis(NcmErpTxHisId id, String bizDiv, String bizDivNm, String captDiv, String captDivNm,
			String txType, String txTypeNm, String prodNm, String fstFinTxNo, String cntPrty, String cntPrtyNm,
			String acctNo, String termStDate, String termEdDate, BigDecimal origAmt, String acctCode, String acctCodeNm,
			BigDecimal payAmt, BigDecimal intAmt, BigDecimal corpTaxAmt, BigDecimal muniTaxAmt, BigDecimal residualAmt,
			String bookingDate, String bookingNo, String creDttm, String chgDttm, String eaiPttn, Date eaiCreDttm,
			String eaiTrstType, Date eaiTrstDttm, String errMsg) {
		this.id = id;
		this.bizDiv = bizDiv;
		this.bizDivNm = bizDivNm;
		this.captDiv = captDiv;
		this.captDivNm = captDivNm;
		this.txType = txType;
		this.txTypeNm = txTypeNm;
		this.prodNm = prodNm;
		this.fstFinTxNo = fstFinTxNo;
		this.cntPrty = cntPrty;
		this.cntPrtyNm = cntPrtyNm;
		this.acctNo = acctNo;
		this.termStDate = termStDate;
		this.termEdDate = termEdDate;
		this.origAmt = origAmt;
		this.acctCode = acctCode;
		this.acctCodeNm = acctCodeNm;
		this.payAmt = payAmt;
		this.intAmt = intAmt;
		this.corpTaxAmt = corpTaxAmt;
		this.muniTaxAmt = muniTaxAmt;
		this.residualAmt = residualAmt;
		this.bookingDate = bookingDate;
		this.bookingNo = bookingNo;
		this.creDttm = creDttm;
		this.chgDttm = chgDttm;
		this.eaiPttn = eaiPttn;
		this.eaiCreDttm = eaiCreDttm;
		this.eaiTrstType = eaiTrstType;
		this.eaiTrstDttm = eaiTrstDttm;
		this.errMsg = errMsg;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 20)),
			@AttributeOverride(name = "finTxNo", column = @Column(name = "FIN_TX_NO", nullable = false, length = 20)) })
	public NcmErpTxHisId getId() {
		return this.id;
	}

	public void setId(NcmErpTxHisId id) {
		this.id = id;
	}

	@Column(name = "BIZ_DIV", length = 20)
	public String getBizDiv() {
		return this.bizDiv;
	}

	public void setBizDiv(String bizDiv) {
		this.bizDiv = bizDiv;
	}

	@Column(name = "BIZ_DIV_NM", length = 100)
	public String getBizDivNm() {
		return this.bizDivNm;
	}

	public void setBizDivNm(String bizDivNm) {
		this.bizDivNm = bizDivNm;
	}

	@Column(name = "CAPT_DIV", length = 20)
	public String getCaptDiv() {
		return this.captDiv;
	}

	public void setCaptDiv(String captDiv) {
		this.captDiv = captDiv;
	}

	@Column(name = "CAPT_DIV_NM", length = 100)
	public String getCaptDivNm() {
		return this.captDivNm;
	}

	public void setCaptDivNm(String captDivNm) {
		this.captDivNm = captDivNm;
	}

	@Column(name = "TX_TYPE", length = 20)
	public String getTxType() {
		return this.txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	@Column(name = "TX_TYPE_NM", length = 100)
	public String getTxTypeNm() {
		return this.txTypeNm;
	}

	public void setTxTypeNm(String txTypeNm) {
		this.txTypeNm = txTypeNm;
	}

	@Column(name = "PROD_NM", length = 100)
	public String getProdNm() {
		return this.prodNm;
	}

	public void setProdNm(String prodNm) {
		this.prodNm = prodNm;
	}

	@Column(name = "FST_FIN_TX_NO", length = 20)
	public String getFstFinTxNo() {
		return this.fstFinTxNo;
	}

	public void setFstFinTxNo(String fstFinTxNo) {
		this.fstFinTxNo = fstFinTxNo;
	}

	@Column(name = "CNT_PRTY", length = 20)
	public String getCntPrty() {
		return this.cntPrty;
	}

	public void setCntPrty(String cntPrty) {
		this.cntPrty = cntPrty;
	}

	@Column(name = "CNT_PRTY_NM", length = 100)
	public String getCntPrtyNm() {
		return this.cntPrtyNm;
	}

	public void setCntPrtyNm(String cntPrtyNm) {
		this.cntPrtyNm = cntPrtyNm;
	}

	@Column(name = "ACCT_NO", length = 25)
	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	@Column(name = "TERM_ST_DATE", length = 20)
	public String getTermStDate() {
		return this.termStDate;
	}

	public void setTermStDate(String termStDate) {
		this.termStDate = termStDate;
	}

	@Column(name = "TERM_ED_DATE", length = 20)
	public String getTermEdDate() {
		return this.termEdDate;
	}

	public void setTermEdDate(String termEdDate) {
		this.termEdDate = termEdDate;
	}

	@Column(name = "ORIG_AMT", precision = 20, scale = 0)
	public BigDecimal getOrigAmt() {
		return this.origAmt;
	}

	public void setOrigAmt(BigDecimal origAmt) {
		this.origAmt = origAmt;
	}

	@Column(name = "ACCT_CODE", length = 20)
	public String getAcctCode() {
		return this.acctCode;
	}

	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}

	@Column(name = "ACCT_CODE_NM", length = 100)
	public String getAcctCodeNm() {
		return this.acctCodeNm;
	}

	public void setAcctCodeNm(String acctCodeNm) {
		this.acctCodeNm = acctCodeNm;
	}

	@Column(name = "PAY_AMT", precision = 20, scale = 0)
	public BigDecimal getPayAmt() {
		return this.payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}

	@Column(name = "INT_AMT", precision = 20, scale = 0)
	public BigDecimal getIntAmt() {
		return this.intAmt;
	}

	public void setIntAmt(BigDecimal intAmt) {
		this.intAmt = intAmt;
	}

	@Column(name = "CORP_TAX_AMT", precision = 20, scale = 0)
	public BigDecimal getCorpTaxAmt() {
		return this.corpTaxAmt;
	}

	public void setCorpTaxAmt(BigDecimal corpTaxAmt) {
		this.corpTaxAmt = corpTaxAmt;
	}

	@Column(name = "MUNI_TAX_AMT", precision = 20, scale = 0)
	public BigDecimal getMuniTaxAmt() {
		return this.muniTaxAmt;
	}

	public void setMuniTaxAmt(BigDecimal muniTaxAmt) {
		this.muniTaxAmt = muniTaxAmt;
	}

	@Column(name = "RESIDUAL_AMT", precision = 20, scale = 0)
	public BigDecimal getResidualAmt() {
		return this.residualAmt;
	}

	public void setResidualAmt(BigDecimal residualAmt) {
		this.residualAmt = residualAmt;
	}

	@Column(name = "BOOKING_DATE", length = 20)
	public String getBookingDate() {
		return this.bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Column(name = "BOOKING_NO", length = 20)
	public String getBookingNo() {
		return this.bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}

	@Column(name = "CRE_DTTM", length = 20)
	public String getCreDttm() {
		return this.creDttm;
	}

	public void setCreDttm(String creDttm) {
		this.creDttm = creDttm;
	}

	@Column(name = "CHG_DTTM", length = 20)
	public String getChgDttm() {
		return this.chgDttm;
	}

	public void setChgDttm(String chgDttm) {
		this.chgDttm = chgDttm;
	}

	@Column(name = "EAI_PTTN", length = 1)
	public String getEaiPttn() {
		return this.eaiPttn;
	}

	public void setEaiPttn(String eaiPttn) {
		this.eaiPttn = eaiPttn;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EAI_CRE_DTTM", length = 7)
	public Date getEaiCreDttm() {
		return this.eaiCreDttm;
	}

	public void setEaiCreDttm(Date eaiCreDttm) {
		this.eaiCreDttm = eaiCreDttm;
	}

	@Column(name = "EAI_TRST_TYPE", length = 1)
	public String getEaiTrstType() {
		return this.eaiTrstType;
	}

	public void setEaiTrstType(String eaiTrstType) {
		this.eaiTrstType = eaiTrstType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EAI_TRST_DTTM", length = 7)
	public Date getEaiTrstDttm() {
		return this.eaiTrstDttm;
	}

	public void setEaiTrstDttm(Date eaiTrstDttm) {
		this.eaiTrstDttm = eaiTrstDttm;
	}

	@Column(name = "ERR_MSG", length = 200)
	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
