package com.designpatterns.commandpattern;

public class LightOffCommand implements ICommand {

	private LightBulbReceiver bulb;
	
	public LightOffCommand(LightBulbReceiver bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void unexecute() {
		this.bulb.setState(LightBulbReceiver.STATE_ON);
		this.bulb.setBrightness(LightBulbReceiver.DEFAULT_BRIGHTNESS);
	}

	@Override
	public void execute() {
		this.bulb.setState(LightBulbReceiver.STATE_OFF);
		this.bulb.setBrightness(LightBulbReceiver.ZERO_BRIGHTNESS);
	}

}
