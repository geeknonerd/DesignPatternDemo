package com.geek.mode.factory3;

public class Decaf extends Coffee{

	@Override
	protected void prepare() {
		setName("Decaf");
		boil();
	}

}
