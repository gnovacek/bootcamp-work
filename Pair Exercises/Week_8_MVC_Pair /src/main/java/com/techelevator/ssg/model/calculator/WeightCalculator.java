package com.techelevator.ssg.model.calculator;

import java.util.HashMap;
import java.util.Map;

public class WeightCalculator {
    
    private String planet;
    private double earthWeight;
    private Map<String, Double> planetMap = new HashMap<>();
    
    public WeightCalculator(String planet, double earthWeight) {
        this.planet = planet;
        this.earthWeight = earthWeight;
        planetMap.put("mercury", 0.37);
        planetMap.put("venus", 0.90);
        planetMap.put("earth", 1.0);
        planetMap.put("mars", 0.38);
        planetMap.put("jupiter", 2.65);
        planetMap.put("saturn", 1.13);
        planetMap.put("uranus", 1.09);
        planetMap.put("neptune", 1.43);
    }
    
    public double getAlienWeight() {
        if(!planetMap.containsKey(planet.toLowerCase())) {
            return 0.0;
        }
        double conversion = planetMap.get(planet.toLowerCase());
        double newPlanetWeight = earthWeight * conversion;
        
        return Math.floor(newPlanetWeight);
        
    }
    

}
