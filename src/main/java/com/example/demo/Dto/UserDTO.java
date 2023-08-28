	package com.example.demo.Dto;



import java.sql.Date;

import jakarta.persistence.OneToMany;

public class UserDTO {
	
	
	
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	
	private int hotelid;
	
	
	//extras
	private Date fromDate;
	
	private Date toDate;
	
	private int noOfDays;
	
	private double amountPaid;
	
	private int noroomsbooked;
	
	
	





	public int getNoroomsbooked() {
		return noroomsbooked;
	}





	public void setNoroomsbooked(int noroomsbooked) {
		this.noroomsbooked = noroomsbooked;
	}





	public UserDTO() {
	
	}
	
	
	
	
	
	public int getNoOfDays() {
		return noOfDays;
	}





	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}





	public double getAmountPaid() {
		return amountPaid;
	}





	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
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


	

	public Date getFromDate() {
		return fromDate;
	}



	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}



	public Date getToDate() {
		return toDate;
	}



	public void setToDate(Date toDate) {
		this.toDate = toDate;
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
				+ userPassword + ", hotelid=" + hotelid + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
	
	
	

}
