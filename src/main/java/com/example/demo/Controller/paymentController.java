package com.example.demo.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.paymentDTO;
import com.example.demo.ServiceImpl.PaymentService;
import com.stripe.exception.StripeException;

@RestController
@CrossOrigin
@RequestMapping("/payment")
public class paymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping
	public ResponseEntity<String> completePayment(@RequestBody paymentDTO paymentDto) throws StripeException 
	{
		String chargeId= paymentService.charge(paymentDto);
		
		return chargeId!=null? new ResponseEntity<String>(chargeId,HttpStatus.OK) :
				new ResponseEntity<String>("Please check your card details",HttpStatus.BAD_REQUEST);
	}

}
