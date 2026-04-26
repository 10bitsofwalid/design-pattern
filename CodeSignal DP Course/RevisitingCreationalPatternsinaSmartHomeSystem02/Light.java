package RevisitingCreationalPatternsinaSmartHomeSystem02;

public class Light extends Device {
    // TODO: Implement the methods turnOn() to print "Light is on." and turnOff() to
    // print "Light is off.".

    public void turnOn() {
        System.out.println("Light is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off.");
    }

}