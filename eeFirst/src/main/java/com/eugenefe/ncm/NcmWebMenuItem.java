package com.eugenefe.ncm;
// Generated Nov 1, 2016 1:37:21 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NcmWebMenuItem generated by hbm2java
 */
@Entity
@Table(name = "NCM_WEB_MENU_ITEM", schema = "NCM")
public class NcmWebMenuItem implements java.io.Serializable {

	private NcmWebMenuItemId id;
	private NcmWebAuthor ncmWebAuthor;
	private NcmWebMenu ncmWebMenu;
	private Date creatDt;

	public NcmWebMenuItem() {
	}

	public NcmWebMenuItem(NcmWebMenuItemId id, NcmWebAuthor ncmWebAuthor, NcmWebMenu ncmWebMenu, Date creatDt) {
		this.id = id;
		this.ncmWebAuthor = ncmWebAuthor;
		this.ncmWebMenu = ncmWebMenu;
		this.creatDt = creatDt;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "authorCode", column = @Column(name = "AUTHOR_CODE", nullable = false, length = 60)),
			@AttributeOverride(name = "menuCode", column = @Column(name = "MENU_CODE", nullable = false, length = 100)) })
	public NcmWebMenuItemId getId() {
		return this.id;
	}

	public void setId(NcmWebMenuItemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AUTHOR_CODE", nullable = false, insertable = false, updatable = false)
	public NcmWebAuthor getNcmWebAuthor() {
		return this.ncmWebAuthor;
	}

	public void setNcmWebAuthor(NcmWebAuthor ncmWebAuthor) {
		this.ncmWebAuthor = ncmWebAuthor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MENU_CODE", nullable = false, insertable = false, updatable = false)
	public NcmWebMenu getNcmWebMenu() {
		return this.ncmWebMenu;
	}

	public void setNcmWebMenu(NcmWebMenu ncmWebMenu) {
		this.ncmWebMenu = ncmWebMenu;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREAT_DT", nullable = false, length = 7)
	public Date getCreatDt() {
		return this.creatDt;
	}

	public void setCreatDt(Date creatDt) {
		this.creatDt = creatDt;
	}

}
