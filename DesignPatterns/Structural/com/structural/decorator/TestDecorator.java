package com.structural.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sportscar = new SportsCar(new BasicCar());
		sportscar.assemble();
		
		
		Car sportsluxurycar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsluxurycar.assemble();
	}

}
