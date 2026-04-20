package BehaviouralDesignPattern03;

public class BookingSystem {
    private TicketStrategy strategy;

    public void setTicketStrategy(TicketStrategy strategy) {
        this.strategy = strategy;
    }

    public void book(String event) {
        if (strategy != null) {
            strategy.bookTicket(event);
        } else {
            System.out.println("No ticket strategy set.");
        }
    }
}
