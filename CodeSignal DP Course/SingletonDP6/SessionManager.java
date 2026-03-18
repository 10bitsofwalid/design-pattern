package SingletonDP6;

// TODO: Implement the Singleton pattern for this class
public class SessionManager {

    // TODO: Create a private constructor to prevent instantiation from other classes
    // Print statement to indicate the constructor is only called once per JVM
    // TODO: Create a static inner helper class that holds the Singleton instance
    // TODO: Create a public method to provide access to the Singleton instance
    
    private SessionManager(){
        System.out.println("Created once");
    }
    
    private static class SessionManagerHelper{
        public static final SessionManager INSTANCE = new SessionManager();
    }
    
    public static SessionManager getInstance(){
        return SessionManagerHelper.INSTANCE;
    }
}