package com.observer;

public class TemperatureCustomer2 implements TemperatureObserver{

	@Override
	public void update(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("customer 2 found the temperature as .."+temperature);
	}

}
