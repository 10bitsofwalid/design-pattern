package AdapterDP01;

public class Main {
    public static void main(String[] args) {
        MicroUsb microUsb = new MicroUsb();
        Usb adapter = new Adapter(microUsb);
        adapter.connectWithUsbCable();


    }
}
