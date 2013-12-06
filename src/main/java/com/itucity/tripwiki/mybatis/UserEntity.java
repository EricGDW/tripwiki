package com.itucity.tripwiki.mybatis;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = -458045724375300041L;

	private String userID;
	
	private String userPWD;
	
	private String userName;
	
	private String userBirthday;
	
	private String userSalary;

	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPWD() {
		return userPWD;
	}

	public void setUserPWD(String userPWD) {
		this.userPWD = userPWD;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(String userSalary) {
		this.userSalary = userSalary;
	}
}
