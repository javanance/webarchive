package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmMapMmtAccountSubId generated by hbm2java
 */

public class NcmMapMmtAccountSubId implements java.io.Serializable {

	private String srcAcctNo;
	private String srcFinTxNo;

	public NcmMapMmtAccountSubId() {
	}

	public String getSrcAcctNo() {
		return this.srcAcctNo;
	}

	public void setSrcAcctNo(String srcAcctNo) {
		this.srcAcctNo = srcAcctNo;

	}

	public String getSrcFinTxNo() {
		return this.srcFinTxNo;
	}

	public void setSrcFinTxNo(String srcFinTxNo) {
		this.srcFinTxNo = srcFinTxNo;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getSrcAcctNo());
		buffer.append("#").append(getSrcFinTxNo());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMapMmtAccountSubId))
			return false;
		NcmMapMmtAccountSubId castOther = (NcmMapMmtAccountSubId) other;

		return ((this.getSrcAcctNo() == castOther.getSrcAcctNo())
				|| (this.getSrcAcctNo() != null && castOther.getSrcAcctNo() != null && this.getSrcAcctNo().equals(castOther.getSrcAcctNo())))
				&& ((this.getSrcFinTxNo() == castOther.getSrcFinTxNo())
						|| (this.getSrcFinTxNo() != null && castOther.getSrcFinTxNo() != null && this.getSrcFinTxNo().equals(castOther.getSrcFinTxNo())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcAcctNo() == null ? 0 : this.getSrcAcctNo().hashCode());
		result = 37 * result + (getSrcFinTxNo() == null ? 0 : this.getSrcFinTxNo().hashCode());
		return result;
	}

}
