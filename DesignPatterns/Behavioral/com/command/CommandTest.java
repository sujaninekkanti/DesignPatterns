package com.command;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {

	
	public static List produceRequests(){
		
		//creates a list that addes the set of persons
		//to execute commands
		List<Command> list = new ArrayList();
		
		list.add(new DomesticEngineer());
		list.add(new Politician());
		list.add(new Programmer());
		
		return list;
	}
	
	//requesting the people to work 
	//client
	public static void toWorkRequests(List list){
		for(Object command: list){
			((Command)command).execute();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //creating people 
		List list = produceRequests();
		//calling the method 
		toWorkRequests(list);
	}

}
