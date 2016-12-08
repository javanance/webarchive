package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMapTxType generated by hbm2java
 */

@Entity
@IdClass(value = NcmMapTxTypeId.class)
@Table(name = "NCM_MAP_TX_TYPE", schema = "NCM")
public class NcmMapTxType implements java.io.Serializable {

	private String srcTable;
	private String srcProdTypeCd;
	private String srcTradeTypeCd;
	private String srcProdTypeNm;
	private String srcTradeTypeNm;
	private String txTypeCd;
	private String updateId;
	private Date lastUpdate;

	public NcmMapTxType() {
	}

	@Id
	@Column(name = "SRC_TABLE", nullable = false, length = 20)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;
	}

	@Id
	@Column(name = "SRC_PROD_TYPE_CD", nullable = false, length = 10)
	public String getSrcProdTypeCd() {
		return this.srcProdTypeCd;
	}

	public void setSrcProdTypeCd(String srcProdTypeCd) {
		this.srcProdTypeCd = srcProdTypeCd;
	}

	@Id
	@Column(name = "SRC_TRADE_TYPE_CD", nullable = false, length = 10)
	public String getSrcTradeTypeCd() {
		return this.srcTradeTypeCd;
	}

	public void setSrcTradeTypeCd(String srcTradeTypeCd) {
		this.srcTradeTypeCd = srcTradeTypeCd;
	}

	@Column(name = "SRC_PROD_TYPE_NM", length = 100)
	public String getSrcProdTypeNm() {
		return this.srcProdTypeNm;
	}

	public void setSrcProdTypeNm(String srcProdTypeNm) {
		this.srcProdTypeNm = srcProdTypeNm;

	}

	@Column(name = "SRC_TRADE_TYPE_NM", length = 100)
	public String getSrcTradeTypeNm() {
		return this.srcTradeTypeNm;
	}

	public void setSrcTradeTypeNm(String srcTradeTypeNm) {
		this.srcTradeTypeNm = srcTradeTypeNm;

	}

	@Column(name = "TX_TYPE_CD", length = 10)
	public String getTxTypeCd() {
		return this.txTypeCd;
	}

	public void setTxTypeCd(String txTypeCd) {
		this.txTypeCd = txTypeCd;

	}

	@Column(name = "UPDATE_ID", length = 20)
	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;

	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_UPDATE", length = 7)
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
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getSrcTable());
		buffer.append("#").append(getSrcProdTypeCd());
		buffer.append("#").append(getSrcTradeTypeCd());

		String rst = buffer.toString();

		return rst;
	}

	@Transient
	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmMapTxType))
			return false;
		NcmMapTxType castOther = (NcmMapTxType) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getSrcProdTypeCd() == null ? 0 : this.getSrcProdTypeCd().hashCode());
		result = 37 * result + (getSrcTradeTypeCd() == null ? 0 : this.getSrcTradeTypeCd().hashCode());
		return result;
	}

}
