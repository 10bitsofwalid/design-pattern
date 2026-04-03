package BankingSystemCP05;

// TODO: Define the abstract Prototype class that implements Cloneable and provides a clone method.


public abstract class Prototype implements Cloneable {

    public abstract Prototype clonePrototype();

    @Override
    protected Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}