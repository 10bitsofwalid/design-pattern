package inheritance4;

// TODO: Define the Car class that inherits from Vehicle
// Define an additional private member model of string type
// Define a public constructor that initializes make, year, and model using the superclass constructor
// Define a displayDetails method that calls the drive method and then shows the model "The model is model"
// In the displayDetails method, make use of the drive method from the Vehicle class

public class Car extends Vehicle{
    private String model;
    
    Car(String make, int year, String model){
        super(make, year);
        this.model = model;
    }
    
    public void displayDetails(){
        drive();
        System.out.println("The model is "+model);
    }
}