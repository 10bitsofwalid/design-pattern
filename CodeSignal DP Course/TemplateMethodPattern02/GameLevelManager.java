package TemplateMethodPattern02;

// TODO: Define an abstract class named GameLevelManager
// - Add a final template method playLevel() that calls the methods:
//   - initializeLevel()
//   - startLevel()
//   - completeLevel()
//   - cleanupLevel()
// - Implement the method initializeLevel() to print "Initializing the game level."
// - Define abstract methods: startLevel(), completeLevel(), and cleanupLevel()

public abstract class GameLevelManager {

    public final void playLevel() {
        initializeLevel();
        startLevel();
        completeLevel();
        cleanupLevel();
    }

    protected void initializeLevel() {
        System.out.println("Initializing the game level.");
    }

    protected abstract void startLevel();

    protected abstract void completeLevel();

    protected abstract void cleanupLevel();
}
