package com.geek.mode.compose;

import com.geek.mode.iterator.Iterator;

public class MenuItem implements MenuComponent{
	
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

	@Override
	public Iterator getIterator() {
		return null;
	}

}
