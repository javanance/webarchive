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
 * NcmLv2PortReturn generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV2_PORT_RETURN", schema = "NCM")
public class NcmLv2PortReturn implements java.io.Serializable {

	private NcmLv2PortReturnId id;
	private BigDecimal m01Yield;
	private BigDecimal m03Yield;
	private BigDecimal m06Yield;
	private BigDecimal m12Yield;
	private BigDecimal m24Yield;
	private BigDecimal m36Yield;
	private BigDecimal ytdYield;
	private BigDecimal qtdYield;
	private BigDecimal mtdYield;
	private BigDecimal m01Awght;
	private BigDecimal m03Awght;
	private BigDecimal m06Awght;
	private BigDecimal m12Awght;
	private BigDecimal m24Awght;
	private BigDecimal m36Awght;
	private BigDecimal ytdAwght;
	private BigDecimal qtdAwght;
	private BigDecimal mtdAwght;
	private BigDecimal m01Pl;
	private BigDecimal m03Pl;
	private BigDecimal m06Pl;
	private BigDecimal m12Pl;
	private BigDecimal m24Pl;
	private BigDecimal m36Pl;
	private BigDecimal ytdPl;
	private BigDecimal qtdPl;
	private BigDecimal mtdPl;
	private Integer m01Cnt;
	private Integer m03Cnt;
	private Integer m06Cnt;
	private Integer m12Cnt;
	private Integer m24Cnt;
	private Integer m36Cnt;
	private Integer ytdCnt;
	private Integer qtdCnt;
	private Integer mtdCnt;
	private BigDecimal fy1Yield;
	private BigDecimal fy2Yield;
	private BigDecimal fy3Yield;
	private String srcTable;
	private String updateId;
	private Date lastUpdate;

	public NcmLv2PortReturn() {
	}

	public NcmLv2PortReturn(NcmLv2PortReturnId id) {
		this.id = id;
	}

	public NcmLv2PortReturn(NcmLv2PortReturnId id, BigDecimal m01Yield, BigDecimal m03Yield, BigDecimal m06Yield,
			BigDecimal m12Yield, BigDecimal m24Yield, BigDecimal m36Yield, BigDecimal ytdYield, BigDecimal qtdYield,
			BigDecimal mtdYield, BigDecimal m01Awght, BigDecimal m03Awght, BigDecimal m06Awght, BigDecimal m12Awght,
			BigDecimal m24Awght, BigDecimal m36Awght, BigDecimal ytdAwght, BigDecimal qtdAwght, BigDecimal mtdAwght,
			BigDecimal m01Pl, BigDecimal m03Pl, BigDecimal m06Pl, BigDecimal m12Pl, BigDecimal m24Pl, BigDecimal m36Pl,
			BigDecimal ytdPl, BigDecimal qtdPl, BigDecimal mtdPl, Integer m01Cnt, Integer m03Cnt, Integer m06Cnt,
			Integer m12Cnt, Integer m24Cnt, Integer m36Cnt, Integer ytdCnt, Integer qtdCnt, Integer mtdCnt,
			BigDecimal fy1Yield, BigDecimal fy2Yield, BigDecimal fy3Yield, String srcTable, String updateId,
			Date lastUpdate) {
		this.id = id;
		this.m01Yield = m01Yield;
		this.m03Yield = m03Yield;
		this.m06Yield = m06Yield;
		this.m12Yield = m12Yield;
		this.m24Yield = m24Yield;
		this.m36Yield = m36Yield;
		this.ytdYield = ytdYield;
		this.qtdYield = qtdYield;
		this.mtdYield = mtdYield;
		this.m01Awght = m01Awght;
		this.m03Awght = m03Awght;
		this.m06Awght = m06Awght;
		this.m12Awght = m12Awght;
		this.m24Awght = m24Awght;
		this.m36Awght = m36Awght;
		this.ytdAwght = ytdAwght;
		this.qtdAwght = qtdAwght;
		this.mtdAwght = mtdAwght;
		this.m01Pl = m01Pl;
		this.m03Pl = m03Pl;
		this.m06Pl = m06Pl;
		this.m12Pl = m12Pl;
		this.m24Pl = m24Pl;
		this.m36Pl = m36Pl;
		this.ytdPl = ytdPl;
		this.qtdPl = qtdPl;
		this.mtdPl = mtdPl;
		this.m01Cnt = m01Cnt;
		this.m03Cnt = m03Cnt;
		this.m06Cnt = m06Cnt;
		this.m12Cnt = m12Cnt;
		this.m24Cnt = m24Cnt;
		this.m36Cnt = m36Cnt;
		this.ytdCnt = ytdCnt;
		this.qtdCnt = qtdCnt;
		this.mtdCnt = mtdCnt;
		this.fy1Yield = fy1Yield;
		this.fy2Yield = fy2Yield;
		this.fy3Yield = fy3Yield;
		this.srcTable = srcTable;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "cptlDivCd", column = @Column(name = "CPTL_DIV_CD", nullable = false, length = 10)),
			@AttributeOverride(name = "yieldLclssCd", column = @Column(name = "YIELD_LCLSS_CD", nullable = false, length = 10)),
			@AttributeOverride(name = "yieldDivCd", column = @Column(name = "YIELD_DIV_CD", nullable = false, length = 20)),
			@AttributeOverride(name = "prodTypeCd", column = @Column(name = "PROD_TYPE_CD", nullable = false, length = 10)) })
	public NcmLv2PortReturnId getId() {
		return this.id;
	}

	public void setId(NcmLv2PortReturnId id) {
		this.id = id;
	}

	@Column(name = "M01_YIELD", precision = 12, scale = 8)
	public BigDecimal getM01Yield() {
		return this.m01Yield;
	}

	public void setM01Yield(BigDecimal m01Yield) {
		this.m01Yield = m01Yield;
	}

	@Column(name = "M03_YIELD", precision = 12, scale = 8)
	public BigDecimal getM03Yield() {
		return this.m03Yield;
	}

	public void setM03Yield(BigDecimal m03Yield) {
		this.m03Yield = m03Yield;
	}

	@Column(name = "M06_YIELD", precision = 12, scale = 8)
	public BigDecimal getM06Yield() {
		return this.m06Yield;
	}

	public void setM06Yield(BigDecimal m06Yield) {
		this.m06Yield = m06Yield;
	}

	@Column(name = "M12_YIELD", precision = 12, scale = 8)
	public BigDecimal getM12Yield() {
		return this.m12Yield;
	}

	public void setM12Yield(BigDecimal m12Yield) {
		this.m12Yield = m12Yield;
	}

	@Column(name = "M24_YIELD", precision = 12, scale = 8)
	public BigDecimal getM24Yield() {
		return this.m24Yield;
	}

	public void setM24Yield(BigDecimal m24Yield) {
		this.m24Yield = m24Yield;
	}

	@Column(name = "M36_YIELD", precision = 12, scale = 8)
	public BigDecimal getM36Yield() {
		return this.m36Yield;
	}

	public void setM36Yield(BigDecimal m36Yield) {
		this.m36Yield = m36Yield;
	}

	@Column(name = "YTD_YIELD", precision = 12, scale = 8)
	public BigDecimal getYtdYield() {
		return this.ytdYield;
	}

	public void setYtdYield(BigDecimal ytdYield) {
		this.ytdYield = ytdYield;
	}

	@Column(name = "QTD_YIELD", precision = 12, scale = 8)
	public BigDecimal getQtdYield() {
		return this.qtdYield;
	}

	public void setQtdYield(BigDecimal qtdYield) {
		this.qtdYield = qtdYield;
	}

	@Column(name = "MTD_YIELD", precision = 12, scale = 8)
	public BigDecimal getMtdYield() {
		return this.mtdYield;
	}

	public void setMtdYield(BigDecimal mtdYield) {
		this.mtdYield = mtdYield;
	}

	@Column(name = "M01_AWGHT", precision = 12, scale = 8)
	public BigDecimal getM01Awght() {
		return this.m01Awght;
	}

	public void setM01Awght(BigDecimal m01Awght) {
		this.m01Awght = m01Awght;
	}

	@Column(name = "M03_AWGHT", precision = 12, scale = 8)
	public BigDecimal getM03Awght() {
		return this.m03Awght;
	}

	public void setM03Awght(BigDecimal m03Awght) {
		this.m03Awght = m03Awght;
	}

	@Column(name = "M06_AWGHT", precision = 12, scale = 8)
	public BigDecimal getM06Awght() {
		return this.m06Awght;
	}

	public void setM06Awght(BigDecimal m06Awght) {
		this.m06Awght = m06Awght;
	}

	@Column(name = "M12_AWGHT", precision = 12, scale = 8)
	public BigDecimal getM12Awght() {
		return this.m12Awght;
	}

	public void setM12Awght(BigDecimal m12Awght) {
		this.m12Awght = m12Awght;
	}

	@Column(name = "M24_AWGHT", precision = 12, scale = 8)
	public BigDecimal getM24Awght() {
		return this.m24Awght;
	}

	public void setM24Awght(BigDecimal m24Awght) {
		this.m24Awght = m24Awght;
	}

	@Column(name = "M36_AWGHT", precision = 12, scale = 8)
	public BigDecimal getM36Awght() {
		return this.m36Awght;
	}

	public void setM36Awght(BigDecimal m36Awght) {
		this.m36Awght = m36Awght;
	}

	@Column(name = "YTD_AWGHT", precision = 12, scale = 8)
	public BigDecimal getYtdAwght() {
		return this.ytdAwght;
	}

	public void setYtdAwght(BigDecimal ytdAwght) {
		this.ytdAwght = ytdAwght;
	}

	@Column(name = "QTD_AWGHT", precision = 12, scale = 8)
	public BigDecimal getQtdAwght() {
		return this.qtdAwght;
	}

	public void setQtdAwght(BigDecimal qtdAwght) {
		this.qtdAwght = qtdAwght;
	}

	@Column(name = "MTD_AWGHT", precision = 12, scale = 8)
	public BigDecimal getMtdAwght() {
		return this.mtdAwght;
	}

	public void setMtdAwght(BigDecimal mtdAwght) {
		this.mtdAwght = mtdAwght;
	}

	@Column(name = "M01_PL", precision = 22, scale = 0)
	public BigDecimal getM01Pl() {
		return this.m01Pl;
	}

	public void setM01Pl(BigDecimal m01Pl) {
		this.m01Pl = m01Pl;
	}

	@Column(name = "M03_PL", precision = 22, scale = 0)
	public BigDecimal getM03Pl() {
		return this.m03Pl;
	}

	public void setM03Pl(BigDecimal m03Pl) {
		this.m03Pl = m03Pl;
	}

	@Column(name = "M06_PL", precision = 22, scale = 0)
	public BigDecimal getM06Pl() {
		return this.m06Pl;
	}

	public void setM06Pl(BigDecimal m06Pl) {
		this.m06Pl = m06Pl;
	}

	@Column(name = "M12_PL", precision = 22, scale = 0)
	public BigDecimal getM12Pl() {
		return this.m12Pl;
	}

	public void setM12Pl(BigDecimal m12Pl) {
		this.m12Pl = m12Pl;
	}

	@Column(name = "M24_PL", precision = 22, scale = 0)
	public BigDecimal getM24Pl() {
		return this.m24Pl;
	}

	public void setM24Pl(BigDecimal m24Pl) {
		this.m24Pl = m24Pl;
	}

	@Column(name = "M36_PL", precision = 22, scale = 0)
	public BigDecimal getM36Pl() {
		return this.m36Pl;
	}

	public void setM36Pl(BigDecimal m36Pl) {
		this.m36Pl = m36Pl;
	}

	@Column(name = "YTD_PL", precision = 22, scale = 0)
	public BigDecimal getYtdPl() {
		return this.ytdPl;
	}

	public void setYtdPl(BigDecimal ytdPl) {
		this.ytdPl = ytdPl;
	}

	@Column(name = "QTD_PL", precision = 22, scale = 0)
	public BigDecimal getQtdPl() {
		return this.qtdPl;
	}

	public void setQtdPl(BigDecimal qtdPl) {
		this.qtdPl = qtdPl;
	}

	@Column(name = "MTD_PL", precision = 22, scale = 0)
	public BigDecimal getMtdPl() {
		return this.mtdPl;
	}

	public void setMtdPl(BigDecimal mtdPl) {
		this.mtdPl = mtdPl;
	}

	@Column(name = "M01_CNT", precision = 5, scale = 0)
	public Integer getM01Cnt() {
		return this.m01Cnt;
	}

	public void setM01Cnt(Integer m01Cnt) {
		this.m01Cnt = m01Cnt;
	}

	@Column(name = "M03_CNT", precision = 5, scale = 0)
	public Integer getM03Cnt() {
		return this.m03Cnt;
	}

	public void setM03Cnt(Integer m03Cnt) {
		this.m03Cnt = m03Cnt;
	}

	@Column(name = "M06_CNT", precision = 5, scale = 0)
	public Integer getM06Cnt() {
		return this.m06Cnt;
	}

	public void setM06Cnt(Integer m06Cnt) {
		this.m06Cnt = m06Cnt;
	}

	@Column(name = "M12_CNT", precision = 5, scale = 0)
	public Integer getM12Cnt() {
		return this.m12Cnt;
	}

	public void setM12Cnt(Integer m12Cnt) {
		this.m12Cnt = m12Cnt;
	}

	@Column(name = "M24_CNT", precision = 5, scale = 0)
	public Integer getM24Cnt() {
		return this.m24Cnt;
	}

	public void setM24Cnt(Integer m24Cnt) {
		this.m24Cnt = m24Cnt;
	}

	@Column(name = "M36_CNT", precision = 5, scale = 0)
	public Integer getM36Cnt() {
		return this.m36Cnt;
	}

	public void setM36Cnt(Integer m36Cnt) {
		this.m36Cnt = m36Cnt;
	}

	@Column(name = "YTD_CNT", precision = 5, scale = 0)
	public Integer getYtdCnt() {
		return this.ytdCnt;
	}

	public void setYtdCnt(Integer ytdCnt) {
		this.ytdCnt = ytdCnt;
	}

	@Column(name = "QTD_CNT", precision = 5, scale = 0)
	public Integer getQtdCnt() {
		return this.qtdCnt;
	}

	public void setQtdCnt(Integer qtdCnt) {
		this.qtdCnt = qtdCnt;
	}

	@Column(name = "MTD_CNT", precision = 5, scale = 0)
	public Integer getMtdCnt() {
		return this.mtdCnt;
	}

	public void setMtdCnt(Integer mtdCnt) {
		this.mtdCnt = mtdCnt;
	}

	@Column(name = "FY1_YIELD", precision = 12, scale = 8)
	public BigDecimal getFy1Yield() {
		return this.fy1Yield;
	}

	public void setFy1Yield(BigDecimal fy1Yield) {
		this.fy1Yield = fy1Yield;
	}

	@Column(name = "FY2_YIELD", precision = 12, scale = 8)
	public BigDecimal getFy2Yield() {
		return this.fy2Yield;
	}

	public void setFy2Yield(BigDecimal fy2Yield) {
		this.fy2Yield = fy2Yield;
	}

	@Column(name = "FY3_YIELD", precision = 12, scale = 8)
	public BigDecimal getFy3Yield() {
		return this.fy3Yield;
	}

	public void setFy3Yield(BigDecimal fy3Yield) {
		this.fy3Yield = fy3Yield;
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