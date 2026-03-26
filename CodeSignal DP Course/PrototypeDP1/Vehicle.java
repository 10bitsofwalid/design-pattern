package PrototypeDP1;

public abstract class Vehicle implements Cloneable {

    private String model;

    // Constructor
    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Abstract method to be implemented by concrete prototypes
    public abstract Vehicle cloneVehicle();

    @Override
    protected Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}