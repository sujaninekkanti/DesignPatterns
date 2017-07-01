package com.interpreter;

public class NumberExpression implements Expression {

	int number;
	
	public NumberExpression(int i) {
		super();
		this.number = i;
	}
	
	public NumberExpression(String s) {
		
		number = Integer.parseInt(s);
	}

	

	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return number;
	}

}
