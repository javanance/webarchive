package com.eugenefe.ncm;
// Generated Dec 7, 2016 4:47:20 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmLv2PosRisk generated by hbm2java
 */

@Entity
@IdClass(value = NcmLv2PosRiskId.class)
@Table(name = "NCM_LV2_POS_RISK", schema = "NCM")
public class NcmLv2PosRisk implements java.io.Serializable {

	private String baseDate;
	private String posId;
	private BigDecimal stdev;
	private BigDecimal var;
	private BigDecimal te;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv2PosRisk() {
	}

	@Id
	@Column(name = "BASE_DATE", nullable = false, length = 8)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Id
	@Column(name = "POS_ID", nullable = false, length = 20)
	public String getPosId() {
		return this.posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	@Column(name = "STDEV", nullable = false, precision = 12, scale = 8)
	public BigDecimal getStdev() {
		return this.stdev;
	}

	public void setStdev(BigDecimal stdev) {
		this.stdev = stdev;

	}

	@Column(name = "VAR", nullable = false, precision = 20)
	public BigDecimal getVar() {
		return this.var;
	}

	public void setVar(BigDecimal var) {
		this.var = var;

	}

	@Column(name = "TE", nullable = false, precision = 12, scale = 8)
	public BigDecimal getTe() {
		return this.te;
	}

	public void setTe(BigDecimal te) {
		this.te = te;

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

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getPosId());

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
		if (!(other instanceof NcmLv2PosRisk))
			return false;
		NcmLv2PosRisk castOther = (NcmLv2PosRisk) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getPosId() == null ? 0 : this.getPosId().hashCode());
		return result;
	}

}
