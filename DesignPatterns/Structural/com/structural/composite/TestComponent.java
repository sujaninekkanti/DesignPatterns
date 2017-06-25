package com.structural.composite;

public class TestComponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leaf leaf1 = new Leaf("leaf1");
		Leaf leaf2 = new Leaf("leaf2");
		Leaf leaf3 = new Leaf("leaf3");
		Leaf leaf4 = new Leaf("leaf4");
		Leaf leaf5 = new Leaf("leaf5");
		
		Composite composite1 = new Composite();
		composite1.add(leaf1);
		composite1.add(leaf2);
		
		Composite composite2 = new Composite();
		composite2.add(leaf3);
		composite2.add(leaf4);
		
		Composite composite3 = new Composite();
		composite3.add(composite1);
		composite3.add(composite2);
		composite3.add(leaf5);
		
		System.out.println("calling ...hello on leaf1");
		leaf1.sayHello();
		
		
		System.out.println("calling ...hello on composite1");
		composite1.sayHello();
		
		System.out.println("calling ...hello on composite2");
		composite2.sayHello();
		
		System.out.println("calling ...hello on composite3");
		composite3.sayGoodbye();
	}

}
