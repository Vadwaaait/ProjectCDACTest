package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.ImageEntity;

@EnableJpaRepositories
@Repository
public interface ImgRepo extends JpaRepository<ImageEntity, Integer>{
	

}
