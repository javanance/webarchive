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
 * NcmMktMvDaily generated by hbm2java
 */

@Entity
@IdClass(value = NcmMktMvDailyId.class)
@Table(name = "NCM_MKT_MV_DAILY", schema = "NCM")
public class NcmMktMvDaily implements java.io.Serializable {

	private String baseDate;
	private String mvId;
	private BigDecimal mvIdx;
	private BigDecimal mvInt;
	private BigDecimal mvDiff;
	private BigDecimal mvDailyYield;
	private BigDecimal mvMtdYield;
	private BigDecimal mvQtdYield;
	private BigDecimal mvYtdYield;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmMktMvDaily() {
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
	@Column(name = "MV_ID", nullable = false, length = 20)
	public String getMvId() {
		return this.mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	@Column(name = "MV_IDX", nullable = false, precision = 20, scale = 12)
	public BigDecimal getMvIdx() {
		return this.mvIdx;
	}

	public void setMvIdx(BigDecimal mvIdx) {
		this.mvIdx = mvIdx;

	}

	@Column(name = "MV_INT", nullable = false, precision = 20, scale = 12)
	public BigDecimal getMvInt() {
		return this.mvInt;
	}

	public void setMvInt(BigDecimal mvInt) {
		this.mvInt = mvInt;

	}

	@Column(name = "MV_DIFF", precision = 20, scale = 12)
	public BigDecimal getMvDiff() {
		return this.mvDiff;
	}

	public void setMvDiff(BigDecimal mvDiff) {
		this.mvDiff = mvDiff;

	}

	@Column(name = "MV_DAILY_YIELD", precision = 20, scale = 12)
	public BigDecimal getMvDailyYield() {
		return this.mvDailyYield;
	}

	public void setMvDailyYield(BigDecimal mvDailyYield) {
		this.mvDailyYield = mvDailyYield;

	}

	@Column(name = "MV_MTD_YIELD", precision = 20, scale = 12)
	public BigDecimal getMvMtdYield() {
		return this.mvMtdYield;
	}

	public void setMvMtdYield(BigDecimal mvMtdYield) {
		this.mvMtdYield = mvMtdYield;

	}

	@Column(name = "MV_QTD_YIELD", precision = 20, scale = 12)
	public BigDecimal getMvQtdYield() {
		return this.mvQtdYield;
	}

	public void setMvQtdYield(BigDecimal mvQtdYield) {
		this.mvQtdYield = mvQtdYield;

	}

	@Column(name = "MV_YTD_YIELD", precision = 20, scale = 12)
	public BigDecimal getMvYtdYield() {
		return this.mvYtdYield;
	}

	public void setMvYtdYield(BigDecimal mvYtdYield) {
		this.mvYtdYield = mvYtdYield;

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
		buffer.append("#").append(getMvId());

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
		if (!(other instanceof NcmMktMvDaily))
			return false;
		NcmMktMvDaily castOther = (NcmMktMvDaily) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getMvId() == null ? 0 : this.getMvId().hashCode());
		return result;
	}

}
