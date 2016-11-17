package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmLv1MmtDetailId generated by hbm2java
 */
@Embeddable
public class NcmLv1MmtDetailId implements java.io.Serializable {

	private String mmtProdId;
	private String mmtChgProdId;

	public NcmLv1MmtDetailId() {
	}

	public NcmLv1MmtDetailId(String mmtProdId, String mmtChgProdId) {
		this.mmtProdId = mmtProdId;
		this.mmtChgProdId = mmtChgProdId;
	}

	@Column(name = "MMT_PROD_ID", nullable = false, length = 20)
	public String getMmtProdId() {
		return this.mmtProdId;
	}

	public void setMmtProdId(String mmtProdId) {
		this.mmtProdId = mmtProdId;
	}

	@Column(name = "MMT_CHG_PROD_ID", nullable = false, length = 20)
	public String getMmtChgProdId() {
		return this.mmtChgProdId;
	}

	public void setMmtChgProdId(String mmtChgProdId) {
		this.mmtChgProdId = mmtChgProdId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1MmtDetailId))
			return false;
		NcmLv1MmtDetailId castOther = (NcmLv1MmtDetailId) other;

		return ((this.getMmtProdId() == castOther.getMmtProdId()) || (this.getMmtProdId() != null
				&& castOther.getMmtProdId() != null && this.getMmtProdId().equals(castOther.getMmtProdId())))
				&& ((this.getMmtChgProdId() == castOther.getMmtChgProdId())
						|| (this.getMmtChgProdId() != null && castOther.getMmtChgProdId() != null
								&& this.getMmtChgProdId().equals(castOther.getMmtChgProdId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMmtProdId() == null ? 0 : this.getMmtProdId().hashCode());
		result = 37 * result + (getMmtChgProdId() == null ? 0 : this.getMmtChgProdId().hashCode());
		return result;
	}

}