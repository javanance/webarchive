package com.eugenefe.entity.takion;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.eugenefe.util.Navigatable;


public class WebUserMenuId implements java.io.Serializable, Navigatable {

	private String userId;
	private String menuName;

	public WebUserMenuId() {
	}

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	

	public String getMenuName() {
		return menuName;
	}


	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}


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
		if (!(other instanceof WebUserMenuId))
			return false;
		WebUserMenuId castOther = (WebUserMenuId) other;

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