package com.chainOfResponsibility;

public interface Chain {

	public abstract void setChain(Chain nextChain);
	
	public abstract void process(Number request);
}
