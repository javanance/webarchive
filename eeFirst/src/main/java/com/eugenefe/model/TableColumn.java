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

import com.eugenefe.enums.ENamingConvention;
import com.eugenefe.ncm.NcmBatLogId;

@Entity
@Table(name = "ALL_TAB_COLUMNS")
@IdClass(value= TableColumnPk.class)
public class TableColumn implements Serializable{
	
//	private TableColumnId id;
	private String tableName;
	private String columnName;
	private String camelColumnName;
	private String owner;
	private Integer columnId;
    private String columnType;
    private Integer columnLenght;
    private Integer columnPrecision;
    private Integer columnScale;
    private String alignFormat;
    

    public TableColumn() {
	}

    @Id
    @Column(name = "TABLE_NAME", nullable = false)
    public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Id
	@Column(name = "COLUMN_NAME", nullable = false)
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	@Transient
	public String getCamelColumnName() {
		return ENamingConvention.SNAKE_CASE.convertToCamelCase(columnName);
//		return WordUtils.capitalizeFully(columnName, new char[]{'_'}).replaceAll("_", "");
	}

	public void setCamelColumnName(String camelColumnName) {
		this.camelColumnName = camelColumnName;
	}

	@Column(name = "OWNER")
	public String getOwner() {
		return owner;
	}

	

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Column(name = "COLUMN_ID")
	public Integer getColumnId() {
		return columnId;
	}

	public void setColumnId(Integer columnId) {
		this.columnId = columnId;
	}

	@Column(name = "DATA_TYPE")
	public String getColumnType() {
		return columnType;
	}


	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	
	@Column(name = "DATA_LENGTH")
	public Integer getColumnLenght() {
		return columnLenght;
	}

	public void setColumnLenght(Integer columnLenght) {
		this.columnLenght = columnLenght;
	}

	@Column(name = "DATA_PRECISION")
	public Integer getColumnPrecision() {
		return columnPrecision;
	}

	public void setColumnPrecision(Integer columnPrecision) {
		this.columnPrecision = columnPrecision;
	}
	@Column(name = "DATA_SCALE")
	public Integer getColumnScale() {
		return columnScale;
	}

	public void setColumnScale(Integer columnScale) {
		this.columnScale = columnScale;
	}

	@Transient
	public String getAlignFormat() {
		if(getColumnType()=="NUMBER"){
			return "float : right";
		}
		return "float : left";
	}

	public void setAlignFormat(String alignFormat) {
		this.alignFormat = alignFormat;
	}
}

