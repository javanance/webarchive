package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMstCashcode generated by hbm2java
 */

@Entity
@Table(name = "NCM_MST_CASHCODE", schema = "NCM")
public class NcmMstCashcode implements java.io.Serializable, Navigatable {

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

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getCashCd());

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
		if (!(other instanceof NcmMstCashcode))
			return false;
		NcmMstCashcode castOther = (NcmMstCashcode) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (idString() == null ? 0 : this.idString().hashCode());
		return result;
	}

}
