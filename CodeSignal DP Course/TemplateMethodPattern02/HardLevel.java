package TemplateMethodPattern02;

// TODO: Define a class named HardLevel that extends GameLevelManager
// - Implement the startLevel() method to print "Starting Hard Level."
// - Implement the completeLevel() method to print "Completing Hard Level."
// - Implement the cleanupLevel() method to print "Cleaning up after Hard Level."

public class HardLevel extends GameLevelManager {

    @Override
    protected void startLevel() {
        System.out.println("Starting Hard Level.");
    }

    @Override
    protected void completeLevel() {
        System.out.println("Completing Hard Level.");
    }

    @Override
    protected void cleanupLevel() {
        System.out.println("Cleaning up after Hard Level.");
    }
}