package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * NcmMmtHoldingDetailId generated by hbm2java
 */

public class NcmMmtHoldingDetailId implements java.io.Serializable {

	private String seqNo;
	private String bizDt;
	private String stockCd;
	private String acctCd;
	private String assetCd;
	private String assetGb;
	private String buyDt;

	public NcmMmtHoldingDetailId() {
	}

	public String getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;

	}

	public String getBizDt() {
		return this.bizDt;
	}

	public void setBizDt(String bizDt) {
		this.bizDt = bizDt;

	}

	public String getStockCd() {
		return this.stockCd;
	}

	public void setStockCd(String stockCd) {
		this.stockCd = stockCd;

	}

	public String getAcctCd() {
		return this.acctCd;
	}

	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;

	}

	public String getAssetCd() {
		return this.assetCd;
	}

	public void setAssetCd(String assetCd) {
		this.assetCd = assetCd;

	}

	public String getAssetGb() {
		return this.assetGb;
	}

	public void setAssetGb(String assetGb) {
		this.assetGb = assetGb;

	}

	public String getBuyDt() {
		return this.buyDt;
	}

	public void setBuyDt(String buyDt) {
		this.buyDt = buyDt;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getSeqNo());
		buffer.append("#").append(getBizDt());
		buffer.append("#").append(getStockCd());
		buffer.append("#").append(getAcctCd());
		buffer.append("#").append(getAssetCd());
		buffer.append("#").append(getAssetGb());
		buffer.append("#").append(getBuyDt());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMmtHoldingDetailId))
			return false;
		NcmMmtHoldingDetailId castOther = (NcmMmtHoldingDetailId) other;

		return ((this.getSeqNo() == castOther.getSeqNo()) || (this.getSeqNo() != null && castOther.getSeqNo() != null && this.getSeqNo().equals(castOther.getSeqNo())))
				&& ((this.getBizDt() == castOther.getBizDt()) || (this.getBizDt() != null && castOther.getBizDt() != null && this.getBizDt().equals(castOther.getBizDt())))
				&& ((this.getStockCd() == castOther.getStockCd())
						|| (this.getStockCd() != null && castOther.getStockCd() != null && this.getStockCd().equals(castOther.getStockCd())))
				&& ((this.getAcctCd() == castOther.getAcctCd()) || (this.getAcctCd() != null && castOther.getAcctCd() != null && this.getAcctCd().equals(castOther.getAcctCd())))
				&& ((this.getAssetCd() == castOther.getAssetCd())
						|| (this.getAssetCd() != null && castOther.getAssetCd() != null && this.getAssetCd().equals(castOther.getAssetCd())))
				&& ((this.getAssetGb() == castOther.getAssetGb())
						|| (this.getAssetGb() != null && castOther.getAssetGb() != null && this.getAssetGb().equals(castOther.getAssetGb())))
				&& ((this.getBuyDt() == castOther.getBuyDt()) || (this.getBuyDt() != null && castOther.getBuyDt() != null && this.getBuyDt().equals(castOther.getBuyDt())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSeqNo() == null ? 0 : this.getSeqNo().hashCode());
		result = 37 * result + (getBizDt() == null ? 0 : this.getBizDt().hashCode());
		result = 37 * result + (getStockCd() == null ? 0 : this.getStockCd().hashCode());
		result = 37 * result + (getAcctCd() == null ? 0 : this.getAcctCd().hashCode());
		result = 37 * result + (getAssetCd() == null ? 0 : this.getAssetCd().hashCode());
		result = 37 * result + (getAssetGb() == null ? 0 : this.getAssetGb().hashCode());
		result = 37 * result + (getBuyDt() == null ? 0 : this.getBuyDt().hashCode());
		return result;
	}

}