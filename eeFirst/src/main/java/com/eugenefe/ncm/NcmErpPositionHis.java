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
 * NcmErpPositionHis generated by hbm2java
 */

@Entity
@IdClass(value = NcmErpPositionHisId.class)
@Table(name = "NCM_ERP_POSITION_HIS", schema = "NCM")
public class NcmErpPositionHis implements java.io.Serializable, Navigatable {

	private String baseDate;
	private String finTxNo;
	private String acctDiv;
	private String bizDiv;
	private String bizDivNm;
	private String captDiv;
	private String captDivNm;
	private String txType;
	private String txTypeNm;
	private String prodNm;
	private String fstFinTxNo;
	private String termType;
	private String cntPrty;
	private String cntPrtyNm;
	private String acctNo;
	private String buyDate;
	private String maturityDate;
	private Long holdingTerm;
	private BigDecimal holdingAmt;
	private BigDecimal intRate;
	private String creDttm;
	private String chgDttm;
	private String eaiPttn;
	private Date eaiCreDttm;
	private String eaiTrstType;
	private Date eaiTrstDttm;
	private String errMsg;

	public NcmErpPositionHis() {
	}

	@Id
	@Column(name = "BASE_DATE", nullable = false, length = 20)
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

	@Column(name = "ACCT_DIV", length = 20)
	public String getAcctDiv() {
		return this.acctDiv;
	}

	public void setAcctDiv(String acctDiv) {
		this.acctDiv = acctDiv;

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

	@Column(name = "TERM_TYPE", length = 20)
	public String getTermType() {
		return this.termType;
	}

	public void setTermType(String termType) {
		this.termType = termType;

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

	@Column(name = "BUY_DATE", length = 20)
	public String getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;

	}

	@Column(name = "MATURITY_DATE", length = 20)
	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;

	}

	@Column(name = "HOLDING_TERM", precision = 10, scale = 0)
	public Long getHoldingTerm() {
		return this.holdingTerm;
	}

	public void setHoldingTerm(Long holdingTerm) {
		this.holdingTerm = holdingTerm;

	}

	@Column(name = "HOLDING_AMT", precision = 20, scale = 0)
	public BigDecimal getHoldingAmt() {
		return this.holdingAmt;
	}

	public void setHoldingAmt(BigDecimal holdingAmt) {
		this.holdingAmt = holdingAmt;

	}

	@Column(name = "INT_RATE", precision = 10, scale = 8)
	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;

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
		if (!(other instanceof NcmErpPositionHis))
			return false;
		NcmErpPositionHis castOther = (NcmErpPositionHis) other;

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
