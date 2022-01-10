package com.designpatterns.commandpattern;

public class RemoteInvoker {
	private ICommand button1;
	private ICommand button2;
	private ICommand button3;
	private ICommand button4;
	private LightBulbReceiver bulb;
	
	public RemoteInvoker(LightBulbReceiver bulb) {
		super();
		this.button1 = new LightOnCommand(bulb);
		this.button2 = new LightOffCommand(bulb);
		this.button3 = new IncreaseBrightnessCommand(bulb);
		this.button4 = new ReduceBrightnessCommand(bulb);
	}

	public ICommand getButton1() {
		return button1;
	}

	public void setButton1(ICommand button1) {
		this.button1 = button1;
	}

	public ICommand getButton2() {
		return button2;
	}

	public void setButton2(ICommand button2) {
		this.button2 = button2;
	}

	public ICommand getButton3() {
		return button3;
	}

	public void setButton3(ICommand button3) {
		this.button3 = button3;
	}

	public ICommand getButton4() {
		return button4;
	}

	public void setButton4(ICommand button4) {
		this.button4 = button4;
	}

	public LightBulbReceiver getBulb() {
		return bulb;
	}

	public void setBulb(LightBulbReceiver bulb) {
		this.bulb = bulb;
	}
	
}
