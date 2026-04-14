package BridegePattern;

public class Scanner extends Device {
    public Scanner(OperatingSystem os) {
        super(os);
    }

    @Override
    public void start() {
        System.out.print("Scanner: ");
        os.run("Scanner");
    }
}
