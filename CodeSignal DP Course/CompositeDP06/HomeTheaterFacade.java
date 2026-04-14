package CompositeDP06;

// TODO: Define the HomeTheaterFacade class

// TODO: Create private member variables for Projector, SoundSystem, and Lights
// TODO: In the constructor, initialize these member variables
// TODO: Implement the watchMovie method to orchestrate starting movie components
// TODO: Implement the endMovie method to orchestrate stopping movie components

public class HomeTheaterFacade {
    private Projector projector;
    private SoundSystem soundSystem;
    private Lights lights;

    public HomeTheaterFacade() {
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        this.lights = new Lights();
    }

    public void watchMovie() {
        lights.dim();
        projector.turnOn();
        projector.display();
        soundSystem.start();
        soundSystem.playSound();
    }

    public void endMovie() {
        soundSystem.stop();
        projector.turnOff();
        lights.brighten();
    }
}
