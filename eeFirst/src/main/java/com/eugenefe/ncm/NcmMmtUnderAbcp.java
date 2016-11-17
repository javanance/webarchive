package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

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
 * NcmMmtUnderAbcp generated by hbm2java
 */
@Entity
@Table(name = "NCM_MMT_UNDER_ABCP", schema = "NCM")
public class NcmMmtUnderAbcp implements java.io.Serializable {

	private NcmMmtUnderAbcpId id;
	private String unastNm;
	private String unastGb;
	private String unastPubNo;
	private String unastPubNm;
	private String unastCrdtGd;
	private String crdtEvalAg;
	private String crdtTypeCd;
	private String cdsGbCd;
	private String bnkrpt;
	private String bkSecuTyp;
	private String devNm;
	private String bldNm;
	private String bldNo;
	private String bldCrdtGd;
	private String bldCrdtEval;
	private String bldCrdtCd;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmMmtUnderAbcp() {
	}

	public NcmMmtUnderAbcp(NcmMmtUnderAbcpId id, String unastNm, String unastGb, String unastCrdtGd) {
		this.id = id;
		this.unastNm = unastNm;
		this.unastGb = unastGb;
		this.unastCrdtGd = unastCrdtGd;
	}

	public NcmMmtUnderAbcp(NcmMmtUnderAbcpId id, String unastNm, String unastGb, String unastPubNo, String unastPubNm,
			String unastCrdtGd, String crdtEvalAg, String crdtTypeCd, String cdsGbCd, String bnkrpt, String bkSecuTyp,
			String devNm, String bldNm, String bldNo, String bldCrdtGd, String bldCrdtEval, String bldCrdtCd,
			Date creDttm, String creEmpNo, Date chgDttm, String chgEmpNo, String workfilename) {
		this.id = id;
		this.unastNm = unastNm;
		this.unastGb = unastGb;
		this.unastPubNo = unastPubNo;
		this.unastPubNm = unastPubNm;
		this.unastCrdtGd = unastCrdtGd;
		this.crdtEvalAg = crdtEvalAg;
		this.crdtTypeCd = crdtTypeCd;
		this.cdsGbCd = cdsGbCd;
		this.bnkrpt = bnkrpt;
		this.bkSecuTyp = bkSecuTyp;
		this.devNm = devNm;
		this.bldNm = bldNm;
		this.bldNo = bldNo;
		this.bldCrdtGd = bldCrdtGd;
		this.bldCrdtEval = bldCrdtEval;
		this.bldCrdtCd = bldCrdtCd;
		this.creDttm = creDttm;
		this.creEmpNo = creEmpNo;
		this.chgDttm = chgDttm;
		this.chgEmpNo = chgEmpNo;
		this.workfilename = workfilename;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "seqNo", column = @Column(name = "SEQ_NO", nullable = false, length = 7)),
			@AttributeOverride(name = "bizDt", column = @Column(name = "BIZ_DT", nullable = false, length = 8)),
			@AttributeOverride(name = "stockCd", column = @Column(name = "STOCK_CD", nullable = false, length = 13)),
			@AttributeOverride(name = "acctCd", column = @Column(name = "ACCT_CD", nullable = false, length = 30)),
			@AttributeOverride(name = "assetCd", column = @Column(name = "ASSET_CD", nullable = false, length = 12)),
			@AttributeOverride(name = "unastCd", column = @Column(name = "UNAST_CD", nullable = false, length = 14)) })
	public NcmMmtUnderAbcpId getId() {
		return this.id;
	}

	public void setId(NcmMmtUnderAbcpId id) {
		this.id = id;
	}

	@Column(name = "UNAST_NM", nullable = false, length = 100)
	public String getUnastNm() {
		return this.unastNm;
	}

	public void setUnastNm(String unastNm) {
		this.unastNm = unastNm;
	}

	@Column(name = "UNAST_GB", nullable = false, length = 2)
	public String getUnastGb() {
		return this.unastGb;
	}

	public void setUnastGb(String unastGb) {
		this.unastGb = unastGb;
	}

	@Column(name = "UNAST_PUB_NO", length = 13)
	public String getUnastPubNo() {
		return this.unastPubNo;
	}

	public void setUnastPubNo(String unastPubNo) {
		this.unastPubNo = unastPubNo;
	}

	@Column(name = "UNAST_PUB_NM", length = 30)
	public String getUnastPubNm() {
		return this.unastPubNm;
	}

	public void setUnastPubNm(String unastPubNm) {
		this.unastPubNm = unastPubNm;
	}

	@Column(name = "UNAST_CRDT_GD", nullable = false, length = 4)
	public String getUnastCrdtGd() {
		return this.unastCrdtGd;
	}

	public void setUnastCrdtGd(String unastCrdtGd) {
		this.unastCrdtGd = unastCrdtGd;
	}

	@Column(name = "CRDT_EVAL_AG", length = 2)
	public String getCrdtEvalAg() {
		return this.crdtEvalAg;
	}

	public void setCrdtEvalAg(String crdtEvalAg) {
		this.crdtEvalAg = crdtEvalAg;
	}

	@Column(name = "CRDT_TYPE_CD", length = 2)
	public String getCrdtTypeCd() {
		return this.crdtTypeCd;
	}

	public void setCrdtTypeCd(String crdtTypeCd) {
		this.crdtTypeCd = crdtTypeCd;
	}

	@Column(name = "CDS_GB_CD", length = 2)
	public String getCdsGbCd() {
		return this.cdsGbCd;
	}

	public void setCdsGbCd(String cdsGbCd) {
		this.cdsGbCd = cdsGbCd;
	}

	@Column(name = "BNKRPT", length = 2)
	public String getBnkrpt() {
		return this.bnkrpt;
	}

	public void setBnkrpt(String bnkrpt) {
		this.bnkrpt = bnkrpt;
	}

	@Column(name = "BK_SECU_TYP", length = 2)
	public String getBkSecuTyp() {
		return this.bkSecuTyp;
	}

	public void setBkSecuTyp(String bkSecuTyp) {
		this.bkSecuTyp = bkSecuTyp;
	}

	@Column(name = "DEV_NM", length = 30)
	public String getDevNm() {
		return this.devNm;
	}

	public void setDevNm(String devNm) {
		this.devNm = devNm;
	}

	@Column(name = "BLD_NM", length = 30)
	public String getBldNm() {
		return this.bldNm;
	}

	public void setBldNm(String bldNm) {
		this.bldNm = bldNm;
	}

	@Column(name = "BLD_NO", length = 13)
	public String getBldNo() {
		return this.bldNo;
	}

	public void setBldNo(String bldNo) {
		this.bldNo = bldNo;
	}

	@Column(name = "BLD_CRDT_GD", length = 4)
	public String getBldCrdtGd() {
		return this.bldCrdtGd;
	}

	public void setBldCrdtGd(String bldCrdtGd) {
		this.bldCrdtGd = bldCrdtGd;
	}

	@Column(name = "BLD_CRDT_EVAL", length = 2)
	public String getBldCrdtEval() {
		return this.bldCrdtEval;
	}

	public void setBldCrdtEval(String bldCrdtEval) {
		this.bldCrdtEval = bldCrdtEval;
	}

	@Column(name = "BLD_CRDT_CD", length = 2)
	public String getBldCrdtCd() {
		return this.bldCrdtCd;
	}

	public void setBldCrdtCd(String bldCrdtCd) {
		this.bldCrdtCd = bldCrdtCd;
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

}