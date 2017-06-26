package com.structural.decorator;

public class CarDecorator implements Car{

	Car car;
	
	public CarDecorator(Car c){
		this.car=c;
	}
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		this.car.assemble();
	}

}
