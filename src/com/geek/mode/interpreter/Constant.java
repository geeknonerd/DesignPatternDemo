package com.geek.mode.interpreter;

public class Constant extends Expression{
	private int i;
	public Constant(int i) {
		this.i = i;
	}

	@Override
	public int interpret(Context con) {
		return i;
	}

}
