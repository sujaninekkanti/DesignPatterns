package com.observer;

public class TemperatureCustomer1 implements TemperatureObserver {

	@Override
	public void update(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("customer 1 found the temperature as "+temperature);
	}

}
