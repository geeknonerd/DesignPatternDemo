package com.geek.mode.bridge;

public class TvControl extends TvControlabs{
	private boolean isOn = false;
	
	public TvControl(Control control) {
		super(control);
	}

	@Override
	public void onOff() {
		if (isOn) {
			mControl.off();
		}else {
			mControl.on();
		}
		isOn = !isOn;
	}

}
