package com.eugenefe.entities;
// Generated May 29, 2016 10:08:33 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OdsIsinMaster generated by hbm2java
 */
@Entity
@Table(name = "ods_isin_master")
public class OdsIsinMaster implements java.io.Serializable {

	private String isin;
	private String prodType;
	private String mvName;
	private String issuerId;
	private String issueDate;
	private String maturityDate;
	private String listType;
	private String listDate;
	private String genDate;
	private Date updateDate;

	public OdsIsinMaster() {
	}

	public OdsIsinMaster(String isin, Date updateDate) {
		this.isin = isin;
		this.updateDate = updateDate;
	}

	public OdsIsinMaster(String isin, String prodType, String mvName, String issuerId, String issueDate,
			String maturityDate, String listType, String listDate, String genDate, Date updateDate) {
		this.isin = isin;
		this.prodType = prodType;
		this.mvName = mvName;
		this.issuerId = issuerId;
		this.issueDate = issueDate;
		this.maturityDate = maturityDate;
		this.listType = listType;
		this.listDate = listDate;
		this.genDate = genDate;
		this.updateDate = updateDate;
	}

	@Id

	@Column(name = "ISIN", unique = true, nullable = false, length = 20)
	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	@Column(name = "PROD_TYPE", length = 10)
	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	@Column(name = "MV_NAME", length = 100)
	public String getMvName() {
		return this.mvName;
	}

	public void setMvName(String mvName) {
		this.mvName = mvName;
	}

	@Column(name = "ISSUER_ID", length = 100)
	public String getIssuerId() {
		return this.issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	@Column(name = "ISSUE_DATE", length = 8)
	public String getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	@Column(name = "MATURITY_DATE", length = 8)
	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	@Column(name = "LIST_TYPE", length = 10)
	public String getListType() {
		return this.listType;
	}

	public void setListType(String listType) {
		this.listType = listType;
	}

	@Column(name = "LIST_DATE", length = 8)
	public String getListDate() {
		return this.listDate;
	}

	public void setListDate(String listDate) {
		this.listDate = listDate;
	}

	@Column(name = "GEN_DATE", length = 8)
	public String getGenDate() {
		return this.genDate;
	}

	public void setGenDate(String genDate) {
		this.genDate = genDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE", nullable = false, length = 19)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
