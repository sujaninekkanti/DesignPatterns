package com.template;

public abstract class HouseTemplate {

	public final void buildHouse(){
		
		//implementation in same class
		buildFoundation();
		//implementation in sub class
		buildPillars();
		//implementation in sub class
		buildWalls();
		//implementation in same class
		buildWindows();
		
		
		System.out.println("house is built");
	}
	public void buildFoundation(){
		System.out.println("building foundation with cement and sand");
	}
	
	
	public void buildWindows(){
		System.out.println("building windows..");
	}
	
	//methods to be implemented by subclasses
	public abstract void buildWalls();
	
	public abstract void buildPillars();
}
