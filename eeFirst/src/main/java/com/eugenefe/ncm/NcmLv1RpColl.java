package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmLv1RpColl generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV1_RP_COLL", schema = "NCM")
public class NcmLv1RpColl implements java.io.Serializable {

	private String rpProdId;
	private String rpCollProdId;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1RpColl() {
	}

	public NcmLv1RpColl(String rpProdId) {
		this.rpProdId = rpProdId;
	}

	public NcmLv1RpColl(String rpProdId, String rpCollProdId, String srcTable, String updateId, Date lastUpdate) {
		this.rpProdId = rpProdId;
		this.rpCollProdId = rpCollProdId;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@Id

	@Column(name = "RP_PROD_ID", unique = true, nullable = false, length = 20)
	public String getRpProdId() {
		return this.rpProdId;
	}

	public void setRpProdId(String rpProdId) {
		this.rpProdId = rpProdId;
	}

	@Column(name = "RP_COLL_PROD_ID", length = 20)
	public String getRpCollProdId() {
		return this.rpCollProdId;
	}

	public void setRpCollProdId(String rpCollProdId) {
		this.rpCollProdId = rpCollProdId;
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
