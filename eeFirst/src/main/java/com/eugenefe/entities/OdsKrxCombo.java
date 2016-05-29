package com.eugenefe.entities;
// Generated May 29, 2016 10:08:33 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OdsKrxCombo generated by hbm2java
 */
@Entity
@Table(name = "ods_krx_combo", catalog = "eugenefe")
public class OdsKrxCombo implements java.io.Serializable {

	private String isuCd;
	private String korIsuNm;

	public OdsKrxCombo() {
	}

	public OdsKrxCombo(String isuCd) {
		this.isuCd = isuCd;
	}

	public OdsKrxCombo(String isuCd, String korIsuNm) {
		this.isuCd = isuCd;
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

	@Column(name = "KOR_ISU_NM", length = 50)
	public String getKorIsuNm() {
		return this.korIsuNm;
	}

	public void setKorIsuNm(String korIsuNm) {
		this.korIsuNm = korIsuNm;
	}

}
