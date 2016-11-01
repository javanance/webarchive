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
 * NcmKfrBmIndex generated by hbm2java
 */
@Entity
@Table(name = "NCM_KFR_BM_INDEX", schema = "NCM")
public class NcmKfrBmIndex implements java.io.Serializable {

	private NcmKfrBmIndexId id;
	private String bmname;
	private BigDecimal bmret1d;
	private BigDecimal bmretidx;
	private BigDecimal bmret1m;
	private BigDecimal bmret3m;
	private BigDecimal bmret6m;
	private BigDecimal bmret1y;
	private BigDecimal bmretytd;
	private String evalcorpcode;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmKfrBmIndex() {
	}

	public NcmKfrBmIndex(NcmKfrBmIndexId id) {
		this.id = id;
	}

	public NcmKfrBmIndex(NcmKfrBmIndexId id, String bmname, BigDecimal bmret1d, BigDecimal bmretidx, BigDecimal bmret1m,
			BigDecimal bmret3m, BigDecimal bmret6m, BigDecimal bmret1y, BigDecimal bmretytd, String evalcorpcode,
			Date creDttm, String creEmpNo, Date chgDttm, String chgEmpNo, String workfilename) {
		this.id = id;
		this.bmname = bmname;
		this.bmret1d = bmret1d;
		this.bmretidx = bmretidx;
		this.bmret1m = bmret1m;
		this.bmret3m = bmret3m;
		this.bmret6m = bmret6m;
		this.bmret1y = bmret1y;
		this.bmretytd = bmretytd;
		this.evalcorpcode = evalcorpcode;
		this.creDttm = creDttm;
		this.creEmpNo = creEmpNo;
		this.chgDttm = chgDttm;
		this.chgEmpNo = chgEmpNo;
		this.workfilename = workfilename;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseday", column = @Column(name = "BASEDAY", nullable = false, length = 8)),
			@AttributeOverride(name = "tradeday", column = @Column(name = "TRADEDAY", nullable = false, length = 8)),
			@AttributeOverride(name = "bmcode", column = @Column(name = "BMCODE", nullable = false, length = 12)) })
	public NcmKfrBmIndexId getId() {
		return this.id;
	}

	public void setId(NcmKfrBmIndexId id) {
		this.id = id;
	}

	@Column(name = "BMNAME", length = 100)
	public String getBmname() {
		return this.bmname;
	}

	public void setBmname(String bmname) {
		this.bmname = bmname;
	}

	@Column(name = "BMRET1D", precision = 20, scale = 12)
	public BigDecimal getBmret1d() {
		return this.bmret1d;
	}

	public void setBmret1d(BigDecimal bmret1d) {
		this.bmret1d = bmret1d;
	}

	@Column(name = "BMRETIDX", precision = 20, scale = 12)
	public BigDecimal getBmretidx() {
		return this.bmretidx;
	}

	public void setBmretidx(BigDecimal bmretidx) {
		this.bmretidx = bmretidx;
	}

	@Column(name = "BMRET1M", precision = 20, scale = 12)
	public BigDecimal getBmret1m() {
		return this.bmret1m;
	}

	public void setBmret1m(BigDecimal bmret1m) {
		this.bmret1m = bmret1m;
	}

	@Column(name = "BMRET3M", precision = 20, scale = 12)
	public BigDecimal getBmret3m() {
		return this.bmret3m;
	}

	public void setBmret3m(BigDecimal bmret3m) {
		this.bmret3m = bmret3m;
	}

	@Column(name = "BMRET6M", precision = 20, scale = 12)
	public BigDecimal getBmret6m() {
		return this.bmret6m;
	}

	public void setBmret6m(BigDecimal bmret6m) {
		this.bmret6m = bmret6m;
	}

	@Column(name = "BMRET1Y", precision = 20, scale = 12)
	public BigDecimal getBmret1y() {
		return this.bmret1y;
	}

	public void setBmret1y(BigDecimal bmret1y) {
		this.bmret1y = bmret1y;
	}

	@Column(name = "BMRETYTD", precision = 20, scale = 12)
	public BigDecimal getBmretytd() {
		return this.bmretytd;
	}

	public void setBmretytd(BigDecimal bmretytd) {
		this.bmretytd = bmretytd;
	}

	@Column(name = "EVALCORPCODE", length = 4)
	public String getEvalcorpcode() {
		return this.evalcorpcode;
	}

	public void setEvalcorpcode(String evalcorpcode) {
		this.evalcorpcode = evalcorpcode;
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
