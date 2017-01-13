package com.geek.mode.agent;

public class Proxy {
	Source source;
	public Proxy(Source source) {
		this.source = source;
	}
	
	public void say(){
		source.say();
	}
}
