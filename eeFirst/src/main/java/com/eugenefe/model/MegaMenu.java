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
@Table(name = "WEB_MENU")
public class MegaMenu implements Serializable{
	
	private String menuId;
	private String menuName;
	private String menuGroup;
    private Integer menuColumn;
    private String menuStyle;
    private String menuUrl;
    private String iconName;
    

    public MegaMenu() {
	}


	@Id
	@Column(name = "MENU_ID", nullable = false, unique = true)
	public String getMenuId() {
		return menuId;
	}


	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	
	@Column(name = "MENU_NAME")
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	@Column(name = "MENU_GROUP")
	public String getMenuGroup() {
		return menuGroup;
	}

	public void setMenuGroup(String menuGroup) {
		this.menuGroup = menuGroup;
	}
	
	@Column(name = "MENU_COLUMN")
	public Integer getMenuColumn() {
		return menuColumn;
	}

	public void setMenuColumn(Integer menuColumn) {
		this.menuColumn = menuColumn;
	}
	
	@Column(name = "MENU_STYLE")
	public String getMenuStyle() {
		return menuStyle;
	}

	public void setMenuStyle(String menuStyle) {
		this.menuStyle = menuStyle;
	}

	@Column(name = "MENU_URL")
	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	@Column(name = "ICON_NAME")
	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}

}

