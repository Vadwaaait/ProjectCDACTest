package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Entity.AdminEntity;
import com.example.demo.Repo.AdminRepo;
import com.example.demo.Service.AdminService;


@Service
public class AdminServiceImp implements AdminService{

	@Autowired
	AdminRepo adminRepo;
	
	
	
	@Override
	public String addAdmin(AdminDTO adminDto) {
		
		AdminEntity ae = new AdminEntity(adminDto.getAdminName(),adminDto.getAdminEmail(),adminDto.getAdminPassword());
		
		adminRepo.save(ae);
		
		return ae.getAdminName() + ": Saved in Database";
	}

	
	
	
}
