package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMstBm generated by hbm2java
 */
@Entity
@Table(name = "NCM_MST_BM", schema = "NCM")
public class NcmMstBm implements java.io.Serializable {

	private String bmId;
	private String bmNm;
	private String bmDivCd;
	private String delayFetchCd;
	private String intUseYn;
	private String bmMngCorpNo;
	private String remarks;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmMstBm() {
	}

	public NcmMstBm(String bmId) {
		this.bmId = bmId;
	}

	public NcmMstBm(String bmId, String bmNm, String bmDivCd, String delayFetchCd, String intUseYn, String bmMngCorpNo,
			String remarks, String srcTable, String updateId, Date lastUpdate) {
		this.bmId = bmId;
		this.bmNm = bmNm;
		this.bmDivCd = bmDivCd;
		this.delayFetchCd = delayFetchCd;
		this.intUseYn = intUseYn;
		this.bmMngCorpNo = bmMngCorpNo;
		this.remarks = remarks;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@Id

	@Column(name = "BM_ID", unique = true, nullable = false, length = 20)
	public String getBmId() {
		return this.bmId;
	}

	public void setBmId(String bmId) {
		this.bmId = bmId;
	}

	@Column(name = "BM_NM", length = 100)
	public String getBmNm() {
		return this.bmNm;
	}

	public void setBmNm(String bmNm) {
		this.bmNm = bmNm;
	}

	@Column(name = "BM_DIV_CD", length = 10)
	public String getBmDivCd() {
		return this.bmDivCd;
	}

	public void setBmDivCd(String bmDivCd) {
		this.bmDivCd = bmDivCd;
	}

	@Column(name = "DELAY_FETCH_CD", length = 10)
	public String getDelayFetchCd() {
		return this.delayFetchCd;
	}

	public void setDelayFetchCd(String delayFetchCd) {
		this.delayFetchCd = delayFetchCd;
	}

	@Column(name = "INT_USE_YN", length = 1)
	public String getIntUseYn() {
		return this.intUseYn;
	}

	public void setIntUseYn(String intUseYn) {
		this.intUseYn = intUseYn;
	}

	@Column(name = "BM_MNG_CORP_NO", length = 20)
	public String getBmMngCorpNo() {
		return this.bmMngCorpNo;
	}

	public void setBmMngCorpNo(String bmMngCorpNo) {
		this.bmMngCorpNo = bmMngCorpNo;
	}

	@Column(name = "REMARKS", length = 200)
	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name = "SRC_TABLE", length = 20)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;
	}

	@Column(name = "UPDATE_ID", length = 20)
	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_UPDATE", length = 7)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}