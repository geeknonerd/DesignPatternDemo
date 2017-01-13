package com.geek.mode.mediator;

public class Curtain extends Colleague{

	public Curtain(Mediator mediator) {
		super(mediator, "Curtain");
	}

	@Override
	public void sendMsg(int state) {
		getMediator().getMsg(getName(), state);
	}

}
