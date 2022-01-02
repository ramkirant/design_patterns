package com.designpatterns.chainofresponsibilitypattern;

public class ChainPatternDemo {
	private static AbstractLogger createChainOfLoggers() {
		AbstractLogger consoleLogger = new InfoLogger(AbstractLogger.INFO);
		AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = createChainOfLoggers();
		
		loggerChain.logMessage("This is info message", AbstractLogger.ERROR);
	}
}
