package com.structural.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
	}

}
