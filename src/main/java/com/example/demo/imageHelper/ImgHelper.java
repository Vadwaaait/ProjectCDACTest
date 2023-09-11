package com.example.demo.imageHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entity.HotelEntity;
import com.example.demo.Entity.ImageEntity;
import com.example.demo.Repo.HotelRepo;
import com.example.demo.Repo.ImgRepo;

@Component
public class ImgHelper {

	
	public final String UPLOAD_DIR="D:\\Eclipse ws\\PracticeSpring-1\\src\\main\\resources\\static\\images";
	
	int counter=1;
	
	@Autowired
	HotelRepo hotelRepo;
	
	@Autowired
	ImgRepo imgRepo;
	
	
	public boolean uploadimg(MultipartFile file, int hotelid) {
		
		boolean flag=false;
		
		try {
			 
			InputStream is=file.getInputStream();
			
			byte[] imgdata=new byte[is.available()];
			
			is.read(imgdata);
			
			
			
			FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+"\\"+file.getOriginalFilename());
			
			fos.write(imgdata);
			
			fos.flush();
			
			fos.close();
			
			flag=true;
			
			
			ImageEntity img=new ImageEntity(file.getOriginalFilename(),UPLOAD_DIR+"\\"+file.getOriginalFilename());
			
			imgRepo.save(img);
			
			HotelEntity he= hotelRepo.findById(hotelid).orElse(null);
			
			if(he==null)
			{
			return false;	
			}
			else {
				
				he.setHotelImg(img);
				hotelRepo.save(he);
				
			}
			
			
			
			
			return flag;
			
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
		
	}
	
}
