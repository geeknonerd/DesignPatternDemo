package com.geek.mode.interpreter;

public class Variable extends Expression{

	@Override
	public int interpret(Context con) {
		return con.getValue(this);
	}

}
