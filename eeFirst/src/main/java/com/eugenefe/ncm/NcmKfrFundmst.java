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
 * NcmKfrFundmst generated by hbm2java
 */
@Entity
@Table(name = "NCM_KFR_FUNDMST", schema = "NCM")
public class NcmKfrFundmst implements java.io.Serializable {

	private NcmKfrFundmstId id;
	private String fundkrcode;
	private String fundname;
	private String fundtype;
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

	public NcmKfrFundmst() {
	}

	public NcmKfrFundmst(NcmKfrFundmstId id, String fundkrcode, String fundname, String estabday, long startamt,
			BigDecimal startprice, String sday, String eday, String evalcorpcode) {
		this.id = id;
		this.fundkrcode = fundkrcode;
		this.fundname = fundname;
		this.estabday = estabday;
		this.startamt = startamt;
		this.startprice = startprice;
		this.sday = sday;
		this.eday = eday;
		this.evalcorpcode = evalcorpcode;
	}

	public NcmKfrFundmst(NcmKfrFundmstId id, String fundkrcode, String fundname, String fundtype, String estabday,
			long startamt, BigDecimal startprice, String sday, String eday, String evalcorpcode, Date creDttm,
			String creEmpNo, Date chgDttm, String chgEmpNo, String workfilename) {
		this.id = id;
		this.fundkrcode = fundkrcode;
		this.fundname = fundname;
		this.fundtype = fundtype;
		this.estabday = estabday;
		this.startamt = startamt;
		this.startprice = startprice;
		this.sday = sday;
		this.eday = eday;
		this.evalcorpcode = evalcorpcode;
		this.creDttm = creDttm;
		this.creEmpNo = creEmpNo;
		this.chgDttm = chgDttm;
		this.chgEmpNo = chgEmpNo;
		this.workfilename = workfilename;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "mgrcode", column = @Column(name = "MGRCODE", nullable = false, length = 3)),
			@AttributeOverride(name = "fundmgrcode", column = @Column(name = "FUNDMGRCODE", nullable = false, length = 30)) })
	public NcmKfrFundmstId getId() {
		return this.id;
	}

	public void setId(NcmKfrFundmstId id) {
		this.id = id;
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

	@Column(name = "FUNDTYPE", length = 2)
	public String getFundtype() {
		return this.fundtype;
	}

	public void setFundtype(String fundtype) {
		this.fundtype = fundtype;
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
