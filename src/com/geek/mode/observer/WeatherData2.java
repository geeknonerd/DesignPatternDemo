package com.geek.mode.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData2 extends Observable{
	
	private Data mData;
	
	public WeatherData2() {
		mData = new Data();
	}

	public void updateTemp(int temp){
		mData.mTemperatrue = temp;
		this.setChanged();
		this.notifyObservers(mData);
	}
	
	public class Data{
		public float mTemperatrue;
	}
}
