package com.example.demo.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.UserEntity;


@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	
	Optional<UserEntity> findByUserEmail(String email);
}
