package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
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
 * NcmLv2BmReturn generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV2_BM_RETURN", schema = "NCM")
public class NcmLv2BmReturn implements java.io.Serializable {

	private NcmLv2BmReturnId id;
	private BigDecimal m01BmYield;
	private BigDecimal m03BmYield;
	private BigDecimal m06BmYield;
	private BigDecimal m12BmYield;
	private BigDecimal m24BmYield;
	private BigDecimal m36BmYield;
	private BigDecimal ytdBmYield;
	private BigDecimal qtdBmYield;
	private BigDecimal mtdBmYield;
	private BigDecimal fy1BmYield;
	private BigDecimal fy2BmYield;
	private BigDecimal fy3BmYield;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv2BmReturn() {
	}

	public NcmLv2BmReturn(NcmLv2BmReturnId id) {
		this.id = id;
	}

	public NcmLv2BmReturn(NcmLv2BmReturnId id, BigDecimal m01BmYield, BigDecimal m03BmYield, BigDecimal m06BmYield,
			BigDecimal m12BmYield, BigDecimal m24BmYield, BigDecimal m36BmYield, BigDecimal ytdBmYield,
			BigDecimal qtdBmYield, BigDecimal mtdBmYield, BigDecimal fy1BmYield, BigDecimal fy2BmYield,
			BigDecimal fy3BmYield, String srcTable, String updateId, Date lastUpdate) {
		this.id = id;
		this.m01BmYield = m01BmYield;
		this.m03BmYield = m03BmYield;
		this.m06BmYield = m06BmYield;
		this.m12BmYield = m12BmYield;
		this.m24BmYield = m24BmYield;
		this.m36BmYield = m36BmYield;
		this.ytdBmYield = ytdBmYield;
		this.qtdBmYield = qtdBmYield;
		this.mtdBmYield = mtdBmYield;
		this.fy1BmYield = fy1BmYield;
		this.fy2BmYield = fy2BmYield;
		this.fy3BmYield = fy3BmYield;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "bmId", column = @Column(name = "BM_ID", nullable = false, length = 20)) })
	public NcmLv2BmReturnId getId() {
		return this.id;
	}

	public void setId(NcmLv2BmReturnId id) {
		this.id = id;
	}

	@Column(name = "M01_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getM01BmYield() {
		return this.m01BmYield;
	}

	public void setM01BmYield(BigDecimal m01BmYield) {
		this.m01BmYield = m01BmYield;
	}

	@Column(name = "M03_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getM03BmYield() {
		return this.m03BmYield;
	}

	public void setM03BmYield(BigDecimal m03BmYield) {
		this.m03BmYield = m03BmYield;
	}

	@Column(name = "M06_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getM06BmYield() {
		return this.m06BmYield;
	}

	public void setM06BmYield(BigDecimal m06BmYield) {
		this.m06BmYield = m06BmYield;
	}

	@Column(name = "M12_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getM12BmYield() {
		return this.m12BmYield;
	}

	public void setM12BmYield(BigDecimal m12BmYield) {
		this.m12BmYield = m12BmYield;
	}

	@Column(name = "M24_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getM24BmYield() {
		return this.m24BmYield;
	}

	public void setM24BmYield(BigDecimal m24BmYield) {
		this.m24BmYield = m24BmYield;
	}

	@Column(name = "M36_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getM36BmYield() {
		return this.m36BmYield;
	}

	public void setM36BmYield(BigDecimal m36BmYield) {
		this.m36BmYield = m36BmYield;
	}

	@Column(name = "YTD_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getYtdBmYield() {
		return this.ytdBmYield;
	}

	public void setYtdBmYield(BigDecimal ytdBmYield) {
		this.ytdBmYield = ytdBmYield;
	}

	@Column(name = "QTD_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getQtdBmYield() {
		return this.qtdBmYield;
	}

	public void setQtdBmYield(BigDecimal qtdBmYield) {
		this.qtdBmYield = qtdBmYield;
	}

	@Column(name = "MTD_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getMtdBmYield() {
		return this.mtdBmYield;
	}

	public void setMtdBmYield(BigDecimal mtdBmYield) {
		this.mtdBmYield = mtdBmYield;
	}

	@Column(name = "FY1_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getFy1BmYield() {
		return this.fy1BmYield;
	}

	public void setFy1BmYield(BigDecimal fy1BmYield) {
		this.fy1BmYield = fy1BmYield;
	}

	@Column(name = "FY2_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getFy2BmYield() {
		return this.fy2BmYield;
	}

	public void setFy2BmYield(BigDecimal fy2BmYield) {
		this.fy2BmYield = fy2BmYield;
	}

	@Column(name = "FY3_BM_YIELD", precision = 12, scale = 8)
	public BigDecimal getFy3BmYield() {
		return this.fy3BmYield;
	}

	public void setFy3BmYield(BigDecimal fy3BmYield) {
		this.fy3BmYield = fy3BmYield;
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
