package SingletonDP6;

// TODO: Use the Main class to test the Singleton pattern
public class Main {
    public static void main(String[] args) {
        // TODO: Get the Singleton instance using getInstance() method
        // TODO: Call the getInstance method again to demonstrate Singleton behavior
        
        SessionManager session1 = SessionManager.getInstance();
        SessionManager session2 = SessionManager.getInstance();
        
        System.out.println("Same instance?: "+(session1==session2));
    }
}
