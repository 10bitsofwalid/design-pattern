package RevisitingCreationalPatternsinaSmartHomeSystem03;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of SmartHomeHub
        // TODO: Build a thermostat using the Builder pattern
        // TODO: Add the thermostat to the SmartHomeHub and display its settings

        SmartHomeHub hub = SmartHomeHub.getInstance();

        Thermostat thermostat = new Thermostat.Builder()
                .setTemperature(24.5)
                .setHumidity(60.0)
                .setSchedule("Weekdays 07:00 - 22:00")
                .build();

        hub.addThermostat(thermostat);
        hub.displayAllThermostatSettings();

        Thermostat thermostat2 = new Thermostat.Builder()
                .setTemperature(18.0)
                .setHumidity(45.0)
                .setSchedule("Weekends 08:00 - 23:00")
                .build();

        hub.addThermostat(thermostat2);
        hub.displayAllThermostatSettings();
    }
}