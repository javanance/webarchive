package com.eugenefe.entity.temp;
// Generated Dec 19, 2016 6:36:07 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.eugenefe.util.Navigatable;

/**
 * MarketVariable generated by hbm2java
 */

@Entity
@Table(name = "MARKET_VARIABLE", schema = "TAKION79")
//@SecondaryTable(name="RISK_FACTOR", pkJoinColumns = @PrimaryKeyJoinColumn(name ="RF_ID"))
public class TempTempMarketVariable implements java.io.Serializable, Navigatable, TempMarketVari{

	private String mvId;
	private String mvName;
	private String mvType;
	private String productYn;
	private String rfYn;
	private String underlyingYn;


	public TempTempMarketVariable() {
	}

	@Id
	@Column(name = "MV_ID", unique = true, nullable = false, length = 20)
	public String getMvId() {
		return this.mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;

	}

	@Column(name = "MV_NAME", length = 50)
	public String getMvName() {
		return this.mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;

	}

	@Column(name = "MV_TYPE", length = 10)
	public String getMvType() {
		return this.mvType;
	}

	public void setMvType(String mvType) {
		this.mvType = mvType;

	}

	@Column(name = "PRODUCT_YN", length = 1)
	public String getProductYn() {
		return this.productYn;
	}

	public void setProductYn(String productYn) {
		this.productYn = productYn;

	}

	@Column(name = "RF_YN", length = 1)
	public String getRfYn() {
		return this.rfYn;
	}

	public void setRfYn(String rfYn) {
		this.rfYn = rfYn;

	}

	@Column(name = "UNDERLYING_YN", length = 1)
	public String getUnderlyingYn() {
		return this.underlyingYn;
	}

	public void setUnderlyingYn(String underlyingYn) {
		this.underlyingYn = underlyingYn;

	}
//	private List<Bond> bondList = new ArrayList<Bond>();
//	@ManyToOne
//	@JoinColumn(name = "MV_ID" , insertable=false, updatable=false )
//	public Bond getBond() {
//		return bond;
//	}
//
//	public void setBond(Bond bond) {
//		this.bond = bond;
//	}
	
//	@OneToMany(fetch=FetchType.EAGER)
//	@JoinTable(name ="BOND", joinColumns = @JoinColumn(name ="MV_ID") , inverseJoinColumns = @JoinColumn(name ="MV_ID"))
//	@JoinColumn(name ="MV_ID",referencedColumnName ="MV_ID")
//	public List<Bond> getBondList() {
//		return bondList;
//	}
//
//	public void setBondList(List<Bond> bondList) {
//		this.bondList = bondList;
//	}
	
	
//	TO_DO
	private TempTempBond bd;

//	@LazyToOne(LazyToOneOption.NO_PROXY)
	@OneToOne(fetch =FetchType.LAZY , optional= true, mappedBy="mVari")
//	@JoinColumn(name ="MV_ID" , referencedColumnName ="MV_ID")
	public TempTempBond getBd() {
		return bd;
	}

	public void setBd(TempTempBond bd) {
		this.bd = bd;
	}
//	
	private TempTempStock stock;
	@OneToOne(fetch =FetchType.LAZY , optional= true, mappedBy="stockVari")
	public TempTempStock getStock() {
		return stock;
	}

	public void setStock(TempTempStock stock) {
		this.stock = stock;
	}
//	
//	private TempEtf etf;
//	
//	@OneToOne(fetch =FetchType.LAZY , optional= true)
//	@JoinColumn(name ="MV_ID",  nullable=true)
//	public TempEtf getEtf() {
//		return etf;
//	}
//
//	public void setEtf(TempEtf etf) {
//		this.etf = etf;
//	}

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
		if (!(other instanceof TempTempMarketVariable))
			return false;
		TempTempMarketVariable castOther = (TempTempMarketVariable) other;

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