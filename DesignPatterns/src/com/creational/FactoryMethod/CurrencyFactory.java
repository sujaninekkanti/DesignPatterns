package com.creational.FactoryMethod;

public class CurrencyFactory {
	
	
	public Currency getCurrency(String currencyType){
		
		Currency currency = null;
		
		
		if("Rupees".equals(currencyType)){
			currency = new India();
		}
		else if("Dollar".equals(currencyType)){
			currency = new USA();
		}
		return currency;
		
	}
}
