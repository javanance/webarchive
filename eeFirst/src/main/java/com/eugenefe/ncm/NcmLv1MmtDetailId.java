package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmLv1MmtDetailId generated by hbm2java
 */

public class NcmLv1MmtDetailId implements java.io.Serializable {

	private String mmtProdId;
	private String mmtChgProdId;

	public NcmLv1MmtDetailId() {
	}

	public String getMmtProdId() {
		return this.mmtProdId;
	}

	public void setMmtProdId(String mmtProdId) {
		this.mmtProdId = mmtProdId;

	}

	public String getMmtChgProdId() {
		return this.mmtChgProdId;
	}

	public void setMmtChgProdId(String mmtChgProdId) {
		this.mmtChgProdId = mmtChgProdId;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getMmtProdId());
		buffer.append("#").append(getMmtChgProdId());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1MmtDetailId))
			return false;
		NcmLv1MmtDetailId castOther = (NcmLv1MmtDetailId) other;

		return ((this.getMmtProdId() == castOther.getMmtProdId())
				|| (this.getMmtProdId() != null && castOther.getMmtProdId() != null && this.getMmtProdId().equals(castOther.getMmtProdId())))
				&& ((this.getMmtChgProdId() == castOther.getMmtChgProdId())
						|| (this.getMmtChgProdId() != null && castOther.getMmtChgProdId() != null && this.getMmtChgProdId().equals(castOther.getMmtChgProdId())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMmtProdId() == null ? 0 : this.getMmtProdId().hashCode());
		result = 37 * result + (getMmtChgProdId() == null ? 0 : this.getMmtChgProdId().hashCode());
		return result;
	}

}
