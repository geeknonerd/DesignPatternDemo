package com.geek.mode.decorator;

public class Milk extends Decorator{

	public Milk(DrinkComponent dc) {
		super(dc);
		setDescription("Milk");
		setPrice(5);
	}
}
