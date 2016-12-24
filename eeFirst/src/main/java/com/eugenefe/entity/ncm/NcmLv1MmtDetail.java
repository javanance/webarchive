package com.eugenefe.entity.ncm;
// Generated Dec 21, 2016 2:18:11 PM by Hibernate Tools 5.2.0.CR1 with Custom Template_takion!!!!!! 

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
 * NcmLv1MmtDetail generated by hbm2java
 */

@Entity(name = "NaviNcmLv1MmtDetail")
@IdClass(value = NcmLv1MmtDetailId.class)
@Table(name = "NCM_LV1_MMT_DETAIL", schema = "NCM")
public class NcmLv1MmtDetail implements java.io.Serializable, Navigatable {

	private String mmtProdId;
	private String mmtChgProdId;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1MmtDetail() {
	}

	@Id
	@Column(name = "MMT_PROD_ID", nullable = false, length = 20)
	public String getMmtProdId() {
		return this.mmtProdId;
	}

	public void setMmtProdId(String mmtProdId) {
		this.mmtProdId = mmtProdId;
	}

	@Id
	@Column(name = "MMT_CHG_PROD_ID", nullable = false, length = 20)
	public String getMmtChgProdId() {
		return this.mmtChgProdId;
	}

	public void setMmtChgProdId(String mmtChgProdId) {
		this.mmtChgProdId = mmtChgProdId;
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
		buffer.append("#").append(getMmtProdId());
		buffer.append("#").append(getMmtChgProdId());

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
		if (!(other instanceof NcmLv1MmtDetail))
			return false;
		NcmLv1MmtDetail castOther = (NcmLv1MmtDetail) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMmtProdId() == null ? 0 : this.getMmtProdId().hashCode());
		result = 37 * result + (getMmtChgProdId() == null ? 0 : this.getMmtChgProdId().hashCode());
		return result;
	}

}