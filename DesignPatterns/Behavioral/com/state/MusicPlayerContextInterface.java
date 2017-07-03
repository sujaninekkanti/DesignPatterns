package com.state;

public interface MusicPlayerContextInterface {

	public State state =null;
	public void requestPaly();
	public void setState(State state);
	public State getState();
}
