package IncorporatingBehavioralPatternsinaSmartHomeSystem01;

// TODO: Implement the CoolingStrategy class that implements ClimateControlStrategy interface and override the controlTemperature method to print a message indicating the house is being cooled.

public class CoolingStrategy implements ClimateControlStrategy {
    @Override
    public void controlTemperature() {
        System.out.println("Cooling Strategy: The house is being cooled.");
    }
}