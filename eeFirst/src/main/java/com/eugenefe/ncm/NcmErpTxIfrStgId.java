package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmErpTxIfrStgId generated by hbm2java
 */
@Embeddable
public class NcmErpTxIfrStgId implements java.io.Serializable {

	private long eaiSeqNo;
	private String baseDate;
	private String finTxNo;
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

	public NcmErpTxIfrStgId() {
	}

	public NcmErpTxIfrStgId(long eaiSeqNo, String baseDate, String finTxNo) {
		this.eaiSeqNo = eaiSeqNo;
		this.baseDate = baseDate;
		this.finTxNo = finTxNo;
	}

	public NcmErpTxIfrStgId(long eaiSeqNo, String baseDate, String finTxNo, String bizDiv, String bizDivNm,
			String captDiv, String captDivNm, String txType, String txTypeNm, String prodNm, String fstFinTxNo,
			String cntPrty, String cntPrtyNm, String acctNo, String termStDate, String termEdDate, BigDecimal origAmt,
			String acctCode, String acctCodeNm, BigDecimal payAmt, BigDecimal intAmt, BigDecimal corpTaxAmt,
			BigDecimal muniTaxAmt, BigDecimal residualAmt, String bookingDate, String bookingNo, String creDttm,
			String chgDttm, String eaiPttn, Date eaiCreDttm, String eaiTrstType, Date eaiTrstDttm, String errMsg) {
		this.eaiSeqNo = eaiSeqNo;
		this.baseDate = baseDate;
		this.finTxNo = finTxNo;
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

	@Column(name = "EAI_SEQ_NO", nullable = false, precision = 15, scale = 0)
	public long getEaiSeqNo() {
		return this.eaiSeqNo;
	}

	public void setEaiSeqNo(long eaiSeqNo) {
		this.eaiSeqNo = eaiSeqNo;
	}

	@Column(name = "BASE_DATE", nullable = false, length = 20)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Column(name = "FIN_TX_NO", nullable = false, length = 20)
	public String getFinTxNo() {
		return this.finTxNo;
	}

	public void setFinTxNo(String finTxNo) {
		this.finTxNo = finTxNo;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmErpTxIfrStgId))
			return false;
		NcmErpTxIfrStgId castOther = (NcmErpTxIfrStgId) other;

		return (this.getEaiSeqNo() == castOther.getEaiSeqNo())
				&& ((this.getBaseDate() == castOther.getBaseDate()) || (this.getBaseDate() != null
						&& castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getFinTxNo() == castOther.getFinTxNo()) || (this.getFinTxNo() != null
						&& castOther.getFinTxNo() != null && this.getFinTxNo().equals(castOther.getFinTxNo())))
				&& ((this.getBizDiv() == castOther.getBizDiv()) || (this.getBizDiv() != null
						&& castOther.getBizDiv() != null && this.getBizDiv().equals(castOther.getBizDiv())))
				&& ((this.getBizDivNm() == castOther.getBizDivNm()) || (this.getBizDivNm() != null
						&& castOther.getBizDivNm() != null && this.getBizDivNm().equals(castOther.getBizDivNm())))
				&& ((this.getCaptDiv() == castOther.getCaptDiv()) || (this.getCaptDiv() != null
						&& castOther.getCaptDiv() != null && this.getCaptDiv().equals(castOther.getCaptDiv())))
				&& ((this.getCaptDivNm() == castOther.getCaptDivNm()) || (this.getCaptDivNm() != null
						&& castOther.getCaptDivNm() != null && this.getCaptDivNm().equals(castOther.getCaptDivNm())))
				&& ((this.getTxType() == castOther.getTxType()) || (this.getTxType() != null
						&& castOther.getTxType() != null && this.getTxType().equals(castOther.getTxType())))
				&& ((this.getTxTypeNm() == castOther.getTxTypeNm()) || (this.getTxTypeNm() != null
						&& castOther.getTxTypeNm() != null && this.getTxTypeNm().equals(castOther.getTxTypeNm())))
				&& ((this.getProdNm() == castOther.getProdNm()) || (this.getProdNm() != null
						&& castOther.getProdNm() != null && this.getProdNm().equals(castOther.getProdNm())))
				&& ((this.getFstFinTxNo() == castOther.getFstFinTxNo()) || (this.getFstFinTxNo() != null
						&& castOther.getFstFinTxNo() != null && this.getFstFinTxNo().equals(castOther.getFstFinTxNo())))
				&& ((this.getCntPrty() == castOther.getCntPrty()) || (this.getCntPrty() != null
						&& castOther.getCntPrty() != null && this.getCntPrty().equals(castOther.getCntPrty())))
				&& ((this.getCntPrtyNm() == castOther.getCntPrtyNm()) || (this.getCntPrtyNm() != null
						&& castOther.getCntPrtyNm() != null && this.getCntPrtyNm().equals(castOther.getCntPrtyNm())))
				&& ((this.getAcctNo() == castOther.getAcctNo()) || (this.getAcctNo() != null
						&& castOther.getAcctNo() != null && this.getAcctNo().equals(castOther.getAcctNo())))
				&& ((this.getTermStDate() == castOther.getTermStDate()) || (this.getTermStDate() != null
						&& castOther.getTermStDate() != null && this.getTermStDate().equals(castOther.getTermStDate())))
				&& ((this.getTermEdDate() == castOther.getTermEdDate()) || (this.getTermEdDate() != null
						&& castOther.getTermEdDate() != null && this.getTermEdDate().equals(castOther.getTermEdDate())))
				&& ((this.getOrigAmt() == castOther.getOrigAmt()) || (this.getOrigAmt() != null
						&& castOther.getOrigAmt() != null && this.getOrigAmt().equals(castOther.getOrigAmt())))
				&& ((this.getAcctCode() == castOther.getAcctCode()) || (this.getAcctCode() != null
						&& castOther.getAcctCode() != null && this.getAcctCode().equals(castOther.getAcctCode())))
				&& ((this.getAcctCodeNm() == castOther.getAcctCodeNm()) || (this.getAcctCodeNm() != null
						&& castOther.getAcctCodeNm() != null && this.getAcctCodeNm().equals(castOther.getAcctCodeNm())))
				&& ((this.getPayAmt() == castOther.getPayAmt()) || (this.getPayAmt() != null
						&& castOther.getPayAmt() != null && this.getPayAmt().equals(castOther.getPayAmt())))
				&& ((this.getIntAmt() == castOther.getIntAmt()) || (this.getIntAmt() != null
						&& castOther.getIntAmt() != null && this.getIntAmt().equals(castOther.getIntAmt())))
				&& ((this.getCorpTaxAmt() == castOther.getCorpTaxAmt()) || (this.getCorpTaxAmt() != null
						&& castOther.getCorpTaxAmt() != null && this.getCorpTaxAmt().equals(castOther.getCorpTaxAmt())))
				&& ((this.getMuniTaxAmt() == castOther.getMuniTaxAmt()) || (this.getMuniTaxAmt() != null
						&& castOther.getMuniTaxAmt() != null && this.getMuniTaxAmt().equals(castOther.getMuniTaxAmt())))
				&& ((this.getResidualAmt() == castOther.getResidualAmt())
						|| (this.getResidualAmt() != null && castOther.getResidualAmt() != null
								&& this.getResidualAmt().equals(castOther.getResidualAmt())))
				&& ((this.getBookingDate() == castOther.getBookingDate())
						|| (this.getBookingDate() != null && castOther.getBookingDate() != null
								&& this.getBookingDate().equals(castOther.getBookingDate())))
				&& ((this.getBookingNo() == castOther.getBookingNo()) || (this.getBookingNo() != null
						&& castOther.getBookingNo() != null && this.getBookingNo().equals(castOther.getBookingNo())))
				&& ((this.getCreDttm() == castOther.getCreDttm()) || (this.getCreDttm() != null
						&& castOther.getCreDttm() != null && this.getCreDttm().equals(castOther.getCreDttm())))
				&& ((this.getChgDttm() == castOther.getChgDttm()) || (this.getChgDttm() != null
						&& castOther.getChgDttm() != null && this.getChgDttm().equals(castOther.getChgDttm())))
				&& ((this.getEaiPttn() == castOther.getEaiPttn()) || (this.getEaiPttn() != null
						&& castOther.getEaiPttn() != null && this.getEaiPttn().equals(castOther.getEaiPttn())))
				&& ((this.getEaiCreDttm() == castOther.getEaiCreDttm()) || (this.getEaiCreDttm() != null
						&& castOther.getEaiCreDttm() != null && this.getEaiCreDttm().equals(castOther.getEaiCreDttm())))
				&& ((this.getEaiTrstType() == castOther.getEaiTrstType())
						|| (this.getEaiTrstType() != null && castOther.getEaiTrstType() != null
								&& this.getEaiTrstType().equals(castOther.getEaiTrstType())))
				&& ((this.getEaiTrstDttm() == castOther.getEaiTrstDttm())
						|| (this.getEaiTrstDttm() != null && castOther.getEaiTrstDttm() != null
								&& this.getEaiTrstDttm().equals(castOther.getEaiTrstDttm())))
				&& ((this.getErrMsg() == castOther.getErrMsg()) || (this.getErrMsg() != null
						&& castOther.getErrMsg() != null && this.getErrMsg().equals(castOther.getErrMsg())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getEaiSeqNo();
		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getFinTxNo() == null ? 0 : this.getFinTxNo().hashCode());
		result = 37 * result + (getBizDiv() == null ? 0 : this.getBizDiv().hashCode());
		result = 37 * result + (getBizDivNm() == null ? 0 : this.getBizDivNm().hashCode());
		result = 37 * result + (getCaptDiv() == null ? 0 : this.getCaptDiv().hashCode());
		result = 37 * result + (getCaptDivNm() == null ? 0 : this.getCaptDivNm().hashCode());
		result = 37 * result + (getTxType() == null ? 0 : this.getTxType().hashCode());
		result = 37 * result + (getTxTypeNm() == null ? 0 : this.getTxTypeNm().hashCode());
		result = 37 * result + (getProdNm() == null ? 0 : this.getProdNm().hashCode());
		result = 37 * result + (getFstFinTxNo() == null ? 0 : this.getFstFinTxNo().hashCode());
		result = 37 * result + (getCntPrty() == null ? 0 : this.getCntPrty().hashCode());
		result = 37 * result + (getCntPrtyNm() == null ? 0 : this.getCntPrtyNm().hashCode());
		result = 37 * result + (getAcctNo() == null ? 0 : this.getAcctNo().hashCode());
		result = 37 * result + (getTermStDate() == null ? 0 : this.getTermStDate().hashCode());
		result = 37 * result + (getTermEdDate() == null ? 0 : this.getTermEdDate().hashCode());
		result = 37 * result + (getOrigAmt() == null ? 0 : this.getOrigAmt().hashCode());
		result = 37 * result + (getAcctCode() == null ? 0 : this.getAcctCode().hashCode());
		result = 37 * result + (getAcctCodeNm() == null ? 0 : this.getAcctCodeNm().hashCode());
		result = 37 * result + (getPayAmt() == null ? 0 : this.getPayAmt().hashCode());
		result = 37 * result + (getIntAmt() == null ? 0 : this.getIntAmt().hashCode());
		result = 37 * result + (getCorpTaxAmt() == null ? 0 : this.getCorpTaxAmt().hashCode());
		result = 37 * result + (getMuniTaxAmt() == null ? 0 : this.getMuniTaxAmt().hashCode());
		result = 37 * result + (getResidualAmt() == null ? 0 : this.getResidualAmt().hashCode());
		result = 37 * result + (getBookingDate() == null ? 0 : this.getBookingDate().hashCode());
		result = 37 * result + (getBookingNo() == null ? 0 : this.getBookingNo().hashCode());
		result = 37 * result + (getCreDttm() == null ? 0 : this.getCreDttm().hashCode());
		result = 37 * result + (getChgDttm() == null ? 0 : this.getChgDttm().hashCode());
		result = 37 * result + (getEaiPttn() == null ? 0 : this.getEaiPttn().hashCode());
		result = 37 * result + (getEaiCreDttm() == null ? 0 : this.getEaiCreDttm().hashCode());
		result = 37 * result + (getEaiTrstType() == null ? 0 : this.getEaiTrstType().hashCode());
		result = 37 * result + (getEaiTrstDttm() == null ? 0 : this.getEaiTrstDttm().hashCode());
		result = 37 * result + (getErrMsg() == null ? 0 : this.getErrMsg().hashCode());
		return result;
	}

}
