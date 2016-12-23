package com.eugenefe.entity.takion;
// Generated Dec 19, 2016 6:36:07 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import javax.persistence.Id;
import javax.persistence.Transient;

import com.eugenefe.enums.model.EBondCfType;
import com.eugenefe.enums.model.ECompound;
import com.eugenefe.enums.model.EDayCount;
import com.eugenefe.util.Navigatable;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Bond generated by hbm2java
 */

@Entity
@Table(name = "BOND", schema = "TAKION79")
public class Bond implements java.io.Serializable, Navigatable {

	private String mvId;
	private String issuerId;
	private Long faceAmt;
	private BigDecimal totalAmt;
	private String issueDate;
	private String maturityDate;
	private BigDecimal couponRate;
	private String intTerm;
	private ECompound compoundMtd;
	private String daycountMtd;
	private String bondCfType;
	private String priorityCd;
	private String securitizationCd;
	private String creditRatingCd;
	private String currCd;
	private BigDecimal premiumAtEnd;
	private String bondType;
	private BigDecimal initInbIndex;
	private String redemMcd;
	private String amortStDate;
	private String deferTerm;
	private Long amortCnt;
	private Long amortFreq;
	private BigDecimal amortAmt;
	private Character isCpPrepay;
	private String refIrcId;
	private BigDecimal spreadRate;
	private String refixingTerm;
	private String firstCouponDate;
	private String cpDateGen;
	private Long refixingSlideNum;
	private BigDecimal capRate;
	private BigDecimal floorRate;
	private String stockLinkedType;
	private String refStockId;
	private String optionStDate;
	private String optionEdDate;
	private BigDecimal strikePrice;
	private BigDecimal conversionRatio;
//	private Set<BondHis> bondHises = new HashSet<BondHis>(0);
//	private Set<BondIndexDetail> bondIndexDetails = new HashSet<BondIndexDetail>(0);

	public Bond() {
	}

	@Id
	@Column(name = "MV_ID", unique = true, nullable = false, length = 20)
	public String getMvId() {
		return this.mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;

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

	@Column(name = "TOTAL_AMT", scale = 0)
	public BigDecimal getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(BigDecimal totalAmt) {
		this.totalAmt = totalAmt;

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

	@Column(name = "COUPON_RATE", precision = 10, scale = 8)
	public BigDecimal getCouponRate() {
		return this.couponRate;
	}

	public void setCouponRate(BigDecimal couponRate) {
		this.couponRate = couponRate;

	}

	@Column(name = "INT_TERM", length = 10)
	public String getIntTerm() {
		return this.intTerm;
	}

	public void setIntTerm(String intTerm) {
		this.intTerm = intTerm;

	}
	@Enumerated(EnumType.STRING)
	@Column(name = "COMPOUND_MTD", length = 10)
	public ECompound getCompoundMtd() {
		return this.compoundMtd;
	}

	public void setCompoundMtd(ECompound compoundMtd) {
		this.compoundMtd = compoundMtd;

	}

	@Column(name = "DAYCOUNT_MTD", length = 10)
	public String getDaycountMtd() {
		return this.daycountMtd;
	}

	public void setDaycountMtd(String daycountMtd) {
		this.daycountMtd = daycountMtd;

	}

	@Column(name = "BOND_CF_TYPE", length = 10)
	public String getBondCfType() {
		return this.bondCfType;
	}

	public void setBondCfType(String bondCfType) {
		this.bondCfType = bondCfType;

	}

	@Column(name = "PRIORITY_CD", length = 10)
	public String getPriorityCd() {
		return this.priorityCd;
	}

	public void setPriorityCd(String priorityCd) {
		this.priorityCd = priorityCd;

	}

	@Column(name = "SECURITIZATION_CD", length = 10)
	public String getSecuritizationCd() {
		return this.securitizationCd;
	}

	public void setSecuritizationCd(String securitizationCd) {
		this.securitizationCd = securitizationCd;

	}

	@Column(name = "CREDIT_RATING_CD", length = 10)
	public String getCreditRatingCd() {
		return this.creditRatingCd;
	}

	public void setCreditRatingCd(String creditRatingCd) {
		this.creditRatingCd = creditRatingCd;

	}

	@Column(name = "CURR_CD", length = 3)
	public String getCurrCd() {
		return this.currCd;
	}

	public void setCurrCd(String currCd) {
		this.currCd = currCd;

	}

	@Column(name = "PREMIUM_AT_END", precision = 10, scale = 4)
	public BigDecimal getPremiumAtEnd() {
		return this.premiumAtEnd;
	}

	public void setPremiumAtEnd(BigDecimal premiumAtEnd) {
		this.premiumAtEnd = premiumAtEnd;

	}

	@Column(name = "BOND_TYPE", length = 10)
	public String getBondType() {
		return this.bondType;
	}

	public void setBondType(String bondType) {
		this.bondType = bondType;

	}

	@Column(name = "INIT_INB_INDEX", precision = 10, scale = 4)
	public BigDecimal getInitInbIndex() {
		return this.initInbIndex;
	}

	public void setInitInbIndex(BigDecimal initInbIndex) {
		this.initInbIndex = initInbIndex;

	}

	@Column(name = "REDEM_MCD", length = 10)
	public String getRedemMcd() {
		return this.redemMcd;
	}

	public void setRedemMcd(String redemMcd) {
		this.redemMcd = redemMcd;

	}

	@Column(name = "AMORT_ST_DATE", length = 8)
	public String getAmortStDate() {
		return this.amortStDate;
	}

	public void setAmortStDate(String amortStDate) {
		this.amortStDate = amortStDate;

	}

	@Column(name = "DEFER_TERM", length = 10)
	public String getDeferTerm() {
		return this.deferTerm;
	}

	public void setDeferTerm(String deferTerm) {
		this.deferTerm = deferTerm;

	}

	@Column(name = "AMORT_CNT", precision = 10, scale = 0)
	public Long getAmortCnt() {
		return this.amortCnt;
	}

	public void setAmortCnt(Long amortCnt) {
		this.amortCnt = amortCnt;

	}

	@Column(name = "AMORT_FREQ", precision = 10, scale = 0)
	public Long getAmortFreq() {
		return this.amortFreq;
	}

	public void setAmortFreq(Long amortFreq) {
		this.amortFreq = amortFreq;

	}

	@Column(name = "AMORT_AMT", scale = 4)
	public BigDecimal getAmortAmt() {
		return this.amortAmt;
	}

	public void setAmortAmt(BigDecimal amortAmt) {
		this.amortAmt = amortAmt;

	}

	@Column(name = "IS_CP_PREPAY", length = 1)
	public Character getIsCpPrepay() {
		return this.isCpPrepay;
	}

	public void setIsCpPrepay(Character isCpPrepay) {
		this.isCpPrepay = isCpPrepay;

	}

	@Column(name = "REF_IRC_ID", length = 20)
	public String getRefIrcId() {
		return this.refIrcId;
	}

	public void setRefIrcId(String refIrcId) {
		this.refIrcId = refIrcId;

	}

	@Column(name = "SPREAD_RATE", precision = 10, scale = 4)
	public BigDecimal getSpreadRate() {
		return this.spreadRate;
	}

	public void setSpreadRate(BigDecimal spreadRate) {
		this.spreadRate = spreadRate;

	}

	@Column(name = "REFIXING_TERM", length = 10)
	public String getRefixingTerm() {
		return this.refixingTerm;
	}

	public void setRefixingTerm(String refixingTerm) {
		this.refixingTerm = refixingTerm;

	}

	@Column(name = "FIRST_COUPON_DATE", length = 8)
	public String getFirstCouponDate() {
		return this.firstCouponDate;
	}

	public void setFirstCouponDate(String firstCouponDate) {
		this.firstCouponDate = firstCouponDate;

	}

	@Column(name = "CP_DATE_GEN", length = 10)
	public String getCpDateGen() {
		return this.cpDateGen;
	}

	public void setCpDateGen(String cpDateGen) {
		this.cpDateGen = cpDateGen;

	}

	@Column(name = "REFIXING_SLIDE_NUM", precision = 10, scale = 0)
	public Long getRefixingSlideNum() {
		return this.refixingSlideNum;
	}

	public void setRefixingSlideNum(Long refixingSlideNum) {
		this.refixingSlideNum = refixingSlideNum;

	}

	@Column(name = "CAP_RATE", precision = 10, scale = 4)
	public BigDecimal getCapRate() {
		return this.capRate;
	}

	public void setCapRate(BigDecimal capRate) {
		this.capRate = capRate;

	}

	@Column(name = "FLOOR_RATE", precision = 10, scale = 4)
	public BigDecimal getFloorRate() {
		return this.floorRate;
	}

	public void setFloorRate(BigDecimal floorRate) {
		this.floorRate = floorRate;

	}

	@Column(name = "STOCK_LINKED_TYPE", length = 10)
	public String getStockLinkedType() {
		return this.stockLinkedType;
	}

	public void setStockLinkedType(String stockLinkedType) {
		this.stockLinkedType = stockLinkedType;

	}

	@Column(name = "REF_STOCK_ID", length = 20)
	public String getRefStockId() {
		return this.refStockId;
	}

	public void setRefStockId(String refStockId) {
		this.refStockId = refStockId;

	}

	@Column(name = "OPTION_ST_DATE", length = 8)
	public String getOptionStDate() {
		return this.optionStDate;
	}

	public void setOptionStDate(String optionStDate) {
		this.optionStDate = optionStDate;

	}

	@Column(name = "OPTION_ED_DATE", length = 8)
	public String getOptionEdDate() {
		return this.optionEdDate;
	}

	public void setOptionEdDate(String optionEdDate) {
		this.optionEdDate = optionEdDate;

	}

	@Column(name = "STRIKE_PRICE", precision = 10, scale = 4)
	public BigDecimal getStrikePrice() {
		return this.strikePrice;
	}

	public void setStrikePrice(BigDecimal strikePrice) {
		this.strikePrice = strikePrice;

	}

	@Column(name = "CONVERSION_RATIO", precision = 10, scale = 4)
	public BigDecimal getConversionRatio() {
		return this.conversionRatio;
	}

	public void setConversionRatio(BigDecimal conversionRatio) {
		this.conversionRatio = conversionRatio;

	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unresolved")
//	public Set<BondHis> getBondHises() {
//		return this.bondHises;
//	}
//
//	public void setBondHises(Set<BondHis> bondHises) {
//		this.bondHises = bondHises;
//
//	}
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unresolved")
//	public Set<BondIndexDetail> getBondIndexDetails() {
//		return this.bondIndexDetails;
//	}
//
//	public void setBondIndexDetails(Set<BondIndexDetail> bondIndexDetails) {
//		this.bondIndexDetails = bondIndexDetails;
//
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
		if (!(other instanceof Bond))
			return false;
		Bond castOther = (Bond) other;

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
