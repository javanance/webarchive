package com.eugenefe.entity.takion;
// Generated Dec 19, 2016 6:36:07 PM by Hibernate Tools 5.2.0.Beta1 with Custom Template_takion!!!!!! 

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.eugenefe.util.Navigatable;

/**
 * Bond generated by hbm2java
 */

@Entity
@Table(name = "WEB_USER_MST", schema = "TAKION79")
public class WebUser  implements java.io.Serializable, Navigatable {

	private String userId;
	private String userName;
	private String userEmail;
    private String password;
    
   
	
	public WebUser() {
	}
	
	@Id
	@Column(name = "USER_ID", unique = true, nullable = false, length = 50)
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER_NAME", length = 100)
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "USER_EMAIL", length = 100)
	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "PASSWORD", length = 100)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	/*private List<WebUserMenuMulti> userMenuList = new ArrayList<WebUserMenuMulti>();
	@Transient
	public List<WebUserMenuMulti> getUserMenuList() {
		return userMenuList;
	}

	public void setUserMenuList(List<WebUserMenuMulti> userMenuList) {
		this.userMenuList = userMenuList;
	}*/

	/*private List<WebUserMenuMulti> userMenuList = new ArrayList<WebUserMenuMulti>();
	
	@OneToMany(fetch= FetchType.EAGER, mappedBy ="user")
	@Fetch(FetchMode.JOIN)
//	@JoinColumn(name="USER_ID", insertable=false, updatable=false, referencedColumnName ="USER_ID")
	public List<WebUserMenuMulti> getUserMenuList() {
		return userMenuList;
	}

	public void setUserMenuList(List<WebUserMenuMulti> userMenuList) {
		try {
			this.userMenuList = userMenuList;
			
		} catch (Exception e) {
			System.out.println("Error Set userMenuList " + userMenuList);// TODO: handle exception
		}
	}*/
	
	private List<WebUserMenu> userMenuList = new ArrayList<WebUserMenu>();
	
	@OneToMany(fetch =FetchType.LAZY, mappedBy= "user" , cascade=CascadeType.ALL)
//	@OneToMany(fetch= FetchType.EAGER, cascade=CascadeType.ALL)
//	@Fetch(FetchMode.JOIN)
//	@JoinColumn(name="USER_ID", referencedColumnName ="USER_ID")
	public List<WebUserMenu> getUserMenuList() {
		return userMenuList;
	}

	public void setUserMenuList(List<WebUserMenu> userMenuList) {
		this.userMenuList = userMenuList;
	}

//	 private Map<MenuMst, MenuInfo> menuMap = new HashedMap<MenuMst, MenuInfo>();
//	@ElementCollection(fetch= FetchType.LAZY)
//	@Fetch(FetchMode.JOIN)
//	@MapKeyJoinColumn(name ="MENU_ID")
//	@CollectionTable(name="WEB_USER_MENU", joinColumns =@JoinColumn(name="USER_ID"))
//	public Map<MenuMst, MenuInfo> getMenuMap() {
//		return menuMap;
//	}
//
//	public void setMenuMap(Map<MenuMst, MenuInfo> menuMap) {
//		this.menuMap = menuMap;
//	}
	
	/**
	 * idString
	 * @return String
	 */
	@Transient
	public String idString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("#").append(getUserId());

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
		if (!(other instanceof WebUser))
			return false;
		WebUser castOther = (WebUser) other;

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
