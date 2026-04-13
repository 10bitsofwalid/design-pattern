package FacadeDP01;

public class HardDrive {
    public String read(long lba, int size) {
        return "Data from sector " + lba + " with size " + size;
    }

    public void stop() {
        System.out.println("Hard Drive stopping...");
    }
}