package polymorphism3;

// TODO: Implement the Laptop class that extends Device
// - Include an additional attribute for the operating system
// - Implement the constructor to initialize the name, power status, and operating system
// - Override the 'status' method to display the operating system along with the device name and power status

public class Laptop extends Device{
    private String operatingSystem;
    Laptop(String name, String powerStatus, String operatingSystem){
        super(name, powerStatus);
        this.operatingSystem = operatingSystem;
    }
    
    public void status(){
        super.status();
        System.out.println("Operating System: "+operatingSystem);
    }
}