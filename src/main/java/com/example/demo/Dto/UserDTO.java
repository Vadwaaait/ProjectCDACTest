	package com.example.demo.Dto;

import jakarta.persistence.OneToMany;

public class UserDTO {
	
	
	
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	
	private int hotelid;
	
	
	
	
	
	public UserDTO() {
	
	}
	
	
	
	public UserDTO(int userId, String userName, String userEmail, String userPassword) {
		
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
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
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}



	public int getHotelid() {
		return hotelid;
	}



	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}



	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + "]";
	}
	
	
	

}
