package com.eugenefe.entity.takion;
// Generated Dec 19, 2016 6:36:07 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * MarketVariable generated by hbm2java
 */

@Entity
@Table(name = "MARKET_VARIABLE", schema = "TAKION79")
public class MarketVariable implements java.io.Serializable, Navigatable {

	private String mvId;
	private String mvName;
	private String mvType;
	private String productYn;
	private String rfYn;
	private String underlyingYn;

	public MarketVariable() {
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
		if (!(other instanceof MarketVariable))
			return false;
		MarketVariable castOther = (MarketVariable) other;

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