package com.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

	@Override
	public int visit(Book book) {
		// TODO Auto-generated method stub
		
		int cost =0;
		if(book.getPrice() > 50){
			cost = book.getPrice() -5;
		}
		else{
			cost = book.getPrice();
			System.out.println("book isbn:"+book.getIsbnNumber()+"  cost="+cost);
		}
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		// TODO Auto-generated method stub
		int cost = fruit.getPricePerKg()*fruit.getWeight();
		System.out.println(fruit.getName()+"cost ="+cost);
		return cost;
	}
	
	

}
