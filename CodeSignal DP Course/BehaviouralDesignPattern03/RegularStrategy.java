package BehaviouralDesignPattern03;

public class RegularStrategy implements TicketStrategy {
    @Override
    public void bookTicket(String event) {
        System.out.println("Booked a regular ticket for: " + event);
    }
}
