package AdapterDP03;

public class Main {
    public static void main(String[] args) {
        Dvi dvi = new Dvi();
        Hdmi adapter = new Adapter(dvi);
        adapter.connectWithHdmiCable();
    }
}