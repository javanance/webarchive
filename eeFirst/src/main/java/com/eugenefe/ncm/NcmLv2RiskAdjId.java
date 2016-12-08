package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

/**
 * NcmLv2RiskAdjId generated by hbm2java
 */

public class NcmLv2RiskAdjId implements java.io.Serializable, Navigatable {

	private String baseDate;
	private String cptlDivCd;
	private String yieldLclssCd;
	private String yieldDivCd;
	private String prodTypeCd;
	private String matCd;

	public NcmLv2RiskAdjId() {
	}

	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;

	}

	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;

	}

	public String getYieldLclssCd() {
		return this.yieldLclssCd;
	}

	public void setYieldLclssCd(String yieldLclssCd) {
		this.yieldLclssCd = yieldLclssCd;

	}

	public String getYieldDivCd() {
		return this.yieldDivCd;
	}

	public void setYieldDivCd(String yieldDivCd) {
		this.yieldDivCd = yieldDivCd;

	}

	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;

	}

	public String getMatCd() {
		return this.matCd;
	}

	public void setMatCd(String matCd) {
		this.matCd = matCd;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getCptlDivCd());
		buffer.append("#").append(getYieldLclssCd());
		buffer.append("#").append(getYieldDivCd());
		buffer.append("#").append(getProdTypeCd());
		buffer.append("#").append(getMatCd());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv2RiskAdjId))
			return false;
		NcmLv2RiskAdjId castOther = (NcmLv2RiskAdjId) other;

		return ((this.getBaseDate() == castOther.getBaseDate())
				|| (this.getBaseDate() != null && castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getCptlDivCd() == castOther.getCptlDivCd())
						|| (this.getCptlDivCd() != null && castOther.getCptlDivCd() != null && this.getCptlDivCd().equals(castOther.getCptlDivCd())))
				&& ((this.getYieldLclssCd() == castOther.getYieldLclssCd())
						|| (this.getYieldLclssCd() != null && castOther.getYieldLclssCd() != null && this.getYieldLclssCd().equals(castOther.getYieldLclssCd())))
				&& ((this.getYieldDivCd() == castOther.getYieldDivCd())
						|| (this.getYieldDivCd() != null && castOther.getYieldDivCd() != null && this.getYieldDivCd().equals(castOther.getYieldDivCd())))
				&& ((this.getProdTypeCd() == castOther.getProdTypeCd())
						|| (this.getProdTypeCd() != null && castOther.getProdTypeCd() != null && this.getProdTypeCd().equals(castOther.getProdTypeCd())))
				&& ((this.getMatCd() == castOther.getMatCd()) || (this.getMatCd() != null && castOther.getMatCd() != null && this.getMatCd().equals(castOther.getMatCd())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getCptlDivCd() == null ? 0 : this.getCptlDivCd().hashCode());
		result = 37 * result + (getYieldLclssCd() == null ? 0 : this.getYieldLclssCd().hashCode());
		result = 37 * result + (getYieldDivCd() == null ? 0 : this.getYieldDivCd().hashCode());
		result = 37 * result + (getProdTypeCd() == null ? 0 : this.getProdTypeCd().hashCode());
		result = 37 * result + (getMatCd() == null ? 0 : this.getMatCd().hashCode());
		return result;
	}

}
