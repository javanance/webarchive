package com.eugenefe.entity.temp;
// Generated Dec 19, 2016 6:36:07 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Etf generated by hbm2java
 */

@Entity(name ="TempEtf")
@Table(name = "ETF", schema = "TAKION79")
public class TempEtf implements java.io.Serializable, Navigatable {

	private String etfId;
	private String etfName;
	private String isinCd;
	private BigDecimal bmCoefficient;
	private Long numPerCu;
	private Long numShares;
	private BigDecimal totAmt;
	private String sourceTable;
	private String userName;
	private String lastUpdated;
	private BigDecimal versionNo;

	public TempEtf() {
	}

	@Id
//	@Column(name = "ETF_ID", unique = true, nullable = false, length = 20)
	public String getEtfId() {
		return this.etfId;
	}

	public void setEtfId(String etfId) {
		this.etfId = etfId;

	}


	@Column(name = "ETF_NAME", length = 50)
	public String getEtfName() {
		return this.etfName;
	}

	public void setEtfName(String etfName) {
		this.etfName = etfName;

	}

	@Column(name = "ISIN_CD", length = 20)
	public String getIsinCd() {
		return this.isinCd;
	}

	public void setIsinCd(String isinCd) {
		this.isinCd = isinCd;

	}

	@Column(name = "BM_COEFFICIENT", precision = 10, scale = 4)
	public BigDecimal getBmCoefficient() {
		return this.bmCoefficient;
	}

	public void setBmCoefficient(BigDecimal bmCoefficient) {
		this.bmCoefficient = bmCoefficient;

	}

	@Column(name = "NUM_PER_CU", precision = 10, scale = 0)
	public Long getNumPerCu() {
		return this.numPerCu;
	}

	public void setNumPerCu(Long numPerCu) {
		this.numPerCu = numPerCu;

	}

	@Column(name = "NUM_SHARES", precision = 10, scale = 0)
	public Long getNumShares() {
		return this.numShares;
	}

	public void setNumShares(Long numShares) {
		this.numShares = numShares;

	}

	@Column(name = "TOT_AMT", scale = 0)
	public BigDecimal getTotAmt() {
		return this.totAmt;
	}

	public void setTotAmt(BigDecimal totAmt) {
		this.totAmt = totAmt;

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

	private TempMarketVariable mVari;
	@MapsId()
	@OneToOne(mappedBy = "etf")
//	@JoinColumn(name ="MV_ID", referencedColumnName ="MV_ID", insertable =false, updatable= false, nullable=true)
	@JoinColumn(name ="ETF_ID")
	public TempMarketVariable getmVari() {
		return mVari;
	}

	public void setmVari(TempMarketVariable mVari) {
		this.mVari = mVari;
	}
	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getEtfId());

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
		if (!(other instanceof TempEtf))
			return false;
		TempEtf castOther = (TempEtf) other;

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
