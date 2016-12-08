package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmLv1TxSaaId generated by hbm2java
 */

public class NcmLv1TxSaaId implements java.io.Serializable, Navigatable {

	private String baseDate;
	private String finTxNo;
	private String applyStDate;

	public NcmLv1TxSaaId() {
	}

	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;

	}

	public String getFinTxNo() {
		return this.finTxNo;
	}

	public void setFinTxNo(String finTxNo) {
		this.finTxNo = finTxNo;

	}

	public String getApplyStDate() {
		return this.applyStDate;
	}

	public void setApplyStDate(String applyStDate) {
		this.applyStDate = applyStDate;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getFinTxNo());
		buffer.append("#").append(getApplyStDate());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1TxSaaId))
			return false;
		NcmLv1TxSaaId castOther = (NcmLv1TxSaaId) other;

		return ((this.getBaseDate() == castOther.getBaseDate())
				|| (this.getBaseDate() != null && castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getFinTxNo() == castOther.getFinTxNo())
						|| (this.getFinTxNo() != null && castOther.getFinTxNo() != null && this.getFinTxNo().equals(castOther.getFinTxNo())))
				&& ((this.getApplyStDate() == castOther.getApplyStDate())
						|| (this.getApplyStDate() != null && castOther.getApplyStDate() != null && this.getApplyStDate().equals(castOther.getApplyStDate())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getFinTxNo() == null ? 0 : this.getFinTxNo().hashCode());
		result = 37 * result + (getApplyStDate() == null ? 0 : this.getApplyStDate().hashCode());
		return result;
	}

}
