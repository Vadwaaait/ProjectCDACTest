package com.example.demo.Dto;

public class paymentDTO {
	
	private String email;
	
	private String token;
	
	private int amount;

	public paymentDTO(String email, String token, int amount) {
		super();
		this.email = email;
		this.token = token;
		this.amount = amount;
	}

	public paymentDTO() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "paymentDTO [email=" + email + ", token=" + token + ", amount=" + amount + "]";
	}
	
	

}
