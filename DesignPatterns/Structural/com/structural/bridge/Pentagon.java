package com.structural.bridge;

public class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		System.out.println("pentagon is filled with color");
		color.applyColor();
	}

}
