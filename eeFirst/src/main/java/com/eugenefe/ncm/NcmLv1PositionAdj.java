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
 * NcmLv1PositionAdj generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV1_POSITION_ADJ", schema = "NCM")
public class NcmLv1PositionAdj implements java.io.Serializable {

	private NcmLv1PositionAdjId id;
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

	public NcmLv1PositionAdj() {
	}

	public NcmLv1PositionAdj(NcmLv1PositionAdjId id) {
		this.id = id;
	}

	public NcmLv1PositionAdj(NcmLv1PositionAdjId id, String bizDivCd, String acctDivCd, String cptlDivCd, String acctNo,
			String finTxNo, String saaCd, String finProdId, String mngOrgCorpNo, String matCd, String fstFinTxNo,
			BigDecimal fstTxAmt, String fstTxDate, BigDecimal hldQty, BigDecimal hldFaceAmt, BigDecimal bookAmt,
			BigDecimal bdayEvalAmt, BigDecimal mktEvalAmt, BigDecimal evalPl, BigDecimal intInflowAmt,
			BigDecimal todayAccrInt, BigDecimal accuAccrInt, BigDecimal unrealIntAmt, BigDecimal todayBuyAmt,
			BigDecimal todaySellAmt, BigDecimal todayTradePl, BigDecimal ytm, BigDecimal adjDur, BigDecimal spread,
			BigDecimal subInvAmt, BigDecimal subHldFaceAmt, BigDecimal subBookAmt, BigDecimal subMktEvalAmt,
			String creditCd, String creditOrgCd, String creditTypeCd, String srcTable, String updateId,
			Date lastUpdate) {
		this.id = id;
		this.bizDivCd = bizDivCd;
		this.acctDivCd = acctDivCd;
		this.cptlDivCd = cptlDivCd;
		this.acctNo = acctNo;
		this.finTxNo = finTxNo;
		this.saaCd = saaCd;
		this.finProdId = finProdId;
		this.mngOrgCorpNo = mngOrgCorpNo;
		this.matCd = matCd;
		this.fstFinTxNo = fstFinTxNo;
		this.fstTxAmt = fstTxAmt;
		this.fstTxDate = fstTxDate;
		this.hldQty = hldQty;
		this.hldFaceAmt = hldFaceAmt;
		this.bookAmt = bookAmt;
		this.bdayEvalAmt = bdayEvalAmt;
		this.mktEvalAmt = mktEvalAmt;
		this.evalPl = evalPl;
		this.intInflowAmt = intInflowAmt;
		this.todayAccrInt = todayAccrInt;
		this.accuAccrInt = accuAccrInt;
		this.unrealIntAmt = unrealIntAmt;
		this.todayBuyAmt = todayBuyAmt;
		this.todaySellAmt = todaySellAmt;
		this.todayTradePl = todayTradePl;
		this.ytm = ytm;
		this.adjDur = adjDur;
		this.spread = spread;
		this.subInvAmt = subInvAmt;
		this.subHldFaceAmt = subHldFaceAmt;
		this.subBookAmt = subBookAmt;
		this.subMktEvalAmt = subMktEvalAmt;
		this.creditCd = creditCd;
		this.creditOrgCd = creditOrgCd;
		this.creditTypeCd = creditTypeCd;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "posId", column = @Column(name = "POS_ID", nullable = false, length = 30)) })
	public NcmLv1PositionAdjId getId() {
		return this.id;
	}

	public void setId(NcmLv1PositionAdjId id) {
		this.id = id;
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

}