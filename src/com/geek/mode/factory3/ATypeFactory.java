package com.geek.mode.factory3;

import com.geek.mode.factory.GreekPizza;
import com.geek.mode.factory.Pizza;

public class ATypeFactory implements AFactory{

	@Override
	public Pizza createPizza() {
		return new GreekPizza();
	}

	@Override
	public Coffee createCoffee() {
		return new Decaf();
	}

}
