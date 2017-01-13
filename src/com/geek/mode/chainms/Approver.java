package com.geek.mode.chainms;

public abstract class Approver {
	protected String name;
	protected Approver successor;

	public Approver(String name) {
		this.name = name;
	}
	
	public void setSuccessor(Approver successor){
		this.successor = successor;
	}
	
	public abstract void processRequest(PurchaseRequest request);
}
