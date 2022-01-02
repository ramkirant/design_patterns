package com.designpatterns.chainofresponsibilitypattern;

public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2; 
	public static int ERROR = 3;
	
	protected int level;
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger logger) {
		this.nextLogger = logger;
	}
	
	abstract protected void write(String message);
	
	public void logMessage(String message, int level) {
		if(this.level <= level) {
			write(message);	
		} else if(this.nextLogger != null) {
			this.nextLogger.logMessage(message, level);
		}
	}
}
