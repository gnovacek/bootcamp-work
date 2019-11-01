package com.techelevator;

public class Television {
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;

	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void turnOff() {
		isOn = false;
	}

	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}

	public void changeChannel(int newChannel) {
		if (isOn) {
			if (newChannel > 2 && newChannel < 19) {
				currentChannel = newChannel;
			}
		}
	}

	public void channelUp() {
		if (isOn) {
			if (currentChannel > 2 && currentChannel < 18) {
				currentChannel++;
			} else if (currentChannel == 18) {
				currentChannel = 3;
			}
		}
	}

	public void channelDown() {
		if (isOn) {
			if (currentChannel > 3 && currentChannel <= 18) {
				currentChannel--;
			} else if (currentChannel == 3) {
				currentChannel = 18;
			}
		}
	}

	public void raiseVolume() {
		if (isOn && currentVolume < 10) {
			currentVolume++;
		}
	}

	public void lowerVolume() {
		if (isOn && currentVolume > 0) {
			currentVolume--;
		} else if (isOn && currentVolume == 0) {
			// keeps currentVolume set to zero - couldn't pass the test without it
		}
	}

}
