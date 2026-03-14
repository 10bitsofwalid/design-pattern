package inheritance4;


// TODO: Define the Vehicle class with private members make and year of string and int type respectively
// Define a public constructor that initializes the make and year members
// Define a drive method that shows a message "Driving a vehicle made by make in the year year"

public class Vehicle{
    private String make;
    private int year;
    
    Vehicle(String make, int year){
        this.make = make;
        this.year = year;
    }
    
    public void drive(){
        System.out.println("Driving a vehicle made by "+make+" in the year "+year);
    }
}