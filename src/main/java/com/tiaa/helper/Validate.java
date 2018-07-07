package com.tiaa.helper;

import org.springframework.stereotype.Component;

import com.tiaa.util.CCVendor;

@Component
public class Validate {

	public boolean validateCardType(String s) {
		boolean enumContainsValue = enumContainsValue(s);
		return enumContainsValue;

	}

	private boolean enumContainsValue(String value) {
		for (CCVendor vender : CCVendor.values()) {
			if (vender.name().equals(value)) {
				return true;
			}
		}

		return false;
	}

}
