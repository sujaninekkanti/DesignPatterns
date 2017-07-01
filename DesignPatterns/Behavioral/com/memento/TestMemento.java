package com.memento;

public class TestMemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CareTaker caretaker = new CareTaker();
		Originator originator = new Originator();
		
		originator.setState("state1");
		originator.setState("state2");
		
		caretaker.addMemeto(originator.save());
		originator.setState("state3");
		
		caretaker.addMemeto(originator.save());
		originator.setState("state4");
		
		originator.restore(caretaker.getMemento());;
		
	}

}
