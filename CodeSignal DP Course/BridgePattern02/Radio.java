package BridgePattern02;

// TODO: Implement the Radio class that simulates a radio device.
public class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned off.");
    }
}
