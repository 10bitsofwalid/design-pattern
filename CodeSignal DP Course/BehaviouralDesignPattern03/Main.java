package BehaviouralDesignPattern03;

public class Main {
    public static void main(String[] args) {
        BookingSystem system = new BookingSystem();

        TicketStrategy regular = new RegularStrategy();
        TicketStrategy vip = new VIPStrategy("VIP123");

        system.setTicketStrategy(regular);
        system.book("Concert");

        system.setTicketStrategy(vip);
        system.book("Theater");  
    }
}