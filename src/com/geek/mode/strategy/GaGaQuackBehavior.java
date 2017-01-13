package com.geek.mode.strategy;

public class GaGaQuackBehavior implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("--GaGaQuack--");
	}

}
