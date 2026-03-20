package FactoryDP3;

// TODO: Create a class InstrumentFactory with an enum for InstrumentType
// TODO: Add a factory method to create instruments based on the type

public class InstrumentFactory{
    public enum InstrumentType{
        GUITAR, PIANO, PUSH
    }
    
    public static Instrument getInstrument(InstrumentType type){
        switch (type) {
            case GUITAR:
                return new Guitar();
            case PIANO:
                return new Piano();
            default:
                return new NullInstrument();
        }
    }
}