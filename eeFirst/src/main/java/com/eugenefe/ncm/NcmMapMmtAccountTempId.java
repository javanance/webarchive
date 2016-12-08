package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import java.util.Date;

/**
 * NcmMapMmtAccountTempId generated by hbm2java
 */

public class NcmMapMmtAccountTempId implements java.io.Serializable, Navigatable {

	private String srcTable;
	private String srcAcctNo;
	private String srcFinTxNo;
	private String srcProdTypeCd;
	private String srcProdTypeNm;
	private String srcCparty;
	private String srcCpartyNm;
	private String srcBuyDate;
	private String srcMaturityDate;
	private BigDecimal srcIssuAmt;
	private BigDecimal srcIntRate;
	private String finProdId;
	private String updateId;
	private Date lastUpdate;

	public NcmMapMmtAccountTempId() {
	}

	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;

	}

	public String getSrcAcctNo() {
		return this.srcAcctNo;
	}

	public void setSrcAcctNo(String srcAcctNo) {
		this.srcAcctNo = srcAcctNo;

	}

	public String getSrcFinTxNo() {
		return this.srcFinTxNo;
	}

	public void setSrcFinTxNo(String srcFinTxNo) {
		this.srcFinTxNo = srcFinTxNo;

	}

	public String getSrcProdTypeCd() {
		return this.srcProdTypeCd;
	}

	public void setSrcProdTypeCd(String srcProdTypeCd) {
		this.srcProdTypeCd = srcProdTypeCd;

	}

	public String getSrcProdTypeNm() {
		return this.srcProdTypeNm;
	}

	public void setSrcProdTypeNm(String srcProdTypeNm) {
		this.srcProdTypeNm = srcProdTypeNm;

	}

	public String getSrcCparty() {
		return this.srcCparty;
	}

	public void setSrcCparty(String srcCparty) {
		this.srcCparty = srcCparty;

	}

	public String getSrcCpartyNm() {
		return this.srcCpartyNm;
	}

	public void setSrcCpartyNm(String srcCpartyNm) {
		this.srcCpartyNm = srcCpartyNm;

	}

	public String getSrcBuyDate() {
		return this.srcBuyDate;
	}

	public void setSrcBuyDate(String srcBuyDate) {
		this.srcBuyDate = srcBuyDate;

	}

	public String getSrcMaturityDate() {
		return this.srcMaturityDate;
	}

	public void setSrcMaturityDate(String srcMaturityDate) {
		this.srcMaturityDate = srcMaturityDate;

	}

	public BigDecimal getSrcIssuAmt() {
		return this.srcIssuAmt;
	}

	public void setSrcIssuAmt(BigDecimal srcIssuAmt) {
		this.srcIssuAmt = srcIssuAmt;

	}

	public BigDecimal getSrcIntRate() {
		return this.srcIntRate;
	}

	public void setSrcIntRate(BigDecimal srcIntRate) {
		this.srcIntRate = srcIntRate;

	}

	public String getFinProdId() {
		return this.finProdId;
	}

	public void setFinProdId(String finProdId) {
		this.finProdId = finProdId;

	}

	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;

	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;

	}

	/**
	 * idString
	 * @return String
	 */
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getSrcTable());
		buffer.append("#").append(getSrcAcctNo());
		buffer.append("#").append(getSrcFinTxNo());
		buffer.append("#").append(getSrcProdTypeCd());
		buffer.append("#").append(getSrcProdTypeNm());
		buffer.append("#").append(getSrcCparty());
		buffer.append("#").append(getSrcCpartyNm());
		buffer.append("#").append(getSrcBuyDate());
		buffer.append("#").append(getSrcMaturityDate());
		buffer.append("#").append(getSrcIssuAmt());
		buffer.append("#").append(getSrcIntRate());
		buffer.append("#").append(getFinProdId());
		buffer.append("#").append(getUpdateId());
		buffer.append("#").append(getLastUpdate());

		String rst = buffer.toString();

		return rst;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMapMmtAccountTempId))
			return false;
		NcmMapMmtAccountTempId castOther = (NcmMapMmtAccountTempId) other;

		return ((this.getSrcTable() == castOther.getSrcTable())
				|| (this.getSrcTable() != null && castOther.getSrcTable() != null && this.getSrcTable().equals(castOther.getSrcTable())))
				&& ((this.getSrcAcctNo() == castOther.getSrcAcctNo())
						|| (this.getSrcAcctNo() != null && castOther.getSrcAcctNo() != null && this.getSrcAcctNo().equals(castOther.getSrcAcctNo())))
				&& ((this.getSrcFinTxNo() == castOther.getSrcFinTxNo())
						|| (this.getSrcFinTxNo() != null && castOther.getSrcFinTxNo() != null && this.getSrcFinTxNo().equals(castOther.getSrcFinTxNo())))
				&& ((this.getSrcProdTypeCd() == castOther.getSrcProdTypeCd())
						|| (this.getSrcProdTypeCd() != null && castOther.getSrcProdTypeCd() != null && this.getSrcProdTypeCd().equals(castOther.getSrcProdTypeCd())))
				&& ((this.getSrcProdTypeNm() == castOther.getSrcProdTypeNm())
						|| (this.getSrcProdTypeNm() != null && castOther.getSrcProdTypeNm() != null && this.getSrcProdTypeNm().equals(castOther.getSrcProdTypeNm())))
				&& ((this.getSrcCparty() == castOther.getSrcCparty())
						|| (this.getSrcCparty() != null && castOther.getSrcCparty() != null && this.getSrcCparty().equals(castOther.getSrcCparty())))
				&& ((this.getSrcCpartyNm() == castOther.getSrcCpartyNm())
						|| (this.getSrcCpartyNm() != null && castOther.getSrcCpartyNm() != null && this.getSrcCpartyNm().equals(castOther.getSrcCpartyNm())))
				&& ((this.getSrcBuyDate() == castOther.getSrcBuyDate())
						|| (this.getSrcBuyDate() != null && castOther.getSrcBuyDate() != null && this.getSrcBuyDate().equals(castOther.getSrcBuyDate())))
				&& ((this.getSrcMaturityDate() == castOther.getSrcMaturityDate())
						|| (this.getSrcMaturityDate() != null && castOther.getSrcMaturityDate() != null && this.getSrcMaturityDate().equals(castOther.getSrcMaturityDate())))
				&& ((this.getSrcIssuAmt() == castOther.getSrcIssuAmt())
						|| (this.getSrcIssuAmt() != null && castOther.getSrcIssuAmt() != null && this.getSrcIssuAmt().equals(castOther.getSrcIssuAmt())))
				&& ((this.getSrcIntRate() == castOther.getSrcIntRate())
						|| (this.getSrcIntRate() != null && castOther.getSrcIntRate() != null && this.getSrcIntRate().equals(castOther.getSrcIntRate())))
				&& ((this.getFinProdId() == castOther.getFinProdId())
						|| (this.getFinProdId() != null && castOther.getFinProdId() != null && this.getFinProdId().equals(castOther.getFinProdId())))
				&& ((this.getUpdateId() == castOther.getUpdateId())
						|| (this.getUpdateId() != null && castOther.getUpdateId() != null && this.getUpdateId().equals(castOther.getUpdateId())))
				&& ((this.getLastUpdate() == castOther.getLastUpdate())
						|| (this.getLastUpdate() != null && castOther.getLastUpdate() != null && this.getLastUpdate().equals(castOther.getLastUpdate())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getSrcAcctNo() == null ? 0 : this.getSrcAcctNo().hashCode());
		result = 37 * result + (getSrcFinTxNo() == null ? 0 : this.getSrcFinTxNo().hashCode());
		result = 37 * result + (getSrcProdTypeCd() == null ? 0 : this.getSrcProdTypeCd().hashCode());
		result = 37 * result + (getSrcProdTypeNm() == null ? 0 : this.getSrcProdTypeNm().hashCode());
		result = 37 * result + (getSrcCparty() == null ? 0 : this.getSrcCparty().hashCode());
		result = 37 * result + (getSrcCpartyNm() == null ? 0 : this.getSrcCpartyNm().hashCode());
		result = 37 * result + (getSrcBuyDate() == null ? 0 : this.getSrcBuyDate().hashCode());
		result = 37 * result + (getSrcMaturityDate() == null ? 0 : this.getSrcMaturityDate().hashCode());
		result = 37 * result + (getSrcIssuAmt() == null ? 0 : this.getSrcIssuAmt().hashCode());
		result = 37 * result + (getSrcIntRate() == null ? 0 : this.getSrcIntRate().hashCode());
		result = 37 * result + (getFinProdId() == null ? 0 : this.getFinProdId().hashCode());
		result = 37 * result + (getUpdateId() == null ? 0 : this.getUpdateId().hashCode());
		result = 37 * result + (getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode());
		return result;
	}

}
