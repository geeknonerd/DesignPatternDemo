package com.geek.mode.decorator;

public class Coffee extends DrinkComponent{

	@Override
	public float cost() {
		return super.getPrice();
	}

	@Override
	public String getDescription() {
		return super.getDescription()+":"+super.getPrice();
	}
}
