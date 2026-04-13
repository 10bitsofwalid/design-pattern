package FacadeDP01;

public class Memory {
    public void load(long position, String data) {
        System.out.println("Memory loading " + data + " at position " + position);
    }

    public void clear() {
        System.out.println("Memory clearing data...");
    }
}
