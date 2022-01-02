package com.designpatterns.builderpattern;

public abstract class Packing {
	protected String pack;

	public abstract void setPack();

	public String getPack() {
		return pack;
	}
}
