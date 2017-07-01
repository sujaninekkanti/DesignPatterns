package com.mediator;

public class TestMediator {

	public static void main(String args[]){
		
	
	ChatMediator mediator = new ChatMediatorImp();
	
	User user1 = new UserImpl(mediator,"sujani");
	User user2 = new UserImpl(mediator,"karim");
	User user3 = new UserImpl(mediator,"revathi");
	User user4 = new UserImpl(mediator,"home");
	User user5 = new UserImpl(mediator,"ball");
	
	mediator.addUser(user1);
	mediator.addUser(user2);
	mediator.addUser(user3);
	mediator.addUser(user4);
	
	user1.send("hi all....");
}
}