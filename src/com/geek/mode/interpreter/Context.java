package com.geek.mode.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
	private Map<Variable, Integer> map = new HashMap<>();
	
	public void addValue(Variable v,int i){
		map.put(v, i);
	}
	public int getValue(Variable v){
		return map.get(v).intValue();
	}

}
