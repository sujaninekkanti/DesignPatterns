package com.visitor;

public class Book implements ItemElement{

	int price;
	String isbnNumber;
	
	
	public Book(int price, String isbnNumber) {

		this.price = price;
		this.isbnNumber = isbnNumber;
	}


	public int getPrice() {
		return price;
	}


	

	public String getIsbnNumber() {
		return isbnNumber;
	}


	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

}
