package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

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
 * NcmBatLog generated by hbm2java
 */
@Entity
@Table(name = "NCM_BAT_LOG", schema = "NCM")
public class NcmBatLog implements java.io.Serializable {

	private NcmBatLogId id;
	private String batCdNm;
	private Long cnt;
	private String status;
	private String errMsg;
	private String updateId;
	private Date lastUpdate;

	public NcmBatLog() {
	}

	public NcmBatLog(NcmBatLogId id) {
		this.id = id;
	}

	public NcmBatLog(NcmBatLogId id, String batCdNm, Long cnt, String status, String errMsg, String updateId,
			Date lastUpdate) {
		this.id = id;
		this.batCdNm = batCdNm;
		this.cnt = cnt;
		this.status = status;
		this.errMsg = errMsg;
		this.updateId = updateId;
		this.lastUpdate = lastUpdate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "batCd", column = @Column(name = "BAT_CD", nullable = false, length = 20)) })
	public NcmBatLogId getId() {
		return this.id;
	}

	public void setId(NcmBatLogId id) {
		this.id = id;
	}

	@Column(name = "BAT_CD_NM", length = 100)
	public String getBatCdNm() {
		return this.batCdNm;
	}

	public void setBatCdNm(String batCdNm) {
		this.batCdNm = batCdNm;
	}

	@Column(name = "CNT", precision = 18, scale = 0)
	public Long getCnt() {
		return this.cnt;
	}

	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}

	@Column(name = "STATUS", length = 100)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "ERR_MSG", length = 1000)
	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	@Column(name = "UPDATE_ID", length = 20)
	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_UPDATE", length = 7)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
