package com.geek.mode.state;

public class OnReadyState implements State{
	private CandyMachine cm;
	
	public OnReadyState(CandyMachine cm) {
		this.cm = cm;
	}

	@Override
	public void insertCoin() {
		System.out.println("inserted a coin");
		cm.setState(cm.hasCoin);
	}

	@Override
	public void returnCoin() {
	}

	@Override
	public void turnCrank() {
	}

	@Override
	public void dispense() {
	}

	@Override
	public void printState() {
		System.out.println("OnReady:");
	}

}
