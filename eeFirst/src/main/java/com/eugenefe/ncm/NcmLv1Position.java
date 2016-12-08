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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmLv1Position generated by hbm2java
 */

@Entity
@IdClass(value = NcmLv1PositionId.class)
@Table(name = "NCM_LV1_POSITION", schema = "NCM")
public class NcmLv1Position implements java.io.Serializable {

	private String baseDate;
	private String posId;
	private String bizDivCd;
	private String acctDivCd;
	private String cptlDivCd;
	private String acctNo;
	private String finTxNo;
	private String saaCd;
	private String finProdId;
	private String mngOrgCorpNo;
	private String matCd;
	private String fstFinTxNo;
	private BigDecimal fstTxAmt;
	private String fstTxDate;
	private BigDecimal hldQty;
	private BigDecimal hldFaceAmt;
	private BigDecimal bookAmt;
	private BigDecimal bdayEvalAmt;
	private BigDecimal mktEvalAmt;
	private BigDecimal evalPl;
	private BigDecimal intInflowAmt;
	private BigDecimal todayAccrInt;
	private BigDecimal accuAccrInt;
	private BigDecimal unrealIntAmt;
	private BigDecimal todayBuyAmt;
	private BigDecimal todaySellAmt;
	private BigDecimal todayTradePl;
	private BigDecimal ytm;
	private BigDecimal adjDur;
	private BigDecimal spread;
	private BigDecimal subInvAmt;
	private BigDecimal subHldFaceAmt;
	private BigDecimal subBookAmt;
	private BigDecimal subMktEvalAmt;
	private String creditCd;
	private String creditOrgCd;
	private String creditTypeCd;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1Position() {
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
	@Column(name = "POS_ID", nullable = false, length = 30)
	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
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

	@Column(name = "FIN_TX_NO", length = 20)
	public String getFinTxNo() {
		return this.finTxNo;
	}

	public void setFinTxNo(String finTxNo) {
		this.finTxNo = finTxNo;

	}

	@Column(name = "SAA_CD", length = 20)
	public String getSaaCd() {
		return this.saaCd;
	}

	public void setSaaCd(String saaCd) {
		this.saaCd = saaCd;

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

	@Column(name = "MAT_CD", length = 10)
	public String getMatCd() {
		return this.matCd;
	}

	public void setMatCd(String matCd) {
		this.matCd = matCd;

	}

	@Column(name = "FST_FIN_TX_NO", length = 20)
	public String getFstFinTxNo() {
		return this.fstFinTxNo;
	}

	public void setFstFinTxNo(String fstFinTxNo) {
		this.fstFinTxNo = fstFinTxNo;

	}

	@Column(name = "FST_TX_AMT", precision = 20)
	public BigDecimal getFstTxAmt() {
		return this.fstTxAmt;
	}

	public void setFstTxAmt(BigDecimal fstTxAmt) {
		this.fstTxAmt = fstTxAmt;

	}

	@Column(name = "FST_TX_DATE", length = 8)
	public String getFstTxDate() {
		return this.fstTxDate;
	}

	public void setFstTxDate(String fstTxDate) {
		this.fstTxDate = fstTxDate;

	}

	@Column(name = "HLD_QTY", precision = 20)
	public BigDecimal getHldQty() {
		return this.hldQty;
	}

	public void setHldQty(BigDecimal hldQty) {
		this.hldQty = hldQty;

	}

	@Column(name = "HLD_FACE_AMT", precision = 20)
	public BigDecimal getHldFaceAmt() {
		return this.hldFaceAmt;
	}

	public void setHldFaceAmt(BigDecimal hldFaceAmt) {
		this.hldFaceAmt = hldFaceAmt;

	}

	@Column(name = "BOOK_AMT", precision = 20)
	public BigDecimal getBookAmt() {
		return this.bookAmt;
	}

	public void setBookAmt(BigDecimal bookAmt) {
		this.bookAmt = bookAmt;

	}

	@Column(name = "BDAY_EVAL_AMT", precision = 20)
	public BigDecimal getBdayEvalAmt() {
		return this.bdayEvalAmt;
	}

	public void setBdayEvalAmt(BigDecimal bdayEvalAmt) {
		this.bdayEvalAmt = bdayEvalAmt;

	}

	@Column(name = "MKT_EVAL_AMT", precision = 20)
	public BigDecimal getMktEvalAmt() {
		return this.mktEvalAmt;
	}

	public void setMktEvalAmt(BigDecimal mktEvalAmt) {
		this.mktEvalAmt = mktEvalAmt;

	}

	@Column(name = "EVAL_PL", precision = 20)
	public BigDecimal getEvalPl() {
		return this.evalPl;
	}

	public void setEvalPl(BigDecimal evalPl) {
		this.evalPl = evalPl;

	}

	@Column(name = "INT_INFLOW_AMT", precision = 20)
	public BigDecimal getIntInflowAmt() {
		return this.intInflowAmt;
	}

	public void setIntInflowAmt(BigDecimal intInflowAmt) {
		this.intInflowAmt = intInflowAmt;

	}

	@Column(name = "TODAY_ACCR_INT", precision = 20)
	public BigDecimal getTodayAccrInt() {
		return this.todayAccrInt;
	}

	public void setTodayAccrInt(BigDecimal todayAccrInt) {
		this.todayAccrInt = todayAccrInt;

	}

	@Column(name = "ACCU_ACCR_INT", precision = 20)
	public BigDecimal getAccuAccrInt() {
		return this.accuAccrInt;
	}

	public void setAccuAccrInt(BigDecimal accuAccrInt) {
		this.accuAccrInt = accuAccrInt;

	}

	@Column(name = "UNREAL_INT_AMT", precision = 20)
	public BigDecimal getUnrealIntAmt() {
		return this.unrealIntAmt;
	}

	public void setUnrealIntAmt(BigDecimal unrealIntAmt) {
		this.unrealIntAmt = unrealIntAmt;

	}

	@Column(name = "TODAY_BUY_AMT", precision = 20)
	public BigDecimal getTodayBuyAmt() {
		return this.todayBuyAmt;
	}

	public void setTodayBuyAmt(BigDecimal todayBuyAmt) {
		this.todayBuyAmt = todayBuyAmt;

	}

	@Column(name = "TODAY_SELL_AMT", precision = 20)
	public BigDecimal getTodaySellAmt() {
		return this.todaySellAmt;
	}

	public void setTodaySellAmt(BigDecimal todaySellAmt) {
		this.todaySellAmt = todaySellAmt;

	}

	@Column(name = "TODAY_TRADE_PL", precision = 20)
	public BigDecimal getTodayTradePl() {
		return this.todayTradePl;
	}

	public void setTodayTradePl(BigDecimal todayTradePl) {
		this.todayTradePl = todayTradePl;

	}

	@Column(name = "YTM", precision = 12, scale = 8)
	public BigDecimal getYtm() {
		return this.ytm;
	}

	public void setYtm(BigDecimal ytm) {
		this.ytm = ytm;

	}

	@Column(name = "ADJ_DUR", precision = 12, scale = 8)
	public BigDecimal getAdjDur() {
		return this.adjDur;
	}

	public void setAdjDur(BigDecimal adjDur) {
		this.adjDur = adjDur;

	}

	@Column(name = "SPREAD", precision = 12, scale = 8)
	public BigDecimal getSpread() {
		return this.spread;
	}

	public void setSpread(BigDecimal spread) {
		this.spread = spread;

	}

	@Column(name = "SUB_INV_AMT", precision = 20)
	public BigDecimal getSubInvAmt() {
		return this.subInvAmt;
	}

	public void setSubInvAmt(BigDecimal subInvAmt) {
		this.subInvAmt = subInvAmt;

	}

	@Column(name = "SUB_HLD_FACE_AMT", precision = 20)
	public BigDecimal getSubHldFaceAmt() {
		return this.subHldFaceAmt;
	}

	public void setSubHldFaceAmt(BigDecimal subHldFaceAmt) {
		this.subHldFaceAmt = subHldFaceAmt;

	}

	@Column(name = "SUB_BOOK_AMT", precision = 20)
	public BigDecimal getSubBookAmt() {
		return this.subBookAmt;
	}

	public void setSubBookAmt(BigDecimal subBookAmt) {
		this.subBookAmt = subBookAmt;

	}

	@Column(name = "SUB_MKT_EVAL_AMT", precision = 20)
	public BigDecimal getSubMktEvalAmt() {
		return this.subMktEvalAmt;
	}

	public void setSubMktEvalAmt(BigDecimal subMktEvalAmt) {
		this.subMktEvalAmt = subMktEvalAmt;

	}

	@Column(name = "CREDIT_CD", length = 10)
	public String getCreditCd() {
		return this.creditCd;
	}

	public void setCreditCd(String creditCd) {
		this.creditCd = creditCd;

	}

	@Column(name = "CREDIT_ORG_CD", length = 10)
	public String getCreditOrgCd() {
		return this.creditOrgCd;
	}

	public void setCreditOrgCd(String creditOrgCd) {
		this.creditOrgCd = creditOrgCd;

	}

	@Column(name = "CREDIT_TYPE_CD", length = 10)
	public String getCreditTypeCd() {
		return this.creditTypeCd;
	}

	public void setCreditTypeCd(String creditTypeCd) {
		this.creditTypeCd = creditTypeCd;

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
		if (!(other instanceof NcmLv1Position))
			return false;
		NcmLv1Position castOther = (NcmLv1Position) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getPosId() == null ? 0 : this.getPosId().hashCode());
		return result;
	}

}