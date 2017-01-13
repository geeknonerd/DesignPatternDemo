package com.geek.mode.state;

public class HasCoinState implements State{
	private CandyMachine cm;
	
	public HasCoinState(CandyMachine cm) {
		this.cm = cm;
	}

	@Override
	public void insertCoin() {
	}

	@Override
	public void returnCoin() {
		System.out.println("coin return");
		cm.setState(cm.onReady);
	}

	@Override
	public void turnCrank() {
		System.out.println("crank turn...");
		cm.setState(cm.sold);
	}

	@Override
	public void dispense() {
	}

	@Override
	public void printState() {
		System.out.println("HasCoin:");
	}

}
