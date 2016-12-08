package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * NcmMstSaaWghtTmp generated by hbm2java
 */

@Entity
@IdClass(value = NcmMstSaaWghtTmpId.class)
@Table(name = "NCM_MST_SAA_WGHT_TMP", schema = "NCM")
public class NcmMstSaaWghtTmp implements java.io.Serializable, Navigatable {

	private String applyStDate;
	private String saaCd;
	private Short saaOrder;
	private Short saaLevel;
	private BigDecimal targetYield;
	private BigDecimal targetWght;
	private BigDecimal torlError;
	private String bmId;
	private String applyEndDate;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmMstSaaWghtTmp() {
	}

	@Id
	@Column(name = "APPLY_ST_DATE", length = 8)
	public String getApplyStDate() {
		return this.applyStDate;
	}

	public void setApplyStDate(String applyStDate) {
		this.applyStDate = applyStDate;
	}

	@Id
	@Column(name = "SAA_CD", nullable = false, length = 10)
	public String getSaaCd() {
		return this.saaCd;
	}

	public void setSaaCd(String saaCd) {
		this.saaCd = saaCd;
	}

	@Id
	@Column(name = "SAA_ORDER", precision = 4, scale = 0)
	public Short getSaaOrder() {
		return this.saaOrder;
	}

	public void setSaaOrder(Short saaOrder) {
		this.saaOrder = saaOrder;
	}

	@Id
	@Column(name = "SAA_LEVEL", precision = 4, scale = 0)
	public Short getSaaLevel() {
		return this.saaLevel;
	}

	public void setSaaLevel(Short saaLevel) {
		this.saaLevel = saaLevel;
	}

	@Id
	@Column(name = "TARGET_YIELD", precision = 12, scale = 8)
	public BigDecimal getTargetYield() {
		return this.targetYield;
	}

	public void setTargetYield(BigDecimal targetYield) {
		this.targetYield = targetYield;
	}

	@Id
	@Column(name = "TARGET_WGHT", precision = 12, scale = 8)
	public BigDecimal getTargetWght() {
		return this.targetWght;
	}

	public void setTargetWght(BigDecimal targetWght) {
		this.targetWght = targetWght;
	}

	@Id
	@Column(name = "TORL_ERROR", precision = 12, scale = 8)
	public BigDecimal getTorlError() {
		return this.torlError;
	}

	public void setTorlError(BigDecimal torlError) {
		this.torlError = torlError;
	}

	@Id
	@Column(name = "BM_ID", length = 20)
	public String getBmId() {
		return this.bmId;
	}

	public void setBmId(String bmId) {
		this.bmId = bmId;
	}

	@Id
	@Column(name = "APPLY_END_DATE", length = 8)
	public String getApplyEndDate() {
		return this.applyEndDate;
	}

	public void setApplyEndDate(String applyEndDate) {
		this.applyEndDate = applyEndDate;
	}

	@Id
	@Column(name = "SRC_TABLE", length = 20)
	public String getSrcTable() {
		return this.srcTable;
	}

	public void setSrcTable(String srcTable) {
		this.srcTable = srcTable;
	}

	@Id
	@Column(name = "UPDATE_ID", length = 20)
	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	@Id
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
		buffer.append("#").append(getSaaCd());
		buffer.append("#").append(getSaaOrder());
		buffer.append("#").append(getSaaLevel());
		buffer.append("#").append(getTargetYield());
		buffer.append("#").append(getTargetWght());
		buffer.append("#").append(getTorlError());
		buffer.append("#").append(getBmId());
		buffer.append("#").append(getApplyEndDate());
		buffer.append("#").append(getSrcTable());
		buffer.append("#").append(getUpdateId());
		buffer.append("#").append(getLastUpdate());

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
		if (!(other instanceof NcmMstSaaWghtTmp))
			return false;
		NcmMstSaaWghtTmp castOther = (NcmMstSaaWghtTmp) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getApplyStDate() == null ? 0 : this.getApplyStDate().hashCode());
		result = 37 * result + (getSaaCd() == null ? 0 : this.getSaaCd().hashCode());
		result = 37 * result + (getSaaOrder() == null ? 0 : this.getSaaOrder().hashCode());
		result = 37 * result + (getSaaLevel() == null ? 0 : this.getSaaLevel().hashCode());
		result = 37 * result + (getTargetYield() == null ? 0 : this.getTargetYield().hashCode());
		result = 37 * result + (getTargetWght() == null ? 0 : this.getTargetWght().hashCode());
		result = 37 * result + (getTorlError() == null ? 0 : this.getTorlError().hashCode());
		result = 37 * result + (getBmId() == null ? 0 : this.getBmId().hashCode());
		result = 37 * result + (getApplyEndDate() == null ? 0 : this.getApplyEndDate().hashCode());
		result = 37 * result + (getSrcTable() == null ? 0 : this.getSrcTable().hashCode());
		result = 37 * result + (getUpdateId() == null ? 0 : this.getUpdateId().hashCode());
		result = 37 * result + (getLastUpdate() == null ? 0 : this.getLastUpdate().hashCode());
		return result;
	}

}
