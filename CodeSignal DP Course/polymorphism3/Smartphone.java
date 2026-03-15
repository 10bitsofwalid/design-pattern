package polymorphism3;

// TODO: Implement the Smartphone class that extends Device
// - Include an additional attribute for the carrier
// - Implement the constructor to initialize the name, power status, and carrier
// - Override the 'status' method to display the carrier along with the device name and power status

public class Smartphone extends Device{
    private String carrier; 
    
    Smartphone(String name, String powerStatus, String carrier){
        super(name, powerStatus);
        this.carrier = carrier;
    }
    
    public void status(){
        super.status();
        System.out.println("Carrier: "+carrier);
    }
}
