package com.example.demo.Entity;

import org.springframework.web.bind.annotation.RequestBody;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ImageEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	

	private String name;

	
	private String pathname;
	
	
	
	

	public ImageEntity(String name, String pathname) {
		super();
		
		this.name = name;
		this.pathname = pathname;
	}

	public ImageEntity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPathname() {
		return pathname;
	}

	public void setPathname(String pathname) {
		this.pathname = pathname;
	}

	@Override
	public String toString() {
		return "ImageEntity [id=" + id + ", name=" + name + ", pathname=" + pathname + "]";
	}
	
	
	
	
	
}
