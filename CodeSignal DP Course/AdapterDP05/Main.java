public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of Vga
        // TODO: Create an instance of HdmiAdapter using the Vga instance
        // TODO: Use the adapter to connect with HDMI interface
        // It should print "Connected with VGA cable."
        Vga vga = new Vga();
        Hdmi hdmi = new HdmiAdapter(vga);
        hdmi.connectWithHdmiCable();
    }
}