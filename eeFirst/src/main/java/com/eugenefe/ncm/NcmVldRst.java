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
 * NcmVldRst generated by hbm2java
 */
@Entity
@Table(name = "NCM_VLD_RST", schema = "NCM")
public class NcmVldRst implements java.io.Serializable {

	private NcmVldRstId id;
	private String keyCol1;
	private String keyCol1Nm;
	private String keyCol2;
	private String keyCol2Nm;
	private String keyCol3;
	private String keyCol3Nm;
	private String updateId;
	private Date lastUpdate;

	public NcmVldRst() {
	}

	public NcmVldRst(NcmVldRstId id) {
		this.id = id;
	}

	public NcmVldRst(NcmVldRstId id, String keyCol1, String keyCol1Nm, String keyCol2, String keyCol2Nm, String keyCol3,
			String keyCol3Nm, String updateId, Date lastUpdate) {
		this.id = id;
		this.keyCol1 = keyCol1;
		this.keyCol1Nm = keyCol1Nm;
		this.keyCol2 = keyCol2;
		this.keyCol2Nm = keyCol2Nm;
		this.keyCol3 = keyCol3;
		this.keyCol3Nm = keyCol3Nm;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "vldTypeCd", column = @Column(name = "VLD_TYPE_CD", nullable = false, length = 100)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 4, scale = 0)) })
	public NcmVldRstId getId() {
		return this.id;
	}

	public void setId(NcmVldRstId id) {
		this.id = id;
	}

	@Column(name = "KEY_COL1", length = 100)
	public String getKeyCol1() {
		return this.keyCol1;
	}

	public void setKeyCol1(String keyCol1) {
		this.keyCol1 = keyCol1;
	}

	@Column(name = "KEY_COL1_NM", length = 100)
	public String getKeyCol1Nm() {
		return this.keyCol1Nm;
	}

	public void setKeyCol1Nm(String keyCol1Nm) {
		this.keyCol1Nm = keyCol1Nm;
	}

	@Column(name = "KEY_COL2", length = 100)
	public String getKeyCol2() {
		return this.keyCol2;
	}

	public void setKeyCol2(String keyCol2) {
		this.keyCol2 = keyCol2;
	}

	@Column(name = "KEY_COL2_NM", length = 100)
	public String getKeyCol2Nm() {
		return this.keyCol2Nm;
	}

	public void setKeyCol2Nm(String keyCol2Nm) {
		this.keyCol2Nm = keyCol2Nm;
	}

	@Column(name = "KEY_COL3", length = 100)
	public String getKeyCol3() {
		return this.keyCol3;
	}

	public void setKeyCol3(String keyCol3) {
		this.keyCol3 = keyCol3;
	}

	@Column(name = "KEY_COL3_NM", length = 100)
	public String getKeyCol3Nm() {
		return this.keyCol3Nm;
	}

	public void setKeyCol3Nm(String keyCol3Nm) {
		this.keyCol3Nm = keyCol3Nm;
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
