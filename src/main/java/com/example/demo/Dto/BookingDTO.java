package com.example.demo.Dto;

import java.sql.Date;

import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.UserEntity;

public class BookingDTO {

	private int bookingId;
	
	private UserEntity userE;
	
	private HotelEntity hotelE;
	
private Date fromDate;
	
	private Date toDate;
	
	private int noOfDays;
	
	private double amountPaid;

	

	public BookingDTO(UserEntity userE, HotelEntity hotelE, Date fromDate, Date toDate, int noOfDays,
			double amountPaid) {
		super();
		this.userE = userE;
		this.hotelE = hotelE;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfDays = noOfDays;
		this.amountPaid = amountPaid;
	}

	public int getBookingId() {
		return bookingId;
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

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public UserEntity getUserE() {
		return userE;
	}

	public void setUserE(UserEntity userE) {
		this.userE = userE;
	}

	public HotelEntity getHotelE() {
		return hotelE;
	}

	public void setHotelE(HotelEntity hotelE) {
		this.hotelE = hotelE;
	}

	@Override
	public String toString() {
		return "BookingDTO [bookingId=" + bookingId + ", userE=" + userE + ", hotelE=" + hotelE + ", fromDate="
				+ fromDate + ", toDate=" + toDate + ", noOfDays=" + noOfDays + ", amountPaid=" + amountPaid + "]";
	}
	
	
	
	
	
	
	
	
}
