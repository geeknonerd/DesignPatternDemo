package com.geek.mode.bridge;

public abstract class TvControlabs {
	
	Control mControl;
	public TvControlabs(Control control) {
		mControl = control;
	}
	public abstract void onOff();

}
