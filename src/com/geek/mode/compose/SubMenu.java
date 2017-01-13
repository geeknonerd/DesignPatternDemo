package com.geek.mode.compose;

import java.util.ArrayList;

import com.geek.mode.iterator.Iterator;

public class SubMenu implements MenuComponent{
	
	private ArrayList<MenuComponent> menuItems;

	public SubMenu() {
		menuItems = new ArrayList<>();
		addItem("Apple Cookie", 1.99f);
		addItem("Orange Cookie", 1.29f);
	}
	
	private void addItem(String name, float price){
		MenuComponent mc = new MenuItem(name, price);
		menuItems.add(mc);
	}
	
	@Override
	public Iterator getIterator() {
		return new ComposeIterator(new SubIterator());
	}
	
	private class SubIterator implements Iterator{
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
	
	@Override
	public String toString() {
		return "";
	}

}
