package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmKfrHoldingYieldId generated by hbm2java
 */
@Embeddable
public class NcmKfrHoldingYieldId implements java.io.Serializable {

	private String tradeday;
	private String mgrcode;
	private String fundmgrcode;
	private String assetbclasscode;
	private String assetsclasscode;
	private String itemcode;

	public NcmKfrHoldingYieldId() {
	}

	public NcmKfrHoldingYieldId(String tradeday, String mgrcode, String fundmgrcode, String assetbclasscode,
			String assetsclasscode, String itemcode) {
		this.tradeday = tradeday;
		this.mgrcode = mgrcode;
		this.fundmgrcode = fundmgrcode;
		this.assetbclasscode = assetbclasscode;
		this.assetsclasscode = assetsclasscode;
		this.itemcode = itemcode;
	}

	@Column(name = "TRADEDAY", nullable = false, length = 8)
	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;
	}

	@Column(name = "MGRCODE", nullable = false, length = 3)
	public String getMgrcode() {
		return this.mgrcode;
	}

	public void setMgrcode(String mgrcode) {
		this.mgrcode = mgrcode;
	}

	@Column(name = "FUNDMGRCODE", nullable = false, length = 30)
	public String getFundmgrcode() {
		return this.fundmgrcode;
	}

	public void setFundmgrcode(String fundmgrcode) {
		this.fundmgrcode = fundmgrcode;
	}

	@Column(name = "ASSETBCLASSCODE", nullable = false, length = 2)
	public String getAssetbclasscode() {
		return this.assetbclasscode;
	}

	public void setAssetbclasscode(String assetbclasscode) {
		this.assetbclasscode = assetbclasscode;
	}

	@Column(name = "ASSETSCLASSCODE", nullable = false, length = 2)
	public String getAssetsclasscode() {
		return this.assetsclasscode;
	}

	public void setAssetsclasscode(String assetsclasscode) {
		this.assetsclasscode = assetsclasscode;
	}

	@Column(name = "ITEMCODE", nullable = false, length = 50)
	public String getItemcode() {
		return this.itemcode;
	}

	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmKfrHoldingYieldId))
			return false;
		NcmKfrHoldingYieldId castOther = (NcmKfrHoldingYieldId) other;

		return ((this.getTradeday() == castOther.getTradeday()) || (this.getTradeday() != null
				&& castOther.getTradeday() != null && this.getTradeday().equals(castOther.getTradeday())))
				&& ((this.getMgrcode() == castOther.getMgrcode()) || (this.getMgrcode() != null
						&& castOther.getMgrcode() != null && this.getMgrcode().equals(castOther.getMgrcode())))
				&& ((this.getFundmgrcode() == castOther.getFundmgrcode())
						|| (this.getFundmgrcode() != null && castOther.getFundmgrcode() != null
								&& this.getFundmgrcode().equals(castOther.getFundmgrcode())))
				&& ((this.getAssetbclasscode() == castOther.getAssetbclasscode())
						|| (this.getAssetbclasscode() != null && castOther.getAssetbclasscode() != null
								&& this.getAssetbclasscode().equals(castOther.getAssetbclasscode())))
				&& ((this.getAssetsclasscode() == castOther.getAssetsclasscode())
						|| (this.getAssetsclasscode() != null && castOther.getAssetsclasscode() != null
								&& this.getAssetsclasscode().equals(castOther.getAssetsclasscode())))
				&& ((this.getItemcode() == castOther.getItemcode()) || (this.getItemcode() != null
						&& castOther.getItemcode() != null && this.getItemcode().equals(castOther.getItemcode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		result = 37 * result + (getAssetbclasscode() == null ? 0 : this.getAssetbclasscode().hashCode());
		result = 37 * result + (getAssetsclasscode() == null ? 0 : this.getAssetsclasscode().hashCode());
		result = 37 * result + (getItemcode() == null ? 0 : this.getItemcode().hashCode());
		return result;
	}

}
