package com.designpatterns.commandpattern;

public class LightOnCommand implements ICommand {

	private LightBulbReceiver bulb;
	
	public LightOnCommand(LightBulbReceiver bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		this.bulb.setState(LightBulbReceiver.STATE_ON);
		this.bulb.setBrightness(LightBulbReceiver.DEFAULT_BRIGHTNESS);
	}

	@Override
	public void unexecute() {
		this.bulb.setState(LightBulbReceiver.STATE_OFF);
		this.bulb.setBrightness(LightBulbReceiver.ZERO_BRIGHTNESS);
	}

}
