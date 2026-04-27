package IncorporatingBehavioralPatternsinaSmartHomeSystem02;

// TODO: Implement the CoolingState class.

// TODO: Print "Cooling mode activated." in the overridden method.

public class CoolingState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Cooling mode activated.");
    }
}
