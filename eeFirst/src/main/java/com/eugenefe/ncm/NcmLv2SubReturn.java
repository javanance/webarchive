package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmLv2SubReturn generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV2_SUB_RETURN", schema = "NCM")
public class NcmLv2SubReturn implements java.io.Serializable {

	private NcmLv2SubReturnId id;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv2SubReturn() {
	}

	public NcmLv2SubReturn(NcmLv2SubReturnId id) {
		this.id = id;
	}

	public NcmLv2SubReturn(NcmLv2SubReturnId id, String srcTable, String updateId, Date lastUpdate) {
		this.id = id;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "posId", column = @Column(name = "POS_ID", nullable = false, length = 20)) })
	public NcmLv2SubReturnId getId() {
		return this.id;
	}

	public void setId(NcmLv2SubReturnId id) {
		this.id = id;
	}

	@Column(name = "SRC_TABLE", length = 20)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;
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

}