package com.tiaa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiaa.helper.NumberGenerator;
import com.tiaa.helper.Validate;

@Service
public class CCNumberGeneratorImpl implements ICCNumberGenerator {

	@Autowired
	Validate validate;

	public CCNumberGeneratorImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateNumber(String cardType) {
		String generatedNumber = null ;
		// TODO Auto-generated method stub
		if (validate.validateCardType(cardType)) {
			generatedNumber = NumberGenerator.generateNumber(cardType);
		}
		return generatedNumber;
	}

	@Override
	public String generateNumber(String cardType, int count) {
		// TODO Auto-generated method stub
		return null;
	}

}
