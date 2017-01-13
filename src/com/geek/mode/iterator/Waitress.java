package com.geek.mode.iterator;

import java.util.ArrayList;

public class Waitress {
	
	private ArrayList<Iterator> iterators = new ArrayList<>();
	
	public void addIterator(Iterator iterator){
		iterators.add(iterator);
	}
	
	public void printMenu(){
//		MenuItem menuItem;
		for(Iterator iterator:iterators){
			while(iterator.hasNext()){
				System.out.println(((MenuItem)iterator.next()).toString());
			}
		}
	}

}
