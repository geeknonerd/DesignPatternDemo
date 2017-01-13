package com.geek.mode.flyweight;

public class TreeManager {
	private int length=100;
	private int[] ageArray = new int[length];
	private TreeFlyWeight mTree;
	
	public TreeManager() {
		mTree = new TreeFlyWeight();
		for(int i=0;i<length;i++){
			ageArray[i] = (int) (Math.random() * length) %100;
		}
	}
	
	public void displayTree(){
		for(int i=0;i<length;i++){
			mTree.display(ageArray[i]);
		}
	}

}
