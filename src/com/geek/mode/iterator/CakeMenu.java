package com.geek.mode.iterator;

import java.util.ArrayList;

public class CakeMenu {
	private ArrayList<MenuItem> menuItems;

	public CakeMenu() {
		menuItems = new ArrayList<>();
		addItem("KFC Cake", 3.99f);
		addItem("Stawberry Cake", 3.29f);
	}
	
	private void addItem(String name,float price){
		MenuItem mi = new MenuItem(name, price);
		menuItems.add(mi);
	}

//	private ArrayList<MenuItem> getMenuItems() {
//		return menuItems;
//	}
	
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
		return new CakeIterator();
	}

}
