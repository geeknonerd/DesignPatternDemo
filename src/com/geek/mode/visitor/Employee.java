package com.geek.mode.visitor;

public class Employee implements Element{
	private String name;
	private int degree;
	
	public Employee(String name, int degree) {
		this.name = name;
		this.degree = degree;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDegree() {
		return degree;
	}
	public void setDegree(int degree) {
		this.degree = degree;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	

}
