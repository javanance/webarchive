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
 * NcmMstCashcode generated by hbm2java
 */
@Entity
@Table(name = "NCM_MST_CASHCODE", schema = "NCM")
public class NcmMstCashcode implements java.io.Serializable {

	private String cashCd;
	private String cashCdNm;
	private String upperCashCd;
	private String hierCashCdNm;
	private Short hierLv;
	private String cashLclssCd;
	private String inoutDivCd;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmMstCashcode() {
	}

	public NcmMstCashcode(String cashCd) {
		this.cashCd = cashCd;
	}

	public NcmMstCashcode(String cashCd, String cashCdNm, String upperCashCd, String hierCashCdNm, Short hierLv,
			String cashLclssCd, String inoutDivCd, String srcTable, String updateId, Date lastUpdate) {
		this.cashCd = cashCd;
		this.cashCdNm = cashCdNm;
		this.upperCashCd = upperCashCd;
		this.hierCashCdNm = hierCashCdNm;
		this.hierLv = hierLv;
		this.cashLclssCd = cashLclssCd;
		this.inoutDivCd = inoutDivCd;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@Id

	@Column(name = "CASH_CD", unique = true, nullable = false, length = 20)
	public String getCashCd() {
		return this.cashCd;
	}

	public void setCashCd(String cashCd) {
		this.cashCd = cashCd;
	}

	@Column(name = "CASH_CD_NM", length = 100)
	public String getCashCdNm() {
		return this.cashCdNm;
	}

	public void setCashCdNm(String cashCdNm) {
		this.cashCdNm = cashCdNm;
	}

	@Column(name = "UPPER_CASH_CD", length = 20)
	public String getUpperCashCd() {
		return this.upperCashCd;
	}

	public void setUpperCashCd(String upperCashCd) {
		this.upperCashCd = upperCashCd;
	}

	@Column(name = "HIER_CASH_CD_NM", length = 100)
	public String getHierCashCdNm() {
		return this.hierCashCdNm;
	}

	public void setHierCashCdNm(String hierCashCdNm) {
		this.hierCashCdNm = hierCashCdNm;
	}

	@Column(name = "HIER_LV", precision = 4, scale = 0)
	public Short getHierLv() {
		return this.hierLv;
	}

	public void setHierLv(Short hierLv) {
		this.hierLv = hierLv;
	}

	@Column(name = "CASH_LCLSS_CD", length = 10)
	public String getCashLclssCd() {
		return this.cashLclssCd;
	}

	public void setCashLclssCd(String cashLclssCd) {
		this.cashLclssCd = cashLclssCd;
	}

	@Column(name = "INOUT_DIV_CD", length = 10)
	public String getInoutDivCd() {
		return this.inoutDivCd;
	}

	public void setInoutDivCd(String inoutDivCd) {
		this.inoutDivCd = inoutDivCd;
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