package com.observer;

public interface TemperatureSubject {

	public void addObserver(TemperatureObserver TemperatureObserver);
	
	public void removeObserver(TemperatureObserver TemperatureObserver);
	
	public void notification();
}
