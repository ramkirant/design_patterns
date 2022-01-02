package com.designpatterns.builderpattern;

public abstract class ColdDrink extends Item {

	public ColdDrink() {
		this.packing = new Bottle();
	}
	
}
