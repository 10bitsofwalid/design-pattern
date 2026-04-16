package BridegePattern01;

public class Main {
    public static void main(String[] args) {
        // Running a Printer on Windows OS
        Device printerOnWindows = new Printer(new WindowsOS());
        printerOnWindows.start(); // Outputs: Printer: Running Printer on Windows OS.

        // Running a Scanner on MacOS
        Device scannerOnMac = new Scanner(new MacOS());
        scannerOnMac.start(); // Outputs: Scanner: Running Scanner on MacOS.
    }
}
