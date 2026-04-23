package CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOn);
        remote.pressButton(); // Outputs: Light is on.
        remote.setCommand(lightOff);
        remote.pressButton(); // Outputs: Light is off.
    }
}