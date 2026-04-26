package RevisitingCreationalPatternsinaSmartHomeSystem03;

public class Thermostat {
    private double temperature;
    private double humidity;
    private String schedule;

    // TODO: Implement the Builder inner class for Thermostat configuration
    // TODO: Implement the displaySettings method to show the thermostat settings

    private Thermostat(Builder builder) {
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
        this.schedule = builder.schedule;
    }

    public void displaySettings() {
        System.out.println("Thermostat Settings");
        System.out.println("Temperature : " + temperature + "°C");
        System.out.println("Humidity    : " + humidity + "%");
        System.out.println("Schedule    : " + schedule);
    }

    public static class Builder {
        private double temperature = 22.0;
        private double humidity = 50.0;
        private String schedule = "None";

        public Builder setTemperature(double temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder setHumidity(double humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        public Thermostat build() {
            return new Thermostat(this);
        }
    }

}
