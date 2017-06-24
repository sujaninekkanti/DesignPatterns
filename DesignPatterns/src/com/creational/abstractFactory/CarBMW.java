package com.creational.abstractFactory;

public class CarBMW extends Car{

	@Override
	public Parts getWheels() {
		// TODO Auto-generated method stub
		return new Parts("BMW wheels");
	}

	@Override
	public Parts getMirrors() {
		// TODO Auto-generated method stub
		return new Parts("BMW Mirrors");
	}

	@Override
	public Parts getSeatCovers() {
		// TODO Auto-generated method stub
		return new Parts("BMW seat covers");
	}

	@Override
	public Parts getBody() {
		// TODO Auto-generated method stub
		return new Parts("BMW body...");
	}

}
