package com.eugenefe.entity.ncm;
// Generated Dec 21, 2016 2:18:11 PM by Hibernate Tools 5.2.0.CR1 with Custom Template_takion!!!!!! 

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
 * NcmHstKfrFundmst generated by hbm2java
 */

@Entity(name = "NaviNcmHstKfrFundmst")
@IdClass(value = NcmHstKfrFundmstId.class)
@Table(name = "NCM_HST_KFR_FUNDMST", schema = "NCM")
public class NcmHstKfrFundmst implements java.io.Serializable, Navigatable {

	private String basedate;
	private String mgrcode;
	private String fundmgrcode;
	private String fundkrcode;
	private String fundname;
	private String estabday;
	private long startamt;
	private BigDecimal startprice;
	private String sday;
	private String eday;
	private String evalcorpcode;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmHstKfrFundmst() {
	}

	@Id
	@Column(name = "BASEDATE", nullable = false, length = 8)
	public String getBasedate() {
		return this.basedate;
	}

	public void setBasedate(String basedate) {
		this.basedate = basedate;
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

	@Column(name = "FUNDKRCODE", nullable = false, length = 12)
	public String getFundkrcode() {
		return this.fundkrcode;
	}

	public void setFundkrcode(String fundkrcode) {
		this.fundkrcode = fundkrcode;

	}

	@Column(name = "FUNDNAME", nullable = false, length = 200)
	public String getFundname() {
		return this.fundname;
	}

	public void setFundname(String fundname) {
		this.fundname = fundname;

	}

	@Column(name = "ESTABDAY", nullable = false, length = 8)
	public String getEstabday() {
		return this.estabday;
	}

	public void setEstabday(String estabday) {
		this.estabday = estabday;

	}

	@Column(name = "STARTAMT", nullable = false, precision = 18, scale = 0)
	public long getStartamt() {
		return this.startamt;
	}

	public void setStartamt(long startamt) {
		this.startamt = startamt;

	}

	@Column(name = "STARTPRICE", nullable = false, precision = 18)
	public BigDecimal getStartprice() {
		return this.startprice;
	}

	public void setStartprice(BigDecimal startprice) {
		this.startprice = startprice;

	}

	@Column(name = "SDAY", nullable = false, length = 8)
	public String getSday() {
		return this.sday;
	}

	public void setSday(String sday) {
		this.sday = sday;

	}

	@Column(name = "EDAY", nullable = false, length = 8)
	public String getEday() {
		return this.eday;
	}

	public void setEday(String eday) {
		this.eday = eday;

	}

	@Column(name = "EVALCORPCODE", nullable = false, length = 4)
	public String getEvalcorpcode() {
		return this.evalcorpcode;
	}

	public void setEvalcorpcode(String evalcorpcode) {
		this.evalcorpcode = evalcorpcode;

	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRE_DTTM", nullable = false, length = 7)
	public Date getCreDttm() {
		return this.creDttm;
	}

	public void setCreDttm(Date creDttm) {
		this.creDttm = creDttm;

	}

	@Column(name = "CRE_EMP_NO", nullable = false, length = 6)
	public String getCreEmpNo() {
		return this.creEmpNo;
	}

	public void setCreEmpNo(String creEmpNo) {
		this.creEmpNo = creEmpNo;

	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CHG_DTTM", nullable = false, length = 7)
	public Date getChgDttm() {
		return this.chgDttm;
	}

	public void setChgDttm(Date chgDttm) {
		this.chgDttm = chgDttm;

	}

	@Column(name = "CHG_EMP_NO", nullable = false, length = 6)
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
		buffer.append("#").append(getBasedate());
		buffer.append("#").append(getMgrcode());
		buffer.append("#").append(getFundmgrcode());

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
		if (!(other instanceof NcmHstKfrFundmst))
			return false;
		NcmHstKfrFundmst castOther = (NcmHstKfrFundmst) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBasedate() == null ? 0 : this.getBasedate().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		return result;
	}

}