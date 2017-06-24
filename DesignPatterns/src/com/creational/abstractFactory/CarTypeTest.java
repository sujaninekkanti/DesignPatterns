package com.creational.abstractFactory;

public class CarTypeTest {

	private Car car;
	
	public static void main(String args[]){
		
		CarTypeTest type = new CarTypeTest();
		Car car = type.getCar("GeneralMotors");
		
		System.out.println(car.getWheels().getSpecification());
		System.out.println(car.getSeatCovers().getSpecification());
		System.out.println(car.getBody().getSpecification());
		System.out.println(car.getMirrors().getSpecification());
	}
	
	
	public Car getCar(String CarType){
		if(CarType.equals("BMW")){
			car = new CarBMW();
		}
		else if(CarType.equals("Swift")){
			car = new Swift();
		}
		else if(CarType.equals("GeneralMotors")){
			car = new GeneralMotors();
		}
		return car;
	}
}
