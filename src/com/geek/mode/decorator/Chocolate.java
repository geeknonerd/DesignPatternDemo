package com.geek.mode.decorator;

public class Chocolate extends Decorator{

	public Chocolate(DrinkComponent dc) {
		super(dc);
		setDescription("Chocolate");
		setPrice(8);
	}

}
