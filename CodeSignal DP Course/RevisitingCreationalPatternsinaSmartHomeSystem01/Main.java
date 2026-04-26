package RevisitingCreationalPatternsinaSmartHomeSystem01;

public class Main {
    public static void main(String[] args) {
        // TODO: Get the Singleton instance of SmartHomeHub.

        SmartHomeHub hub1 = SmartHomeHub.getInstance();
        SmartHomeHub hub2 = SmartHomeHub.getInstance();

        System.out.println("hub1 == hub2: " + (hub1 == hub2));
        System.out.println("hub1 hashCode: " + hub1.hashCode());
        System.out.println("hub2 hashCode: " + hub2.hashCode());
    }
}
