package com.chainOfResponsibility;

public class TestChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NegativeProcessor chain1 = new NegativeProcessor();
		PositiveProcessor chain2 = new PositiveProcessor();
		ZeroProcessor chain3 = new ZeroProcessor();
		
		//creating a chain
		chain1.setChain(chain2);
		chain2.setChain(chain3);
		
		chain1.process(new Number(89));
		chain1.process(new Number(-98));
		chain1.process(new Number(0));
	}

}
