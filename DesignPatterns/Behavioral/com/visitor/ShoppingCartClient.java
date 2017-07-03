package com.visitor;

public class ShoppingCartClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
				new Fruit("Banana", 2, 10), new Fruit("Apple", 5, 5)};
		
		int total = calculatePrice(items);
		
		System.out.println("Total Cost = "+total);
	}
		
		
		private static int calculatePrice(ItemElement[] items) {
			ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
			int sum=0;
			for(ItemElement item : items){
				sum = sum + item.accept(visitor);
			}
			return sum;
		
	}

}
