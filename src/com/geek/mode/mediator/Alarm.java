package com.geek.mode.mediator;

public class Alarm extends Colleague{

	public Alarm(Mediator mediator) {
		super(mediator, "Alarm");
	}

	@Override
	public void sendMsg(int state) {
		getMediator().getMsg(getName(), state);
	}

}
