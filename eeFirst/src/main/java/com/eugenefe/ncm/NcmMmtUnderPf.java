package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMmtUnderPf generated by hbm2java
 */

@Entity
@IdClass(value = NcmMmtUnderPfId.class)
@Table(name = "NCM_MMT_UNDER_PF", schema = "NCM")
public class NcmMmtUnderPf implements java.io.Serializable {

	private String seqNo;
	private String bizDt;
	private String stockCd;
	private String acctCd;
	private String assetCd;
	private String unastCd;
	private int ordGb;
	private String pfCd;
	private String pfDetailCd;
	private String crdtGrdEval;
	private String pfAgNo;
	private String pfAgNm;
	private String pfAgCrdt;
	private String crdtGrdType;
	private String detailLst;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmMmtUnderPf() {
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
	@Column(name = "UNAST_CD", nullable = false, length = 14)
	public String getUnastCd() {
		return this.unastCd;
	}

	public void setUnastCd(String unastCd) {
		this.unastCd = unastCd;
	}

	@Id
	@Column(name = "ORD_GB", nullable = false, precision = 8, scale = 0)
	public int getOrdGb() {
		return this.ordGb;
	}

	public void setOrdGb(int ordGb) {
		this.ordGb = ordGb;
	}

	@Column(name = "PF_CD", nullable = false, length = 2)
	public String getPfCd() {
		return this.pfCd;
	}

	public void setPfCd(String pfCd) {
		this.pfCd = pfCd;

	}

	@Column(name = "PF_DETAIL_CD", nullable = false, length = 2)
	public String getPfDetailCd() {
		return this.pfDetailCd;
	}

	public void setPfDetailCd(String pfDetailCd) {
		this.pfDetailCd = pfDetailCd;

	}

	@Column(name = "CRDT_GRD_EVAL", length = 2)
	public String getCrdtGrdEval() {
		return this.crdtGrdEval;
	}

	public void setCrdtGrdEval(String crdtGrdEval) {
		this.crdtGrdEval = crdtGrdEval;

	}

	@Column(name = "PF_AG_NO", length = 13)
	public String getPfAgNo() {
		return this.pfAgNo;
	}

	public void setPfAgNo(String pfAgNo) {
		this.pfAgNo = pfAgNo;

	}

	@Column(name = "PF_AG_NM", length = 30)
	public String getPfAgNm() {
		return this.pfAgNm;
	}

	public void setPfAgNm(String pfAgNm) {
		this.pfAgNm = pfAgNm;

	}

	@Column(name = "PF_AG_CRDT", length = 4)
	public String getPfAgCrdt() {
		return this.pfAgCrdt;
	}

	public void setPfAgCrdt(String pfAgCrdt) {
		this.pfAgCrdt = pfAgCrdt;

	}

	@Column(name = "CRDT_GRD_TYPE", length = 2)
	public String getCrdtGrdType() {
		return this.crdtGrdType;
	}

	public void setCrdtGrdType(String crdtGrdType) {
		this.crdtGrdType = crdtGrdType;

	}

	@Column(name = "DETAIL_LST", length = 500)
	public String getDetailLst() {
		return this.detailLst;
	}

	public void setDetailLst(String detailLst) {
		this.detailLst = detailLst;

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
		buffer.append("#").append(getUnastCd());
		buffer.append("#").append(getOrdGb());

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
		if (!(other instanceof NcmMmtUnderPf))
			return false;
		NcmMmtUnderPf castOther = (NcmMmtUnderPf) other;

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
		result = 37 * result + (getUnastCd() == null ? 0 : this.getUnastCd().hashCode());
		result = 37 * result + this.getOrdGb();
		return result;
	}

}