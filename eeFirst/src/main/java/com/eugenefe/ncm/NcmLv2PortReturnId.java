package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmLv2PortReturnId generated by hbm2java
 */
@Embeddable
public class NcmLv2PortReturnId implements java.io.Serializable {

	private String baseDate;
	private String cptlDivCd;
	private String yieldLclssCd;
	private String yieldDivCd;
	private String prodTypeCd;

	public NcmLv2PortReturnId() {
	}

	public NcmLv2PortReturnId(String baseDate, String cptlDivCd, String yieldLclssCd, String yieldDivCd,
			String prodTypeCd) {
		this.baseDate = baseDate;
		this.cptlDivCd = cptlDivCd;
		this.yieldLclssCd = yieldLclssCd;
		this.yieldDivCd = yieldDivCd;
		this.prodTypeCd = prodTypeCd;
	}

	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Column(name = "CPTL_DIV_CD", nullable = false, length = 10)
	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;
	}

	@Column(name = "YIELD_LCLSS_CD", nullable = false, length = 10)
	public String getYieldLclssCd() {
		return this.yieldLclssCd;
	}

	public void setYieldLclssCd(String yieldLclssCd) {
		this.yieldLclssCd = yieldLclssCd;
	}

	@Column(name = "YIELD_DIV_CD", nullable = false, length = 20)
	public String getYieldDivCd() {
		return this.yieldDivCd;
	}

	public void setYieldDivCd(String yieldDivCd) {
		this.yieldDivCd = yieldDivCd;
	}

	@Column(name = "PROD_TYPE_CD", nullable = false, length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv2PortReturnId))
			return false;
		NcmLv2PortReturnId castOther = (NcmLv2PortReturnId) other;

		return ((this.getBaseDate() == castOther.getBaseDate()) || (this.getBaseDate() != null
				&& castOther.getBaseDate() != null && this.getBaseDate().equals(castOther.getBaseDate())))
				&& ((this.getCptlDivCd() == castOther.getCptlDivCd()) || (this.getCptlDivCd() != null
						&& castOther.getCptlDivCd() != null && this.getCptlDivCd().equals(castOther.getCptlDivCd())))
				&& ((this.getYieldLclssCd() == castOther.getYieldLclssCd())
						|| (this.getYieldLclssCd() != null && castOther.getYieldLclssCd() != null
								&& this.getYieldLclssCd().equals(castOther.getYieldLclssCd())))
				&& ((this.getYieldDivCd() == castOther.getYieldDivCd()) || (this.getYieldDivCd() != null
						&& castOther.getYieldDivCd() != null && this.getYieldDivCd().equals(castOther.getYieldDivCd())))
				&& ((this.getProdTypeCd() == castOther.getProdTypeCd())
						|| (this.getProdTypeCd() != null && castOther.getProdTypeCd() != null
								&& this.getProdTypeCd().equals(castOther.getProdTypeCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getCptlDivCd() == null ? 0 : this.getCptlDivCd().hashCode());
		result = 37 * result + (getYieldLclssCd() == null ? 0 : this.getYieldLclssCd().hashCode());
		result = 37 * result + (getYieldDivCd() == null ? 0 : this.getYieldDivCd().hashCode());
		result = 37 * result + (getProdTypeCd() == null ? 0 : this.getProdTypeCd().hashCode());
		return result;
	}

}
