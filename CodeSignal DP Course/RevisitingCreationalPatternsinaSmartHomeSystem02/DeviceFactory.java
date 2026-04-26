package RevisitingCreationalPatternsinaSmartHomeSystem02;

public class DeviceFactory {
    // TODO: Create an enum DeviceType for LIGHT and FAN.
    // TODO: Implement the createDevice() method to return a Light or Fan instance
    // based on the DeviceType input.

    public enum DeviceType {
        LIGHT,
        FAN
    }

    public static Device createDevice(DeviceType type) {
        switch (type) {
            case LIGHT:
                return new Light();
            case FAN:
                return new Fan();
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }

}