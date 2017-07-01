package com.iterator;

import java.util.ArrayList;
import java.util.List;


public class ChannelCollectionImpl implements ChannelCollection{

	private List<Channel> ChannelsList;
	
	
	public ChannelCollectionImpl() {
		
		ChannelsList = new ArrayList();
	}
	
	//to add channel to the list
	public void addChannel(Channel c){
		ChannelsList.add(c);
	}
	
	//to remove channel from the list
	public void removeChannel(Channel c){
		ChannelsList.remove(c);
	}
	
	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return new ChannelIteratorImpl(type,this.ChannelsList);
	}
	
	//inner class 
	private class ChannelIteratorImpl implements ChannelIterator{

		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;
		
		
		public ChannelIteratorImpl(ChannelTypeEnum type,
				List<Channel> channels) {
			super();
			this.type = type;
			this.channels = channels;
			
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			while(position < channels.size()){
				Channel c = channels.get(position);
				
				if(c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)){
					return true;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			// TODO Auto-generated method stub
			Channel c = channels.get(position);
			position++;
			return c;
		}
		

	}

	

}
