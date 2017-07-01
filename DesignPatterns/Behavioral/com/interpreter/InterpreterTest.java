package com.interpreter;

import java.util.Stack;

public class InterpreterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tokenString = "4 3 2 - 1 + *";
		
		Stack stack = new Stack();
		
		String[] tokenlist = tokenString.split(" ");
		
		for(String s : tokenlist){
			
			if(isOperator(s)){
				
				Expression rightExpression = (Expression) stack.pop();
				Expression leftExpression = (Expression) stack.pop();
				
				Expression operator = getOperatorInstance(s,leftExpression,rightExpression);
				
				int result = operator.interpret();
				stack.push(new NumberExpression(result));
			}
			else{
				Expression i = new NumberExpression(s);
				stack.push(i);
			}
			System.out.println("Result: "+((Expression) stack.pop()).interpret());
			
		}		

}
	public static boolean isOperator(String s){
		if(s.equals("+") || s.equals("-") || s.equals("*")){
			return true;
		}
		else
		{
		return false;
	}
	}
	
	public static Expression getOperatorInstance(String s, Expression left,
			Expression right) {
		
		if(s.equals("+")){
			return new PlusExpression(left, right);
		} else if (s.equals("-")){
			return new MinusExpression(left, right);
		} else if (s.equals("*")){
			return new MultiplyExpression(left, right);
		} else{
			return null;
		}
		
	}
	
	}
