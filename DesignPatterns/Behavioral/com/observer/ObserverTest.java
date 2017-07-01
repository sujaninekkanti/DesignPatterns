package com.observer;

public class ObserverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TemperatureStation temperaturestation = new TemperatureStation(345);
		TemperatureCustomer1 temperaturecustomer1 = new TemperatureCustomer1();
		TemperatureCustomer2 temperaturecustomer2 = new TemperatureCustomer2();
		
		temperaturestation.addObserver(temperaturecustomer1);
		temperaturestation.addObserver(temperaturecustomer2);
		
		temperaturestation.setTemperature(34);
		temperaturestation.removeObserver(temperaturecustomer1);
		temperaturestation.setTemperature(45);
	}

}
