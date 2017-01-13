package com.geek.mode.iterator;

public class MenuItem {
	
	private String name;
	private float price;
	
	public MenuItem(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "name:"+name+",price:"+price;
	}

}
