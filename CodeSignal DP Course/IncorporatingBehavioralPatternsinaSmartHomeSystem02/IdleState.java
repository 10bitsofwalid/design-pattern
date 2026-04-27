package IncorporatingBehavioralPatternsinaSmartHomeSystem02;

public class IdleState implements State {
    private SmartThermostat thermostat;

    public IdleState(SmartThermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void handleRequest() {
        System.out.println("Thermostat is idle.");
    }
}
