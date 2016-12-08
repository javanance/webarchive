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
 * NcmRptPosDetail generated by hbm2java
 */

@Entity
@IdClass(value = NcmRptPosDetailId.class)
@Table(name = "NCM_RPT_POS_DETAIL", schema = "NCM")
public class NcmRptPosDetail implements java.io.Serializable {

	private String baseDate;
	private String posDiv;
	private String posId;
	private String subProdId;
	private String finTxNo;
	private String cptlDivCd;
	private String cptlDivNm;
	private String saaCd;
	private String saaCdNm;
	private String finProdId;
	private String finProdNm;
	private String prodTypeCd;
	private String prodTypeNm;
	private String sellerCorpNo;
	private String sellerNm;
	private String sellerTypeCd;
	private String sellerTypeNm;
	private String issuDate;
	private String matDate;
	private String issuerCorpNo;
	private String issuerNm;
	private String subProdNm;
	private String subProdTypeCd;
	private String subProdTypeNm;
	private String subIssuerCorpNo;
	private String subIssuerNm;
	private String matCd;
	private String creditTypeCd;
	private String unastNm;
	private String unastPubNm;
	private String unastCrdtGd;
	private String fstTxDate;
	private BigDecimal invAmt;
	private BigDecimal hldQty;
	private BigDecimal hldFaceAmt;
	private BigDecimal bookAmt;
	private BigDecimal mktEvalAmt;
	private BigDecimal evalPl;
	private BigDecimal todayAccrInt;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;
	private BigDecimal ytm;
	private BigDecimal intRate;

	public NcmRptPosDetail() {
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
	@Column(name = "POS_DIV", nullable = false, length = 10)
	public String getPosDiv() {
		return this.posDiv;
	}

	public void setPosDiv(String posDiv) {
		this.posDiv = posDiv;
	}

	@Id
	@Column(name = "POS_ID", nullable = false, length = 100)
	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	@Id
	@Column(name = "SUB_PROD_ID", nullable = false, length = 100)
	public String getSubProdId() {
		return this.subProdId;
	}

	public void setSubProdId(String subProdId) {
		this.subProdId = subProdId;
	}

	@Id
	@Column(name = "FIN_TX_NO", nullable = false, length = 10)
	public String getFinTxNo() {
		return this.finTxNo;
	}

	public void setFinTxNo(String finTxNo) {
		this.finTxNo = finTxNo;
	}

	@Column(name = "CPTL_DIV_CD", length = 10)
	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;

	}

	@Column(name = "CPTL_DIV_NM", length = 100)
	public String getCptlDivNm() {
		return this.cptlDivNm;
	}

	public void setCptlDivNm(String cptlDivNm) {
		this.cptlDivNm = cptlDivNm;

	}

	@Column(name = "SAA_CD", length = 10)
	public String getSaaCd() {
		return this.saaCd;
	}

	public void setSaaCd(String saaCd) {
		this.saaCd = saaCd;

	}

	@Column(name = "SAA_CD_NM", length = 100)
	public String getSaaCdNm() {
		return this.saaCdNm;
	}

	public void setSaaCdNm(String saaCdNm) {
		this.saaCdNm = saaCdNm;

	}

	@Column(name = "FIN_PROD_ID", length = 100)
	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;

	}

	@Column(name = "FIN_PROD_NM", length = 100)
	public String getFinProdNm() {
		return this.finProdNm;
	}

	public void setFinProdNm(String finProdNm) {
		this.finProdNm = finProdNm;

	}

	@Column(name = "PROD_TYPE_CD", length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;

	}

	@Column(name = "PROD_TYPE_NM", length = 100)
	public String getProdTypeNm() {
		return this.prodTypeNm;
	}

	public void setProdTypeNm(String prodTypeNm) {
		this.prodTypeNm = prodTypeNm;

	}

	@Column(name = "SELLER_CORP_NO", length = 20)
	public String getSellerCorpNo() {
		return this.sellerCorpNo;
	}

	public void setSellerCorpNo(String sellerCorpNo) {
		this.sellerCorpNo = sellerCorpNo;

	}

	@Column(name = "SELLER_NM", length = 100)
	public String getSellerNm() {
		return this.sellerNm;
	}

	public void setSellerNm(String sellerNm) {
		this.sellerNm = sellerNm;

	}

	@Column(name = "SELLER_TYPE_CD", length = 10)
	public String getSellerTypeCd() {
		return this.sellerTypeCd;
	}

	public void setSellerTypeCd(String sellerTypeCd) {
		this.sellerTypeCd = sellerTypeCd;

	}

	@Column(name = "SELLER_TYPE_NM", length = 100)
	public String getSellerTypeNm() {
		return this.sellerTypeNm;
	}

	public void setSellerTypeNm(String sellerTypeNm) {
		this.sellerTypeNm = sellerTypeNm;

	}

	@Column(name = "ISSU_DATE", length = 8)
	public String getIssuDate() {
		return this.issuDate;
	}

	public void setIssuDate(String issuDate) {
		this.issuDate = issuDate;

	}

	@Column(name = "MAT_DATE", length = 8)
	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;

	}

	@Column(name = "ISSUER_CORP_NO", length = 20)
	public String getIssuerCorpNo() {
		return this.issuerCorpNo;
	}

	public void setIssuerCorpNo(String issuerCorpNo) {
		this.issuerCorpNo = issuerCorpNo;

	}

	@Column(name = "ISSUER_NM", length = 100)
	public String getIssuerNm() {
		return this.issuerNm;
	}

	public void setIssuerNm(String issuerNm) {
		this.issuerNm = issuerNm;

	}

	@Column(name = "SUB_PROD_NM", length = 100)
	public String getSubProdNm() {
		return this.subProdNm;
	}

	public void setSubProdNm(String subProdNm) {
		this.subProdNm = subProdNm;

	}

	@Column(name = "SUB_PROD_TYPE_CD", length = 10)
	public String getSubProdTypeCd() {
		return this.subProdTypeCd;
	}

	public void setSubProdTypeCd(String subProdTypeCd) {
		this.subProdTypeCd = subProdTypeCd;

	}

	@Column(name = "SUB_PROD_TYPE_NM", length = 100)
	public String getSubProdTypeNm() {
		return this.subProdTypeNm;
	}

	public void setSubProdTypeNm(String subProdTypeNm) {
		this.subProdTypeNm = subProdTypeNm;

	}

	@Column(name = "SUB_ISSUER_CORP_NO", length = 20)
	public String getSubIssuerCorpNo() {
		return this.subIssuerCorpNo;
	}

	public void setSubIssuerCorpNo(String subIssuerCorpNo) {
		this.subIssuerCorpNo = subIssuerCorpNo;

	}

	@Column(name = "SUB_ISSUER_NM", length = 100)
	public String getSubIssuerNm() {
		return this.subIssuerNm;
	}

	public void setSubIssuerNm(String subIssuerNm) {
		this.subIssuerNm = subIssuerNm;

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

	@Column(name = "UNAST_NM", length = 100)
	public String getUnastNm() {
		return this.unastNm;
	}

	public void setUnastNm(String unastNm) {
		this.unastNm = unastNm;

	}

	@Column(name = "UNAST_PUB_NM", length = 100)
	public String getUnastPubNm() {
		return this.unastPubNm;
	}

	public void setUnastPubNm(String unastPubNm) {
		this.unastPubNm = unastPubNm;

	}

	@Column(name = "UNAST_CRDT_GD", length = 10)
	public String getUnastCrdtGd() {
		return this.unastCrdtGd;
	}

	public void setUnastCrdtGd(String unastCrdtGd) {
		this.unastCrdtGd = unastCrdtGd;

	}

	@Column(name = "FST_TX_DATE", length = 8)
	public String getFstTxDate() {
		return this.fstTxDate;
	}

	public void setFstTxDate(String fstTxDate) {
		this.fstTxDate = fstTxDate;

	}

	@Column(name = "INV_AMT", precision = 22)
	public BigDecimal getInvAmt() {
		return this.invAmt;
	}

	public void setInvAmt(BigDecimal invAmt) {
		this.invAmt = invAmt;

	}

	@Column(name = "HLD_QTY", precision = 22)
	public BigDecimal getHldQty() {
		return this.hldQty;
	}

	public void setHldQty(BigDecimal hldQty) {
		this.hldQty = hldQty;

	}

	@Column(name = "HLD_FACE_AMT", precision = 22)
	public BigDecimal getHldFaceAmt() {
		return this.hldFaceAmt;
	}

	public void setHldFaceAmt(BigDecimal hldFaceAmt) {
		this.hldFaceAmt = hldFaceAmt;

	}

	@Column(name = "BOOK_AMT", precision = 22)
	public BigDecimal getBookAmt() {
		return this.bookAmt;
	}

	public void setBookAmt(BigDecimal bookAmt) {
		this.bookAmt = bookAmt;

	}

	@Column(name = "MKT_EVAL_AMT", precision = 22)
	public BigDecimal getMktEvalAmt() {
		return this.mktEvalAmt;
	}

	public void setMktEvalAmt(BigDecimal mktEvalAmt) {
		this.mktEvalAmt = mktEvalAmt;

	}

	@Column(name = "EVAL_PL", precision = 22)
	public BigDecimal getEvalPl() {
		return this.evalPl;
	}

	public void setEvalPl(BigDecimal evalPl) {
		this.evalPl = evalPl;

	}

	@Column(name = "TODAY_ACCR_INT", precision = 22)
	public BigDecimal getTodayAccrInt() {
		return this.todayAccrInt;
	}

	public void setTodayAccrInt(BigDecimal todayAccrInt) {
		this.todayAccrInt = todayAccrInt;

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

	@Column(name = "YTM", precision = 22, scale = 8)
	public BigDecimal getYtm() {
		return this.ytm;
	}

	public void setYtm(BigDecimal ytm) {
		this.ytm = ytm;

	}

	@Column(name = "INT_RATE", precision = 22, scale = 8)
	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;

	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getPosDiv());
		buffer.append("#").append(getPosId());
		buffer.append("#").append(getSubProdId());
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
		if (!(other instanceof NcmRptPosDetail))
			return false;
		NcmRptPosDetail castOther = (NcmRptPosDetail) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getPosDiv() == null ? 0 : this.getPosDiv().hashCode());
		result = 37 * result + (getPosId() == null ? 0 : this.getPosId().hashCode());
		result = 37 * result + (getSubProdId() == null ? 0 : this.getSubProdId().hashCode());
		result = 37 * result + (getFinTxNo() == null ? 0 : this.getFinTxNo().hashCode());
		return result;
	}

}
