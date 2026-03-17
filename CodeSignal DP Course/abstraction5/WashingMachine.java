package abstraction5;

// TODO: Define a class WashingMachine that inherits from Appliance
// TODO: Implement the turnOn method to print "The washing machine is now ON."
// TODO: Implement the turnOff method to print "The washing machine is now OFF."

public class WashingMachine extends Appliance{
    public String turnOn(){
        return "The washing machine is now ON";
    }
    public String turnOff(){
        return "The washing machine is now OFF";
    }
    
}