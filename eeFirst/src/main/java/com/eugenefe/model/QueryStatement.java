package com.eugenefe.model;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

import com.eugenefe.entity.takion.WebUserMenuMulti;
import com.eugenefe.util.Navigatable;

@Entity
@Table(name = "WEB_USER_QUERY")
public class QueryStatement implements Serializable, Navigatable{
	
//	private Long querySeq ;
	private Integer querySeq;
	private String userId;
	private String queryStatement;
//	private Date lastUpdate;
    

    public QueryStatement() {
	}
    
    

//    public QueryStatement(Long querySeq, String userId, String queryStatement) {
//		this.querySeq = querySeq;
//		this.userId = userId;
//		this.queryStatement = queryStatement;
//	}
    
    
    public QueryStatement(String userId, String queryStatement) {
    	this.userId = userId;
    	this.queryStatement = queryStatement;
    }

	public QueryStatement(Integer querySeq, String userId, String queryStatement) {
		this.querySeq = querySeq;
		this.userId = userId;
		this.queryStatement = queryStatement;
	}



	@Id
//  @SequenceGenerator()
//	@GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(generator="QUERY_SEQ")
    @SequenceGenerator(name="QUERY_SEQ", sequenceName="WEB_USER_QUERY_SEQ", allocationSize=1)
	@Column(name = "QUERY_SEQ", nullable = false)
	public Integer getQuerySeq() {
		return querySeq;
	}
	
	public void setQuerySeq(Integer querySeq) {
		this.querySeq = querySeq;
	}
	

	@Column(name = "USER_ID", nullable = false)
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "QUERY_STATEMENT", nullable = false)
	public String getQueryStatement() {
		return queryStatement;
	}


	public void setQueryStatement(String queryStatement) {
		this.queryStatement = queryStatement;
	}

//	@Transient
////	@Temporal(value = "LAST_UPDATE")
//	public Date getLastUpdate() {
//		return lastUpdate;
//	}
//
//
//	public void setLastUpdate(Date lastUpdate) {
//		this.lastUpdate = lastUpdate;
//	}
    
	
	/**
	 * idString
	 * @return String
	 */
	@Transient
	@Override
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getQuerySeq());

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
		if (!(other instanceof QueryStatement))
			return false;
		QueryStatement castOther = (QueryStatement) other;

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

