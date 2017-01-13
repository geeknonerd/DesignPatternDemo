package com.geek.mode.builder;

import java.util.ArrayList;
import java.util.List;

public class Vacation {
	private List<VacationDay> mList;
	private VacationDay mDay;
	
	public Vacation(int date) {
		mList = new ArrayList<>();
		mDay = new VacationDay(date);
		mList.add(mDay);
	}
	
	public void addDay(){
		mDay = new VacationDay(mDay.getDate()+1);
		mList.add(mDay);
	}
	
	public void setAddr(String addr){
		mDay.setAddr(addr);
	}
	
	public void showInfo(){
		for(VacationDay vd:mList){
			System.out.println(vd.getDate()+":"+vd.getAddr());
		}
	}

}
