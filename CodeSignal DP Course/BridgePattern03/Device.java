package BridgePattern03;

public abstract class Device {
    protected OperatingSystem os;

    // TODO: Complete the constructor that accepts OperatingSystem
    public Device(OperatingSystem os) {
        this.os = os;
    }

    // TODO: Complete the start method declaration
    public abstract void start();
}