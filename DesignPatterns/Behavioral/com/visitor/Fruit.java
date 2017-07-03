package com.visitor;

public class Fruit implements ItemElement {

	String name;
	int weight;
	int pricePerKg;
	
	
	
	


	public Fruit(String name, int weight, int pricePerKg) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
	}




	public String getName() {
		return name;
	}




	public int getWeight() {
		return weight;
	}




	public int getPricePerKg() {
		return pricePerKg;
	}




	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
