package RevisitingCreationalPatternsinaSmartHomeSystem01;

public class SmartHomeHub {
    // TODO: Implement the Singleton pattern for SmartHomeHub.

    // TODO: Initialize a private constructor to prevent instantiation from outside.
    // TODO: In the constructor, print a message to confirm the creation of the
    // instance.

    // TODO: Create a static inner helper class to hold the Singleton instance.

    // TODO: Provide a public method to access the Singleton instance.

    private SmartHomeHub() {
        System.out.println("SmartHomeHub instance created.");
    }

    private static class SingletonHelper {
        private static final SmartHomeHub INSTANCE = new SmartHomeHub();
    }

    public static SmartHomeHub getInstance() {
        return SingletonHelper.INSTANCE;
    }

}