package com.eugenefe.entity.takion;
// Generated Dec 19, 2016 6:36:07 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.eugenefe.util.Navigatable;

/**
 * Bizunit generated by hbm2java
 */

@Entity
@Table(name = "BIZUNIT", schema = "TAKION79")
public class Bizunit implements java.io.Serializable, Navigatable {

	private String orgId;
	private Bizunit bizunit;
	private String orgName;
	private String orgRole;
	private String orgType;
	private String openDate;
	private String closeDate;
	private String useYn;
	private Set<Bizunit> bizunits = new HashSet<Bizunit>(0);

	public Bizunit() {
	}

	@Id
	@Column(name = "ORG_ID", unique = true, nullable = false, length = 20)
	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;

	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT_ORG_ID")
	public Bizunit getBizunit() {
		return this.bizunit;
	}

	public void setBizunit(Bizunit bizunit) {
		this.bizunit = bizunit;

	}

	@Column(name = "ORG_NAME", length = 50)
	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;

	}

	@Column(name = "ORG_ROLE", length = 50)
	public String getOrgRole() {
		return this.orgRole;
	}

	public void setOrgRole(String orgRole) {
		this.orgRole = orgRole;

	}

	@Column(name = "ORG_TYPE", length = 20)
	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;

	}

	@Column(name = "OPEN_DATE", length = 8)
	public String getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;

	}

	@Column(name = "CLOSE_DATE", length = 8)
	public String getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;

	}

	@Column(name = "USE_YN", length = 1)
	public String getUseYn() {
		return this.useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;

	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bizunit")
	public Set<Bizunit> getBizunits() {
		return this.bizunits;
	}

	public void setBizunits(Set<Bizunit> bizunits) {
		this.bizunits = bizunits;

	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bizunit")
//	public Set<Employee> getEmployees() {
//		return this.employees;
//	}
//
//	public void setEmployees(Set<Employee> employees) {
//		this.employees = employees;
//
//	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getOrgId());

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
		if (!(other instanceof Bizunit))
			return false;
		Bizunit castOther = (Bizunit) other;

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
