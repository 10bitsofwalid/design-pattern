package RevisitingCreationalPatternsinaSmartHomeSystem02;

public class Main {
    public static void main(String[] args) {
        // TODO: Get the SmartHomeHub instance.

        // TODO: Use DeviceFactory to create a Light and add it to the hub.

        // TODO: Use DeviceFactory to create a Fan and add it to the hub.

        SmartHomeHub hub = SmartHomeHub.getInstance();

        Device light = DeviceFactory.createDevice(DeviceFactory.DeviceType.LIGHT);
        hub.addDevice(light);

        Device fan = DeviceFactory.createDevice(DeviceFactory.DeviceType.FAN);
        hub.addDevice(fan);

        light.turnOn();
        light.turnOff();

        fan.turnOn();
        ((Fan) fan).setSpeed(3);
        fan.turnOff();
    }

}
