package com.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		User user1 = new User.UserBuilder("sujani","nekkanti").build();
		
		System.out.println(user1);
		
		User user2 = new User.UserBuilder("nekkanti","sujani").age(25).address("achanta").phoneNumber(1234).build();
		System.out.println(user2);
		
		User user3 = new User.UserBuilder("test","test").age(33).build();
		System.out.println(user3);
	}

}
