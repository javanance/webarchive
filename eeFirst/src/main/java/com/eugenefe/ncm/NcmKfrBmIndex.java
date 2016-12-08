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
 * NcmKfrBmIndex generated by hbm2java
 */

@Entity
@IdClass(value = NcmKfrBmIndexId.class)
@Table(name = "NCM_KFR_BM_INDEX", schema = "NCM")
public class NcmKfrBmIndex implements java.io.Serializable {

	private String baseday;
	private String tradeday;
	private String bmcode;
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

	@Id
	@Column(name = "BASEDAY", nullable = false, length = 8)
	public String getBaseday() {
		return this.baseday;
	}

	public void setBaseday(String baseday) {
		this.baseday = baseday;
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
	@Column(name = "BMCODE", nullable = false, length = 12)
	public String getBmcode() {
		return this.bmcode;
	}

	public void setBmcode(String bmcode) {
		this.bmcode = bmcode;
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

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseday());
		buffer.append("#").append(getTradeday());
		buffer.append("#").append(getBmcode());

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
		if (!(other instanceof NcmKfrBmIndex))
			return false;
		NcmKfrBmIndex castOther = (NcmKfrBmIndex) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseday() == null ? 0 : this.getBaseday().hashCode());
		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getBmcode() == null ? 0 : this.getBmcode().hashCode());
		return result;
	}

}
