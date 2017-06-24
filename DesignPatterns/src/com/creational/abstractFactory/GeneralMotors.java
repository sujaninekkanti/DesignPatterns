package com.creational.abstractFactory;

public class GeneralMotors extends Car {

	@Override
	public Parts getWheels() {
		// TODO Auto-generated method stub
		return new Parts("get general motors wheels");
	}

	@Override
	public Parts getMirrors() {
		// TODO Auto-generated method stub
		return new Parts("get general motors mirrors");
	}

	@Override
	public Parts getSeatCovers() {
		// TODO Auto-generated method stub
		return new Parts("get general motors seat covers");
	}

	@Override
	public Parts getBody() {
		// TODO Auto-generated method stub
		return new Parts("get general motors body");
	}

}
