package com.geek.mode.iterator;

public class DinerMenu {
	
	private MenuItem[] menuItems;
	private int index=0;
	
	public DinerMenu() {
		menuItems = new MenuItem[8];
		addItem("Blt", 3.00f);
		addItem("Hotdog", 3.05f);
	}
	
	private void addItem(String name,float price){
		MenuItem mi = new MenuItem(name, price);
		menuItems[index++] = mi;
	}

//	private MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	
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
		return new DinerIterator();
	}
}
