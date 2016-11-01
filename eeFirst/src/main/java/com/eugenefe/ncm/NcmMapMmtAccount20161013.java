package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NcmMapMmtAccount20161013 generated by hbm2java
 */
@Entity
@Table(name = "NCM_MAP_MMT_ACCOUNT_20161013", schema = "NCM")
public class NcmMapMmtAccount20161013 implements java.io.Serializable {

	private NcmMapMmtAccount20161013Id id;

	public NcmMapMmtAccount20161013() {
	}

	public NcmMapMmtAccount20161013(NcmMapMmtAccount20161013Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "srcTable", column = @Column(name = "SRC_TABLE", nullable = false, length = 20)),
			@AttributeOverride(name = "srcAcctNo", column = @Column(name = "SRC_ACCT_NO", nullable = false, length = 50)),
			@AttributeOverride(name = "srcFinTxNo", column = @Column(name = "SRC_FIN_TX_NO", nullable = false, length = 20)),
			@AttributeOverride(name = "srcProdTypeCd", column = @Column(name = "SRC_PROD_TYPE_CD", nullable = false, length = 10)),
			@AttributeOverride(name = "srcProdTypeNm", column = @Column(name = "SRC_PROD_TYPE_NM", length = 100)),
			@AttributeOverride(name = "srcCparty", column = @Column(name = "SRC_CPARTY", length = 100)),
			@AttributeOverride(name = "srcCpartyNm", column = @Column(name = "SRC_CPARTY_NM", length = 100)),
			@AttributeOverride(name = "srcBuyDate", column = @Column(name = "SRC_BUY_DATE", length = 8)),
			@AttributeOverride(name = "srcMaturityDate", column = @Column(name = "SRC_MATURITY_DATE", length = 8)),
			@AttributeOverride(name = "finProdId", column = @Column(name = "FIN_PROD_ID", length = 100)),
			@AttributeOverride(name = "updateId", column = @Column(name = "UPDATE_ID", length = 20)),
			@AttributeOverride(name = "lastUpdate", column = @Column(name = "LAST_UPDATE", length = 7)) })
	public NcmMapMmtAccount20161013Id getId() {
		return this.id;
	}

	public void setId(NcmMapMmtAccount20161013Id id) {
		this.id = id;
	}

}
