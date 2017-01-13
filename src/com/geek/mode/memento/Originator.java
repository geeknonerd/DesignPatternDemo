package com.geek.mode.memento;

import java.util.HashMap;
import java.util.Map;

public class Originator {
	private Map<String, Integer> state;
	
	public Originator() {
		state = new HashMap<>();
	}
	
	public MementoIF createMemento(){
		return new Memento(state);
	}
	
	public void restoreMemento(MementoIF memento){
		state = ((Memento) memento).state;
	}
	
	public void addValue(String name,int value){
		state.put(name, value);
	}
	
	public int getValue(String name){
		return state.get(name);
	}
	
	private class Memento implements MementoIF{
		private Map<String, Integer> state;
		private Memento(Map<String, Integer> state) {
			this.state = new HashMap<>(state);
		}
	}

}
