package com.designpatterns.builderpattern;

public abstract class Burger extends Item {

	public Burger() {
		this.packing = new Wrapper();
	}

	
	/*@Override
	public void setPacking() {
		this.packing = new Wrapper();
	}*/
	
}
