package com.creational.FactoryMethod;

public class USA implements Currency{

	@Override
	public String getCurrency() {
		// TODO Auto-generated method stub
		return "Dollar";
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return "$";
	}

}
