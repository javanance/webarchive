package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmMstBmCompId generated by hbm2java
 */

public class NcmMstBmCompId implements java.io.Serializable, Navigatable {

	private String bmId;
	private String applyStDate;
	private String subBmId;

	public NcmMstBmCompId() {
	}

	public String getBmId() {
		return this.bmId;
	}

	public void setBmId(String bmId) {
		this.bmId = bmId;

	}

	public String getApplyStDate() {
		return this.applyStDate;
	}

	public void setApplyStDate(String applyStDate) {
		this.applyStDate = applyStDate;

	}

	public String getSubBmId() {
		return this.subBmId;
	}

	public void setSubBmId(String subBmId) {
		this.subBmId = subBmId;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBmId());
		buffer.append("#").append(getApplyStDate());
		buffer.append("#").append(getSubBmId());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMstBmCompId))
			return false;
		NcmMstBmCompId castOther = (NcmMstBmCompId) other;

		return ((this.getBmId() == castOther.getBmId()) || (this.getBmId() != null && castOther.getBmId() != null && this.getBmId().equals(castOther.getBmId())))
				&& ((this.getApplyStDate() == castOther.getApplyStDate())
						|| (this.getApplyStDate() != null && castOther.getApplyStDate() != null && this.getApplyStDate().equals(castOther.getApplyStDate())))
				&& ((this.getSubBmId() == castOther.getSubBmId())
						|| (this.getSubBmId() != null && castOther.getSubBmId() != null && this.getSubBmId().equals(castOther.getSubBmId())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBmId() == null ? 0 : this.getBmId().hashCode());
		result = 37 * result + (getApplyStDate() == null ? 0 : this.getApplyStDate().hashCode());
		result = 37 * result + (getSubBmId() == null ? 0 : this.getSubBmId().hashCode());
		return result;
	}

}
