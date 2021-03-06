package com.eugenefe.entities;
// Generated May 29, 2016 10:08:33 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OdsKrxOptionFinder generated by hbm2java
 */
@Entity
@Table(name = "ods_krx_option_finder", catalog = "eugenefe")
public class OdsKrxOptionFinder implements java.io.Serializable {

	private String isuCd;
	private String shrtIsuCd;
	private String futOptTyp;
	private String isuNm;
	private String korIsuNm;

	public OdsKrxOptionFinder() {
	}

	public OdsKrxOptionFinder(String isuCd) {
		this.isuCd = isuCd;
	}

	public OdsKrxOptionFinder(String isuCd, String shrtIsuCd, String futOptTyp, String isuNm, String korIsuNm) {
		this.isuCd = isuCd;
		this.shrtIsuCd = shrtIsuCd;
		this.futOptTyp = futOptTyp;
		this.isuNm = isuNm;
		this.korIsuNm = korIsuNm;
	}

	@Id

	@Column(name = "ISU_CD", unique = true, nullable = false, length = 20)
	public String getIsuCd() {
		return this.isuCd;
	}

	public void setIsuCd(String isuCd) {
		this.isuCd = isuCd;
	}

	@Column(name = "SHRT_ISU_CD", length = 50)
	public String getShrtIsuCd() {
		return this.shrtIsuCd;
	}

	public void setShrtIsuCd(String shrtIsuCd) {
		this.shrtIsuCd = shrtIsuCd;
	}

	@Column(name = "FUT_OPT_TYP", length = 10)
	public String getFutOptTyp() {
		return this.futOptTyp;
	}

	public void setFutOptTyp(String futOptTyp) {
		this.futOptTyp = futOptTyp;
	}

	@Column(name = "ISU_NM", length = 50)
	public String getIsuNm() {
		return this.isuNm;
	}

	public void setIsuNm(String isuNm) {
		this.isuNm = isuNm;
	}

	@Column(name = "KOR_ISU_NM", length = 50)
	public String getKorIsuNm() {
		return this.korIsuNm;
	}

	public void setKorIsuNm(String korIsuNm) {
		this.korIsuNm = korIsuNm;
	}

}
