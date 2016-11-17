package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmMstAccountId generated by hbm2java
 */
@Embeddable
public class NcmMstAccountId implements java.io.Serializable {

	private String acctNo;
	private String prodTypeCd;

	public NcmMstAccountId() {
	}

	public NcmMstAccountId(String acctNo, String prodTypeCd) {
		this.acctNo = acctNo;
		this.prodTypeCd = prodTypeCd;
	}

	@Column(name = "ACCT_NO", nullable = false, length = 20)
	public String getAcctNo() {
		return this.acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	@Column(name = "PROD_TYPE_CD", nullable = false, length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMstAccountId))
			return false;
		NcmMstAccountId castOther = (NcmMstAccountId) other;

		return ((this.getAcctNo() == castOther.getAcctNo()) || (this.getAcctNo() != null
				&& castOther.getAcctNo() != null && this.getAcctNo().equals(castOther.getAcctNo())))
				&& ((this.getProdTypeCd() == castOther.getProdTypeCd())
						|| (this.getProdTypeCd() != null && castOther.getProdTypeCd() != null
								&& this.getProdTypeCd().equals(castOther.getProdTypeCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAcctNo() == null ? 0 : this.getAcctNo().hashCode());
		result = 37 * result + (getProdTypeCd() == null ? 0 : this.getProdTypeCd().hashCode());
		return result;
	}

}