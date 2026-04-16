package BridgePattern03;

public class Printer extends Device {
    // TODO: Complete the constructor that accepts OperatingSystem
    public Printer(OperatingSystem os) {
        super(os);
    }

    // TODO: Complete the implementation of the start method
    @Override
    public void start() {
        System.out.print("Printer: ");
        os.run("Printer");
    }
}