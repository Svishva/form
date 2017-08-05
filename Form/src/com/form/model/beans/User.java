
package com.form.model.beans;

/**
 * User Beans Class
 * 
 * User info  processed between Frontend and Backend use
 * this Beans.
 * 
 * user info are stored here and processed
 * 
 * @author visweshwaran
 *
 */
public class User {
	
	
	private Long UserID;
	private String UserName;
	private String UserEmail;
	private String UserPassword;
	private String UserPhoneNo;
	private String UserAge;
	private Boolean NewUser;
	
	public User(Builder builder){
		
		UserID= builder.UserID;
		UserName = builder.UserName;
		
	}
	
	public User() {
	}

	private static class Builder{
		
		private Long UserID;
		private String UserName;
		private String UserEmail;
		private String UserPassword;
		private String UserPhoneNo;
		private String UserAge;
		private Boolean NewUser;
		
		public Builder(){
			
			
		}
		
		public User build(){
			
			return new User(this);
		}
		
		public Builder UserID(Long val){
			
			UserID = val;
			return null;
		}
		
		
	}
	
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	public String getUserPhoneNo() {
		return UserPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		UserPhoneNo = userPhoneNo;
	}
	public String getUserAge() {
		return UserAge;
	}
	public void setUserAge(String userAge) {
		UserAge = userAge;
	}
	public Boolean getNewUser() {
		return NewUser;
	}
	public void setNewUser(Boolean newUser) {
		NewUser = newUser;
	}





}
