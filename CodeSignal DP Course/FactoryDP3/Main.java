package FactoryDP3;

// TODO: Create a Main class to test the Instrument factory method
public class Main {
    public static void main(String[] args) {
        // TODO: Use the InstrumentFactory to create a Guitar and call the play method
        // TODO: Use the InstrumentFactory to create a Piano and call the play method
        // TODO: Use the InstrumentFactory to create an unsupported instrument (null) and call the play method
        
        Instrument guitar = InstrumentFactory.getInstrument(InstrumentFactory.InstrumentType.GUITAR);
        Instrument piano = InstrumentFactory.getInstrument(InstrumentFactory.InstrumentType.PIANO);
        Instrument nullInstrument = InstrumentFactory.getInstrument(InstrumentFactory.InstrumentType.PUSH);
        
        guitar.play();
        piano.play();
        nullInstrument.play();
    }   
}