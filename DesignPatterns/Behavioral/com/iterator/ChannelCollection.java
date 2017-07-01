package com.iterator;

public interface ChannelCollection {

	//to add the channel
	public void addChannel(Channel c);
	//to remove channel
	public void removeChannel(Channel c);
	//to display all the channels 
	public ChannelIterator iterator(ChannelTypeEnum Type );
}
