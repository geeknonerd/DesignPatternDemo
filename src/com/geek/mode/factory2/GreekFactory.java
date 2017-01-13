package com.geek.mode.factory2;

import com.geek.mode.factory.GreekPizza;
import com.geek.mode.factory.Pizza;

public class GreekFactory implements Factory{

	@Override
	public Pizza createPizza() {
		return new GreekPizza();
	}
	
}
