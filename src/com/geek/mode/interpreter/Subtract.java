package com.geek.mode.interpreter;

public class Subtract extends Expression{
	private Expression left,right;
	public Subtract(Expression left,Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(Context con) {
		return left.interpret(con) - right.interpret(con);
	}

}
