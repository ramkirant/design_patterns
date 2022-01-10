package com.designpatterns.commandpattern;

public class LightBulbReceiver {
	public static int STATE_ON = 1;
	public static int STATE_OFF = 0;
	public static int DEFAULT_BRIGHTNESS = 10;
	public static int ZERO_BRIGHTNESS = 0;
	public static int MAX_BRIGHTNESS = 50;
	
	private int state;
	private int brightness;
	
	
	public LightBulbReceiver() {
		this.state = LightBulbReceiver.STATE_OFF;
		this.brightness = LightBulbReceiver.ZERO_BRIGHTNESS;
	}

	public LightBulbReceiver(int state, int brightness) {
		super();
		this.state = state;
		this.brightness = brightness;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	@Override
	public String toString() {
		return "LightBulbReceiver [state=" + state + ", brightness=" + brightness + "]";
	}
	
}
