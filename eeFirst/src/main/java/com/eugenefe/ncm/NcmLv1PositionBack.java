package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * NcmLv1PositionBack generated by hbm2java
 */
@Entity
@Table(name = "NCM_LV1_POSITION_BACK", schema = "NCM")
public class NcmLv1PositionBack implements java.io.Serializable {

	private NcmLv1PositionBackId id;

	public NcmLv1PositionBack() {
	}

	public NcmLv1PositionBack(NcmLv1PositionBackId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "baseDate", column = @Column(name = "BASE_DATE", nullable = false, length = 8)),
			@AttributeOverride(name = "posId", column = @Column(name = "POS_ID", nullable = false, length = 30)),
			@AttributeOverride(name = "bizDivCd", column = @Column(name = "BIZ_DIV_CD", length = 10)),
			@AttributeOverride(name = "acctDivCd", column = @Column(name = "ACCT_DIV_CD", length = 10)),
			@AttributeOverride(name = "acctNo", column = @Column(name = "ACCT_NO", length = 20)),
			@AttributeOverride(name = "saaCd", column = @Column(name = "SAA_CD", length = 20)),
			@AttributeOverride(name = "finProdId", column = @Column(name = "FIN_PROD_ID", length = 20)),
			@AttributeOverride(name = "mngOrgCorpNo", column = @Column(name = "MNG_ORG_CORP_NO", length = 20)),
			@AttributeOverride(name = "fstTxAmt", column = @Column(name = "FST_TX_AMT", precision = 20)),
			@AttributeOverride(name = "hldQty", column = @Column(name = "HLD_QTY", precision = 20)),
			@AttributeOverride(name = "hldFaceAmt", column = @Column(name = "HLD_FACE_AMT", precision = 20)),
			@AttributeOverride(name = "bookAmt", column = @Column(name = "BOOK_AMT", precision = 20)),
			@AttributeOverride(name = "bdayEvalAmt", column = @Column(name = "BDAY_EVAL_AMT", precision = 20)),
			@AttributeOverride(name = "mktEvalAmt", column = @Column(name = "MKT_EVAL_AMT", precision = 20)),
			@AttributeOverride(name = "intInflowAmt", column = @Column(name = "INT_INFLOW_AMT", precision = 20)),
			@AttributeOverride(name = "evalPl", column = @Column(name = "EVAL_PL", precision = 20)),
			@AttributeOverride(name = "todayAccrInt", column = @Column(name = "TODAY_ACCR_INT", precision = 20)),
			@AttributeOverride(name = "accuAccrInt", column = @Column(name = "ACCU_ACCR_INT", precision = 20)),
			@AttributeOverride(name = "todayBuyAmt", column = @Column(name = "TODAY_BUY_AMT", precision = 20)),
			@AttributeOverride(name = "todaySellAmt", column = @Column(name = "TODAY_SELL_AMT", precision = 20)),
			@AttributeOverride(name = "todayTradePl", column = @Column(name = "TODAY_TRADE_PL", precision = 20)),
			@AttributeOverride(name = "ytm", column = @Column(name = "YTM", precision = 12, scale = 8)),
			@AttributeOverride(name = "adjDur", column = @Column(name = "ADJ_DUR", precision = 12, scale = 8)),
			@AttributeOverride(name = "spread", column = @Column(name = "SPREAD", precision = 12, scale = 8)),
			@AttributeOverride(name = "matCd", column = @Column(name = "MAT_CD", length = 10)),
			@AttributeOverride(name = "fstTxDate", column = @Column(name = "FST_TX_DATE", length = 8)),
			@AttributeOverride(name = "finTxNo", column = @Column(name = "FIN_TX_NO", length = 20)),
			@AttributeOverride(name = "creditCd", column = @Column(name = "CREDIT_CD", length = 10)),
			@AttributeOverride(name = "creditOrgCd", column = @Column(name = "CREDIT_ORG_CD", length = 10)),
			@AttributeOverride(name = "creditTypeCd", column = @Column(name = "CREDIT_TYPE_CD", length = 10)),
			@AttributeOverride(name = "srcTable", column = @Column(name = "SRC_TABLE", length = 20)),
			@AttributeOverride(name = "updateId", column = @Column(name = "UPDATE_ID", length = 20)),
			@AttributeOverride(name = "lastUpdate", column = @Column(name = "LAST_UPDATE", length = 7)) })
	public NcmLv1PositionBackId getId() {
		return this.id;
	}

	public void setId(NcmLv1PositionBackId id) {
		this.id = id;
	}

}