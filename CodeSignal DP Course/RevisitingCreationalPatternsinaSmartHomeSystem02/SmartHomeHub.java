package RevisitingCreationalPatternsinaSmartHomeSystem02;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    // TODO: Add a List to store devices

    private List<Device> devices = new ArrayList<>();

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
        // TODO: Add the device to the devices list.
        // TODO: Print a confirmation message "Device added: " followed by the device's
        // class name. (Hint: Use getClass().getSimpleName())

        devices.add(device);
        System.out.println("Device added: " + device.getClass().getSimpleName());
    }

    public List<Device> getDevices() {
        return devices;
    }
}
