package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NcmWebMenu generated by hbm2java
 */
@Entity
@Table(name = "NCM_WEB_MENU", schema = "NCM")
public class NcmWebMenu implements java.io.Serializable {

	private String menuCode;
	private String menuTitle;
	private String menuUrl;
	private String menuParent;
	private String menuImage;
	private String menuOrder;
	private Set<NcmWebMenuItem> ncmWebMenuItems = new HashSet<NcmWebMenuItem>(0);

	public NcmWebMenu() {
	}

	public NcmWebMenu(String menuCode, String menuTitle) {
		this.menuCode = menuCode;
		this.menuTitle = menuTitle;
	}

	public NcmWebMenu(String menuCode, String menuTitle, String menuUrl, String menuParent, String menuImage,
			String menuOrder, Set<NcmWebMenuItem> ncmWebMenuItems) {
		this.menuCode = menuCode;
		this.menuTitle = menuTitle;
		this.menuUrl = menuUrl;
		this.menuParent = menuParent;
		this.menuImage = menuImage;
		this.menuOrder = menuOrder;
		this.ncmWebMenuItems = ncmWebMenuItems;
	}

	@Id

	@Column(name = "MENU_CODE", unique = true, nullable = false, length = 100)
	public String getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	@Column(name = "MENU_TITLE", nullable = false, length = 60)
	public String getMenuTitle() {
		return this.menuTitle;
	}

	public void setMenuTitle(String menuTitle) {
		this.menuTitle = menuTitle;
	}

	@Column(name = "MENU_URL", length = 300)
	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	@Column(name = "MENU_PARENT", length = 100)
	public String getMenuParent() {
		return this.menuParent;
	}

	public void setMenuParent(String menuParent) {
		this.menuParent = menuParent;
	}

	@Column(name = "MENU_IMAGE", length = 200)
	public String getMenuImage() {
		return this.menuImage;
	}

	public void setMenuImage(String menuImage) {
		this.menuImage = menuImage;
	}

	@Column(name = "MENU_ORDER", length = 5)
	public String getMenuOrder() {
		return this.menuOrder;
	}

	public void setMenuOrder(String menuOrder) {
		this.menuOrder = menuOrder;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ncmWebMenu")
	public Set<NcmWebMenuItem> getNcmWebMenuItems() {
		return this.ncmWebMenuItems;
	}

	public void setNcmWebMenuItems(Set<NcmWebMenuItem> ncmWebMenuItems) {
		this.ncmWebMenuItems = ncmWebMenuItems;
	}

}