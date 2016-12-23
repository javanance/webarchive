package com.eugenefe.entities;
// Generated May 29, 2016 10:08:33 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * OdsKrxOptionPrice generated by hbm2java
 */
@Entity
@Table(name = "ods_krx_option_price", catalog = "eugenefe")
public class OdsKrxOptionPrice implements java.io.Serializable {

	private OdsKrxOptionPriceId id;
	private BigDecimal opnPr;
	private BigDecimal hgPr;
	private BigDecimal lwPr;
	private BigDecimal endPr;
	private BigDecimal endRt;
	private BigDecimal TDdTrVl;
	private BigDecimal TDdTrAmt;
	private BigDecimal opnIntCtrVl;
	private BigDecimal impVola;
	private BigDecimal setlmult;

	public OdsKrxOptionPrice() {
	}

	public OdsKrxOptionPrice(OdsKrxOptionPriceId id) {
		this.id = id;
	}

	public OdsKrxOptionPrice(OdsKrxOptionPriceId id, BigDecimal opnPr, BigDecimal hgPr, BigDecimal lwPr,
			BigDecimal endPr, BigDecimal endRt, BigDecimal TDdTrVl, BigDecimal TDdTrAmt, BigDecimal opnIntCtrVl,
			BigDecimal impVola, BigDecimal setlmult) {
		this.id = id;
		this.opnPr = opnPr;
		this.hgPr = hgPr;
		this.lwPr = lwPr;
		this.endPr = endPr;
		this.endRt = endRt;
		this.TDdTrVl = TDdTrVl;
		this.TDdTrAmt = TDdTrAmt;
		this.opnIntCtrVl = opnIntCtrVl;
		this.impVola = impVola;
		this.setlmult = setlmult;
	}

	@EmbeddedId
	
	@AttributeOverrides({
			@AttributeOverride(name = "workDt", column = @Column(name = "WORK_DT", nullable = false, length = 8) ),
			@AttributeOverride(name = "isuCd", column = @Column(name = "ISU_CD", nullable = false, length = 20) ) })
	public OdsKrxOptionPriceId getId() {
		return this.id;
	}

	public void setId(OdsKrxOptionPriceId id) {
		this.id = id;
	}

	@Column(name = "OPN_PR", precision = 20, scale = 8)
	public BigDecimal getOpnPr() {
		return this.opnPr;
	}

	public void setOpnPr(BigDecimal opnPr) {
		this.opnPr = opnPr;
	}

	@Column(name = "HG_PR", precision = 20, scale = 8)
	public BigDecimal getHgPr() {
		return this.hgPr;
	}

	public void setHgPr(BigDecimal hgPr) {
		this.hgPr = hgPr;
	}

	@Column(name = "LW_PR", precision = 20, scale = 8)
	public BigDecimal getLwPr() {
		return this.lwPr;
	}

	public void setLwPr(BigDecimal lwPr) {
		this.lwPr = lwPr;
	}

	@Column(name = "END_PR", precision = 20, scale = 8)
	public BigDecimal getEndPr() {
		return this.endPr;
	}

	public void setEndPr(BigDecimal endPr) {
		this.endPr = endPr;
	}

	@Column(name = "END_RT", precision = 20, scale = 8)
	public BigDecimal getEndRt() {
		return this.endRt;
	}

	public void setEndRt(BigDecimal endRt) {
		this.endRt = endRt;
	}

	@Column(name = "T_DD_TR_VL", precision = 20, scale = 8)
	public BigDecimal getTDdTrVl() {
		return this.TDdTrVl;
	}

	public void setTDdTrVl(BigDecimal TDdTrVl) {
		this.TDdTrVl = TDdTrVl;
	}

	@Column(name = "T_DD_TR_AMT", precision = 20, scale = 8)
	public BigDecimal getTDdTrAmt() {
		return this.TDdTrAmt;
	}

	public void setTDdTrAmt(BigDecimal TDdTrAmt) {
		this.TDdTrAmt = TDdTrAmt;
	}

	@Column(name = "OPN_INT_CTR_VL", precision = 20, scale = 8)
	public BigDecimal getOpnIntCtrVl() {
		return this.opnIntCtrVl;
	}

	public void setOpnIntCtrVl(BigDecimal opnIntCtrVl) {
		this.opnIntCtrVl = opnIntCtrVl;
	}

	@Column(name = "IMP_VOLA", precision = 20, scale = 8)
	public BigDecimal getImpVola() {
		return this.impVola;
	}

	public void setImpVola(BigDecimal impVola) {
		this.impVola = impVola;
	}

	@Column(name = "SETLMULT", precision = 20, scale = 8)
	public BigDecimal getSetlmult() {
		return this.setlmult;
	}

	public void setSetlmult(BigDecimal setlmult) {
		this.setlmult = setlmult;
	}

}
