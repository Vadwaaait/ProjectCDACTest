package com.example.demo.Dto;

public class AdminDTO {
	
	
	private int adminId;
	
	private String adminName;
	
	private String adminEmail;
	
	private String adminPassword;

	public AdminDTO( String adminName, String adminEmail, String adminPassword) {
		super();
		
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}

	public AdminDTO() {
		super();
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "AdminDTO [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + "]";
	}
	
	
	

}
