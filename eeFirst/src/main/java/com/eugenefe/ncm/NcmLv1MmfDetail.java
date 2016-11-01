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
 * NcmLv1MmfDetail generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV1_MMF_DETAIL", schema = "NCM")
public class NcmLv1MmfDetail implements java.io.Serializable {

	private NcmLv1MmfDetailId id;
	private BigDecimal invAmt;
	private BigDecimal hldQty;
	private BigDecimal hldFaceAmt;
	private BigDecimal bookAmt;
	private BigDecimal bdayEvalAmt;
	private BigDecimal mktEvalAmt;
	private BigDecimal intInflowAmt;
	private BigDecimal evalPl;
	private BigDecimal todayAccrInt;
	private BigDecimal accuAccrInt;
	private BigDecimal todayBuyAmt;
	private BigDecimal todaySellAmt;
	private BigDecimal todayTradePl;
	private BigDecimal ytm;
	private BigDecimal adjDur;
	private BigDecimal spread;
	private String matCd;
	private String creditTypeCd;
	private String creditOrgCd;
	private String creditCd;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1MmfDetail() {
	}

	public NcmLv1MmfDetail(NcmLv1MmfDetailId id) {
		this.id = id;
	}

	public NcmLv1MmfDetail(NcmLv1MmfDetailId id, BigDecimal invAmt, BigDecimal hldQty, BigDecimal hldFaceAmt,
			BigDecimal bookAmt, BigDecimal bdayEvalAmt, BigDecimal mktEvalAmt, BigDecimal intInflowAmt,
			BigDecimal evalPl, BigDecimal todayAccrInt, BigDecimal accuAccrInt, BigDecimal todayBuyAmt,
			BigDecimal todaySellAmt, BigDecimal todayTradePl, BigDecimal ytm, BigDecimal adjDur, BigDecimal spread,
			String matCd, String creditTypeCd, String creditOrgCd, String creditCd, String srcTable, String updateId,
			Date lastUpdate) {
		this.id = id;
		this.invAmt = invAmt;
		this.hldQty = hldQty;
		this.hldFaceAmt = hldFaceAmt;
		this.bookAmt = bookAmt;
		this.bdayEvalAmt = bdayEvalAmt;
		this.mktEvalAmt = mktEvalAmt;
		this.intInflowAmt = intInflowAmt;
		this.evalPl = evalPl;
		this.todayAccrInt = todayAccrInt;
		this.accuAccrInt = accuAccrInt;
		this.todayBuyAmt = todayBuyAmt;
		this.todaySellAmt = todaySellAmt;
		this.todayTradePl = todayTradePl;
		this.ytm = ytm;
		this.adjDur = adjDur;
		this.spread = spread;
		this.matCd = matCd;
		this.creditTypeCd = creditTypeCd;
		this.creditOrgCd = creditOrgCd;
		this.creditCd = creditCd;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "finProdId", column = @Column(name = "FIN_PROD_ID", nullable = false, length = 50)),
			@AttributeOverride(name = "hldProdId", column = @Column(name = "HLD_PROD_ID", nullable = false, length = 20)) })
	public NcmLv1MmfDetailId getId() {
		return this.id;
	}

	public void setId(NcmLv1MmfDetailId id) {
		this.id = id;
	}

	@Column(name = "INV_AMT", precision = 20)
	public BigDecimal getInvAmt() {
		return this.invAmt;
	}

	public void setInvAmt(BigDecimal invAmt) {
		this.invAmt = invAmt;
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

	@Column(name = "INT_INFLOW_AMT", precision = 20)
	public BigDecimal getIntInflowAmt() {
		return this.intInflowAmt;
	}

	public void setIntInflowAmt(BigDecimal intInflowAmt) {
		this.intInflowAmt = intInflowAmt;
	}

	@Column(name = "EVAL_PL", precision = 20)
	public BigDecimal getEvalPl() {
		return this.evalPl;
	}

	public void setEvalPl(BigDecimal evalPl) {
		this.evalPl = evalPl;
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

	@Column(name = "MAT_CD", length = 10)
	public String getMatCd() {
		return this.matCd;
	}

	public void setMatCd(String matCd) {
		this.matCd = matCd;
	}

	@Column(name = "CREDIT_TYPE_CD", length = 10)
	public String getCreditTypeCd() {
		return this.creditTypeCd;
	}

	public void setCreditTypeCd(String creditTypeCd) {
		this.creditTypeCd = creditTypeCd;
	}

	@Column(name = "CREDIT_ORG_CD", length = 10)
	public String getCreditOrgCd() {
		return this.creditOrgCd;
	}

	public void setCreditOrgCd(String creditOrgCd) {
		this.creditOrgCd = creditOrgCd;
	}

	@Column(name = "CREDIT_CD", length = 10)
	public String getCreditCd() {
		return this.creditCd;
	}

	public void setCreditCd(String creditCd) {
		this.creditCd = creditCd;
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
