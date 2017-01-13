package com.geek.mode.prototype;

public class ConcretePrototype implements Prototype{

	private String name;
	
	public ConcretePrototype(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public Prototype objClone() {
		return new ConcretePrototype(name);
	}

}
