package com.designpatterns.commandpattern;

public class IncreaseBrightnessCommand implements ICommand {

	private LightBulbReceiver bulb;
	
	public IncreaseBrightnessCommand(LightBulbReceiver bulb) {
		super();
		this.bulb = bulb;
	}

	@Override
	public void execute() {
		if(this.bulb.getBrightness() <= LightBulbReceiver.MAX_BRIGHTNESS) {
			this.bulb.setBrightness(this.bulb.getBrightness() + 1);
		}
	}

	@Override
	public void unexecute() {
		if(this.bulb.getBrightness() > LightBulbReceiver.ZERO_BRIGHTNESS) {
			this.bulb.setBrightness(this.bulb.getBrightness() - 1);
		}
	}

}
