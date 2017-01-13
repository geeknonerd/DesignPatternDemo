package com.geek.mode.mediator;

public abstract class Colleague {
	private Mediator mediator;
	private String name;
	
	public Colleague(Mediator mediator,String name) {
		this.mediator = mediator;
		this.name = name;
		mediator.register(name, this);
	}
	
	public Mediator getMediator(){
		return mediator;
	}
	public String getName(){
		return name;
	}
	
	public abstract void sendMsg(int state);
}
