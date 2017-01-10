package com.eugenefe.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.text.WordUtils;

import com.eugenefe.entity.ncm.NcmBatLogId;
import com.eugenefe.enums.model.ENamingConvention;

@Entity
@Table(name = "WEB_DATATABLE_MST")
public class DataTableMst implements Serializable{
	
	private String dataTableId;
	private String dataTableName;
	private String dataTableType;
	private String dataTableQuery;
	private String styleClass;
	private String pagenatorType;

    public DataTableMst() {
	}

    @Id
    @Column(name = "DATA_TABLE_ID", nullable = false)
    public String getDataTableId() {
		return dataTableId;
	}

	public void setDataTableId(String dataTableId) {
		this.dataTableId = dataTableId;
	}

	
	@Column(name = "DATA_TABLE_NAME", nullable = true)
	public String getDataTableName() {
		return dataTableName;
	}

	public void setDataTableName(String dataTableName) {
		this.dataTableName = dataTableName;
	}

	@Column(name = "DATA_TABLE_TYPE", nullable = true)
	public String getDataTableType() {
		return dataTableType;
	}

	public void setDataTableType(String dataTableType) {
		this.dataTableType = dataTableType;
	}
	@Column(name = "DATA_TABLE_QUERY", nullable = true)
	public String getDataTableQuery() {
		return dataTableQuery;
	}

	public void setDataTableQuery(String dataTableQuery) {
		this.dataTableQuery = dataTableQuery;
	}
	@Column(name = "STYLE_CLASS", nullable = true)
	public String getStyleClass() {
		return styleClass;
	}

	public void setStyleClass(String styleClass) {
		this.styleClass = styleClass;
	}
	@Column(name = "PAGENATOR_TYPE", nullable = true)
	public String getPagenatorType() {
		return pagenatorType;
	}

	public void setPagenatorType(String pagenatorType) {
		this.pagenatorType = pagenatorType;
	}

	
}

