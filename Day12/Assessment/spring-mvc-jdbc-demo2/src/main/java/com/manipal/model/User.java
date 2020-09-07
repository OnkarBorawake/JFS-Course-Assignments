package com.manipal.model;

import javax.annotation.processing.Generated;


public class User {
	
	private int userId;

	private String userName;
	private String userGender;
	private String select;
	private String email;
	private String phone;
	
//	private static int count;
//	static
//	{
//		count=0;
//	}
//	private static int getCount()
//	{
//		return ++count;
//	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getSelect() {
		return select;
	}
	public void setSelect(String select) {
		this.select = select;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	
//	public int getUserId() {
//		this.userId = getCount();
//		return userId;
//	}
//
//
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//
//	public static void setCount(int count) {
//		User.count = count;
//	}

	
	
}


//CREATE TABLE USER (USERNAME VARCHAR(25) NOT NULL, LOCATION VARCHAR(25) );

