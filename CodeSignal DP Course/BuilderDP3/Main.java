package BuilderDP3;

public class Main {
    public static void main(String[] args) {
        // Building a House object using the Builder pattern
        House house = new House.HouseBuilder(4, 3)  // Required parameters
                .setGarage(true)                    // Optional parameter
                .setSwimmingPool(true)              // Optional parameter
                .setGarden(true)                    // Optional parameter
                .build();

        System.out.println("House has " + house.getRooms() + " rooms.");
        System.out.println("House has " + house.getBathrooms() + " bathrooms.");
        System.out.println("House has a garage: " + house.hasGarage());
        System.out.println("House has a swimming pool: " + house.hasSwimmingPool());
        System.out.println("House has a garden: " + house.hasGarden());
    }
}