package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmKfrHoldingDetail generated by hbm2java
 */
@Entity
@Table(name = "NCM_KFR_HOLDING_DETAIL", schema = "NCM")
public class NcmKfrHoldingDetail implements java.io.Serializable {

	private NcmKfrHoldingDetailId id;
	private String itemkname;
	private String buydate;
	private String buyseq;
	private String positioncode;
	private String assetbclasscode;
	private String assetsclasscode;
	private long qty;
	private BigDecimal price;
	private long investamt;
	private long bookamt;
	private long evalamt;
	private Long evalpl;
	private Long accrudividamt;
	private BigDecimal buyyield;
	private BigDecimal ytm;
	private BigDecimal couprate;
	private String issueday;
	private String dueday;
	private String lastbuydate;
	private BigDecimal duration;
	private BigDecimal spread;
	private BigDecimal disprarate;
	private String creditgrade;
	private String isscorpno;
	private String isscorpname;
	private String evalcorpcode;
	private Date creDttm;
	private String creEmpNo;
	private Date chgDttm;
	private String chgEmpNo;
	private String workfilename;

	public NcmKfrHoldingDetail() {
	}

	public NcmKfrHoldingDetail(NcmKfrHoldingDetailId id, String itemkname, String assetbclasscode,
			String assetsclasscode, long qty, BigDecimal price, long investamt, long bookamt, long evalamt,
			BigDecimal ytm, BigDecimal couprate, BigDecimal duration, BigDecimal spread, BigDecimal disprarate,
			String evalcorpcode) {
		this.id = id;
		this.itemkname = itemkname;
		this.assetbclasscode = assetbclasscode;
		this.assetsclasscode = assetsclasscode;
		this.qty = qty;
		this.price = price;
		this.investamt = investamt;
		this.bookamt = bookamt;
		this.evalamt = evalamt;
		this.ytm = ytm;
		this.couprate = couprate;
		this.duration = duration;
		this.spread = spread;
		this.disprarate = disprarate;
		this.evalcorpcode = evalcorpcode;
	}

	public NcmKfrHoldingDetail(NcmKfrHoldingDetailId id, String itemkname, String buydate, String buyseq,
			String positioncode, String assetbclasscode, String assetsclasscode, long qty, BigDecimal price,
			long investamt, long bookamt, long evalamt, Long evalpl, Long accrudividamt, BigDecimal buyyield,
			BigDecimal ytm, BigDecimal couprate, String issueday, String dueday, String lastbuydate,
			BigDecimal duration, BigDecimal spread, BigDecimal disprarate, String creditgrade, String isscorpno,
			String isscorpname, String evalcorpcode, Date creDttm, String creEmpNo, Date chgDttm, String chgEmpNo,
			String workfilename) {
		this.id = id;
		this.itemkname = itemkname;
		this.buydate = buydate;
		this.buyseq = buyseq;
		this.positioncode = positioncode;
		this.assetbclasscode = assetbclasscode;
		this.assetsclasscode = assetsclasscode;
		this.qty = qty;
		this.price = price;
		this.investamt = investamt;
		this.bookamt = bookamt;
		this.evalamt = evalamt;
		this.evalpl = evalpl;
		this.accrudividamt = accrudividamt;
		this.buyyield = buyyield;
		this.ytm = ytm;
		this.couprate = couprate;
		this.issueday = issueday;
		this.dueday = dueday;
		this.lastbuydate = lastbuydate;
		this.duration = duration;
		this.spread = spread;
		this.disprarate = disprarate;
		this.creditgrade = creditgrade;
		this.isscorpno = isscorpno;
		this.isscorpname = isscorpname;
		this.evalcorpcode = evalcorpcode;
		this.creDttm = creDttm;
		this.creEmpNo = creEmpNo;
		this.chgDttm = chgDttm;
		this.chgEmpNo = chgEmpNo;
		this.workfilename = workfilename;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "tradeday", column = @Column(name = "TRADEDAY", nullable = false, length = 8)),
			@AttributeOverride(name = "mgrcode", column = @Column(name = "MGRCODE", nullable = false, length = 3)),
			@AttributeOverride(name = "fundmgrcode", column = @Column(name = "FUNDMGRCODE", nullable = false, length = 30)),
			@AttributeOverride(name = "itemcode", column = @Column(name = "ITEMCODE", nullable = false, length = 50)),
			@AttributeOverride(name = "dataseq", column = @Column(name = "DATASEQ", nullable = false, precision = 5, scale = 0)) })
	public NcmKfrHoldingDetailId getId() {
		return this.id;
	}

	public void setId(NcmKfrHoldingDetailId id) {
		this.id = id;
	}

	@Column(name = "ITEMKNAME", nullable = false, length = 100)
	public String getItemkname() {
		return this.itemkname;
	}

	public void setItemkname(String itemkname) {
		this.itemkname = itemkname;
	}

	@Column(name = "BUYDATE", length = 8)
	public String getBuydate() {
		return this.buydate;
	}

	public void setBuydate(String buydate) {
		this.buydate = buydate;
	}

	@Column(name = "BUYSEQ", length = 5)
	public String getBuyseq() {
		return this.buyseq;
	}

	public void setBuyseq(String buyseq) {
		this.buyseq = buyseq;
	}

	@Column(name = "POSITIONCODE", length = 1)
	public String getPositioncode() {
		return this.positioncode;
	}

	public void setPositioncode(String positioncode) {
		this.positioncode = positioncode;
	}

	@Column(name = "ASSETBCLASSCODE", nullable = false, length = 2)
	public String getAssetbclasscode() {
		return this.assetbclasscode;
	}

	public void setAssetbclasscode(String assetbclasscode) {
		this.assetbclasscode = assetbclasscode;
	}

	@Column(name = "ASSETSCLASSCODE", nullable = false, length = 2)
	public String getAssetsclasscode() {
		return this.assetsclasscode;
	}

	public void setAssetsclasscode(String assetsclasscode) {
		this.assetsclasscode = assetsclasscode;
	}

	@Column(name = "QTY", nullable = false, precision = 18, scale = 0)
	public long getQty() {
		return this.qty;
	}

	public void setQty(long qty) {
		this.qty = qty;
	}

	@Column(name = "PRICE", nullable = false, precision = 22, scale = 3)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "INVESTAMT", nullable = false, precision = 18, scale = 0)
	public long getInvestamt() {
		return this.investamt;
	}

	public void setInvestamt(long investamt) {
		this.investamt = investamt;
	}

	@Column(name = "BOOKAMT", nullable = false, precision = 18, scale = 0)
	public long getBookamt() {
		return this.bookamt;
	}

	public void setBookamt(long bookamt) {
		this.bookamt = bookamt;
	}

	@Column(name = "EVALAMT", nullable = false, precision = 18, scale = 0)
	public long getEvalamt() {
		return this.evalamt;
	}

	public void setEvalamt(long evalamt) {
		this.evalamt = evalamt;
	}

	@Column(name = "EVALPL", precision = 18, scale = 0)
	public Long getEvalpl() {
		return this.evalpl;
	}

	public void setEvalpl(Long evalpl) {
		this.evalpl = evalpl;
	}

	@Column(name = "ACCRUDIVIDAMT", precision = 18, scale = 0)
	public Long getAccrudividamt() {
		return this.accrudividamt;
	}

	public void setAccrudividamt(Long accrudividamt) {
		this.accrudividamt = accrudividamt;
	}

	@Column(name = "BUYYIELD", precision = 18)
	public BigDecimal getBuyyield() {
		return this.buyyield;
	}

	public void setBuyyield(BigDecimal buyyield) {
		this.buyyield = buyyield;
	}

	@Column(name = "YTM", nullable = false, precision = 32, scale = 6)
	public BigDecimal getYtm() {
		return this.ytm;
	}

	public void setYtm(BigDecimal ytm) {
		this.ytm = ytm;
	}

	@Column(name = "COUPRATE", nullable = false, precision = 18)
	public BigDecimal getCouprate() {
		return this.couprate;
	}

	public void setCouprate(BigDecimal couprate) {
		this.couprate = couprate;
	}

	@Column(name = "ISSUEDAY", length = 8)
	public String getIssueday() {
		return this.issueday;
	}

	public void setIssueday(String issueday) {
		this.issueday = issueday;
	}

	@Column(name = "DUEDAY", length = 8)
	public String getDueday() {
		return this.dueday;
	}

	public void setDueday(String dueday) {
		this.dueday = dueday;
	}

	@Column(name = "LASTBUYDATE", length = 8)
	public String getLastbuydate() {
		return this.lastbuydate;
	}

	public void setLastbuydate(String lastbuydate) {
		this.lastbuydate = lastbuydate;
	}

	@Column(name = "DURATION", nullable = false, precision = 20, scale = 12)
	public BigDecimal getDuration() {
		return this.duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	@Column(name = "SPREAD", nullable = false, precision = 20, scale = 12)
	public BigDecimal getSpread() {
		return this.spread;
	}

	public void setSpread(BigDecimal spread) {
		this.spread = spread;
	}

	@Column(name = "DISPRARATE", nullable = false, precision = 20, scale = 12)
	public BigDecimal getDisprarate() {
		return this.disprarate;
	}

	public void setDisprarate(BigDecimal disprarate) {
		this.disprarate = disprarate;
	}

	@Column(name = "CREDITGRADE", length = 4)
	public String getCreditgrade() {
		return this.creditgrade;
	}

	public void setCreditgrade(String creditgrade) {
		this.creditgrade = creditgrade;
	}

	@Column(name = "ISSCORPNO", length = 13)
	public String getIsscorpno() {
		return this.isscorpno;
	}

	public void setIsscorpno(String isscorpno) {
		this.isscorpno = isscorpno;
	}

	@Column(name = "ISSCORPNAME", length = 50)
	public String getIsscorpname() {
		return this.isscorpname;
	}

	public void setIsscorpname(String isscorpname) {
		this.isscorpname = isscorpname;
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

}
