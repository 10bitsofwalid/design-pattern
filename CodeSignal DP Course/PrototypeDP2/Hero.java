package PrototypeDP2;

public abstract class Hero implements Cloneable {

    private String alias;

    // Constructor
    public Hero(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    // TODO: Declare an abstract method named 'cloneHero'
    public abstract Hero cloneHero();

    @Override
    protected Hero clone() {
        try {
            return (Hero) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}