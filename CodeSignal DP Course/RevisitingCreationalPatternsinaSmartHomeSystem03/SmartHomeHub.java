package RevisitingCreationalPatternsinaSmartHomeSystem03;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    private List<Device> devices = new ArrayList<>();
    private List<Thermostat> thermostats = new ArrayList<>();

    // TODO: Create a list to keep Thermostats

    private SmartHomeHub() {
        System.out.println("SmartHomeHub instance created.");
    }

    private static class SmartHomeHubHelper {
        private static final SmartHomeHub INSTANCE = new SmartHomeHub();
    }

    public static SmartHomeHub getInstance() {
        return SmartHomeHubHelper.INSTANCE;
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device added: " + device.getClass().getSimpleName());
    }

    // TODO: Add a method to add thermostats to the SmartHomeHub, which stores the
    // thermostat configuration in a list

    // TODO: Add a method to display all thermostat settings stored in the
    // SmartHomeHub

    public void addThermostat(Thermostat thermostat) {
        thermostats.add(thermostat);
        System.out.println("Thermostat added to SmartHomeHub.");
    }

    public void displayAllThermostatSettings() {
        if (thermostats.isEmpty()) {
            System.out.println("No thermostats registered.");
            return;
        }
        System.out.println("All Thermostat Settings");
        for (int i = 0; i < thermostats.size(); i++) {
            System.out.println("Thermostat #" + (i + 1));
            thermostats.get(i).displaySettings();
        }
    }

}
