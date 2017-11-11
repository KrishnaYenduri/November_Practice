package com.jsp.ms.beans;

public class User {

	private int userId;

	private String userName;

	private String mobileNo;

	private String emailId;

	public User(int userId, String userName, String mobileNo, String emailId) {
		this.userId = userId;
		this.userName = userName;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ "]";
	}
}
