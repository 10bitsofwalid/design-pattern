package TemplateMethodPattern02;

// TODO: Define a class named EasyLevel that extends GameLevelManager

// - Implement the startLevel() method to print "Starting Easy Level."
// - Implement the completeLevel() method to print "Completing Easy Level."
// - Implement the cleanupLevel() method to print "Cleaning up after Easy Level."

public class EasyLevel extends GameLevelManager {

    @Override
    protected void startLevel() {
        System.out.println("Starting Easy Level.");
    }

    @Override
    protected void completeLevel() {
        System.out.println("Completing Easy Level.");
    }

    @Override
    protected void cleanupLevel() {
        System.out.println("Cleaning up after Easy Level.");
    }
}
