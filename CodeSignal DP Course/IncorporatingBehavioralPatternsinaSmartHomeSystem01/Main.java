package IncorporatingBehavioralPatternsinaSmartHomeSystem01;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        // TODO: Create instances of HeatingStrategy and CoolingStrategy.

        // TODO: Set the strategy on the SmartHomeHub and execute it.

        HeatingStrategy heating = new HeatingStrategy();
        CoolingStrategy cooling = new CoolingStrategy();

        hub.setClimateControlStrategy(heating);
        hub.executeClimateControl();

        System.out.println();

        hub.setClimateControlStrategy(cooling);
        hub.executeClimateControl();

    }
}
