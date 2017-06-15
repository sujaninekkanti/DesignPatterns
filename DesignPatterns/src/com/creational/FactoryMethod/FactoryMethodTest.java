package com.creational.FactoryMethod;

public class FactoryMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrencyFactory currencyfactory = new CurrencyFactory();
		
		Currency createdcurrency =currencyfactory.getCurrency("Dollar");
		System.out.println(createdcurrency.getCurrency());
		System.out.println(createdcurrency.getSymbol());
		
		Currency createdcurrency1 =currencyfactory.getCurrency("Rupees");
		System.out.println(createdcurrency1.getSymbol());
		System.out.println(createdcurrency1.getCurrency());
	}

}
