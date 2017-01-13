package com.geek.mode.strategy;

public class NoFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("--NoFly--");
	}

}
