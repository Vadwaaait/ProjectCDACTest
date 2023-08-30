package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
