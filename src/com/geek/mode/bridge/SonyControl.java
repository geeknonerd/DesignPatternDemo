package com.geek.mode.bridge;

public class SonyControl implements Control{
	@Override
	public void on() {
		System.out.println("Sony:on");
	}

	@Override
	public void off() {
		System.out.println("Sony:off");
	}
}
