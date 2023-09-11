package com.example.demo.Controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Dto.AdminDTO;
import com.example.demo.Dto.HotelDto;
import com.example.demo.Dto.UserDTO;
import com.example.demo.Entity.BookingEntity;
import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.ImageEntity;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.AdminService;
//import com.example.demo.imageHelper.ImgHelper;
import com.example.demo.imageHelper.ImgHelper;

@RestController
@CrossOrigin(originPatterns = "*")
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	AdminService adminServie;
	
	@Autowired
	ImgHelper imghelp;
	
	
	@PostMapping("/save")
	public String saveAdmin(@RequestBody UserDTO adminDto) {
		
		try {
			
			String id=adminServie.addAdmin(adminDto);
			return id;	
		}
		catch(Exception e)
		{
			return "Some error has occured";
		}
		
		
	}
	
	
	
	
	@PostMapping("/AdminLogin")
	public UserEntity loginAdmin(@RequestBody UserDTO userDto)
	{
		
		
		return adminServie.loginAdmin(userDto);
	}
	
	
	@PutMapping("/editHotel")
	public HotelEntity editHotelById(@RequestBody HotelDto hotelDto)
	{
		
		
		return adminServie.editHotelById(hotelDto);
	}
	
	
	@DeleteMapping("/deletehotel/{id}")
	public String deleteHotelById(@PathVariable("id") int hotid)
	{
		
		
		
		return adminServie.deleteHotelById(hotid);
		
	}
	
	@GetMapping("/allbookingdetails")
	public List<BookingEntity> getALlListOfBooking(){
		
		
		return adminServie.allbookingdetails();
	}
	
	
	@PostMapping("/uploadimg")
	public String uploadImg(@RequestParam("file") MultipartFile file,@RequestParam("hotid") int hotelid ) {
	
		
		
		
		
		
		
		
		try {
		System.out.println(file.getOriginalFilename());
	
		if(file.isEmpty())
		{
			return"Request Must Contain File";
		}
		
		if(!file.getContentType().equals("image/jpeg"))
		{
			return "Request must only contain jpeg file";
		}
		
		
		boolean result=imghelp.uploadimg(file,hotelid);
		
		if(result==true)
		{
			return "File Uploaded Successfully";
		}
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return "working";
	}
	
	@GetMapping("/getImage/{hotelid}")
	public String getImage(@PathVariable int hotelid) {
		
		
		
		
		return adminServie.getImage(hotelid);
	}
	

}
