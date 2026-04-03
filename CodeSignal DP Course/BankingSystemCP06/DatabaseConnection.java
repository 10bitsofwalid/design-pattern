package BankingSystemCP06;

import java.time.LocalDateTime;

public class DatabaseConnection {

    private DatabaseConnection() {
        // Initialization code here
    }

    private static class SingletonHelper {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void connect() {
        System.out.println("Connected to the database.");
        // TODO: Call the logConnection method to indicate when the connection is established
        
        logConnection();
    }

    // TODO: Implement a private method logConnection() that logs the connection time using java.time.LocalDateTime.now()
    // as "Database connection established at " + <timestamp>
    
    private void logConnection() {
        System.out.println("Database connection established at " + LocalDateTime.now());
    }
}