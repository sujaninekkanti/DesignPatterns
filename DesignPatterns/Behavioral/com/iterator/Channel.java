package com.iterator;

public class Channel {

	// properties of a channel

	private double frequency;

	// type of the language of a channel
	private ChannelTypeEnum TYPE;

	public Channel(double frequency, ChannelTypeEnum tYPE) {
		super();
		this.frequency = frequency;
		TYPE = tYPE;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", TYPE=" + TYPE + "]";
	}

	
}
