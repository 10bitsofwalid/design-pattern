package FacadeDP01;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        // Simulate some operations...
        computer.shutdown();
    }
}
