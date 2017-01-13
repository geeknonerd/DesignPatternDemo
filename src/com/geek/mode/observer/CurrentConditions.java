package com.geek.mode.observer;

public class CurrentConditions implements Observer{
	
	private float mTemperatrue;
	private int mId;
	
	public CurrentConditions(int id) {
		mId = id;
	}

	@Override
	public void update(float temp) {
		mTemperatrue = temp;
		display();
	}
	
	private void display(){
		System.out.println("*"+mId+"--Tempertrue:"+mTemperatrue);
	}
}
