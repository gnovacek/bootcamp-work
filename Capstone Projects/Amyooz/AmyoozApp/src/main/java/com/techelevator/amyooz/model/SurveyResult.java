package com.techelevator.amyooz.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class SurveyResult {

	
	private Long surveyId; 
	
	@NotNull (message="First Name is Required")
	private String firstName; 
	
	private String lastName; 
	
	@NotNull (message="Height is Required")
	private int height; 
	
	@NotNull (message="This Question is Required")
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
	
	
	
}
