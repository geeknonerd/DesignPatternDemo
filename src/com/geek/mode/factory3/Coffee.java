package com.geek.mode.factory3;

public abstract class Coffee {
	
	private String name;
	
	public Coffee() {
		prepare();
	}
	
	protected abstract void prepare();

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected void boil(){
		System.out.println("--"+name+"--boil");
	}
}
