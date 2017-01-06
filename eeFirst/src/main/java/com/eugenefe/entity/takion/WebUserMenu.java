package com.eugenefe.entity.takion;
// Generated Dec 19, 2016 6:36:07 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.collections4.map.HashedMap;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.eugenefe.embeddable.MenuInfo;
import com.eugenefe.util.Navigatable;

/**
 * Bond generated by hbm2java
 */

@Entity
@IdClass(value = WebUserMenuId.class)
@Table(name = "WEB_USER_MENU", schema = "TAKION79")
public class WebUserMenu  implements java.io.Serializable, Navigatable {

	private String userId;
	private String menuName;
	private String menuGroup;
    private Integer menuColumn;
    private String menuStyle;
    private String iconName;
//    private String menuId;
//    private MenuMst menu;
    private WebUser user;
    
	
	
	@Id
	@Column(name = "USER_ID",  nullable = false, length = 50)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@ManyToOne
	@JoinColumn(name="USER_ID", referencedColumnName="USER_ID",  insertable=false, updatable=false)
	public WebUser getUser() {
		return user;
	}
	public void setUser(WebUser user) {
		this.user = user;
	}
	
	@Id
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
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@ManyToOne
//	@JoinColumn(name="MENU_ID", referencedColumnName="MENU_ID"  )
//	public MenuMst getMenu() {
//		return menu;
//	}
//
//	public void setMenu(MenuMst menu) {
//		this.menu = menu;
//	}
//	
//	public WebUserMenu() {
//	}

	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getUserId());
		buffer.append("#").append(getMenuName());

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
		if (!(other instanceof WebUserMenu))
			return false;
		WebUserMenu castOther = (WebUserMenu) other;

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
