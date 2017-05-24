package com.creational.singleton;

public class Singleton {

	private static Singleton instance;
	
	
	private Singleton() {
	}
	
	public static synchronized Singleton getinstance(){
		
		if(instance == null){
			
			instance = new Singleton();
		}
		
		return instance;
	}
	
}
