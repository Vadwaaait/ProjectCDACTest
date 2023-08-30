package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.AdminEntity;
import com.example.demo.Entity.Role;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.AdminRepo;
import com.example.demo.Repo.RoleRepo;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.AdminService;


@Service
public class AdminServiceImp implements AdminService{

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	RoleRepo roleRepo;
	
	@Override
	public String addAdmin(UserDTO userDto) {
		
//		AdminEntity ae = new AdminEntity(adminDto.getAdminName(),adminDto.getAdminEmail(),adminDto.getAdminPassword());
//		
//		adminRepo.save(ae);
//		
//		return ae.getAdminName() + ": Saved in Database";
		
		
UserEntity userEntity = new UserEntity(
				
				userDto.getUserName(),
				userDto.getUserEmail(),
				userDto.getUserPassword()
			
				);
		
//		userEntity.getRoles().add(role);
		
		
		
		
		
		
//		Role role=roleRepo.findById(1).orElse(null);
//		System.out.println(role);
//	
//		userEntity.getRoles().add(role);
//		System.out.println(userEntity);
		
				Role role=roleRepo.findById(2).orElse(null);
				
				userEntity.getRoles().add(role);
		
		
		userRepo.save(userEntity);
		
		return "User Added :  "+ userEntity.getUserId() ;
	}

	
	
	
}
