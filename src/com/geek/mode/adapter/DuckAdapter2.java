package com.geek.mode.adapter;

public class DuckAdapter2 extends WildTurkey implements Duck{

	@Override
	public void quack() {
		super.gobble();
	}

	@Override
	public void longFly() {
		super.shortFly();
	}

}
