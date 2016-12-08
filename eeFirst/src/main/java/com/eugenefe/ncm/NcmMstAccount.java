package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMstAccount generated by hbm2java
 */

@Entity
@IdClass(value = NcmMstAccountId.class)
@Table(name = "NCM_MST_ACCOUNT", schema = "NCM")
public class NcmMstAccount implements java.io.Serializable {

	private String acctNo;
	private String prodTypeCd;
	private String acctNoNm;
	private String bizDivCd;
	private String acctDivCd;
	private String cptlDivCd;
	private String mngFinOrg;
	private String stusDivCd;
	private String acctStDate;
	private String acctEndDate;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmMstAccount() {
	}

	@Id
	@Column(name = "ACCT_NO", nullable = false, length = 20)
	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	@Id
	@Column(name = "PROD_TYPE_CD", nullable = false, length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;
	}

	@Column(name = "ACCT_NO_NM", length = 100)
	public String getAcctNoNm() {
		return this.acctNoNm;
	}

	public void setAcctNoNm(String acctNoNm) {
		this.acctNoNm = acctNoNm;

	}

	@Column(name = "BIZ_DIV_CD", length = 10)
	public String getBizDivCd() {
		return this.bizDivCd;
	}

	public void setBizDivCd(String bizDivCd) {
		this.bizDivCd = bizDivCd;

	}

	@Column(name = "ACCT_DIV_CD", length = 10)
	public String getAcctDivCd() {
		return this.acctDivCd;
	}

	public void setAcctDivCd(String acctDivCd) {
		this.acctDivCd = acctDivCd;

	}

	@Column(name = "CPTL_DIV_CD", length = 10)
	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;

	}

	@Column(name = "MNG_FIN_ORG", length = 20)
	public String getMngFinOrg() {
		return this.mngFinOrg;
	}

	public void setMngFinOrg(String mngFinOrg) {
		this.mngFinOrg = mngFinOrg;

	}

	@Column(name = "STUS_DIV_CD", length = 10)
	public String getStusDivCd() {
		return this.stusDivCd;
	}

	public void setStusDivCd(String stusDivCd) {
		this.stusDivCd = stusDivCd;

	}

	@Column(name = "ACCT_ST_DATE", length = 8)
	public String getAcctStDate() {
		return this.acctStDate;
	}

	public void setAcctStDate(String acctStDate) {
		this.acctStDate = acctStDate;

	}

	@Column(name = "ACCT_END_DATE", length = 8)
	public String getAcctEndDate() {
		return this.acctEndDate;
	}

	public void setAcctEndDate(String acctEndDate) {
		this.acctEndDate = acctEndDate;

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
		buffer.append("#").append(getAcctNo());
		buffer.append("#").append(getProdTypeCd());

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
		if (!(other instanceof NcmMstAccount))
			return false;
		NcmMstAccount castOther = (NcmMstAccount) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAcctNo() == null ? 0 : this.getAcctNo().hashCode());
		result = 37 * result + (getProdTypeCd() == null ? 0 : this.getProdTypeCd().hashCode());
		return result;
	}

}
