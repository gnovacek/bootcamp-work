package com.techelevator.amyooz.model;

public class Ride {

	private int rideId;                         
    private String rideName; 
    private int rideSpeed;                  
    private int heightRequirement; 
    private boolean canRideWhilePregnant;      
    private int averageLineTime;            
 
	private boolean isWaterRide; 
	private boolean isRollercoaster;
	private boolean isUpsideDown;
	private boolean isTwisted;
	private boolean isScary;
	private boolean isFreefallDrop;
	private boolean isKidFriendly;
	private boolean isNostalgic;
	
	// GETTERS AND SETTERS 
	
	public int getRideId() {
		return rideId;
	}
	public void setRideId(int rideId) {
		this.rideId = rideId;
	}
	public String getRideName() {
		return rideName;
	}
	public void setRideName(String rideName) {
		this.rideName = rideName;
	}
	public int getRideSpeed() {
		return rideSpeed;
	}
	public void setRideSpeed(int rideSpeed) {
		this.rideSpeed = rideSpeed;
	}
	public int getHeightRequirement() {
		return heightRequirement;
	}
	public void setHeightRequirement(int heightRequirement) {
		this.heightRequirement = heightRequirement;
	}
	public boolean isCanRideWhilePregnant() {
		return canRideWhilePregnant;
	}
	public void setCanRideWhilePregnant(boolean canRideWhilePregnant) {
		this.canRideWhilePregnant = canRideWhilePregnant;
	}
	public int getAverageLineTime() {
		return averageLineTime;
	}
	public void setAverageLineTime(int averageLineTime) {
		this.averageLineTime = averageLineTime;
	}
	public boolean isWaterRide() {
		return isWaterRide;
	}
	public void setWaterRide(boolean isWaterRide) {
		this.isWaterRide = isWaterRide;
	}
	public boolean isRollercoaster() {
		return isRollercoaster;
	}
	public void setRollercoaster(boolean isRollercoaster) {
		this.isRollercoaster = isRollercoaster;
	}
	public boolean isUpsideDown() {
		return isUpsideDown;
	}
	public void setUpsideDown(boolean isUpsideDown) {
		this.isUpsideDown = isUpsideDown;
	}
	public boolean isTwisted() {
		return isTwisted;
	}
	public void setTwisted(boolean isTwisted) {
		this.isTwisted = isTwisted;
	}
	public boolean isScary() {
		return isScary;
	}
	public void setScary(boolean isScary) {
		this.isScary = isScary;
	}
	public boolean isFreefallDrop() {
		return isFreefallDrop;
	}
	public void setFreefallDrop(boolean isFreefallDrop) {
		this.isFreefallDrop = isFreefallDrop;
	}
	public boolean isKidFriendly() {
		return isKidFriendly;
	}
	public void setKidFriendly(boolean isKidFriendly) {
		this.isKidFriendly = isKidFriendly;
	}
	public boolean isNostalgic() {
		return isNostalgic;
	}
	public void setNostalgic(boolean isNostalgic) {
		this.isNostalgic = isNostalgic;
	}
    
	
	
}
