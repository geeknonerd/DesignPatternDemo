package com.geek.mode.strategy;

public abstract class Duck {
	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;
	
	public Duck() {
	}
	
	public void fly(){
		mFlyBehavior.fly();
	}
	
	public void quack(){
		mQuackBehavior.quack();
	}
	
	public abstract void display();
	
	public void swim(){
		System.out.println("--swim--");
	}

}
