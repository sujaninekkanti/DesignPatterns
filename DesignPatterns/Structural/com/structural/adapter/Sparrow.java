package com.structural.adapter;

public class Sparrow implements Bird{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("sparrow can fly");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("sparrow can chirp chirp");
	}

}
