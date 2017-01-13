package com.geek.mode.factory2;

import com.geek.mode.factory.CheesePizza;
import com.geek.mode.factory.Pizza;

public class CheeseFactory implements Factory{

	@Override
	public Pizza createPizza() {
		return new CheesePizza();
	}
	
}
