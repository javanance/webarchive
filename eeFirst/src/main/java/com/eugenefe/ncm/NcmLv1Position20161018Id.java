package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmLv1Position20161018Id generated by hbm2java
 */
@Embeddable
public class NcmLv1Position20161018Id implements java.io.Serializable {

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

	public NcmLv1Position20161018Id() {
	}

	public NcmLv1Position20161018Id(String baseDate, String posId) {
		this.baseDate = baseDate;
		this.posId = posId;
	}

	public NcmLv1Position20161018Id(String baseDate, String posId, String bizDivCd, String acctDivCd, String cptlDivCd,
			String acctNo, String finTxNo, String saaCd, String finProdId, String mngOrgCorpNo, String matCd,
			String fstFinTxNo, BigDecimal fstTxAmt, String fstTxDate, BigDecimal hldQty, BigDecimal hldFaceAmt,
			BigDecimal bookAmt, BigDecimal bdayEvalAmt, BigDecimal mktEvalAmt, BigDecimal evalPl,
			BigDecimal intInflowAmt, BigDecimal todayAccrInt, BigDecimal accuAccrInt, BigDecimal unrealIntAmt,
			BigDecimal todayBuyAmt, BigDecimal todaySellAmt, BigDecimal todayTradePl, BigDecimal ytm, BigDecimal adjDur,
			BigDecimal spread, BigDecimal subInvAmt, BigDecimal subHldFaceAmt, BigDecimal subBookAmt,
			BigDecimal subMktEvalAmt, String creditCd, String creditOrgCd, String creditTypeCd, String srcTable,
			String updateId, Date lastUpdate) {
		this.baseDate = baseDate;
		this.posId = posId;
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

	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

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

	@Column(name = "LAST_UPDATE", length = 7)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1Position20161018Id))
			return false;
		NcmLv1Position20161018Id castOther = (NcmLv1Position20161018Id) other;

		return ((this.getBaseDate() == castOther.getBaseDate()) || (this.getBaseDate() != null
				&& castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getPosId() == castOther.getPosId()) || (this.getPosId() != null
						&& castOther.getPosId() != null && this.getPosId().equals(castOther.getPosId())))
				&& ((this.getBizDivCd() == castOther.getBizDivCd()) || (this.getBizDivCd() != null
						&& castOther.getBizDivCd() != null && this.getBizDivCd().equals(castOther.getBizDivCd())))
				&& ((this.getAcctDivCd() == castOther.getAcctDivCd()) || (this.getAcctDivCd() != null
						&& castOther.getAcctDivCd() != null && this.getAcctDivCd().equals(castOther.getAcctDivCd())))
				&& ((this.getCptlDivCd() == castOther.getCptlDivCd()) || (this.getCptlDivCd() != null
						&& castOther.getCptlDivCd() != null && this.getCptlDivCd().equals(castOther.getCptlDivCd())))
				&& ((this.getAcctNo() == castOther.getAcctNo()) || (this.getAcctNo() != null
						&& castOther.getAcctNo() != null && this.getAcctNo().equals(castOther.getAcctNo())))
				&& ((this.getFinTxNo() == castOther.getFinTxNo()) || (this.getFinTxNo() != null
						&& castOther.getFinTxNo() != null && this.getFinTxNo().equals(castOther.getFinTxNo())))
				&& ((this.getSaaCd() == castOther.getSaaCd()) || (this.getSaaCd() != null
						&& castOther.getSaaCd() != null && this.getSaaCd().equals(castOther.getSaaCd())))
				&& ((this.getFinProdId() == castOther.getFinProdId()) || (this.getFinProdId() != null
						&& castOther.getFinProdId() != null && this.getFinProdId().equals(castOther.getFinProdId())))
				&& ((this.getMngOrgCorpNo() == castOther.getMngOrgCorpNo())
						|| (this.getMngOrgCorpNo() != null && castOther.getMngOrgCorpNo() != null
								&& this.getMngOrgCorpNo().equals(castOther.getMngOrgCorpNo())))
				&& ((this.getMatCd() == castOther.getMatCd()) || (this.getMatCd() != null
						&& castOther.getMatCd() != null && this.getMatCd().equals(castOther.getMatCd())))
				&& ((this.getFstFinTxNo() == castOther.getFstFinTxNo()) || (this.getFstFinTxNo() != null
						&& castOther.getFstFinTxNo() != null && this.getFstFinTxNo().equals(castOther.getFstFinTxNo())))
				&& ((this.getFstTxAmt() == castOther.getFstTxAmt()) || (this.getFstTxAmt() != null
						&& castOther.getFstTxAmt() != null && this.getFstTxAmt().equals(castOther.getFstTxAmt())))
				&& ((this.getFstTxDate() == castOther.getFstTxDate()) || (this.getFstTxDate() != null
						&& castOther.getFstTxDate() != null && this.getFstTxDate().equals(castOther.getFstTxDate())))
				&& ((this.getHldQty() == castOther.getHldQty()) || (this.getHldQty() != null
						&& castOther.getHldQty() != null && this.getHldQty().equals(castOther.getHldQty())))
				&& ((this.getHldFaceAmt() == castOther.getHldFaceAmt()) || (this.getHldFaceAmt() != null
						&& castOther.getHldFaceAmt() != null && this.getHldFaceAmt().equals(castOther.getHldFaceAmt())))
				&& ((this.getBookAmt() == castOther.getBookAmt()) || (this.getBookAmt() != null
						&& castOther.getBookAmt() != null && this.getBookAmt().equals(castOther.getBookAmt())))
				&& ((this.getBdayEvalAmt() == castOther.getBdayEvalAmt())
						|| (this.getBdayEvalAmt() != null && castOther.getBdayEvalAmt() != null
								&& this.getBdayEvalAmt().equals(castOther.getBdayEvalAmt())))
				&& ((this.getMktEvalAmt() == castOther.getMktEvalAmt()) || (this.getMktEvalAmt() != null
						&& castOther.getMktEvalAmt() != null && this.getMktEvalAmt().equals(castOther.getMktEvalAmt())))
				&& ((this.getEvalPl() == castOther.getEvalPl()) || (this.getEvalPl() != null
						&& castOther.getEvalPl() != null && this.getEvalPl().equals(castOther.getEvalPl())))
				&& ((this.getIntInflowAmt() == castOther.getIntInflowAmt())
						|| (this.getIntInflowAmt() != null && castOther.getIntInflowAmt() != null
								&& this.getIntInflowAmt().equals(castOther.getIntInflowAmt())))
				&& ((this.getTodayAccrInt() == castOther.getTodayAccrInt())
						|| (this.getTodayAccrInt() != null && castOther.getTodayAccrInt() != null
								&& this.getTodayAccrInt().equals(castOther.getTodayAccrInt())))
				&& ((this.getAccuAccrInt() == castOther.getAccuAccrInt())
						|| (this.getAccuAccrInt() != null && castOther.getAccuAccrInt() != null
								&& this.getAccuAccrInt().equals(castOther.getAccuAccrInt())))
				&& ((this.getUnrealIntAmt() == castOther.getUnrealIntAmt())
						|| (this.getUnrealIntAmt() != null && castOther.getUnrealIntAmt() != null
								&& this.getUnrealIntAmt().equals(castOther.getUnrealIntAmt())))
				&& ((this.getTodayBuyAmt() == castOther.getTodayBuyAmt())
						|| (this.getTodayBuyAmt() != null && castOther.getTodayBuyAmt() != null
								&& this.getTodayBuyAmt().equals(castOther.getTodayBuyAmt())))
				&& ((this.getTodaySellAmt() == castOther.getTodaySellAmt())
						|| (this.getTodaySellAmt() != null && castOther.getTodaySellAmt() != null
								&& this.getTodaySellAmt().equals(castOther.getTodaySellAmt())))
				&& ((this.getTodayTradePl() == castOther.getTodayTradePl())
						|| (this.getTodayTradePl() != null && castOther.getTodayTradePl() != null
								&& this.getTodayTradePl().equals(castOther.getTodayTradePl())))
				&& ((this.getYtm() == castOther.getYtm()) || (this.getYtm() != null && castOther.getYtm() != null
						&& this.getYtm().equals(castOther.getYtm())))
				&& ((this.getAdjDur() == castOther.getAdjDur()) || (this.getAdjDur() != null
						&& castOther.getAdjDur() != null && this.getAdjDur().equals(castOther.getAdjDur())))
				&& ((this.getSpread() == castOther.getSpread()) || (this.getSpread() != null
						&& castOther.getSpread() != null && this.getSpread().equals(castOther.getSpread())))
				&& ((this.getSubInvAmt() == castOther.getSubInvAmt()) || (this.getSubInvAmt() != null
						&& castOther.getSubInvAmt() != null && this.getSubInvAmt().equals(castOther.getSubInvAmt())))
				&& ((this.getSubHldFaceAmt() == castOther.getSubHldFaceAmt())
						|| (this.getSubHldFaceAmt() != null && castOther.getSubHldFaceAmt() != null
								&& this.getSubHldFaceAmt().equals(castOther.getSubHldFaceAmt())))
				&& ((this.getSubBookAmt() == castOther.getSubBookAmt()) || (this.getSubBookAmt() != null
						&& castOther.getSubBookAmt() != null && this.getSubBookAmt().equals(castOther.getSubBookAmt())))
				&& ((this.getSubMktEvalAmt() == castOther.getSubMktEvalAmt())
						|| (this.getSubMktEvalAmt() != null && castOther.getSubMktEvalAmt() != null
								&& this.getSubMktEvalAmt().equals(castOther.getSubMktEvalAmt())))
				&& ((this.getCreditCd() == castOther.getCreditCd()) || (this.getCreditCd() != null
						&& castOther.getCreditCd() != null && this.getCreditCd().equals(castOther.getCreditCd())))
				&& ((this.getCreditOrgCd() == castOther.getCreditOrgCd())
						|| (this.getCreditOrgCd() != null && castOther.getCreditOrgCd() != null
								&& this.getCreditOrgCd().equals(castOther.getCreditOrgCd())))
				&& ((this.getCreditTypeCd() == castOther.getCreditTypeCd())
						|| (this.getCreditTypeCd() != null && castOther.getCreditTypeCd() != null
								&& this.getCreditTypeCd().equals(castOther.getCreditTypeCd())))
				&& ((this.getSrcTable() == castOther.getSrcTable()) || (this.getSrcTable() != null
						&& castOther.getSrcTable() != null && this.getSrcTable().equals(castOther.getSrcTable())))
				&& ((this.getUpdateId() == castOther.getUpdateId()) || (this.getUpdateId() != null
						&& castOther.getUpdateId() != null && this.getUpdateId().equals(castOther.getUpdateId())))
				&& ((this.getLastUpdate() == castOther.getLastUpdate())
						|| (this.getLastUpdate() != null && castOther.getLastUpdate() != null
								&& this.getLastUpdate().equals(castOther.getLastUpdate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getPosId() == null ? 0 : this.getPosId().hashCode());
		result = 37 * result + (getBizDivCd() == null ? 0 : this.getBizDivCd().hashCode());
		result = 37 * result + (getAcctDivCd() == null ? 0 : this.getAcctDivCd().hashCode());
		result = 37 * result + (getCptlDivCd() == null ? 0 : this.getCptlDivCd().hashCode());
		result = 37 * result + (getAcctNo() == null ? 0 : this.getAcctNo().hashCode());
		result = 37 * result + (getFinTxNo() == null ? 0 : this.getFinTxNo().hashCode());
		result = 37 * result + (getSaaCd() == null ? 0 : this.getSaaCd().hashCode());
		result = 37 * result + (getFinProdId() == null ? 0 : this.getFinProdId().hashCode());
		result = 37 * result + (getMngOrgCorpNo() == null ? 0 : this.getMngOrgCorpNo().hashCode());
		result = 37 * result + (getMatCd() == null ? 0 : this.getMatCd().hashCode());
		result = 37 * result + (getFstFinTxNo() == null ? 0 : this.getFstFinTxNo().hashCode());
		result = 37 * result + (getFstTxAmt() == null ? 0 : this.getFstTxAmt().hashCode());
		result = 37 * result + (getFstTxDate() == null ? 0 : this.getFstTxDate().hashCode());
		result = 37 * result + (getHldQty() == null ? 0 : this.getHldQty().hashCode());
		result = 37 * result + (getHldFaceAmt() == null ? 0 : this.getHldFaceAmt().hashCode());
		result = 37 * result + (getBookAmt() == null ? 0 : this.getBookAmt().hashCode());
		result = 37 * result + (getBdayEvalAmt() == null ? 0 : this.getBdayEvalAmt().hashCode());
		result = 37 * result + (getMktEvalAmt() == null ? 0 : this.getMktEvalAmt().hashCode());
		result = 37 * result + (getEvalPl() == null ? 0 : this.getEvalPl().hashCode());
		result = 37 * result + (getIntInflowAmt() == null ? 0 : this.getIntInflowAmt().hashCode());
		result = 37 * result + (getTodayAccrInt() == null ? 0 : this.getTodayAccrInt().hashCode());
		result = 37 * result + (getAccuAccrInt() == null ? 0 : this.getAccuAccrInt().hashCode());
		result = 37 * result + (getUnrealIntAmt() == null ? 0 : this.getUnrealIntAmt().hashCode());
		result = 37 * result + (getTodayBuyAmt() == null ? 0 : this.getTodayBuyAmt().hashCode());
		result = 37 * result + (getTodaySellAmt() == null ? 0 : this.getTodaySellAmt().hashCode());
		result = 37 * result + (getTodayTradePl() == null ? 0 : this.getTodayTradePl().hashCode());
		result = 37 * result + (getYtm() == null ? 0 : this.getYtm().hashCode());
		result = 37 * result + (getAdjDur() == null ? 0 : this.getAdjDur().hashCode());
		result = 37 * result + (getSpread() == null ? 0 : this.getSpread().hashCode());
		result = 37 * result + (getSubInvAmt() == null ? 0 : this.getSubInvAmt().hashCode());
		result = 37 * result + (getSubHldFaceAmt() == null ? 0 : this.getSubHldFaceAmt().hashCode());
		result = 37 * result + (getSubBookAmt() == null ? 0 : this.getSubBookAmt().hashCode());
		result = 37 * result + (getSubMktEvalAmt() == null ? 0 : this.getSubMktEvalAmt().hashCode());
		result = 37 * result + (getCreditCd() == null ? 0 : this.getCreditCd().hashCode());
		result = 37 * result + (getCreditOrgCd() == null ? 0 : this.getCreditOrgCd().hashCode());
		result = 37 * result + (getCreditTypeCd() == null ? 0 : this.getCreditTypeCd().hashCode());
		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getUpdateId() == null ? 0 : this.getUpdateId().hashCode());
		result = 37 * result + (getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode());
		return result;
	}

}
