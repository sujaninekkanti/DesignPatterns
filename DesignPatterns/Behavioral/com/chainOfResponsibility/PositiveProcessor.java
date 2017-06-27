package com.chainOfResponsibility;

public class PositiveProcessor implements Chain{

	private Chain nextInChain;
	
	@Override
	public void setChain(Chain c) {
		// TODO Auto-generated method stub
		nextInChain = c;
	}

	@Override
	public void process(Number request) {
		// TODO Auto-generated method stub
		if(request.getNumber()>0){
			System.out.println("the request is handled by positive processor "+request.getNumber());
		}
		else{
			nextInChain.process(request);
		}
	}

}
