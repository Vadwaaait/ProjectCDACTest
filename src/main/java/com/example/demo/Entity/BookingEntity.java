package com.example.demo.Entity;


import java.sql.Date;
import java.util.List;

import org.apache.catalina.User;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	@ManyToOne
	private UserEntity userE;
	
	@ManyToOne
	private HotelEntity hotelE;

	
	private Date fromDate;
	
	private Date toDate;
	
	private int noOfDays;
	
	
	public int getNoOfDays() {
		return noOfDays;
	}


	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	private int noroomsbooked;
	
	public int getNoroomsbooked() {
		return noroomsbooked;
	}


	public void setNoroomsbooked(int noroomsbooked) {
		this.noroomsbooked = noroomsbooked;
	}


	private double amountPaid;


	public double getAmountPaid() {
		return amountPaid;
	}


	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}


	public BookingEntity(UserEntity userE, HotelEntity hotelE, Date fromDate, Date toDate,int noOfDays,double amountPaid,int noroomsbooked) {
		super();
		this.userE = userE;
		this.hotelE = hotelE;
		this.fromDate = fromDate;
		this.toDate=toDate;
		this.noOfDays=noOfDays;
		this.amountPaid=amountPaid;
		this.noroomsbooked=noroomsbooked;
	}


	public BookingEntity() {
		super();
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


	public int getBookingId() {
		return bookingId;
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


	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}


	@Override
	public String toString() {
		return "BookingEntity [bookingId=" + bookingId + ", userE=" + userE + ", hotelE=" + hotelE + ", fromDate="
				+ fromDate + ", toDate=" + toDate + "]";
	}


	

	
	

	
	
	
	
	
	
}
