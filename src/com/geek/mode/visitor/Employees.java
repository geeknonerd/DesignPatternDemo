package com.geek.mode.visitor;

import java.util.HashMap;
import java.util.Map;

public class Employees {
	private Map<String, Employee> map;
	
	public Employees() {
		map = new HashMap<>();
	}
	
	public void attach(Employee employee){
		map.put(employee.getName(), employee);
	}
	
	public void detach(Employee employee){
		map.remove(employee.getName());
	}
	
	public void accept(Visitor visitor){
		for(Employee e:map.values()){
			e.accept(visitor);
		}
	}

}
