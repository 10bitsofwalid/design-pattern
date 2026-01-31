package inheritance;

public class Car extends vehical {
    int doors;

    public Car(String brandname, int year, int doors) {
        super(brandname, year);
        this.doors = doors;
    }

    public void display() {
        displayInfo();
        System.out.println("Doors: " + doors);
    }

    public static void main(String[] args) {
        Car car1 = new Car("toyota", 2017, 04);
        car1.display();
    }

}
