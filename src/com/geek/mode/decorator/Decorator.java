package com.geek.mode.decorator;

public class Decorator extends DrinkComponent{
	
	DrinkComponent mDrink;
	
	public Decorator(DrinkComponent dc) {
		mDrink = dc;
	}

	@Override
	public float cost() {
		return super.getPrice()+mDrink.cost();
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+":"+getPrice()+" && "+mDrink.getDescription();
	}
	
}
