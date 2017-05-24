package com.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//the object cant we be created because of the private constructor
		//Singleton singleton = new Singleton();
		
		Singleton singletonObject = Singleton.getinstance();
		System.out.println(singletonObject.hashCode());
		
		Singleton singletonObject1 = Singleton.getinstance();
		System.out.println(singletonObject1.hashCode());
		
		//both the object hashcodes are same 

	}

}
