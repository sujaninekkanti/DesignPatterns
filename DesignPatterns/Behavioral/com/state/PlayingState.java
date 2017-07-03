package com.state;

public class PlayingState implements State{

	@Override
	public void pressPlay(MusicPlayerContextInterface context) {
		// TODO Auto-generated method stub
		context.setState(new StandByState());
	}

}
