package com.geek.mode.chainms;

public class DepartmentApprover extends Approver{

	public DepartmentApprover(String name) {
		super(name+" Department");
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if (request.getPrice()>=5000 && request.getPrice()<10000) {
			System.out.println("process:"+name);
		}else {
			successor.processRequest(request);
		}
	}

}
