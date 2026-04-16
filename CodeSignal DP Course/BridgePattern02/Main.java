package BridgePattern02;

public class Main {
    public static void main(String[] args) {
        // TODO: Create instances of TV and Radio
        // TODO: Create instances of RemoteControl with appropriate devices
        // Test the remote control with the devices

        TV tv = new TV();
        Radio radio = new Radio();

        RemoteControl tvRemote = new RemoteControl(tv);
        RemoteControl radioRemote = new RemoteControl(radio);

        System.out.println("TV Remote");
        tvRemote.turnOn();
        tvRemote.turnOff();

        System.out.println("Radio Remote");
        radioRemote.turnOn();
        radioRemote.turnOff();
    }
}