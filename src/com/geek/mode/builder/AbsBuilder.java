package com.geek.mode.builder;

public abstract class AbsBuilder {
	protected Vacation mVacation;
	
	public AbsBuilder(int date) {
		mVacation = new Vacation(date);
	}
	
	public abstract void buildVacation();
	
	public Vacation getVacation(){
		return mVacation;
	}

}
