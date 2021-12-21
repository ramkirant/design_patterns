package com.designpatterns.singletonpattern;

public class SingletonLazyInstantiation {
	private static SingletonLazyInstantiation obj;
	public int value;
	
	private SingletonLazyInstantiation(int x) {value = x;}
	
	public static SingletonLazyInstantiation getInstance(int x) {
		if(obj == null) {
			obj = new SingletonLazyInstantiation(x);
		}
		return obj;
	}
	
	public void printValue() {
		System.out.println(value);
	}
}
