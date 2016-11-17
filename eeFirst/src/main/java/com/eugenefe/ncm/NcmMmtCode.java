package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NcmMmtCode generated by hbm2java
 */
@Entity
@Table(name = "NCM_MMT_CODE", schema = "NCM")
public class NcmMmtCode implements java.io.Serializable {

	private NcmMmtCodeId id;
	private String baseCdPttnNm;
	private String baseCdCmnt;

	public NcmMmtCode() {
	}

	public NcmMmtCode(NcmMmtCodeId id) {
		this.id = id;
	}

	public NcmMmtCode(NcmMmtCodeId id, String baseCdPttnNm, String baseCdCmnt) {
		this.id = id;
		this.baseCdPttnNm = baseCdPttnNm;
		this.baseCdCmnt = baseCdCmnt;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseCdPttn", column = @Column(name = "BASE_CD_PTTN", nullable = false, length = 10)),
			@AttributeOverride(name = "baseCdClass1", column = @Column(name = "BASE_CD_CLASS1", nullable = false, length = 10)),
			@AttributeOverride(name = "baseCdClass2", column = @Column(name = "BASE_CD_CLASS2", nullable = false, length = 20)) })
	public NcmMmtCodeId getId() {
		return this.id;
	}

	public void setId(NcmMmtCodeId id) {
		this.id = id;
	}

	@Column(name = "BASE_CD_PTTN_NM", length = 20)
	public String getBaseCdPttnNm() {
		return this.baseCdPttnNm;
	}

	public void setBaseCdPttnNm(String baseCdPttnNm) {
		this.baseCdPttnNm = baseCdPttnNm;
	}

	@Column(name = "BASE_CD_CMNT", length = 30)
	public String getBaseCdCmnt() {
		return this.baseCdCmnt;
	}

	public void setBaseCdCmnt(String baseCdCmnt) {
		this.baseCdCmnt = baseCdCmnt;
	}

}