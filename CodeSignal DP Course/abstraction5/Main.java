package abstraction5;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of Appliance that points to a Television object and call its turnOn and turnOff methods
        // TODO: Change the instance to point to a WashingMachine object and call its turnOn and turnOff methods
        
        Appliance television = new Television();
        Appliance washingMachine = new WashingMachine();
        
        System.out.println(television.turnOn());
        System.out.println(television.turnOff());
        
        System.out.println(washingMachine.turnOn());
        System.out.println(washingMachine.turnOff());
    }
}