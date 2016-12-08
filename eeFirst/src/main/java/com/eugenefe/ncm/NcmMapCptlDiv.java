package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMapCptlDiv generated by hbm2java
 */

@Entity
@IdClass(value = NcmMapCptlDivId.class)
@Table(name = "NCM_MAP_CPTL_DIV", schema = "NCM")
public class NcmMapCptlDiv implements java.io.Serializable, Navigatable {

	private String srcTable;
	private String srcCptlDivCd;
	private String srcCptlDivNm;
	private String cptlDivCd;
	private String updateId;
	private Date lastUpdate;

	public NcmMapCptlDiv() {
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
	@Column(name = "SRC_CPTL_DIV_CD", nullable = false, length = 10)
	public String getSrcCptlDivCd() {
		return this.srcCptlDivCd;
	}

	public void setSrcCptlDivCd(String srcCptlDivCd) {
		this.srcCptlDivCd = srcCptlDivCd;
	}

	@Column(name = "SRC_CPTL_DIV_NM", length = 100)
	public String getSrcCptlDivNm() {
		return this.srcCptlDivNm;
	}

	public void setSrcCptlDivNm(String srcCptlDivNm) {
		this.srcCptlDivNm = srcCptlDivNm;

	}

	@Column(name = "CPTL_DIV_CD", length = 10)
	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;

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
		buffer.append("#").append(getSrcCptlDivCd());

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
		if (!(other instanceof NcmMapCptlDiv))
			return false;
		NcmMapCptlDiv castOther = (NcmMapCptlDiv) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getSrcCptlDivCd() == null ? 0 : this.getSrcCptlDivCd().hashCode());
		return result;
	}

}
