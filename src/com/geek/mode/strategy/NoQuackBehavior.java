package com.geek.mode.strategy;

public class NoQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("--NoQuack--");
	}

}
