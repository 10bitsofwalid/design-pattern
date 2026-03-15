package polymorphism3;

public class Device {
    private String name;
    private String powerStatus;

    // TODO: Implement the constructor that initializes the device name and power status
    Device(String name, String powerStatus){
        this.name = name;
        this.powerStatus = powerStatus;
    }

    // TODO: Implement the 'status' method that prints the device name and power status
    public void status(){
        System.out.println("Name: "+name);
        System.out.println("Power Status: "+powerStatus);
    }
}
