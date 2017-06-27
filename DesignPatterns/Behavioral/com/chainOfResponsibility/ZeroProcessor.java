package com.chainOfResponsibility;

public class ZeroProcessor implements Chain{

	private Chain nextInChain;
	@Override
	//this is next chain of the present chain
	public void setChain(Chain c) {
		// TODO Auto-generated method stub
		nextInChain =c;
	}

	@Override
	public void process(Number request) {
		// TODO Auto-generated method stub
		if(request.getNumber()==0){
			System.out.println("handled the request by zero processor  "+request.getNumber());
		}else{
			nextInChain.process(request);
		}
	}

}
