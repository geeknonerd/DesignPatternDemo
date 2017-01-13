package com.geek.mode.state;

public class CandyMachine {
	State onReady;
	State hasCoin;
	State sold;
	State soldOut;
	private State state;
	private int count=0;
	
	public CandyMachine(int count) {
		this.count = count;
		onReady = new OnReadyState(this);
		hasCoin = new HasCoinState(this);
		sold = new SoldState(this);
		soldOut = new SoldOutState(this);
		if (count>0) {
			state = onReady;
		}else {
			state = soldOut;
		}
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void insertCoin(){
		state.insertCoin();
	}
	
	public void returnCoin(){
		state.returnCoin();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseCandy(){
		if (count>0) {
			System.out.println("roll a candy");
			count--;
		}
	}
	
	public int getCount(){
		return count;
	}
	
	public void printState(){
		state.printState();
	}

}
