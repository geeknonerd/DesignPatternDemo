package com.geek.mode.factory;

public class GreekPizza extends Pizza{
	
	@Override
	protected void prepare() {
		setName("Greek");
		bake();
	}

}
