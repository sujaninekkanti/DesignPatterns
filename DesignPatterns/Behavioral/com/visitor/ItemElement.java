package com.visitor;

public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
