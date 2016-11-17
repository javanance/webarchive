package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmWebUser generated by hbm2java
 */
@Entity
@Table(name = "NCM_WEB_USER", schema = "NCM")
public class NcmWebUser implements java.io.Serializable {

	private String empNo;
	private NcmWebDept ncmWebDept;
	private String empNm;
	private String password;
	private char sexdstnCode;
	private String downAuth;
	private String ofcpsNm;
	private char sttusCode;
	private Date sbscrbDt;
	private BigDecimal logInCnt;
	private Date lastLoginDate;

	public NcmWebUser() {
	}

	public NcmWebUser(String empNo, NcmWebDept ncmWebDept, String empNm, String password, char sexdstnCode,
			String downAuth, String ofcpsNm, char sttusCode, Date sbscrbDt) {
		this.empNo = empNo;
		this.ncmWebDept = ncmWebDept;
		this.empNm = empNm;
		this.password = password;
		this.sexdstnCode = sexdstnCode;
		this.downAuth = downAuth;
		this.ofcpsNm = ofcpsNm;
		this.sttusCode = sttusCode;
		this.sbscrbDt = sbscrbDt;
	}

	public NcmWebUser(String empNo, NcmWebDept ncmWebDept, String empNm, String password, char sexdstnCode,
			String downAuth, String ofcpsNm, char sttusCode, Date sbscrbDt, BigDecimal logInCnt, Date lastLoginDate) {
		this.empNo = empNo;
		this.ncmWebDept = ncmWebDept;
		this.empNm = empNm;
		this.password = password;
		this.sexdstnCode = sexdstnCode;
		this.downAuth = downAuth;
		this.ofcpsNm = ofcpsNm;
		this.sttusCode = sttusCode;
		this.sbscrbDt = sbscrbDt;
		this.logInCnt = logInCnt;
		this.lastLoginDate = lastLoginDate;
	}

	@Id

	@Column(name = "EMP_NO", unique = true, nullable = false, length = 20)
	public String getEmpNo() {
		return this.empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPT_CD", nullable = false)
	public NcmWebDept getNcmWebDept() {
		return this.ncmWebDept;
	}

	public void setNcmWebDept(NcmWebDept ncmWebDept) {
		this.ncmWebDept = ncmWebDept;
	}

	@Column(name = "EMP_NM", nullable = false, length = 60)
	public String getEmpNm() {
		return this.empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	@Column(name = "PASSWORD", nullable = false, length = 300)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "SEXDSTN_CODE", nullable = false, length = 1)
	public char getSexdstnCode() {
		return this.sexdstnCode;
	}

	public void setSexdstnCode(char sexdstnCode) {
		this.sexdstnCode = sexdstnCode;
	}

	@Column(name = "DOWN_AUTH", nullable = false, length = 100)
	public String getDownAuth() {
		return this.downAuth;
	}

	public void setDownAuth(String downAuth) {
		this.downAuth = downAuth;
	}

	@Column(name = "OFCPS_NM", nullable = false, length = 60)
	public String getOfcpsNm() {
		return this.ofcpsNm;
	}

	public void setOfcpsNm(String ofcpsNm) {
		this.ofcpsNm = ofcpsNm;
	}

	@Column(name = "STTUS_CODE", nullable = false, length = 1)
	public char getSttusCode() {
		return this.sttusCode;
	}

	public void setSttusCode(char sttusCode) {
		this.sttusCode = sttusCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SBSCRB_DT", nullable = false, length = 7)
	public Date getSbscrbDt() {
		return this.sbscrbDt;
	}

	public void setSbscrbDt(Date sbscrbDt) {
		this.sbscrbDt = sbscrbDt;
	}

	@Column(name = "LOG_IN_CNT", precision = 22, scale = 0)
	public BigDecimal getLogInCnt() {
		return this.logInCnt;
	}

	public void setLogInCnt(BigDecimal logInCnt) {
		this.logInCnt = logInCnt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_LOGIN_DATE", length = 7)
	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

}