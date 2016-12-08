package com.eugenefe.ncm;
// Generated Dec 8, 2016 3:49:34 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * NcmErpTxIfrTemp generated by hbm2java
 */

@Entity
@IdClass(value = NcmErpTxIfrTempId.class)
@Table(name = "NCM_ERP_TX_IFR_TEMP", schema = "NCM")
public class NcmErpTxIfrTemp implements java.io.Serializable, Navigatable {

	private String cptlDivCd;
	private String finTxNo;
	private String bookingNo;
	private String issuerNm;
	private BigDecimal issuAmt;
	private String issuDate;
	private String matDate;
	private BigDecimal intRate;

	public NcmErpTxIfrTemp() {
	}

	@Id
	@Column(name = "CPTL_DIV_CD", nullable = false, length = 10)
	public String getCptlDivCd() {
		return this.cptlDivCd;
	}

	public void setCptlDivCd(String cptlDivCd) {
		this.cptlDivCd = cptlDivCd;
	}

	@Id
	@Column(name = "FIN_TX_NO", nullable = false, length = 20)
	public String getFinTxNo() {
		return this.finTxNo;
	}

	public void setFinTxNo(String finTxNo) {
		this.finTxNo = finTxNo;
	}

	@Column(name = "BOOKING_NO", length = 20)
	public String getBookingNo() {
		return this.bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;

	}

	@Column(name = "ISSUER_NM", length = 100)
	public String getIssuerNm() {
		return this.issuerNm;
	}

	public void setIssuerNm(String issuerNm) {
		this.issuerNm = issuerNm;

	}

	@Column(name = "ISSU_AMT", precision = 20)
	public BigDecimal getIssuAmt() {
		return this.issuAmt;
	}

	public void setIssuAmt(BigDecimal issuAmt) {
		this.issuAmt = issuAmt;

	}

	@Column(name = "ISSU_DATE", length = 8)
	public String getIssuDate() {
		return this.issuDate;
	}

	public void setIssuDate(String issuDate) {
		this.issuDate = issuDate;

	}

	@Column(name = "MAT_DATE", length = 8)
	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;

	}

	@Column(name = "INT_RATE", precision = 12, scale = 8)
	public BigDecimal getIntRate() {
		return this.intRate;
	}

	public void setIntRate(BigDecimal intRate) {
		this.intRate = intRate;

	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getCptlDivCd());
		buffer.append("#").append(getFinTxNo());

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
		if (!(other instanceof NcmErpTxIfrTemp))
			return false;
		NcmErpTxIfrTemp castOther = (NcmErpTxIfrTemp) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCptlDivCd() == null ? 0 : this.getCptlDivCd().hashCode());
		result = 37 * result + (getFinTxNo() == null ? 0 : this.getFinTxNo().hashCode());
		return result;
	}

}
