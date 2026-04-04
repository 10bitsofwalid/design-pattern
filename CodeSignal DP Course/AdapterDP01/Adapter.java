package AdapterDP01;

public class Adapter implements Usb {
    private MicroUsb microUsb;

    public Adapter(MicroUsb microUsb){
        this.microUsb = microUsb;
    }

    public void connectWithUsbCable(){
        microUsb.connectWithUsbCable();
    }
}
