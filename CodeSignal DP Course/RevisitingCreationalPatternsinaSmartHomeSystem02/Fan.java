package RevisitingCreationalPatternsinaSmartHomeSystem02;

public class Fan extends Device {
    // TODO: Implement the methods turnOn() to print "Fan is on." and turnOff() to
    // print "Fan is off.".
    // TODO: Add a method setSpeed(int speed) to print "Fan speed set to " + speed +
    // ".".

    public void turnOn() {
        System.out.println("Fan is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off.");
    }

    public void setSpeed(int speed) {
        System.out.println("Fan speed set to " + speed + ".");
    }

}