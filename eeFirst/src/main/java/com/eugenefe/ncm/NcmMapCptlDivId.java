package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmMapCptlDivId generated by hbm2java
 */

public class NcmMapCptlDivId implements java.io.Serializable {

	private String srcTable;
	private String srcCptlDivCd;

	public NcmMapCptlDivId() {
	}

	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;

	}

	public String getSrcCptlDivCd() {
		return this.srcCptlDivCd;
	}

	public void setSrcCptlDivCd(String srcCptlDivCd) {
		this.srcCptlDivCd = srcCptlDivCd;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getSrcTable());
		buffer.append("#").append(getSrcCptlDivCd());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMapCptlDivId))
			return false;
		NcmMapCptlDivId castOther = (NcmMapCptlDivId) other;

		return ((this.getSrcTable() == castOther.getSrcTable())
				|| (this.getSrcTable() != null && castOther.getSrcTable() != null && this.getSrcTable().equals(castOther.getSrcTable())))
				&& ((this.getSrcCptlDivCd() == castOther.getSrcCptlDivCd())
						|| (this.getSrcCptlDivCd() != null && castOther.getSrcCptlDivCd() != null && this.getSrcCptlDivCd().equals(castOther.getSrcCptlDivCd())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getSrcCptlDivCd() == null ? 0 : this.getSrcCptlDivCd().hashCode());
		return result;
	}

}