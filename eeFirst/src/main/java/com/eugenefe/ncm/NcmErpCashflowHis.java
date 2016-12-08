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
 * NcmErpCashflowHis generated by hbm2java
 */

@Entity
@IdClass(value = NcmErpCashflowHisId.class)
@Table(name = "NCM_ERP_CASHFLOW_HIS", schema = "NCM")
public class NcmErpCashflowHis implements java.io.Serializable {

	private String baseDate;
	private String flowDiv;
	private String flowCode;
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

	@Id
	@Column(name = "BASE_DATE", nullable = false, length = 20)
	public String getBaseDate() {
		return this.baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	@Id
	@Column(name = "FLOW_DIV", nullable = false, length = 20)
	public String getFlowDiv() {
		return this.flowDiv;
	}

	public void setFlowDiv(String flowDiv) {
		this.flowDiv = flowDiv;
	}

	@Id
	@Column(name = "FLOW_CODE", nullable = false, length = 20)
	public String getFlowCode() {
		return this.flowCode;
	}

	public void setFlowCode(String flowCode) {
		this.flowCode = flowCode;
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

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getBaseDate());
		buffer.append("#").append(getFlowDiv());
		buffer.append("#").append(getFlowCode());

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
		if (!(other instanceof NcmErpCashflowHis))
			return false;
		NcmErpCashflowHis castOther = (NcmErpCashflowHis) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getBaseDate() == null ? 0 : this.getBaseDate().hashCode());
		result = 37 * result + (getFlowDiv() == null ? 0 : this.getFlowDiv().hashCode());
		result = 37 * result + (getFlowCode() == null ? 0 : this.getFlowCode().hashCode());
		return result;
	}

}