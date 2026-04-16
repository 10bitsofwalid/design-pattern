package BridegePattern01;

public class WindowsOS implements OperatingSystem {
    @Override
    public void run(String device) {
        System.out.println("Running " + device + " on Windows OS.");
    }
}