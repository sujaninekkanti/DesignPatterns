package com.Template;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseTemplate woodenhouse = new WoodenHouse();
		
		woodenhouse.buildHouse();
		
		
		System.out.println("*********building glass house*****************");
		
		HouseTemplate glasshouse = new GlassHouse();
		glasshouse.buildHouse();
	}

}
