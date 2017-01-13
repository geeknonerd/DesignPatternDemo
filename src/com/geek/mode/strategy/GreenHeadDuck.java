package com.geek.mode.strategy;

public class GreenHeadDuck extends Duck{
	
	public GreenHeadDuck() {
		mFlyBehavior = new NoFlyBehavior();
		mQuackBehavior = new NoQuackBehavior();
	}

	@Override
	public void display() {
		System.out.println("--GreenHead--");
	}

}
