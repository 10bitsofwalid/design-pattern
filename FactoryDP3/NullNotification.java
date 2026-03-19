package FactoryDP3;

// TODO: Create NullNotification class that extends Notification
// TODO: Implement the send() method to print "Unsupported Notification Type."

public class NullNotification extends Notification{
    public void send(){
        System.out.println("Unsupported Notification Type");
    }
}