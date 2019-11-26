package com.techelevator.amyooz.model;

import java.util.List;

import com.techelevator.amyooz.model.Ride;

public interface RideDAO {

	
	public List<Ride> getAllRides();
	
	public List<Ride> getAllRidesBasedOnUserPref(int userId); 
	
}
