package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmKfrFundPrice generated by hbm2java
 */

@Entity
@IdClass(value = NcmKfrFundPriceId.class)
@Table(name = "NCM_KFR_FUND_PRICE", schema = "NCM")
public class NcmKfrFundPrice implements java.io.Serializable, Navigatable {

	private String tradeday;
	private String mgrcode;
	private String fundmgrcode;
	private String fundkrcode;
	private String fundname;
	private long issueamt;
	private Long issueunit;
	private long nav;
	private BigDecimal price;
	private BigDecimal taxprice;
	private BigDecimal befsettlprice;
	private BigDecimal befsettltaxprice;
	private BigDecimal modprice;
	private Long addissueamt;
	private Long tdredemamt;
	private Long profitsharingshare;
	private Long redemfeerefund;
	private Long pricecalunit;
	private BigDecimal unitprice;
	private String befsettleday;
	private String nextsettleday;
	private String evalcorpcode;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmKfrFundPrice() {
	}

	@Id
	@Column(name = "TRADEDAY", nullable = false, length = 8)
	public String getTradeday() {
		return this.tradeday;
	}

	public void setTradeday(String tradeday) {
		this.tradeday = tradeday;
	}

	@Id
	@Column(name = "MGRCODE", nullable = false, length = 3)
	public String getMgrcode() {
		return this.mgrcode;
	}

	public void setMgrcode(String mgrcode) {
		this.mgrcode = mgrcode;
	}

	@Id
	@Column(name = "FUNDMGRCODE", nullable = false, length = 30)
	public String getFundmgrcode() {
		return this.fundmgrcode;
	}

	public void setFundmgrcode(String fundmgrcode) {
		this.fundmgrcode = fundmgrcode;
	}

	@Column(name = "FUNDKRCODE", nullable = false, length = 12)
	public String getFundkrcode() {
		return this.fundkrcode;
	}

	public void setFundkrcode(String fundkrcode) {
		this.fundkrcode = fundkrcode;

	}

	@Column(name = "FUNDNAME", nullable = false, length = 200)
	public String getFundname() {
		return this.fundname;
	}

	public void setFundname(String fundname) {
		this.fundname = fundname;

	}

	@Column(name = "ISSUEAMT", nullable = false, precision = 18, scale = 0)
	public long getIssueamt() {
		return this.issueamt;
	}

	public void setIssueamt(long issueamt) {
		this.issueamt = issueamt;

	}

	@Column(name = "ISSUEUNIT", precision = 18, scale = 0)
	public Long getIssueunit() {
		return this.issueunit;
	}

	public void setIssueunit(Long issueunit) {
		this.issueunit = issueunit;

	}

	@Column(name = "NAV", nullable = false, precision = 18, scale = 0)
	public long getNav() {
		return this.nav;
	}

	public void setNav(long nav) {
		this.nav = nav;

	}

	@Column(name = "PRICE", nullable = false, precision = 18)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;

	}

	@Column(name = "TAXPRICE", precision = 18)
	public BigDecimal getTaxprice() {
		return this.taxprice;
	}

	public void setTaxprice(BigDecimal taxprice) {
		this.taxprice = taxprice;

	}

	@Column(name = "BEFSETTLPRICE", precision = 18)
	public BigDecimal getBefsettlprice() {
		return this.befsettlprice;
	}

	public void setBefsettlprice(BigDecimal befsettlprice) {
		this.befsettlprice = befsettlprice;

	}

	@Column(name = "BEFSETTLTAXPRICE", precision = 18)
	public BigDecimal getBefsettltaxprice() {
		return this.befsettltaxprice;
	}

	public void setBefsettltaxprice(BigDecimal befsettltaxprice) {
		this.befsettltaxprice = befsettltaxprice;

	}

	@Column(name = "MODPRICE", nullable = false, precision = 18)
	public BigDecimal getModprice() {
		return this.modprice;
	}

	public void setModprice(BigDecimal modprice) {
		this.modprice = modprice;

	}

	@Column(name = "ADDISSUEAMT", precision = 18, scale = 0)
	public Long getAddissueamt() {
		return this.addissueamt;
	}

	public void setAddissueamt(Long addissueamt) {
		this.addissueamt = addissueamt;

	}

	@Column(name = "TDREDEMAMT", precision = 18, scale = 0)
	public Long getTdredemamt() {
		return this.tdredemamt;
	}

	public void setTdredemamt(Long tdredemamt) {
		this.tdredemamt = tdredemamt;

	}

	@Column(name = "PROFITSHARINGSHARE", precision = 18, scale = 0)
	public Long getProfitsharingshare() {
		return this.profitsharingshare;
	}

	public void setProfitsharingshare(Long profitsharingshare) {
		this.profitsharingshare = profitsharingshare;

	}

	@Column(name = "REDEMFEEREFUND", precision = 18, scale = 0)
	public Long getRedemfeerefund() {
		return this.redemfeerefund;
	}

	public void setRedemfeerefund(Long redemfeerefund) {
		this.redemfeerefund = redemfeerefund;

	}

	@Column(name = "PRICECALUNIT", precision = 18, scale = 0)
	public Long getPricecalunit() {
		return this.pricecalunit;
	}

	public void setPricecalunit(Long pricecalunit) {
		this.pricecalunit = pricecalunit;

	}

	@Column(name = "UNITPRICE", precision = 18)
	public BigDecimal getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;

	}

	@Column(name = "BEFSETTLEDAY", length = 8)
	public String getBefsettleday() {
		return this.befsettleday;
	}

	public void setBefsettleday(String befsettleday) {
		this.befsettleday = befsettleday;

	}

	@Column(name = "NEXTSETTLEDAY", length = 8)
	public String getNextsettleday() {
		return this.nextsettleday;
	}

	public void setNextsettleday(String nextsettleday) {
		this.nextsettleday = nextsettleday;

	}

	@Column(name = "EVALCORPCODE", nullable = false, length = 4)
	public String getEvalcorpcode() {
		return this.evalcorpcode;
	}

	public void setEvalcorpcode(String evalcorpcode) {
		this.evalcorpcode = evalcorpcode;

	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRE_DTTM", length = 7)
	public Date getCreDttm() {
		return this.creDttm;
	}

	public void setCreDttm(Date creDttm) {
		this.creDttm = creDttm;

	}

	@Column(name = "CRE_EMP_NO", length = 6)
	public String getCreEmpNo() {
		return this.creEmpNo;
	}

	public void setCreEmpNo(String creEmpNo) {
		this.creEmpNo = creEmpNo;

	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CHG_DTTM", length = 7)
	public Date getChgDttm() {
		return this.chgDttm;
	}

	public void setChgDttm(Date chgDttm) {
		this.chgDttm = chgDttm;

	}

	@Column(name = "CHG_EMP_NO", length = 6)
	public String getChgEmpNo() {
		return this.chgEmpNo;
	}

	public void setChgEmpNo(String chgEmpNo) {
		this.chgEmpNo = chgEmpNo;

	}

	@Column(name = "WORKFILENAME", length = 30)
	public String getWorkfilename() {
		return this.workfilename;
	}

	public void setWorkfilename(String workfilename) {
		this.workfilename = workfilename;

	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getTradeday());
		buffer.append("#").append(getMgrcode());
		buffer.append("#").append(getFundmgrcode());

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
		if (!(other instanceof NcmKfrFundPrice))
			return false;
		NcmKfrFundPrice castOther = (NcmKfrFundPrice) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTradeday() == null ? 0 : this.getTradeday().hashCode());
		result = 37 * result + (getMgrcode() == null ? 0 : this.getMgrcode().hashCode());
		result = 37 * result + (getFundmgrcode() == null ? 0 : this.getFundmgrcode().hashCode());
		return result;
	}

}
