package com.geek.mode.chainms;

public class PresidentApprover extends Approver{

	public PresidentApprover(String name) {
		super(name+" President");
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice()>=10000) {
			System.out.println("process:"+name);
		}else {
			successor.processRequest(request);
		}
	}

}
