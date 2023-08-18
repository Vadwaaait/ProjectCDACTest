package com.example.demo.Dto;

public class HotelDto {
	
	
	private int hotelId;
	
	private String hotelName;
	
	private String hotelCity;
	
	private String hotelAddress;
	
	private double hotelPrice;
	
	private int noOfRooms;

	

	public HotelDto(String hotelName, String hotelCity, String hotelAddress, double hotelPrice, int noOfRooms) {
		super();
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelAddress = hotelAddress;
		this.hotelPrice = hotelPrice;
		this.noOfRooms = noOfRooms;
	}

	public HotelDto() {
		super();
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public double getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(double hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

	@Override
	public String toString() {
		return "HotelDto [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity
				+ ", hotelAddress=" + hotelAddress + ", hotelPrice=" + hotelPrice + "]";
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	
	
	
	
	
	
	

}
