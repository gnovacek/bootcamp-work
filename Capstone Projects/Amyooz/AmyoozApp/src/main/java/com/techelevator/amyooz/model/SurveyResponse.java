package com.techelevator.amyooz.model;

public class SurveyResponse {
	
	private int userId; 
	private String firstName; 
	private String lastName; 
	private int height; 
	private boolean pregnant; 
	private int topSpeedPreference; 
	
	private boolean waterRide; 
	private boolean rollercoaster;
	private boolean upsideDown;
	private boolean twisted;
	private boolean scary;
	private boolean freefallDrop;
	private boolean kidFriendly;
	private boolean nostalgic;
	
	// GETTERS AND SETTERS 
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isPregnant() {
		return pregnant;
	}
	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}
	public int getTopSpeedPreference() {
		return topSpeedPreference;
	}
	public void setTopSpeedPreference(int topSpeedPreference) {
		this.topSpeedPreference = topSpeedPreference;
	}
	public boolean isWaterRide() {
		return waterRide;
	}
	public void setWaterRide(boolean waterRide) {
		this.waterRide = waterRide;
	}
	public boolean isRollercoaster() {
		return rollercoaster;
	}
	public void setRollercoaster(boolean rollercoaster) {
		this.rollercoaster = rollercoaster;
	}
	public boolean isUpsideDown() {
		return upsideDown;
	}
	public void setUpsideDown(boolean upsideDown) {
		this.upsideDown = upsideDown;
	}
	public boolean isTwisted() {
		return twisted;
	}
	public void setTwisted(boolean twisted) {
		this.twisted = twisted;
	}
	public boolean isScary() {
		return scary;
	}
	public void setScary(boolean scary) {
		this.scary = scary;
	}
	public boolean isFreefallDrop() {
		return freefallDrop;
	}
	public void setFreefallDrop(boolean freefallDrop) {
		this.freefallDrop = freefallDrop;
	}
	public boolean isKidFriendly() {
		return kidFriendly;
	}
	public void setKidFriendly(boolean kidFriendly) {
		this.kidFriendly = kidFriendly;
	}
	public boolean isNostalgic() {
		return nostalgic;
	}
	public void setNostalgic(boolean nostalgic) {
		this.nostalgic = nostalgic;
	}
	
	
}
