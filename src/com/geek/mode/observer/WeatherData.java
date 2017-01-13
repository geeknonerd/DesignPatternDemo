package com.geek.mode.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private float mTemperatrue;
	private List<Observer> mObservers;
	
	public WeatherData() {
		mObservers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		mObservers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (mObservers.contains(o)) {
			mObservers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o:mObservers){
			o.update(mTemperatrue);
		}
	}

	public void updateTemp(int temp){
		mTemperatrue = temp;
		notifyObservers();
	}
}
