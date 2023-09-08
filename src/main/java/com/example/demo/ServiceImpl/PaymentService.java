package com.example.demo.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.paymentDTO;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.PaymentIntent;
import com.stripe.net.RequestOptions;
import com.stripe.param.PaymentIntentCreateParams;

import jakarta.annotation.PostConstruct;

@Service
public class PaymentService {
	
	
	private String secretKey="sk_test_51NihodSEh35AhV879NoBhv66UGrXpjs57Rq2j7Ef2dF91RO6CiyLQiH1uYCf2TxFHIb2mg1NRNZ5sLO4gJU74ttj006tXo2Pic";

	@PostConstruct
	public void init() {
		Stripe.apiKey="sk_test_51NihodSEh35AhV879NoBhv66UGrXpjs57Rq2j7Ef2dF91RO6CiyLQiH1uYCf2TxFHIb2mg1NRNZ5sLO4gJU74ttj006tXo2Pic";
	}
	
	public String charge(paymentDTO paymentDto) throws StripeException
	{
		
		String chargeId=null;
		try {

			
			PaymentIntentCreateParams createParams=new PaymentIntentCreateParams.Builder()
					.setCurrency("inr")
					.setAmount(paymentDto.getAmount()*1L)
					.build();
					
			PaymentIntent intent= PaymentIntent.create(createParams);
			
			
			
			chargeId=intent.getId();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return chargeId;
	}
	
	

	
	
	
	
	
}
