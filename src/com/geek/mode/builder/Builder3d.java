package com.geek.mode.builder;

public class Builder3d extends AbsBuilder{

	public Builder3d(int date) {
		super(date);
	}

	@Override
	public void buildVacation() {
		mVacation.setAddr("HangZhou");
		mVacation.addDay();
		mVacation.setAddr("ShangHai");
		mVacation.addDay();
		mVacation.setAddr("SuZhou");
	}

}
