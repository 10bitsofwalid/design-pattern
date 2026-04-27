package IncorporatingBehavioralPatternsinaSmartHomeSystem02;

// TODO: Implement the HeatingState class.

// TODO: Print "Heating mode activated." in the overridden method.

public class HeatingState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Heating mode activated.");
    }
}