package com.state;

public class MusicPlayerContext implements MusicPlayerContextInterface {

	State state;
	
	public MusicPlayerContext(State state){
		this.state = state;
	}
	@Override
	public void requestPaly() {
		// TODO Auto-generated method stub
		state.pressPlay(this);
		System.out.println("music player is in playing state request...");
	}

	@Override
	public void setState(State state) {
		// TODO Auto-generated method stub
		this.state = state;
		System.out.println("setting the state of music player");
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return state;
	}

}
