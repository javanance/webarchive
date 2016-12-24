package com.eugenefe.entity.ncm;
// Generated Dec 21, 2016 2:18:11 PM by Hibernate Tools 5.2.0.CR1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmMstLimitSetting generated by hbm2java
 */

@Entity(name = "NaviNcmMstLimitSetting")
@IdClass(value = NcmMstLimitSettingId.class)
@Table(name = "NCM_MST_LIMIT_SETTING", schema = "NCM")
public class NcmMstLimitSetting implements java.io.Serializable, Navigatable {

	private String applyStDate;
	private String applyGroup;
	private String applyCd;
	private String lmtTypeCd;
	private String applyEndDate;
	private BigDecimal lmtMinAmt;
	private BigDecimal lmtMaxAmt;
	private String useYn;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmMstLimitSetting() {
	}

	@Id
	@Column(name = "APPLY_ST_DATE", nullable = false, length = 8)
	public String getApplyStDate() {
		return this.applyStDate;
	}

	public void setApplyStDate(String applyStDate) {
		this.applyStDate = applyStDate;
	}

	@Id
	@Column(name = "APPLY_GROUP", nullable = false, length = 20)
	public String getApplyGroup() {
		return this.applyGroup;
	}

	public void setApplyGroup(String applyGroup) {
		this.applyGroup = applyGroup;
	}

	@Id
	@Column(name = "APPLY_CD", nullable = false, length = 10)
	public String getApplyCd() {
		return this.applyCd;
	}

	public void setApplyCd(String applyCd) {
		this.applyCd = applyCd;
	}

	@Id
	@Column(name = "LMT_TYPE_CD", nullable = false, length = 20)
	public String getLmtTypeCd() {
		return this.lmtTypeCd;
	}

	public void setLmtTypeCd(String lmtTypeCd) {
		this.lmtTypeCd = lmtTypeCd;
	}

	@Column(name = "APPLY_END_DATE", length = 8)
	public String getApplyEndDate() {
		return this.applyEndDate;
	}

	public void setApplyEndDate(String applyEndDate) {
		this.applyEndDate = applyEndDate;

	}

	@Column(name = "LMT_MIN_AMT", nullable = false, precision = 20)
	public BigDecimal getLmtMinAmt() {
		return this.lmtMinAmt;
	}

	public void setLmtMinAmt(BigDecimal lmtMinAmt) {
		this.lmtMinAmt = lmtMinAmt;

	}

	@Column(name = "LMT_MAX_AMT", nullable = false, precision = 20)
	public BigDecimal getLmtMaxAmt() {
		return this.lmtMaxAmt;
	}

	public void setLmtMaxAmt(BigDecimal lmtMaxAmt) {
		this.lmtMaxAmt = lmtMaxAmt;

	}

	@Column(name = "USE_YN", length = 1)
	public String getUseYn() {
		return this.useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;

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
		buffer.append("#").append(getApplyStDate());
		buffer.append("#").append(getApplyGroup());
		buffer.append("#").append(getApplyCd());
		buffer.append("#").append(getLmtTypeCd());

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
		if (!(other instanceof NcmMstLimitSetting))
			return false;
		NcmMstLimitSetting castOther = (NcmMstLimitSetting) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getApplyStDate() == null ? 0 : this.getApplyStDate().hashCode());
		result = 37 * result + (getApplyGroup() == null ? 0 : this.getApplyGroup().hashCode());
		result = 37 * result + (getApplyCd() == null ? 0 : this.getApplyCd().hashCode());
		result = 37 * result + (getLmtTypeCd() == null ? 0 : this.getLmtTypeCd().hashCode());
		return result;
	}

}