package com.geek.mode.visitor;

public class ConcreteVisitor implements Visitor{

	@Override
	public void visit(Element element) {
		Employee e = (Employee) element;
		System.out.println(e.getName()+":"+e.getDegree());
	}
}
