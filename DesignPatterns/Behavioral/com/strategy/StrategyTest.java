package com.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] listToBeSorted ={87,56,48,2};
		
		MySorter mysorter = new MySorter();
		
		
		mysorter.setSorter(new BubbleSort());
		mysorter.doSort(listToBeSorted);
		
		
		mysorter.setSorter(new QuickSort());
		mysorter.doSort(listToBeSorted);
	}

}
