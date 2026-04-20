package BehaviouralDesignPattern03;

public class VIPStrategy implements TicketStrategy {
    private String vipCode;

    public VIPStrategy(String vipCode) {
        this.vipCode = vipCode;
    }

    @Override
    public void bookTicket(String event) {
        System.out.println("Booked a VIP ticket for: " + event + " with VIP code: " + vipCode);
    }
}