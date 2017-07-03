package com.structural.flyweight;

public class Factory {

	private Gazillion[] pool;
	
	public Factory(int maxRows){
		
		pool = new Gazillion[maxRows];
		
		//creating an array of max rows
	}
	
	public Gazillion getFlyweight(int row){
		if(pool[row]==null){
			//if row is null creating a new row
			pool[row] = new Gazillion(row);
		}
		// returning the pool
		return pool[row];
	}
}
