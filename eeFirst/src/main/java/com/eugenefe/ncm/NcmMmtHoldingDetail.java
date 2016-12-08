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
 * NcmMmtHoldingDetail generated by hbm2java
 */

@Entity
@IdClass(value = NcmMmtHoldingDetailId.class)
@Table(name = "NCM_MMT_HOLDING_DETAIL", schema = "NCM")
public class NcmMmtHoldingDetail implements java.io.Serializable, Navigatable {

	private String seqNo;
	private String bizDt;
	private String stockCd;
	private String acctCd;
	private String assetCd;
	private String assetGb;
	private String buyDt;
	private String assetNm;
	private String assetPubNo;
	private String assetPubNm;
	private String assetCrdtGrd;
	private String crdtGrdEval;
	private String crdtGrdType;
	private long assetFaceAmt;
	private long assetInvAmt;
	private long bookEvalAmt;
	private long mktEvalAmt;
	private String issueDt;
	private String exprDt;
	private BigDecimal assetRet;
	private String crdtGrdFir;
	private String crdtGrdPub;
	private String secuLend;
	private Long etcCharge;
	private String tranNo;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmMmtHoldingDetail() {
	}

	@Id
	@Column(name = "SEQ_NO", nullable = false, length = 7)
	public String getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	@Id
	@Column(name = "BIZ_DT", nullable = false, length = 8)
	public String getBizDt() {
		return this.bizDt;
	}

	public void setBizDt(String bizDt) {
		this.bizDt = bizDt;
	}

	@Id
	@Column(name = "STOCK_CD", nullable = false, length = 13)
	public String getStockCd() {
		return this.stockCd;
	}

	public void setStockCd(String stockCd) {
		this.stockCd = stockCd;
	}

	@Id
	@Column(name = "ACCT_CD", nullable = false, length = 30)
	public String getAcctCd() {
		return this.acctCd;
	}

	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}

	@Id
	@Column(name = "ASSET_CD", nullable = false, length = 12)
	public String getAssetCd() {
		return this.assetCd;
	}

	public void setAssetCd(String assetCd) {
		this.assetCd = assetCd;
	}

	@Id
	@Column(name = "ASSET_GB", nullable = false, length = 2)
	public String getAssetGb() {
		return this.assetGb;
	}

	public void setAssetGb(String assetGb) {
		this.assetGb = assetGb;
	}

	@Id
	@Column(name = "BUY_DT", nullable = false, length = 8)
	public String getBuyDt() {
		return this.buyDt;
	}

	public void setBuyDt(String buyDt) {
		this.buyDt = buyDt;
	}

	@Column(name = "ASSET_NM", nullable = false, length = 100)
	public String getAssetNm() {
		return this.assetNm;
	}

	public void setAssetNm(String assetNm) {
		this.assetNm = assetNm;

	}

	@Column(name = "ASSET_PUB_NO", length = 13)
	public String getAssetPubNo() {
		return this.assetPubNo;
	}

	public void setAssetPubNo(String assetPubNo) {
		this.assetPubNo = assetPubNo;

	}

	@Column(name = "ASSET_PUB_NM", length = 30)
	public String getAssetPubNm() {
		return this.assetPubNm;
	}

	public void setAssetPubNm(String assetPubNm) {
		this.assetPubNm = assetPubNm;

	}

	@Column(name = "ASSET_CRDT_GRD", nullable = false, length = 4)
	public String getAssetCrdtGrd() {
		return this.assetCrdtGrd;
	}

	public void setAssetCrdtGrd(String assetCrdtGrd) {
		this.assetCrdtGrd = assetCrdtGrd;

	}

	@Column(name = "CRDT_GRD_EVAL", length = 2)
	public String getCrdtGrdEval() {
		return this.crdtGrdEval;
	}

	public void setCrdtGrdEval(String crdtGrdEval) {
		this.crdtGrdEval = crdtGrdEval;

	}

	@Column(name = "CRDT_GRD_TYPE", length = 2)
	public String getCrdtGrdType() {
		return this.crdtGrdType;
	}

	public void setCrdtGrdType(String crdtGrdType) {
		this.crdtGrdType = crdtGrdType;

	}

	@Column(name = "ASSET_FACE_AMT", nullable = false, precision = 15, scale = 0)
	public long getAssetFaceAmt() {
		return this.assetFaceAmt;
	}

	public void setAssetFaceAmt(long assetFaceAmt) {
		this.assetFaceAmt = assetFaceAmt;

	}

	@Column(name = "ASSET_INV_AMT", nullable = false, precision = 15, scale = 0)
	public long getAssetInvAmt() {
		return this.assetInvAmt;
	}

	public void setAssetInvAmt(long assetInvAmt) {
		this.assetInvAmt = assetInvAmt;

	}

	@Column(name = "BOOK_EVAL_AMT", nullable = false, precision = 15, scale = 0)
	public long getBookEvalAmt() {
		return this.bookEvalAmt;
	}

	public void setBookEvalAmt(long bookEvalAmt) {
		this.bookEvalAmt = bookEvalAmt;

	}

	@Column(name = "MKT_EVAL_AMT", nullable = false, precision = 15, scale = 0)
	public long getMktEvalAmt() {
		return this.mktEvalAmt;
	}

	public void setMktEvalAmt(long mktEvalAmt) {
		this.mktEvalAmt = mktEvalAmt;

	}

	@Column(name = "ISSUE_DT", nullable = false, length = 8)
	public String getIssueDt() {
		return this.issueDt;
	}

	public void setIssueDt(String issueDt) {
		this.issueDt = issueDt;

	}

	@Column(name = "EXPR_DT", nullable = false, length = 8)
	public String getExprDt() {
		return this.exprDt;
	}

	public void setExprDt(String exprDt) {
		this.exprDt = exprDt;

	}

	@Column(name = "ASSET_RET", nullable = false, precision = 7, scale = 3)
	public BigDecimal getAssetRet() {
		return this.assetRet;
	}

	public void setAssetRet(BigDecimal assetRet) {
		this.assetRet = assetRet;

	}

	@Column(name = "CRDT_GRD_FIR", length = 4)
	public String getCrdtGrdFir() {
		return this.crdtGrdFir;
	}

	public void setCrdtGrdFir(String crdtGrdFir) {
		this.crdtGrdFir = crdtGrdFir;

	}

	@Column(name = "CRDT_GRD_PUB", length = 4)
	public String getCrdtGrdPub() {
		return this.crdtGrdPub;
	}

	public void setCrdtGrdPub(String crdtGrdPub) {
		this.crdtGrdPub = crdtGrdPub;

	}

	@Column(name = "SECU_LEND", length = 30)
	public String getSecuLend() {
		return this.secuLend;
	}

	public void setSecuLend(String secuLend) {
		this.secuLend = secuLend;

	}

	@Column(name = "ETC_CHARGE", precision = 15, scale = 0)
	public Long getEtcCharge() {
		return this.etcCharge;
	}

	public void setEtcCharge(Long etcCharge) {
		this.etcCharge = etcCharge;

	}

	@Column(name = "TRAN_NO", length = 15)
	public String getTranNo() {
		return this.tranNo;
	}

	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;

	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRE_DTTM", length = 7)
	public Date getCreDttm() {
		return this.creDttm;
	}

	public void setCreDttm(Date creDttm) {
		this.creDttm = creDttm;

	}

	@Column(name = "CRE_EMP_NO", length = 6)
	public String getCreEmpNo() {
		return this.creEmpNo;
	}

	public void setCreEmpNo(String creEmpNo) {
		this.creEmpNo = creEmpNo;

	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CHG_DTTM", length = 7)
	public Date getChgDttm() {
		return this.chgDttm;
	}

	public void setChgDttm(Date chgDttm) {
		this.chgDttm = chgDttm;

	}

	@Column(name = "CHG_EMP_NO", length = 6)
	public String getChgEmpNo() {
		return this.chgEmpNo;
	}

	public void setChgEmpNo(String chgEmpNo) {
		this.chgEmpNo = chgEmpNo;

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
		buffer.append("#").append(getSeqNo());
		buffer.append("#").append(getBizDt());
		buffer.append("#").append(getStockCd());
		buffer.append("#").append(getAcctCd());
		buffer.append("#").append(getAssetCd());
		buffer.append("#").append(getAssetGb());
		buffer.append("#").append(getBuyDt());

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
		if (!(other instanceof NcmMmtHoldingDetail))
			return false;
		NcmMmtHoldingDetail castOther = (NcmMmtHoldingDetail) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSeqNo() == null ? 0 : this.getSeqNo().hashCode());
		result = 37 * result + (getBizDt() == null ? 0 : this.getBizDt().hashCode());
		result = 37 * result + (getStockCd() == null ? 0 : this.getStockCd().hashCode());
		result = 37 * result + (getAcctCd() == null ? 0 : this.getAcctCd().hashCode());
		result = 37 * result + (getAssetCd() == null ? 0 : this.getAssetCd().hashCode());
		result = 37 * result + (getAssetGb() == null ? 0 : this.getAssetGb().hashCode());
		result = 37 * result + (getBuyDt() == null ? 0 : this.getBuyDt().hashCode());
		return result;
	}

}
