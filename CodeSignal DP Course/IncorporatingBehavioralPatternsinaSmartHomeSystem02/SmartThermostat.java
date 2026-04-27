package IncorporatingBehavioralPatternsinaSmartHomeSystem02;

// TODO: Complete the SmartThermostat class that uses the State pattern for different modes.
public class SmartThermostat {
    private State currentState;

    // TODO: Add fields for currentTemperature and targetTemperature.

    // TODO: Initialize the thermostat with IdleState as the default state and
    // accept targetTemperature in the constructor.

    // TODO: Implement setters for currentTemperature and targetTemperature.

    // TODO: Implement a method that updates currentState based on
    // currentTemperature vs targetTemperature.

    // TODO: Implement handleState() to update the state and then execute the
    // current state's behavior.

    private double currentTemperature;
    private double targetTemperature;

    public SmartThermostat(double targetTemperature) {
        this.targetTemperature = targetTemperature;
        this.currentState = new IdleState(this);
        System.out.println("SmartThermostat initialized. Target temperature: "
                + targetTemperature + "°C");
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    public void updateState() {
        if (currentTemperature < targetTemperature) {
            currentState = new HeatingState();
        } else if (currentTemperature > targetTemperature) {
            currentState = new CoolingState();
        } else {
            currentState = new IdleState(this);
        }
    }

    public void handleState() {
        updateState();
        currentState.handleRequest();
    }

}
