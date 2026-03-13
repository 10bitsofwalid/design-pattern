package encapsulation3;

public class Gadget {
    private String name;
    // TODO: Add price attribute
    private double price;

    // TODO: Modify the constructor to also accept a price parameter and initialize it using the setter method
    public Gadget(String name, double price) {
        this.name = name;
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
        if(price<50.0){
            this.price = 50.0;
        }
    }
    public String getName() {
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    // TODO: Add setPrice method with a condition to ensure the price is not set below 50.00, if so, set it to 50.00

    // TODO: Add getPrice method
}
