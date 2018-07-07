package com.tiaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiaa.service.ICCNumberGenerator;

@RestController
@RequestMapping(value = "/CCEngine")
public class CreditCardController {
	
    @Autowired
	ICCNumberGenerator  ccNumberGeneratorService ;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/{cardType}/{noOfCards}", consumes = { MediaType.APPLICATION_JSON_VALUE} ,
			 produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity pullAWSAccountsData(
			@PathVariable("cardType") String cardType , @PathVariable("noOfCards") int noOfCards ) {
		
		try {
			ccNumberGeneratorService.generateNumber(cardType);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
}


	
	