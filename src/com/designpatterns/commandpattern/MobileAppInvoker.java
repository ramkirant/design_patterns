package com.designpatterns.commandpattern;

public class MobileAppInvoker {
	ICommand buttonOn;
	ICommand buttonOff;
	ICommand slideUp;
	ICommand slideDown;
	LightBulbReceiver bulb;
	
	public MobileAppInvoker(LightBulbReceiver bulb) {
		super();
		this.buttonOn = new LightOnCommand(bulb);
		this.buttonOff = new LightOffCommand(bulb);
		this.slideUp = new IncreaseBrightnessCommand(bulb);
		this.slideDown = new ReduceBrightnessCommand(bulb);
		this.bulb = bulb;
	}

	public ICommand getButtonOn() {
		return buttonOn;
	}

	public void setButtonOn(ICommand buttonOn) {
		this.buttonOn = buttonOn;
	}

	public ICommand getButtonOff() {
		return buttonOff;
	}

	public void setButtonOff(ICommand buttonOff) {
		this.buttonOff = buttonOff;
	}

	public ICommand getSlideUp() {
		return slideUp;
	}

	public void setSlideUp(ICommand slideUp) {
		this.slideUp = slideUp;
	}

	public ICommand getSlideDown() {
		return slideDown;
	}

	public void setSlideDown(ICommand slideDown) {
		this.slideDown = slideDown;
	}

	public LightBulbReceiver getBulb() {
		return bulb;
	}

	public void setBulb(LightBulbReceiver bulb) {
		this.bulb = bulb;
	}
	
}
