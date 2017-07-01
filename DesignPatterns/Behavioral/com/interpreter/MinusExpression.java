package com.interpreter;

public class MinusExpression implements Expression {

	Expression leftExpression;
	Expression rightExpression;
	
	
	
	public MinusExpression(Expression leftExpression, Expression rightExpression) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}



	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExpression.interpret()-rightExpression.interpret();
	}

	
}
