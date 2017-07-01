package com.memento;

public class Originator {
	
	private String state;
	
	public void setState(String state){
		
		System.out.println("Originator:Setting the state of string object");
		this.state = state;
	}
	
	public Memento save(){
		System.out.println("Originator :Saving the sate of string object");
		return new Memento(state);
	}
	
	public void restore(Memento m){
		state = m.getState();
		System.out.println("Originator: state after restoring the previous tate"+state);
	}

}
