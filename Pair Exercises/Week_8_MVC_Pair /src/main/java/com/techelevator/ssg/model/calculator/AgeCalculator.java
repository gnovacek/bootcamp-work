package com.techelevator.ssg.model.calculator;

import java.util.HashMap;
import java.util.Map;

public class AgeCalculator {
    
    private String planetChoice;
    private double earthAge;
    private Map<String, Double> planetMap = new HashMap<>();
    
    public AgeCalculator(String planetChoice, double earthAge) {
        this.planetChoice = planetChoice;
        this.earthAge = earthAge;
        planetMap.put("mercury", 4.15);
        planetMap.put("venus", 1.62);
        planetMap.put("earth", 1.0);
        planetMap.put("mars", 0.53);
        planetMap.put("jupiter", 0.084);
        planetMap.put("saturn", 0.034);
        planetMap.put("uranus", 0.012);
        planetMap.put("neptune", 0.006);
    }
    
    public double getAlienAge() {
        if(!planetMap.containsKey(planetChoice.toLowerCase())) {
            return 0.0;
        }
        double conversion = planetMap.get(planetChoice.toLowerCase());
        double newPlanetAge = earthAge * conversion;
        
        return Math.floor(newPlanetAge);
        
    }
    

}