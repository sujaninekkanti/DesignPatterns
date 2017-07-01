package com.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator {

	private List<User> users;
	
	public  ChatMediatorImp(){
		this.users = new ArrayList();
	}
	@Override
	public void sendMessage(String msg, User user) {
		// TODO Auto-generated method stub
		for(User u : users){
			if(u!=user){
				u.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
	}

}
