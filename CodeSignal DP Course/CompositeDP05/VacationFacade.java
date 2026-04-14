package CompositeDP05;

// TODO: Implement the VacationFacade class to provide a simplified interface for booking a vacation package.
public class VacationFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;

    public VacationFacade() {
        // Initialize the subsystems

        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.carRental = new CarRental();
    }

    // TODO: Implement the bookVacation method to book flight, hotel, and car rental
    // using the subsystems.
    public void bookVacation() {
        // Book the vacation package using the subsystems

        flightBooking.bookFlight();
        hotelBooking.bookHotel();
        carRental.rentCar();
        System.out.println("Vacation package booked successfully.");
    }
}
