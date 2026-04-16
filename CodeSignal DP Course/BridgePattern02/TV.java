package BridgePattern02;

// TODO: Implement the TV class that simulates a TV device.
public class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off.");
    }
}
