package AdapterDP03;

// Adapter.java
public class Adapter implements Hdmi {
    private Dvi dvi;

    public Adapter(Dvi dvi) {
        this.dvi = dvi;
    }

    @Override
    public void connectWithHdmiCable() {
        dvi.connectWithDviCable();
    }
}
