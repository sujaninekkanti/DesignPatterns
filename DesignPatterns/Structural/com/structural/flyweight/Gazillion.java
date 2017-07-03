package com.structural.flyweight;

public class Gazillion {
	
	private int row;
	
	
	public Gazillion(int row){
		this.row = row;
		System.out.println("row number "+row);
	}
	
	public void display(int col){
		System.out.print(" "+row+col);
	}
}
