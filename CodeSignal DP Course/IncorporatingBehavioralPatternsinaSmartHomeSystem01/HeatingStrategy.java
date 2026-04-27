package IncorporatingBehavioralPatternsinaSmartHomeSystem01;

// TODO: Implement the HeatingStrategy class that implements ClimateControlStrategy interface and override the controlTemperature method to print a message indicating the house is being heated.

public class HeatingStrategy implements ClimateControlStrategy {
    @Override
    public void controlTemperature() {
        System.out.println("Heating Strategy: The house is being heated.");
    }
}