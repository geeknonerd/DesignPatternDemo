package com.geek.mode.compose;

import com.geek.mode.iterator.Iterator;

public class DinerMenu {
	
	private MenuComponent[] menuItems;
	private int index=0;
	
	public DinerMenu() {
		menuItems = new MenuComponent[8];
		addItem("Blt", 3.00f);
		addItem("Hotdog", 3.05f);
		addSub(new SubMenu());
	}
	
	private void addItem(String name,float price){
		MenuComponent mc = new MenuItem(name, price);
		menuItems[index++] = mc;
	}
	
	private void addSub(MenuComponent mc){
		menuItems[index++] = mc;
	}
	
	private class DinerIterator implements Iterator{
		private int position=0;
		@Override
		public boolean hasNext() {
			return position<index;
		}
		@Override
		public Object next() {
			return menuItems[position++];
		}
	}
	
	public Iterator getIterator(){
		return new ComposeIterator(new DinerIterator());
	}

}
