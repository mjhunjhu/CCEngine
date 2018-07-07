package com.tiaa.util;

public enum CCVendor {

	VISA_CARD("VISA"),
	MASTER_CARD("MASTER"),
	AMERICAN_EXPRESS_CARD("AMEX"),
	DISCOVER_CARDS("DISCOVER") ;
	
	private final String ccVendor ;
		
	CCVendor(String ccVendor){
		this.ccVendor = ccVendor ;
	}
	public boolean equalsIgnoreCase(final String value){
	    return ccVendor.equalsIgnoreCase(value);
	}
}
