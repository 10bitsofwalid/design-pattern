package BankingSystemCP01;

public class DatabaseConnection {

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
    }

    // TODO: Implement the static inner helper class to hold the Singleton instance

    // TODO: Implement the public method to provide access to the Singleton instance

    private static class DatabaseConnectionHelper {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        return DatabaseConnectionHelper.INSTANCE;
    }

    public void connect() {
        System.out.println("Database connected.");
    }
}