package com.geek.mode.compose;

import java.util.ArrayList;

import com.geek.mode.iterator.Iterator;

public class CakeMenu {
	private ArrayList<MenuComponent> menuItems;
	
	public CakeMenu() {
		menuItems = new ArrayList<>();
		addItem("KFC Cake", 3.99f);
		addItem("Stawberry Cake", 3.29f);
	}
	
	private void addItem(String name,float price){
		MenuItem mi = new MenuItem(name, price);
		menuItems.add(mi);
	}
	
	private class CakeIterator implements Iterator{
		private int position=0;
		@Override
		public boolean hasNext() {
			return position<menuItems.size();
		}

		@Override
		public Object next() {
			return menuItems.get(position++);
		}
		
	}
	
	public Iterator getIterator(){
		return new ComposeIterator(new CakeIterator());
	}

}
