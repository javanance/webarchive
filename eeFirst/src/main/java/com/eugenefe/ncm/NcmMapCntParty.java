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
 * NcmMapCntParty generated by hbm2java
 */

@Entity
@IdClass(value = NcmMapCntPartyId.class)
@Table(name = "NCM_MAP_CNT_PARTY", schema = "NCM")
public class NcmMapCntParty implements java.io.Serializable {

	private String srcTable;
	private String srcCparty;
	private String srcCpartyNm;
	private String corpNo;
	private String updateId;
	private Date lastUpdate;

	public NcmMapCntParty() {
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
	@Column(name = "SRC_CPARTY", nullable = false, length = 100)
	public String getSrcCparty() {
		return this.srcCparty;
	}

	public void setSrcCparty(String srcCparty) {
		this.srcCparty = srcCparty;
	}

	@Column(name = "SRC_CPARTY_NM", length = 100)
	public String getSrcCpartyNm() {
		return this.srcCpartyNm;
	}

	public void setSrcCpartyNm(String srcCpartyNm) {
		this.srcCpartyNm = srcCpartyNm;

	}

	@Column(name = "CORP_NO", length = 20)
	public String getCorpNo() {
		return this.corpNo;
	}

	public void setCorpNo(String corpNo) {
		this.corpNo = corpNo;

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
		buffer.append("#").append(getSrcCparty());

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
		if (!(other instanceof NcmMapCntParty))
			return false;
		NcmMapCntParty castOther = (NcmMapCntParty) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getSrcCparty() == null ? 0 : this.getSrcCparty().hashCode());
		return result;
	}

}
