package com.designpatterns.chainofresponsibilitypattern;

public class DebugLogger extends AbstractLogger {
	
	public DebugLogger(int level) {
		this.level = level;
	}
	@Override
	protected void write(String message) {
		System.out.println("Debug Logger:: "+ message);

	}

}
