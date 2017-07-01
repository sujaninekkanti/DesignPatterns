package com.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TemperatureStation implements TemperatureSubject{

	Set<TemperatureObserver> temperatureObserver = new HashSet<TemperatureObserver>();
	int temperature;
	
	public TemperatureStation(
			int temperature) {
		
		this.temperatureObserver = new HashSet<TemperatureObserver>();
		this.temperature = temperature;
	}
	@Override
	public void addObserver(TemperatureObserver TemperatureObserver) {
		// TODO Auto-generated method stub
		temperatureObserver.add(TemperatureObserver);
		
	}
	@Override
	public void removeObserver(TemperatureObserver TemperatureObserver) {
		// TODO Auto-generated method stub
		temperatureObserver.remove(temperatureObserver);
	}
	@Override
	public void notification() {
		// TODO Auto-generated method stub
		Iterator<TemperatureObserver> it = temperatureObserver.iterator();
		while(it.hasNext()){
			TemperatureObserver temperatureObserver = it.next();
			temperatureObserver.update(temperature);
			
		}
		
	}
	
	
	public void setTemperature(int newTemperature){
		System.out.println("setting temperature to   "+newTemperature );
		temperature = newTemperature;
		notification();
	}
	
}
