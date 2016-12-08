package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * NcmKfrTransaction generated by hbm2java
 */

@Entity
@IdClass(value = NcmKfrTransactionId.class)
@Table(name = "NCM_KFR_TRANSACTION", schema = "NCM")
public class NcmKfrTransaction implements java.io.Serializable {

	private String tradeday;
	private String mgrcode;
	private String fundmgrcode;
	private String assetbclass;
	private String assetsclass;
	private String itemcode;
	private String seq;
	private String tradecode;
	private String fundname;
	private String assetname;
	private String itemkname;
	private String buydate;
	private String buyseq;
	private BigDecimal qty;
	private BigDecimal tradeprc;
	private BigDecimal tradeprice;
	private BigDecimal cost;
	private BigDecimal tradepl;
	private BigDecimal tradefee;
	private BigDecimal traderet;
	private BigDecimal avgtraderet;
	private String settledate;
	private String issuedate;
	private String exprdate;
	private String tradeconame;
	private String evalcorpcode;
	private String workfilename;

	public NcmKfrTransaction() {
	}

	@Id
	@Column(name = "TRADEDAY", nullable = false, length = 8)
	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;
	}

	@Id
	@Column(name = "MGRCODE", nullable = false, length = 3)
	public String getMgrcode() {
		return this.mgrcode;
	}

	public void setMgrcode(String mgrcode) {
		this.mgrcode = mgrcode;
	}

	@Id
	@Column(name = "FUNDMGRCODE", nullable = false, length = 30)
	public String getFundmgrcode() {
		return this.fundmgrcode;
	}

	public void setFundmgrcode(String fundmgrcode) {
		this.fundmgrcode = fundmgrcode;
	}

	@Id
	@Column(name = "ASSETBCLASS", nullable = false, length = 2)
	public String getAssetbclass() {
		return this.assetbclass;
	}

	public void setAssetbclass(String assetbclass) {
		this.assetbclass = assetbclass;
	}

	@Id
	@Column(name = "ASSETSCLASS", nullable = false, length = 2)
	public String getAssetsclass() {
		return this.assetsclass;
	}

	public void setAssetsclass(String assetsclass) {
		this.assetsclass = assetsclass;
	}

	@Id
	@Column(name = "ITEMCODE", nullable = false, length = 50)
	public String getItemcode() {
		return this.itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	@Id
	@Column(name = "SEQ", nullable = false, length = 2)
	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	@Id
	@Column(name = "TRADECODE", nullable = false, length = 2)
	public String getTradecode() {
		return this.tradecode;
	}

	public void setTradecode(String tradecode) {
		this.tradecode = tradecode;
	}

	@Column(name = "FUNDNAME", length = 200)
	public String getFundname() {
		return this.fundname;
	}

	public void setFundname(String fundname) {
		this.fundname = fundname;

	}

	@Column(name = "ASSETNAME", length = 200)
	public String getAssetname() {
		return this.assetname;
	}

	public void setAssetname(String assetname) {
		this.assetname = assetname;

	}

	@Column(name = "ITEMKNAME", length = 50)
	public String getItemkname() {
		return this.itemkname;
	}

	public void setItemkname(String itemkname) {
		this.itemkname = itemkname;

	}

	@Column(name = "BUYDATE", length = 8)
	public String getBuydate() {
		return this.buydate;
	}

	public void setBuydate(String buydate) {
		this.buydate = buydate;

	}

	@Column(name = "BUYSEQ", length = 5)
	public String getBuyseq() {
		return this.buyseq;
	}

	public void setBuyseq(String buyseq) {
		this.buyseq = buyseq;

	}

	@Column(name = "QTY", precision = 20, scale = 0)
	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;

	}

	@Column(name = "TRADEPRC", precision = 20)
	public BigDecimal getTradeprc() {
		return this.tradeprc;
	}

	public void setTradeprc(BigDecimal tradeprc) {
		this.tradeprc = tradeprc;

	}

	@Column(name = "TRADEPRICE", precision = 22, scale = 0)
	public BigDecimal getTradeprice() {
		return this.tradeprice;
	}

	public void setTradeprice(BigDecimal tradeprice) {
		this.tradeprice = tradeprice;

	}

	@Column(name = "COST", precision = 20, scale = 0)
	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;

	}

	@Column(name = "TRADEPL", precision = 20, scale = 0)
	public BigDecimal getTradepl() {
		return this.tradepl;
	}

	public void setTradepl(BigDecimal tradepl) {
		this.tradepl = tradepl;

	}

	@Column(name = "TRADEFEE", precision = 20, scale = 0)
	public BigDecimal getTradefee() {
		return this.tradefee;
	}

	public void setTradefee(BigDecimal tradefee) {
		this.tradefee = tradefee;

	}

	@Column(name = "TRADERET", precision = 20, scale = 12)
	public BigDecimal getTraderet() {
		return this.traderet;
	}

	public void setTraderet(BigDecimal traderet) {
		this.traderet = traderet;

	}

	@Column(name = "AVGTRADERET", precision = 20, scale = 12)
	public BigDecimal getAvgtraderet() {
		return this.avgtraderet;
	}

	public void setAvgtraderet(BigDecimal avgtraderet) {
		this.avgtraderet = avgtraderet;

	}

	@Column(name = "SETTLEDATE", length = 8)
	public String getSettledate() {
		return this.settledate;
	}

	public void setSettledate(String settledate) {
		this.settledate = settledate;

	}

	@Column(name = "ISSUEDATE", length = 8)
	public String getIssuedate() {
		return this.issuedate;
	}

	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;

	}

	@Column(name = "EXPRDATE", length = 8)
	public String getExprdate() {
		return this.exprdate;
	}

	public void setExprdate(String exprdate) {
		this.exprdate = exprdate;

	}

	@Column(name = "TRADECONAME", length = 50)
	public String getTradeconame() {
		return this.tradeconame;
	}

	public void setTradeconame(String tradeconame) {
		this.tradeconame = tradeconame;

	}

	@Column(name = "EVALCORPCODE", length = 2)
	public String getEvalcorpcode() {
		return this.evalcorpcode;
	}

	public void setEvalcorpcode(String evalcorpcode) {
		this.evalcorpcode = evalcorpcode;

	}

	@Column(name = "WORKFILENAME", length = 30)
	public String getWorkfilename() {
		return this.workfilename;
	}

	public void setWorkfilename(String workfilename) {
		this.workfilename = workfilename;

	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getTradeday());
		buffer.append("#").append(getMgrcode());
		buffer.append("#").append(getFundmgrcode());
		buffer.append("#").append(getAssetbclass());
		buffer.append("#").append(getAssetsclass());
		buffer.append("#").append(getItemcode());
		buffer.append("#").append(getSeq());
		buffer.append("#").append(getTradecode());

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
		if (!(other instanceof NcmKfrTransaction))
			return false;
		NcmKfrTransaction castOther = (NcmKfrTransaction) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		result = 37 * result + (getAssetbclass() == null ? 0 : this.getAssetbclass().hashCode());
		result = 37 * result + (getAssetsclass() == null ? 0 : this.getAssetsclass().hashCode());
		result = 37 * result + (getItemcode() == null ? 0 : this.getItemcode().hashCode());
		result = 37 * result + (getSeq() == null ? 0 : this.getSeq().hashCode());
		result = 37 * result + (getTradecode() == null ? 0 : this.getTradecode().hashCode());
		return result;
	}

}
