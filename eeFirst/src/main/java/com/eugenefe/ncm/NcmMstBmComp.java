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
 * NcmMstBmComp generated by hbm2java
 */
@Entity
@Table(name = "NCM_MST_BM_COMP", schema = "NCM")
public class NcmMstBmComp implements java.io.Serializable {

	private NcmMstBmCompId id;
	private BigDecimal subBmWght;
	private String applyEndDate;
	private String bmCreaTypeCd;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmMstBmComp() {
	}

	public NcmMstBmComp(NcmMstBmCompId id, String applyEndDate) {
		this.id = id;
		this.applyEndDate = applyEndDate;
	}

	public NcmMstBmComp(NcmMstBmCompId id, BigDecimal subBmWght, String applyEndDate, String bmCreaTypeCd,
			String srcTable, String updateId, Date lastUpdate) {
		this.id = id;
		this.subBmWght = subBmWght;
		this.applyEndDate = applyEndDate;
		this.bmCreaTypeCd = bmCreaTypeCd;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "bmId", column = @Column(name = "BM_ID", nullable = false, length = 20)),
			@AttributeOverride(name = "applyStDate", column = @Column(name = "APPLY_ST_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "subBmId", column = @Column(name = "SUB_BM_ID", nullable = false, length = 20)) })
	public NcmMstBmCompId getId() {
		return this.id;
	}

	public void setId(NcmMstBmCompId id) {
		this.id = id;
	}

	@Column(name = "SUB_BM_WGHT", precision = 10, scale = 5)
	public BigDecimal getSubBmWght() {
		return this.subBmWght;
	}

	public void setSubBmWght(BigDecimal subBmWght) {
		this.subBmWght = subBmWght;
	}

	@Column(name = "APPLY_END_DATE", nullable = false, length = 8)
	public String getApplyEndDate() {
		return this.applyEndDate;
	}

	public void setApplyEndDate(String applyEndDate) {
		this.applyEndDate = applyEndDate;
	}

	@Column(name = "BM_CREA_TYPE_CD", length = 10)
	public String getBmCreaTypeCd() {
		return this.bmCreaTypeCd;
	}

	public void setBmCreaTypeCd(String bmCreaTypeCd) {
		this.bmCreaTypeCd = bmCreaTypeCd;
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