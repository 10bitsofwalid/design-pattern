package BridgePattern03;

public class Scanner extends Device {
    // TODO: Complete the constructor that accepts OperatingSystem
    public Scanner(OperatingSystem os) {
        super(os);
    }

    // TODO: Complete the implementation of the start method
    @Override
    public void start() {
        System.out.print("Scanner: ");
        os.run("Scanner");
    }
}
