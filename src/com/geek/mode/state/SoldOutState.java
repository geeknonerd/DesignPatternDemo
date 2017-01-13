package com.geek.mode.state;

public class SoldOutState implements State{
	private CandyMachine cm;

	public SoldOutState(CandyMachine cm) {
		this.cm = cm;
	}

	@Override
	public void insertCoin() {
		System.out.println("sold out");
		returnCoin();
	}

	@Override
	public void returnCoin() {
		System.out.println("coin return");
	}

	@Override
	public void turnCrank() {
	}

	@Override
	public void dispense() {
	}

	@Override
	public void printState() {
		System.out.println("SoldOut:");
	}

}
