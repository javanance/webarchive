package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmMmtUnderAbcpId generated by hbm2java
 */
@Embeddable
public class NcmMmtUnderAbcpId implements java.io.Serializable {

	private String seqNo;
	private String bizDt;
	private String stockCd;
	private String acctCd;
	private String assetCd;
	private String unastCd;

	public NcmMmtUnderAbcpId() {
	}

	public NcmMmtUnderAbcpId(String seqNo, String bizDt, String stockCd, String acctCd, String assetCd,
			String unastCd) {
		this.seqNo = seqNo;
		this.bizDt = bizDt;
		this.stockCd = stockCd;
		this.acctCd = acctCd;
		this.assetCd = assetCd;
		this.unastCd = unastCd;
	}

	@Column(name = "SEQ_NO", nullable = false, length = 7)
	public String getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	@Column(name = "BIZ_DT", nullable = false, length = 8)
	public String getBizDt() {
		return this.bizDt;
	}

	public void setBizDt(String bizDt) {
		this.bizDt = bizDt;
	}

	@Column(name = "STOCK_CD", nullable = false, length = 13)
	public String getStockCd() {
		return this.stockCd;
	}

	public void setStockCd(String stockCd) {
		this.stockCd = stockCd;
	}

	@Column(name = "ACCT_CD", nullable = false, length = 30)
	public String getAcctCd() {
		return this.acctCd;
	}

	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}

	@Column(name = "ASSET_CD", nullable = false, length = 12)
	public String getAssetCd() {
		return this.assetCd;
	}

	public void setAssetCd(String assetCd) {
		this.assetCd = assetCd;
	}

	@Column(name = "UNAST_CD", nullable = false, length = 14)
	public String getUnastCd() {
		return this.unastCd;
	}

	public void setUnastCd(String unastCd) {
		this.unastCd = unastCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMmtUnderAbcpId))
			return false;
		NcmMmtUnderAbcpId castOther = (NcmMmtUnderAbcpId) other;

		return ((this.getSeqNo() == castOther.getSeqNo()) || (this.getSeqNo() != null && castOther.getSeqNo() != null
				&& this.getSeqNo().equals(castOther.getSeqNo())))
				&& ((this.getBizDt() == castOther.getBizDt()) || (this.getBizDt() != null
						&& castOther.getBizDt() != null && this.getBizDt().equals(castOther.getBizDt())))
				&& ((this.getStockCd() == castOther.getStockCd()) || (this.getStockCd() != null
						&& castOther.getStockCd() != null && this.getStockCd().equals(castOther.getStockCd())))
				&& ((this.getAcctCd() == castOther.getAcctCd()) || (this.getAcctCd() != null
						&& castOther.getAcctCd() != null && this.getAcctCd().equals(castOther.getAcctCd())))
				&& ((this.getAssetCd() == castOther.getAssetCd()) || (this.getAssetCd() != null
						&& castOther.getAssetCd() != null && this.getAssetCd().equals(castOther.getAssetCd())))
				&& ((this.getUnastCd() == castOther.getUnastCd()) || (this.getUnastCd() != null
						&& castOther.getUnastCd() != null && this.getUnastCd().equals(castOther.getUnastCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSeqNo() == null ? 0 : this.getSeqNo().hashCode());
		result = 37 * result + (getBizDt() == null ? 0 : this.getBizDt().hashCode());
		result = 37 * result + (getStockCd() == null ? 0 : this.getStockCd().hashCode());
		result = 37 * result + (getAcctCd() == null ? 0 : this.getAcctCd().hashCode());
		result = 37 * result + (getAssetCd() == null ? 0 : this.getAssetCd().hashCode());
		result = 37 * result + (getUnastCd() == null ? 0 : this.getUnastCd().hashCode());
		return result;
	}

}
