package DecoratorDP02;

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer(new BasicComputer());
        System.out.println(gamingComputer.assemble());

        Computer workStation = new WorkStationComputer(new BasicComputer());
        System.out.println(workStation.assemble());
    }
}
