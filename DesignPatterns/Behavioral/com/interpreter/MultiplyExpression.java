package com.interpreter;

public class MultiplyExpression implements Expression{

	Expression leftExpression;
	Expression rightExpression;
	
	
	
	public MultiplyExpression(Expression leftExpression,
			Expression rightExpression) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}



	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExpression.interpret()*rightExpression.interpret();
	}

}
