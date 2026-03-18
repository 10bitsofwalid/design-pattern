package SingletonDP2;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        // TODO: Create another instance using getInstance()
        Singleton singleton2 = Singleton.getInstance();
        // Notice that the log message "Singleton instance created." is only displayed once,
        // demonstrating that the Singleton instance is only created once.
        
        System.out.println("Instance1: "+singleton1);
        System.out.println("Instance2: "+singleton2);
        System.out.println("Same instance? = "+(singleton1==singleton2));
    }
}
