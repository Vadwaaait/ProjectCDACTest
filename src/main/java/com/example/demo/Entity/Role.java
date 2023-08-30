package com.example.demo.Entity;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
//	@ManyToMany(mappedBy = "roles")
//    private Collection<UserEntity> users;
	
	
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


	







	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}


	public Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Role() {
		super();
	}





	
	
	

}
