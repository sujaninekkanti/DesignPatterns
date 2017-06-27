package com.chainOfResponsibility;

public class NegativeProcessor implements Chain{

	private Chain nextInChain;
	@Override
	public void setChain(Chain c) {
		// TODO Auto-generated method stub
		nextInChain =c;
	}

	@Override
	public void process(Number request) {
		// TODO Auto-generated method stub
		if(request.getNumber()<0){
			System.out.println("request handled by negative processor "+request.getNumber());
		}else{
			nextInChain.process(request);
		}
	}

}
