package com.structural.flyweight;

public class TestFlyweight {
	
	public static final int ROWS =6, COLS =10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory thefactory = new Factory(ROWS);
		
		for(int i=0;i<ROWS;i++){
			
			for(int j=0;j<COLS;j++){
				
				thefactory.getFlyweight(i).display(j);
				System.out.print(" ");
			}
		}
		
	}

}
