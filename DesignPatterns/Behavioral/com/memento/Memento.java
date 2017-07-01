package com.memento;

public class Memento {

	//taking string object
	private String state;
	
	
	//creating constructor
	public Memento(String state){
		this.state = state;
	}
	
	
	//getting the state of string object
	public String getState(){
		return state;
	}
}
