package com.geek.mode.builder;

public class Director {
	private AbsBuilder builder;
	
	public Director(AbsBuilder ab) {
		this.builder = ab;
	}
	
	public void setBuilder(AbsBuilder ab){
		this.builder = ab;
	}
	
	public void construct(){
		builder.buildVacation();
		builder.getVacation().showInfo();
	}

}
