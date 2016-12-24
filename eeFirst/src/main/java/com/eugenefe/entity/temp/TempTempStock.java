package com.eugenefe.entity.temp;
// Generated Dec 22, 2016 11:17:22 AM by Hibernate Tools 5.2.0.CR1 with Custom Template_takion!!!!!! 

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.eugenefe.util.Navigatable;

/**
 * Stock generated by hbm2java
 */

@Entity
@Table(name = "STOCK", schema = "TAKION79")
public class TempTempStock implements java.io.Serializable, Navigatable, TempMarketVari {

	private String mvId;
	private String stockType;
	private String exchangeId;
	private Character isListed;
	private Long numShares;
	private String issuerId;
	private Long faceAmt;
	private Character useAsUnderlyingYn;
	private String sourceTable;
	private String userName;
	private String lastUpdated;
	private BigDecimal versionNo;

	public TempTempStock() {
	}

	@Id
	@Column(name = "MV_ID", unique = true, nullable = false, length = 20)
	public String getMvId() {
		return this.mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;

	}

	@Column(name = "STOCK_TYPE", length = 10)
	public String getStockType() {
		return this.stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;

	}

	@Column(name = "EXCHANGE_ID", length = 20)
	public String getExchangeId() {
		return this.exchangeId;
	}

	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;

	}

	@Column(name = "IS_LISTED", length = 1)
	public Character getIsListed() {
		return this.isListed;
	}

	public void setIsListed(Character isListed) {
		this.isListed = isListed;

	}

	@Column(name = "NUM_SHARES", precision = 10, scale = 0)
	public Long getNumShares() {
		return this.numShares;
	}

	public void setNumShares(Long numShares) {
		this.numShares = numShares;

	}

	@Column(name = "ISSUER_ID", length = 30)
	public String getIssuerId() {
		return this.issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;

	}

	@Column(name = "FACE_AMT", precision = 10, scale = 0)
	public Long getFaceAmt() {
		return this.faceAmt;
	}

	public void setFaceAmt(Long faceAmt) {
		this.faceAmt = faceAmt;

	}

	@Column(name = "USE_AS_UNDERLYING_YN", length = 1)
	public Character getUseAsUnderlyingYn() {
		return this.useAsUnderlyingYn;
	}

	public void setUseAsUnderlyingYn(Character useAsUnderlyingYn) {
		this.useAsUnderlyingYn = useAsUnderlyingYn;

	}

	@Column(name = "SOURCE_TABLE", length = 50)
	public String getSourceTable() {
		return this.sourceTable;
	}

	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;

	}

	@Column(name = "USER_NAME", length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;

	}

	@Column(name = "LAST_UPDATED", length = 8)
	public String getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;

	}

	@Column(name = "VERSION_NO", precision = 22, scale = 0)
	public BigDecimal getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(BigDecimal versionNo) {
		this.versionNo = versionNo;

	}

	private TempTempMarketVariable stockVari;
	
	@OneToOne(optional=false)
	@JoinColumn(name ="MV_ID")
	public TempTempMarketVariable getStockVari() {
		return stockVari;
	}

	public void setStockVari(TempTempMarketVariable stockVari) {
		this.stockVari = stockVari;
	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
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
		if (!(other instanceof TempTempStock))
			return false;
		TempTempStock castOther = (TempTempStock) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (idString() == null ? 0 : this.idString().hashCode());
		return result;
	}

}
