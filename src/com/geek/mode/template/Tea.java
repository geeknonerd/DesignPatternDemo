package com.geek.mode.template;

public class Tea extends HotDrinkTemplate{

	@Override
	protected void brew() {
		System.out.println("brew tea");
	}

	@Override
	protected void addConDiments() {
		System.out.println("add lemon");
	}

	@Override
	protected boolean wantCondimentsHook() {
		return true;
	}
	
}
