package com.itucity.tripwiki.identity.model;


import javax.xml.bind.annotation.XmlRootElement;

import com.itucity.tripwiki.base.BaseModel;


@XmlRootElement(name = "admin")
public class Admin extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -734080570265979608L;

	private Integer id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private int  lastLoginTime;
	
	private String lastLoginIp;
	
	private int  roleId;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the lastLoginTime
	 */
	public int getLastLoginTime() {
		return lastLoginTime;
	}

	/**
	 * @param lastLoginTime the lastLoginTime to set
	 */
	public void setLastLoginTime(int lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	/**
	 * @return the lastLoginIp
	 */
	public String getLastLoginIp() {
		return lastLoginIp;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password="
				+ password + ", lastLoginTime=" + lastLoginTime + ", lastLoginIp=" + lastLoginIp
				+ ", email=" + email + ", roleId=" + roleId + "]";
	}

	@Override
	public String getMetaData() {
		// TODO Auto-generated method stub
		return toString();
	}
}
