package com.structural.proxy;

public class TestProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image img1 = new ProxyImage("image****$$$$$$1");
		Image img2 = new ProxyImage("image*****$$$$$2");
		
		img1.showImage();
		img2.showImage();
	}

}
