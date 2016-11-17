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
 * NcmErpCashflowHis generated by hbm2java
 */
@Entity
@Table(name = "NCM_ERP_CASHFLOW_HIS", schema = "NCM")
public class NcmErpCashflowHis implements java.io.Serializable {

	private NcmErpCashflowHisId id;
	private BigDecimal flowDay;
	private BigDecimal flowMon;
	private BigDecimal flowAccu;
	private String flowName;
	private BigDecimal flowLevel;
	private String eaiPttn;
	private Date eaiCreDttm;
	private String eaiTrstType;
	private Date eaiTrstDttm;
	private String errMsg;

	public NcmErpCashflowHis() {
	}

	public NcmErpCashflowHis(NcmErpCashflowHisId id) {
		this.id = id;
	}

	public NcmErpCashflowHis(NcmErpCashflowHisId id, BigDecimal flowDay, BigDecimal flowMon, BigDecimal flowAccu,
			String flowName, BigDecimal flowLevel, String eaiPttn, Date eaiCreDttm, String eaiTrstType,
			Date eaiTrstDttm, String errMsg) {
		this.id = id;
		this.flowDay = flowDay;
		this.flowMon = flowMon;
		this.flowAccu = flowAccu;
		this.flowName = flowName;
		this.flowLevel = flowLevel;
		this.eaiPttn = eaiPttn;
		this.eaiCreDttm = eaiCreDttm;
		this.eaiTrstType = eaiTrstType;
		this.eaiTrstDttm = eaiTrstDttm;
		this.errMsg = errMsg;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 20)),
			@AttributeOverride(name = "flowDiv", column = @Column(name = "FLOW_DIV", nullable = false, length = 20)),
			@AttributeOverride(name = "flowCode", column = @Column(name = "FLOW_CODE", nullable = false, length = 20)) })
	public NcmErpCashflowHisId getId() {
		return this.id;
	}

	public void setId(NcmErpCashflowHisId id) {
		this.id = id;
	}

	@Column(name = "FLOW_DAY", precision = 20, scale = 0)
	public BigDecimal getFlowDay() {
		return this.flowDay;
	}

	public void setFlowDay(BigDecimal flowDay) {
		this.flowDay = flowDay;
	}

	@Column(name = "FLOW_MON", precision = 20, scale = 0)
	public BigDecimal getFlowMon() {
		return this.flowMon;
	}

	public void setFlowMon(BigDecimal flowMon) {
		this.flowMon = flowMon;
	}

	@Column(name = "FLOW_ACCU", precision = 20, scale = 0)
	public BigDecimal getFlowAccu() {
		return this.flowAccu;
	}

	public void setFlowAccu(BigDecimal flowAccu) {
		this.flowAccu = flowAccu;
	}

	@Column(name = "FLOW_NAME", length = 100)
	public String getFlowName() {
		return this.flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	@Column(name = "FLOW_LEVEL", precision = 20, scale = 0)
	public BigDecimal getFlowLevel() {
		return this.flowLevel;
	}

	public void setFlowLevel(BigDecimal flowLevel) {
		this.flowLevel = flowLevel;
	}

	@Column(name = "EAI_PTTN", length = 1)
	public String getEaiPttn() {
		return this.eaiPttn;
	}

	public void setEaiPttn(String eaiPttn) {
		this.eaiPttn = eaiPttn;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EAI_CRE_DTTM", length = 7)
	public Date getEaiCreDttm() {
		return this.eaiCreDttm;
	}

	public void setEaiCreDttm(Date eaiCreDttm) {
		this.eaiCreDttm = eaiCreDttm;
	}

	@Column(name = "EAI_TRST_TYPE", length = 1)
	public String getEaiTrstType() {
		return this.eaiTrstType;
	}

	public void setEaiTrstType(String eaiTrstType) {
		this.eaiTrstType = eaiTrstType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EAI_TRST_DTTM", length = 7)
	public Date getEaiTrstDttm() {
		return this.eaiTrstDttm;
	}

	public void setEaiTrstDttm(Date eaiTrstDttm) {
		this.eaiTrstDttm = eaiTrstDttm;
	}

	@Column(name = "ERR_MSG", length = 200)
	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}