package com.tiaa.service;

import org.springframework.stereotype.Component;


public interface ICCNumberGenerator {
	
	public String generateNumber(String cardType);
	
	public String generateNumber(String cardType , int count );

}
