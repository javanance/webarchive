package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmKfrCodeId generated by hbm2java
 */

public class NcmKfrCodeId implements java.io.Serializable, Navigatable {

	private String baseCdPttn;
	private String baseCd;

	public NcmKfrCodeId() {
	}

	public String getBaseCdPttn() {
		return this.baseCdPttn;
	}

	public void setBaseCdPttn(String baseCdPttn) {
		this.baseCdPttn = baseCdPttn;

	}

	public String getBaseCd() {
		return this.baseCd;
	}

	public void setBaseCd(String baseCd) {
		this.baseCd = baseCd;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseCdPttn());
		buffer.append("#").append(getBaseCd());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmKfrCodeId))
			return false;
		NcmKfrCodeId castOther = (NcmKfrCodeId) other;

		return ((this.getBaseCdPttn() == castOther.getBaseCdPttn())
				|| (this.getBaseCdPttn() != null && castOther.getBaseCdPttn() != null && this.getBaseCdPttn().equals(castOther.getBaseCdPttn())))
				&& ((this.getBaseCd() == castOther.getBaseCd()) || (this.getBaseCd() != null && castOther.getBaseCd() != null && this.getBaseCd().equals(castOther.getBaseCd())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseCdPttn() == null ? 0 : this.getBaseCdPttn().hashCode());
		result = 37 * result + (getBaseCd() == null ? 0 : this.getBaseCd().hashCode());
		return result;
	}

}
