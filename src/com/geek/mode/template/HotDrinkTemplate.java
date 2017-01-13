package com.geek.mode.template;

public abstract class HotDrinkTemplate {

	public void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if (wantCondimentsHook()) {
			addConDiments();
		}else {
			System.out.println("No Condiments");
		}
	}
	
	protected void boilWater(){
		System.out.println("Boil Water");
	}
	
	protected abstract void brew();
	
	protected void pourInCup(){
		System.out.println("Pour In Cup");
	}
	
	protected abstract void addConDiments();
	
	protected boolean wantCondimentsHook(){
		return false;
	}
}
