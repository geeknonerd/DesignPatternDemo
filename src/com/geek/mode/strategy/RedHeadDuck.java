package com.geek.mode.strategy;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("--RedHead--");
	}

}
