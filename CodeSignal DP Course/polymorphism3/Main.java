package polymorphism3;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of Laptop with the name "MacBook Pro", power status "On", and OS "macOS"
        
        Laptop laptop = new Laptop("MacBook Pro", "On", "macOS");
        
        // TODO: Create an instance of Smartphone with the name "iPhone", power status "Off", and carrier "Verizon"
        
        Smartphone smartphone = new Smartphone("iPhone", "Off", "Verizon");
        
        // TODO: Call the status method on both objects to print their details
        
        laptop.status();
        smartphone.status();
        
        
    }
}