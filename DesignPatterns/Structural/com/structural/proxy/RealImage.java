package com.structural.proxy;

public class RealImage implements Image{

	private String fileName = null;
	public RealImage(String fileName){
		this.fileName = fileName;
	}
	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		System.out.println("show image real image ....."+fileName);
	}

}
