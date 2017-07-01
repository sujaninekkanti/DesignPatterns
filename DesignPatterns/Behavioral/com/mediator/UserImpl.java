package com.mediator;

public class UserImpl extends User{

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name+" sending message "+msg);
		mediator.sendMessage(msg,this);
	}

	@Override
	public void receive(String msg) {
		// TODO Auto-generated method stub
		System.out.println(this.name+" received messsage "+msg);
	}

}
