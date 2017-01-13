package com.geek.mode.command;

public class Light {
	private String name;

	public Light(String name) {
		this.name = name;
	}
	
	public void on(){
		System.out.println(name+":on");
	}
	
	public void off(){
		System.out.println(name+":off");
	}
}
