package IncorporatingBehavioralPatternsinaSmartHomeSystem01;

public class SmartHomeHub {

    // TODO: Implement the setClimateControlStrategy method to set the current
    // climate control strategy.

    // TODO: Implement the executeClimateControl method to execute the current
    // climate control strategy.

    private ClimateControlStrategy climateControlStrategy;

    public void setClimateControlStrategy(ClimateControlStrategy climateControlStrategy) {
        this.climateControlStrategy = climateControlStrategy;
        System.out.println("Climate control strategy set to: "
                + climateControlStrategy.getClass().getSimpleName());
    }

    public void executeClimateControl() {
        if (climateControlStrategy == null) {
            System.out.println("No climate control strategy set.");
            return;
        }
        climateControlStrategy.controlTemperature();
    }

}
