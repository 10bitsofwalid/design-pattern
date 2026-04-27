package IncorporatingBehavioralPatternsinaSmartHomeSystem02;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a SmartThermostat instance with a target temperature (e.g., 22).

        // TODO: Set current temperature below target and handle the state.
        // Expected Output: Heating mode activated.

        // TODO: Set current temperature above target and handle the state.
        // Expected Output: Cooling mode activated.

        // TODO: Set current temperature equal to target and handle the state.
        // Expected Output: Thermostat is idle.

        SmartThermostat thermostat = new SmartThermostat(22);

        System.out.println();

        thermostat.setCurrentTemperature(18);
        System.out.print("Current: 18°C | Target: 22°C → ");
        thermostat.handleState();

        thermostat.setCurrentTemperature(27);
        System.out.print("Current: 27°C | Target: 22°C → ");
        thermostat.handleState();

        thermostat.setCurrentTemperature(22);
        System.out.print("Current: 22°C | Target: 22°C → ");
        thermostat.handleState();

    }
}
