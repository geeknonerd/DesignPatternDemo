package com.geek.mode.memento;

import java.util.HashMap;
import java.util.Map;

public class MementoCareTaker {
	private Map<String, MementoIF> map;
	public MementoCareTaker() {
		map = new HashMap<>();
	}
	
	public MementoIF retrieveMemento(String name){
		return map.get(name);
	}
	
	public void saveMemento(String name,MementoIF memento){
		map.put(name, memento);
	}

}
