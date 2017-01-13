package com.geek.mode.state;

public class SoldState implements State{
	private CandyMachine cm;

	public SoldState(CandyMachine cm) {
		this.cm = cm;
	}

	@Override
	public void insertCoin() {
	}

	@Override
	public void returnCoin() {
	}

	@Override
	public void turnCrank() {
	}

	@Override
	public void dispense() {
		cm.releaseCandy();
		if (cm.getCount()>0) {
			cm.setState(cm.onReady);
		}else {
			System.out.println("sold out");
			cm.setState(cm.soldOut);
		}
	}

	@Override
	public void printState() {
		System.out.println("Sold:");
	}

}
