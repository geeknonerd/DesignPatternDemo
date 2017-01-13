package com.geek.mode.factory;

public class CheesePizza extends Pizza{
	
	@Override
	protected void prepare() {
		setName("Cheese");
		bake();
	}

}
