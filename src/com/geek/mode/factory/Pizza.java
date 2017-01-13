package com.geek.mode.factory;

public abstract class Pizza {
	
	private String name;
	
	public Pizza() {
		prepare();
	}
	
	protected abstract void prepare();

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected void bake(){
		System.out.println("--"+name+"--bake");
	}
}
