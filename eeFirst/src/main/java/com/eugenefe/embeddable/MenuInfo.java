package com.eugenefe.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MenuInfo {
	
	private String menuName;
	private String menuGroup;
    private Integer menuColumn;
    private String menuStyle;
    private String iconName;
    
	
	public MenuInfo() {

	}
	
	@Column(name="MENU_NAME", nullable = true)
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	@Column(name="MENU_GROUP", nullable = true)
	public String getMenuGroup() {
		return menuGroup;
	}

	public void setMenuGroup(String menuGroup) {
		this.menuGroup = menuGroup;
	}
	
	@Column(name="MENU_COLUMN", nullable = true)
	public Integer getMenuColumn() {
		return menuColumn;
	}

	public void setMenuColumn(Integer menuColumn) {
		this.menuColumn = menuColumn;
	}

	@Column(name="MENU_STYLE", nullable = true)
	public String getMenuStyle() {
		return menuStyle;
	}

	public void setMenuStyle(String menuStyle) {
		this.menuStyle = menuStyle;
	}

	@Column(name="ICON_NAME", nullable = true)
	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}
	
	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MenuInfo))
			return false;
		MenuInfo castOther = (MenuInfo) other;
		
		return ((this.getMenuName() == castOther.getMenuName())
				|| (this.getMenuName() != null && castOther.getMenuName() != null && this.getMenuName().equals(castOther.getMenuName())));
	}
	
	public int hashCode() {
		int result = 17;
		result = 37 * result + (getMenuName() == null ? 0 : this.getMenuName().hashCode());
		return result;
	}

}
