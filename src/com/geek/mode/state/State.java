package com.geek.mode.state;

public interface State {

	void insertCoin();
	void returnCoin();
	void turnCrank();
	void dispense();
	void printState();
}
