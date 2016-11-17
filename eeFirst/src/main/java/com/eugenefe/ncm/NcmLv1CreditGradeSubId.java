package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NcmLv1CreditGradeSubId generated by hbm2java
 */
@Embeddable
public class NcmLv1CreditGradeSubId implements java.io.Serializable {

	private String corpNo;
	private String creditTypeCd;

	public NcmLv1CreditGradeSubId() {
	}

	public NcmLv1CreditGradeSubId(String corpNo, String creditTypeCd) {
		this.corpNo = corpNo;
		this.creditTypeCd = creditTypeCd;
	}

	@Column(name = "CORP_NO", nullable = false, length = 20)
	public String getCorpNo() {
		return this.corpNo;
	}

	public void setCorpNo(String corpNo) {
		this.corpNo = corpNo;
	}

	@Column(name = "CREDIT_TYPE_CD", nullable = false, length = 10)
	public String getCreditTypeCd() {
		return this.creditTypeCd;
	}

	public void setCreditTypeCd(String creditTypeCd) {
		this.creditTypeCd = creditTypeCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmLv1CreditGradeSubId))
			return false;
		NcmLv1CreditGradeSubId castOther = (NcmLv1CreditGradeSubId) other;

		return ((this.getCorpNo() == castOther.getCorpNo()) || (this.getCorpNo() != null
				&& castOther.getCorpNo() != null && this.getCorpNo().equals(castOther.getCorpNo())))
				&& ((this.getCreditTypeCd() == castOther.getCreditTypeCd())
						|| (this.getCreditTypeCd() != null && castOther.getCreditTypeCd() != null
								&& this.getCreditTypeCd().equals(castOther.getCreditTypeCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCorpNo() == null ? 0 : this.getCorpNo().hashCode());
		result = 37 * result + (getCreditTypeCd() == null ? 0 : this.getCreditTypeCd().hashCode());
		return result;
	}

}