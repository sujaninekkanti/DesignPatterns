package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
	
	List<Component> components = new ArrayList<>();

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("composite says hello...");
		for(Component component : components){
			component.sayHello();
		}
	}

	@Override
	public void sayGoodbye() {
		// TODO Auto-generated method stub
		System.out.println("composite says good byee...");
		for(Component component : components){
			component.sayGoodbye();
		}
	}
	
	public void add(Component component){
		components.add(component);
	}
	
	public void remove(Component component){
		components.remove(component);
	}
	
	public List<Component> getComponents(){
		return components;
	}
	
	public Component getComponent(int index) {
		return components.get(index);
	}

}
