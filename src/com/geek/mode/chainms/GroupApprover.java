package com.geek.mode.chainms;

public class GroupApprover extends Approver{

	public GroupApprover(String name) {
		super(name+" Group");
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice()<5000) {
			System.out.println("process:"+name);
		}else {
			successor.processRequest(request);
		}
	}

}
