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
 * NcmMmtPosition generated by hbm2java
 */
@Entity
@Table(name = "NCM_MMT_POSITION", schema = "NCM")
public class NcmMmtPosition implements java.io.Serializable {

	private NcmMmtPositionId id;
	private String bankNm;
	private String acctNm;
	private String estbDt;
	private long faceAmt;
	private BigDecimal prRet;
	private String exprDt;
	private BigDecimal clsRet;
	private Long exprAmt;
	private boolean acctGb;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmMmtPosition() {
	}

	public NcmMmtPosition(NcmMmtPositionId id, String bankNm, String acctNm, String estbDt, long faceAmt,
			BigDecimal prRet, String exprDt, boolean acctGb) {
		this.id = id;
		this.bankNm = bankNm;
		this.acctNm = acctNm;
		this.estbDt = estbDt;
		this.faceAmt = faceAmt;
		this.prRet = prRet;
		this.exprDt = exprDt;
		this.acctGb = acctGb;
	}

	public NcmMmtPosition(NcmMmtPositionId id, String bankNm, String acctNm, String estbDt, long faceAmt,
			BigDecimal prRet, String exprDt, BigDecimal clsRet, Long exprAmt, boolean acctGb, Date creDttm,
			String creEmpNo, Date chgDttm, String chgEmpNo, String workfilename) {
		this.id = id;
		this.bankNm = bankNm;
		this.acctNm = acctNm;
		this.estbDt = estbDt;
		this.faceAmt = faceAmt;
		this.prRet = prRet;
		this.exprDt = exprDt;
		this.clsRet = clsRet;
		this.exprAmt = exprAmt;
		this.acctGb = acctGb;
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
			@AttributeOverride(name = "cptlGb", column = @Column(name = "CPTL_GB", nullable = false, length = 2)),
			@AttributeOverride(name = "termGb", column = @Column(name = "TERM_GB", nullable = false, length = 2)) })
	public NcmMmtPositionId getId() {
		return this.id;
	}

	public void setId(NcmMmtPositionId id) {
		this.id = id;
	}

	@Column(name = "BANK_NM", nullable = false, length = 30)
	public String getBankNm() {
		return this.bankNm;
	}

	public void setBankNm(String bankNm) {
		this.bankNm = bankNm;
	}

	@Column(name = "ACCT_NM", nullable = false, length = 100)
	public String getAcctNm() {
		return this.acctNm;
	}

	public void setAcctNm(String acctNm) {
		this.acctNm = acctNm;
	}

	@Column(name = "ESTB_DT", nullable = false, length = 8)
	public String getEstbDt() {
		return this.estbDt;
	}

	public void setEstbDt(String estbDt) {
		this.estbDt = estbDt;
	}

	@Column(name = "FACE_AMT", nullable = false, precision = 15, scale = 0)
	public long getFaceAmt() {
		return this.faceAmt;
	}

	public void setFaceAmt(long faceAmt) {
		this.faceAmt = faceAmt;
	}

	@Column(name = "PR_RET", nullable = false, precision = 7, scale = 3)
	public BigDecimal getPrRet() {
		return this.prRet;
	}

	public void setPrRet(BigDecimal prRet) {
		this.prRet = prRet;
	}

	@Column(name = "EXPR_DT", nullable = false, length = 8)
	public String getExprDt() {
		return this.exprDt;
	}

	public void setExprDt(String exprDt) {
		this.exprDt = exprDt;
	}

	@Column(name = "CLS_RET", precision = 7, scale = 3)
	public BigDecimal getClsRet() {
		return this.clsRet;
	}

	public void setClsRet(BigDecimal clsRet) {
		this.clsRet = clsRet;
	}

	@Column(name = "EXPR_AMT", precision = 15, scale = 0)
	public Long getExprAmt() {
		return this.exprAmt;
	}

	public void setExprAmt(Long exprAmt) {
		this.exprAmt = exprAmt;
	}

	@Column(name = "ACCT_GB", nullable = false, precision = 1, scale = 0)
	public boolean isAcctGb() {
		return this.acctGb;
	}

	public void setAcctGb(boolean acctGb) {
		this.acctGb = acctGb;
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