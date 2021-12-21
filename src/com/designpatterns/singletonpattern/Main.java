package com.designpatterns.singletonpattern;

public class Main {

	public static void main(String[] args) {
		SingletonLazyInstantiation obj = SingletonLazyInstantiation.getInstance(10);
		obj.printValue();
	}

}
