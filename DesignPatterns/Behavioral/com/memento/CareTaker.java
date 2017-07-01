package com.memento;

import java.util.ArrayList;

public class CareTaker {
	
	private ArrayList<Memento> mementos = new ArrayList();
	
	public void addMemeto(Memento m){
		mementos.add(m);
	}
	
	public Memento getMemento(){
		return mementos.get(1);
	}
}
