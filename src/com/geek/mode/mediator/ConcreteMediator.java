package com.geek.mode.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator{
	private Map<String, Colleague> map;
	public ConcreteMediator() {
		map = new HashMap<>();
	}

	@Override
	public void register(String name, Colleague colleague) {
		map.put(name, colleague);
	}

	@Override
	public void getMsg(String name, int state) {
		if ("Alarm".equals(name)) {
			System.out.println(map.get("Alarm").getName()+":"+(state==0?"off":"on"));
		}else {
			System.out.println(map.get("Curtain").getName()+":"+(state==0?"off":"on"));
		}
	}
}
