package com.state;

public class StandByState implements State{

	@Override
	public void pressPlay(MusicPlayerContextInterface context) {
		// TODO Auto-generated method stub
		context.setState(new PlayingState());
		System.out.println("music player is in standby state");
	}

}
