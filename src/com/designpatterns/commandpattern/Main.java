package com.designpatterns.commandpattern;

public class Main {

	public static void main(String[] args) {
		LightBulbReceiver bulb = new LightBulbReceiver();

		RemoteInvoker remote = new RemoteInvoker(bulb);
		
		remote.getButton1().execute();
		System.out.println(bulb);
		
		remote.getButton2().execute();
		System.out.println(bulb);
		
		remote.getButton1().execute();
		System.out.println(bulb);
		
		remote.getButton3().execute();
		System.out.println(bulb);
		
		remote.getButton4().execute();
		System.out.println(bulb);
	}

}
