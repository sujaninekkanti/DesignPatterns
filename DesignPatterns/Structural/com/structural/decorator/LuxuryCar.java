package com.structural.decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void assemble(){
		super.assemble();
		System.out.println("adding features of luxury car");
	}
}
