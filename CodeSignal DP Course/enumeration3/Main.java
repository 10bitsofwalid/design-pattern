package enumeration3;

public class Main {
    public static void main(String[] args) {
        for(CarType car: CarType.values()){
            System.out.println(car+ ": \n Weight: "+car.getWeight()+", Top Speed: "+car.getTopSpeed()+", Acceleration: "+car.acceleration());
        }
    }
}
