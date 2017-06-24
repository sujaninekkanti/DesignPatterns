package com.strucutral.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sparrow sparrow = new Sparrow();
		PlasticToyDuck toyduck = new PlasticToyDuck();
		
		//bird in birdadapter so it behaves like a toyduck
		ToyDuck birdAdapter = new BirdAdapter(sparrow);
		
		System.out.println("sparrow.....");
		sparrow.fly();
		sparrow.makeSound();
		
		System.out.println("toy duck.....");
		toyduck.squeak();
		
		//bird behaving like a toy duck
		System.out.println("bird adapter.....");
		birdAdapter.squeak();
	}

}
