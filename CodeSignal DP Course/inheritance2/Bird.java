package inheritance2;

// TODO: Define the Bird class that extends Animal
public class Bird extends Animal{
    private String color;
    
    public Bird(String species, String color){
        super(species);
        this.color = color;
    }
    
    public void displayColor(){
        System.out.println("Color: "+color);
    }
}
// Add a private member variable color of string type
// Define a public constructor that initializes species and color using the superclass constructor
// Implement a displayColor method to show a message "Color: color". The method should only contain one line that prints the color.