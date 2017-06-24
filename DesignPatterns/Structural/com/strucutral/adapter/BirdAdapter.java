package com.strucutral.adapter;

/**
 * @author Sujani
 * 
 * implement the interface which client needs it
 *
 */
public class BirdAdapter implements ToyDuck{

	Bird bird;
	public BirdAdapter(Bird bird){
		this.bird = bird;
	}
	@Override
	public void squeak() {
		// TODO Auto-generated method stub
		bird.makeSound();
	}

}
