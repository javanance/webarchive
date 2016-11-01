package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NcmMstCodeTmp generated by hbm2java
 */
@Entity
@Table(name = "NCM_MST_CODE_TMP", schema = "NCM")
public class NcmMstCodeTmp implements java.io.Serializable {

	private NcmMstCodeTmpId id;

	public NcmMstCodeTmp() {
	}

	public NcmMstCodeTmp(NcmMstCodeTmpId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "codeGroup", column = @Column(name = "CODE_GROUP", length = 20)),
			@AttributeOverride(name = "codeId", column = @Column(name = "CODE_ID", length = 100)),
			@AttributeOverride(name = "codeNm", column = @Column(name = "CODE_NM", length = 100)),
			@AttributeOverride(name = "codeRemark", column = @Column(name = "CODE_REMARK", length = 100)),
			@AttributeOverride(name = "codeGroupNm", column = @Column(name = "CODE_GROUP_NM", length = 100)),
			@AttributeOverride(name = "codeOrder", column = @Column(name = "CODE_ORDER", precision = 22, scale = 0)),
			@AttributeOverride(name = "updateId", column = @Column(name = "UPDATE_ID", length = 20)),
			@AttributeOverride(name = "lastUpdate", column = @Column(name = "LAST_UPDATE", length = 7)) })
	public NcmMstCodeTmpId getId() {
		return this.id;
	}

	public void setId(NcmMstCodeTmpId id) {
		this.id = id;
	}

}
