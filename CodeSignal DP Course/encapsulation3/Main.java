package encapsulation3;

public class Main {
    public static void main(String[] args) {
        Gadget gadget = new Gadget("Smartphone", 999.99); // Update constructor call once updated
        gadget.setName("Laptop");
        // TODO: Set the price to 49.99
        gadget.setPrice(49.99);
        
        System.out.println("Name: " + gadget.getName());
        System.out.println("Price: " +gadget.getPrice());
        
        // TODO: Print the price
    }
}