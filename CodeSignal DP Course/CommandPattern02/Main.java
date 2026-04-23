package CommandPattern02;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);

        RemoteControl remote = new RemoteControl();

        // TODO: Set the lightOn command to the remote and press the button

        // TODO: Set the fanOn command to the remote and press the button

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.setCommand(fanOn);
        remote.pressButton();
    }
}