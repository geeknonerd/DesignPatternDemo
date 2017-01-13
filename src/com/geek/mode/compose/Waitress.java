package com.geek.mode.compose;

import java.util.ArrayList;

import com.geek.mode.iterator.Iterator;

public class Waitress {
	
	private ArrayList<Iterator> iterators = new ArrayList<>();
	
	public void addIterator(Iterator it){
		iterators.add(it);
	}
	
	public void printMenu(){
		String mc;
		for(Iterator it:iterators){
			while(it.hasNext()){
				mc = ((MenuComponent) it.next()).toString();
				if(!mc.isEmpty()) System.out.println(mc);
			}
		}
	}

}
