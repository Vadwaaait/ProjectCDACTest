package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="AdminTable",uniqueConstraints={@UniqueConstraint(columnNames={"adminEmail"})})
public class AdminEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminId;
	
	
	@Column(name = "adminName")
	private String adminName;
	
	
	@Column(name="adminEmail")
	private String adminEmail;
	
	
	@Column(name="adminPassword")
	private String adminPassword;


	public AdminEntity(String adminName, String adminEmail, String adminPassword) {
		super();
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}


	public AdminEntity() {
	
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
		return "AdminEntity [adminId=" + adminId + ", adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + "]";
	}
	
	
	
	
	
}
