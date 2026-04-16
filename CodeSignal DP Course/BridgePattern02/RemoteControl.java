package BridgePattern02;

// TODO: Implement the RemoteControl class that uses a Device to control it.
public class RemoteControl {
    private Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    // TODO: Implement the turnOn method to turn on the device
    public void turnOn() {
        // Implement turning on the device
        device.turnOn();
    }

    // TODO: Implement the turnOff method to turn off the device
    public void turnOff() {
        // Implement turning off the device
        device.turnOff();
    }
}