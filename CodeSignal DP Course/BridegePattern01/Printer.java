package BridegePattern01;

public class Printer extends Device {
    public Printer(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.print("Printer: ");
        os.run("Printer");
    }
}