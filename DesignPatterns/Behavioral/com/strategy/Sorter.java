package com.strategy;

public class Sorter {

	private SortInterface strategy;
	
	public void setSorter(SortInterface strategy){
		this.strategy = strategy;
	}
	
	public SortInterface getSorter(){
		return this.strategy;
	}
	
	public void doSort(int[] listToSort){
		
	}
}



