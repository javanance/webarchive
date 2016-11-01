package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmBatLogId generated by hbm2java
 */
@Embeddable
public class NcmBatLogId implements java.io.Serializable {

	private String baseDate;
	private String batCd;

	public NcmBatLogId() {
	}

	public NcmBatLogId(String baseDate, String batCd) {
		this.baseDate = baseDate;
		this.batCd = batCd;
	}

	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Column(name = "BAT_CD", nullable = false, length = 20)
	public String getBatCd() {
		return this.batCd;
	}

	public void setBatCd(String batCd) {
		this.batCd = batCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmBatLogId))
			return false;
		NcmBatLogId castOther = (NcmBatLogId) other;

		return ((this.getBaseDate() == castOther.getBaseDate()) || (this.getBaseDate() != null
				&& castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getBatCd() == castOther.getBatCd()) || (this.getBatCd() != null
						&& castOther.getBatCd() != null && this.getBatCd().equals(castOther.getBatCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getBatCd() == null ? 0 : this.getBatCd().hashCode());
		return result;
	}

}
