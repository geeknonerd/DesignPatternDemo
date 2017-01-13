package com.geek.mode.mediator;

public interface Mediator {
	void register(String name,Colleague colleague);
	void getMsg(String name,int state);
}
