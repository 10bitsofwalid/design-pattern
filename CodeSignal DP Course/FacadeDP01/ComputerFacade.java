package FacadeDP01;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting the computer...");
        cpu.freeze();
        memory.load(0, hardDrive.read(100, 1024));
        cpu.jump(0);
        cpu.execute();
        System.out.println("Computer started successfully.");
    }

    public void shutdown() {
        System.out.println("Shutting down the computer...");
        cpu.shutdown();
        memory.clear();
        hardDrive.stop();
        System.out.println("Computer shut down successfully.");
    }
}
