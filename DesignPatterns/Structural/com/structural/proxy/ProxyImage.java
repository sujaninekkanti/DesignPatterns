package com.structural.proxy;

public class ProxyImage implements Image {

	private RealImage img =null;
	private String fileName = null;
	
	public ProxyImage(String fileName){
		this.fileName = fileName;
	}
	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		if(img==null){
			img = new RealImage(fileName);
		}
		img.showImage();
	}

}
