package com.designpatterns.builderpattern;

public abstract class Item {
	protected String name;
	protected Packing packing;
	protected float price;
	
	/*public abstract void setName();
	public abstract void setPacking();
	public abstract void setPrice();*/
	
	public float getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	public Packing getPacking() {
		return packing;
	}
}
