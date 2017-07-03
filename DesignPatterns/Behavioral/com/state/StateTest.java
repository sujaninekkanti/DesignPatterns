package com.state;

public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MusicPlayerContext musicplayer = new MusicPlayerContext(new StandByState());
		musicplayer.requestPaly();
		musicplayer.setState(new PlayingState());
		musicplayer.requestPaly();
		return;
	}

}
