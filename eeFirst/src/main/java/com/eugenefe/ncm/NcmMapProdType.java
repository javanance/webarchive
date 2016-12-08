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
 * NcmMapProdType generated by hbm2java
 */

@Entity
@IdClass(value = NcmMapProdTypeId.class)
@Table(name = "NCM_MAP_PROD_TYPE", schema = "NCM")
public class NcmMapProdType implements java.io.Serializable {

	private String srcTable;
	private String srcProdTypeCd;
	private String srcProdTypeNm;
	private String prodTypeCd;
	private String updateId;
	private Date lastUpdate;

	public NcmMapProdType() {
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

	@Column(name = "SRC_PROD_TYPE_NM", length = 100)
	public String getSrcProdTypeNm() {
		return this.srcProdTypeNm;
	}

	public void setSrcProdTypeNm(String srcProdTypeNm) {
		this.srcProdTypeNm = srcProdTypeNm;

	}

	@Column(name = "PROD_TYPE_CD", length = 10)
	public String getProdTypeCd() {
		return this.prodTypeCd;
	}

	public void setProdTypeCd(String prodTypeCd) {
		this.prodTypeCd = prodTypeCd;

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
		if (!(other instanceof NcmMapProdType))
			return false;
		NcmMapProdType castOther = (NcmMapProdType) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getSrcProdTypeCd() == null ? 0 : this.getSrcProdTypeCd().hashCode());
		return result;
	}

}
