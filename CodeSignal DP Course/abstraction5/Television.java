package abstraction5;

// TODO: Define a class Television that inherits from Appliance
// TODO: Implement the turnOn method to print "The television is now ON."
// TODO: Implement the turnOff method to print "The television is now OFF."

public class Television extends Appliance{
    public String turnOn(){
        return "The television is now ON";
    }
    public String turnOff(){
        return "The television is now OFF";
    }
}
