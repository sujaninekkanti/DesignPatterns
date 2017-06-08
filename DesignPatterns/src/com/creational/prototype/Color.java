package com.creational.prototype;

public abstract class Color implements PrototypeCapable{
	
	private String colorName;
	
	
	//abstract method doesn't need body
	abstract void fillcolor();
	
	public Color clone(){
		
		Color color = null;
		System.out.println("this clones object");
		return color;
	}
	
	public String toString(){
		return "color";
	}

}
