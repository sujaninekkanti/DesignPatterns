package com.creational.builder;

public class User {
	
	private  final String firstName;
	private  final String lastName;
	private  final int age;
	private  final String address;
	private  final int phoneNumber;

	private User(UserBuilder builder){
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.address = builder.address;
		this.phoneNumber = builder.phoneNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	public static class UserBuilder{

		private  String firstName;
		private  String lastName;
		private   int age;
		private   String address;
		private   int phoneNumber;
		
		public UserBuilder(String firstName,String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age){
			this.age = age;
			return this;
		}
		
		public UserBuilder address(String address){
			this.address = address;
			return this;
		}
		
		public UserBuilder phoneNumber(int phoneNumber){
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		
		//returns a final user object
		public User build(){
			User user = new User(this);
			return user;
		}
	}
	
}
