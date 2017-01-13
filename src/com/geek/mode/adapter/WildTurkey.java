package com.geek.mode.adapter;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Go Go!");
	}

	@Override
	public void shortFly() {
		System.out.println("Fly short!");
	}
	
}
