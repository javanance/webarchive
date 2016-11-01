package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmMapMmtAccountSubId generated by hbm2java
 */
@Embeddable
public class NcmMapMmtAccountSubId implements java.io.Serializable {

	private String srcAcctNo;
	private String srcFinTxNo;

	public NcmMapMmtAccountSubId() {
	}

	public NcmMapMmtAccountSubId(String srcAcctNo, String srcFinTxNo) {
		this.srcAcctNo = srcAcctNo;
		this.srcFinTxNo = srcFinTxNo;
	}

	@Column(name = "SRC_ACCT_NO", nullable = false, length = 50)
	public String getSrcAcctNo() {
		return this.srcAcctNo;
	}

	public void setSrcAcctNo(String srcAcctNo) {
		this.srcAcctNo = srcAcctNo;
	}

	@Column(name = "SRC_FIN_TX_NO", nullable = false, length = 20)
	public String getSrcFinTxNo() {
		return this.srcFinTxNo;
	}

	public void setSrcFinTxNo(String srcFinTxNo) {
		this.srcFinTxNo = srcFinTxNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMapMmtAccountSubId))
			return false;
		NcmMapMmtAccountSubId castOther = (NcmMapMmtAccountSubId) other;

		return ((this.getSrcAcctNo() == castOther.getSrcAcctNo()) || (this.getSrcAcctNo() != null
				&& castOther.getSrcAcctNo() != null && this.getSrcAcctNo().equals(castOther.getSrcAcctNo())))
				&& ((this.getSrcFinTxNo() == castOther.getSrcFinTxNo())
						|| (this.getSrcFinTxNo() != null && castOther.getSrcFinTxNo() != null
								&& this.getSrcFinTxNo().equals(castOther.getSrcFinTxNo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcAcctNo() == null ? 0 : this.getSrcAcctNo().hashCode());
		result = 37 * result + (getSrcFinTxNo() == null ? 0 : this.getSrcFinTxNo().hashCode());
		return result;
	}

}
