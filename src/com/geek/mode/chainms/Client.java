package com.geek.mode.chainms;

public class Client {
	public PurchaseRequest sendRequest(int price){
		return new PurchaseRequest(price);
	}

}
