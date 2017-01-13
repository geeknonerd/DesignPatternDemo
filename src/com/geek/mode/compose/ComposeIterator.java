package com.geek.mode.compose;

import java.util.Stack;

import com.geek.mode.iterator.Iterator;

public class ComposeIterator implements Iterator{
	private Stack<Iterator> iterators = new Stack<>();
	
	public ComposeIterator(Iterator it) {
		iterators.push(it);
	}
	
	@Override
	public boolean hasNext() {
		if(iterators.isEmpty()) return false;
		Iterator it = iterators.peek();
		if(!it.hasNext()){
			iterators.pop();
			return hasNext();
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		if(hasNext()){
			Iterator it = iterators.peek();
			MenuComponent mc = (MenuComponent) it.next();
			Iterator eIt = mc.getIterator();
			if (eIt!=null) {
				iterators.push(eIt);
			}
			return mc;
		}
		return null;
	}

}
