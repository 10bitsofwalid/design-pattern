package BridgePattern03;

public class MacOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println("Running " + device + " on MacOS.");
    }
}