package com.geek.mode.bridge;

public class LGControl implements Control{
	@Override
	public void on() {
		System.out.println("LG:on");
	}

	@Override
	public void off() {
		System.out.println("LG:off");
	}
}
