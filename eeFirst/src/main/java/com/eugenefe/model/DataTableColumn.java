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

import com.eugenefe.entity.ncm.NcmBatLog;
import com.eugenefe.entity.ncm.NcmBatLogId;
import com.eugenefe.enums.model.ENamingConvention;

@Entity
@Table(name = "WEB_TABLE_COLUMN")
@IdClass(value= DataTableColumnId.class)
public class DataTableColumn implements Serializable{
	
//	private TableColumnId id;
	private String dataTableId;
	private Integer columnNo;
	private String columnName;
	private String columnComment;
    private String columnType;
    private Integer columnLenght;
    private Integer columnPrecision;
    private Integer columnScale;
    private String alingType;
    private boolean isUsed;
    
    

    public DataTableColumn() {
	}

    @Id
    @Column(name = "DATA_TABLE_ID", nullable = false)
    public String getDataTableId() {
		return dataTableId;
	}

	public void setDataTableId(String dataTableId) {
		this.dataTableId = dataTableId;
	}

	@Id
	@Column(name = "COLUMN_NO", nullable = false)
	public Integer getColumnNo() {
		return columnNo;
	}

	public void setColumnNo(Integer columnNo) {
		this.columnNo = columnNo;
	}
	
	@Column(name = "COLUMN_NAME", nullable = false)
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	
	@Column(name = "COLUMN_COMMENT", nullable = false)
	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	@Transient
	public String getCamelColumnName() {
		return ENamingConvention.SNAKE_CASE.convertToCamelCase(columnName);
//		return WordUtils.capitalizeFully(columnName, new char[]{'_'}).replaceAll("_", "");
	}

	

	@Column(name = "COLUMN_TYPE")
	public String getColumnType() {
		return columnType;
	}


	public void setColumnType(String columnType) {
		this.columnType = columnType;
	}

	
	@Column(name = "COLUMN_LENGTH")
	public Integer getColumnLenght() {
		return columnLenght;
	}

	public void setColumnLenght(Integer columnLenght) {
		this.columnLenght = columnLenght;
	}

	@Column(name = "COLUMN_PRECISION")
	public Integer getColumnPrecision() {
		return columnPrecision;
	}

	public void setColumnPrecision(Integer columnPrecision) {
		this.columnPrecision = columnPrecision;
	}
	@Column(name = "COLUMN_SCALE")
	public Integer getColumnScale() {
		return columnScale;
	}

	public void setColumnScale(Integer columnScale) {
		this.columnScale = columnScale;
	}
	
	@Column(name = "ALIGN_TYPE")
	public String getAlingType() {
		return "float :" + alingType;
	}

	public void setAlingType(String alingType) {
		this.alingType = alingType;
	}


	@Transient
	public String getAlignFormat() {
		if("NUMBER".equals(getColumnType())){
			return "float : right";
		}
		return "float : left";
	}
	
	
	
	@Transient
	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}


	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getDataTableId());
		buffer.append("#").append(getColumnNo());

		String rst = buffer.toString();

		return rst;
	}
	
	@Transient
	@Override
	public String toString(){
		return idString();
	}
	
	@Transient
	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof NcmBatLog))
			return false;
		DataTableColumn castOther = (DataTableColumn) other;

		return this.idString().equals(castOther.idString());
	}

	@Transient
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDataTableId() == null ? 0 : this.getDataTableId().hashCode());
		result = 37 * result + (getColumnNo() == null ? 0 : this.getColumnNo().hashCode());
		return result;
	}

}

