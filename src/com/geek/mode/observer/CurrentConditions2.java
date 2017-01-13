package com.geek.mode.observer;

import java.util.Observable;
import java.util.Observer;

import com.geek.mode.observer.WeatherData2.Data;

public class CurrentConditions2 implements Observer{
	
	private float mTemperatrue;
	private int mId;
	
	public CurrentConditions2(int id) {
		mId = id;
	}

	private void display(){
		System.out.println("*"+mId+"--Tempertrue:"+mTemperatrue);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.mTemperatrue = ((Data) arg).mTemperatrue;
		display();
	}
	
	
}
