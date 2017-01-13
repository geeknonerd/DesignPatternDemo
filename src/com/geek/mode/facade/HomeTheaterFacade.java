package com.geek.mode.facade;

public class HomeTheaterFacade {
	
	private DVDPlayer mDvdPlayer;
	private Projector mProjector;
	private Screen mScreen;
	
	public HomeTheaterFacade() {
		mDvdPlayer = new DVDPlayer();
		mProjector = new Projector();
		mScreen = new Screen();
	}
	
	public void ready(){
		mScreen.down();
		mProjector.on();
		mProjector.focus();
		mDvdPlayer.on();
		mDvdPlayer.setdvd();
	}
	
	public void end(){
		mScreen.up();
		mProjector.off();
		mDvdPlayer.off();
	}
	
	public void play(){
		mDvdPlayer.play();
	}
	
	public void pause(){
		mDvdPlayer.pause();
	}

}
