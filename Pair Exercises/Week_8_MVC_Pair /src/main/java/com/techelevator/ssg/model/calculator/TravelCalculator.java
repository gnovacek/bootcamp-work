package com.techelevator.ssg.model.calculator;

import java.util.HashMap;
import java.util.Map;

public class TravelCalculator {
    
    private String planet;
    private String travelType;
    private double earthAge;
    private Map<String, Double> planetMap = new HashMap<>();
    private Map<String, Double> travelMap = new HashMap<>();
     
    public TravelCalculator(String planet, String travelType, double earthAge) {
        this.planet = planet;
        this.travelType = travelType;
        this.earthAge = earthAge;
        planetMap.put("mercury", 56974146.0);
        planetMap.put("venus", 25724767.0);
        planetMap.put("earth", 0.0);
        planetMap.put("mars", 48678219.0);
        planetMap.put("jupiter", 390674710.0);
        planetMap.put("saturn", 792248270.0);
        planetMap.put("uranus", 1692662530.0);
        planetMap.put("neptune", 2703959960.0);
        
        travelMap.put("walking", 3.0);
        travelMap.put("car", 100.0);
        travelMap.put("bullet train", 200.0);
        travelMap.put("boeing 747", 570.0);
        travelMap.put("concorde", 1350.0);
    }
    
    public double getAlienTravelTime() {
        if(!planetMap.containsKey(planet.toLowerCase())) {
            return 0.0;
        }
        if(!travelMap.containsKey(travelType.toLowerCase())) {
            return 0.0;
        }
        double milesPerHour = travelMap.get(travelType.toLowerCase());
        double milesPerDay = milesPerHour * 24;
        double milesPerYear = milesPerDay * 365;
        
        double distance = planetMap.get(planet.toLowerCase());
        double travelTime = distance / milesPerYear;
        
        return Math.floor(travelTime);
    }
    
    public double getAgeAfterTravel() {
        if(!planetMap.containsKey(planet.toLowerCase())) {
            return 0.0;
        }
        if(!travelMap.containsKey(travelType.toLowerCase())) {
            return 0.0;
        }
        double milesPerHour = travelMap.get(travelType.toLowerCase());
        double milesPerDay = milesPerHour * 24;
        double milesPerYear = milesPerDay * 365;
        
        double distance = planetMap.get(planet.toLowerCase());
        
        double travelTime = distance / milesPerYear;
        double ageAfterTravel = earthAge + travelTime;
        
        return Math.floor(ageAfterTravel);
    }
    

}