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
 * NcmLv1KfrBm generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV1_KFR_BM", schema = "NCM")
public class NcmLv1KfrBm implements java.io.Serializable {

	private NcmLv1KfrBmId id;
	private String tradeday;
	private String bmname;
	private BigDecimal bmret1d;
	private BigDecimal bmretidx;
	private String evalcorpcode;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv1KfrBm() {
	}

	public NcmLv1KfrBm(NcmLv1KfrBmId id, String tradeday) {
		this.id = id;
		this.tradeday = tradeday;
	}

	public NcmLv1KfrBm(NcmLv1KfrBmId id, String tradeday, String bmname, BigDecimal bmret1d, BigDecimal bmretidx,
			String evalcorpcode, String srcTable, String updateId, Date lastUpdate) {
		this.id = id;
		this.tradeday = tradeday;
		this.bmname = bmname;
		this.bmret1d = bmret1d;
		this.bmretidx = bmretidx;
		this.evalcorpcode = evalcorpcode;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseday", column = @Column(name = "BASEDAY", nullable = false, length = 8)),
			@AttributeOverride(name = "bmcode", column = @Column(name = "BMCODE", nullable = false, length = 12)) })
	public NcmLv1KfrBmId getId() {
		return this.id;
	}

	public void setId(NcmLv1KfrBmId id) {
		this.id = id;
	}

	@Column(name = "TRADEDAY", nullable = false, length = 8)
	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;
	}

	@Column(name = "BMNAME", length = 100)
	public String getBmname() {
		return this.bmname;
	}

	public void setBmname(String bmname) {
		this.bmname = bmname;
	}

	@Column(name = "BMRET1D", precision = 20, scale = 12)
	public BigDecimal getBmret1d() {
		return this.bmret1d;
	}

	public void setBmret1d(BigDecimal bmret1d) {
		this.bmret1d = bmret1d;
	}

	@Column(name = "BMRETIDX", precision = 20, scale = 12)
	public BigDecimal getBmretidx() {
		return this.bmretidx;
	}

	public void setBmretidx(BigDecimal bmretidx) {
		this.bmretidx = bmretidx;
	}

	@Column(name = "EVALCORPCODE", length = 4)
	public String getEvalcorpcode() {
		return this.evalcorpcode;
	}

	public void setEvalcorpcode(String evalcorpcode) {
		this.evalcorpcode = evalcorpcode;
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