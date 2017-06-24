package com.creational.abstractFactory;

public class Swift extends Car {

	@Override
	public Parts getWheels() {
		// TODO Auto-generated method stub
		return new Parts("get wheels for swift car..");
	}

	@Override
	public Parts getMirrors() {
		// TODO Auto-generated method stub
		return new Parts("get mirros of swift car...");
	}

	@Override
	public Parts getSeatCovers() {
		// TODO Auto-generated method stub
		return new Parts("get seat covers of swift car...");
	}

	@Override
	public Parts getBody() {
		// TODO Auto-generated method stub
		return new Parts("get body of swift car");
	}

}
