package Applyin_CreationalPattern_inBankingSystem;

public class Main {
    public static void main(String[] args) {
        // TODO: Create the first instance of DatabaseConnection

        // TODO: Create the second instance of DatabaseConnection

        // TODO: Verify if both instances are the same

        // TODO: Test the connect method

        DatabaseConnection db1 = DatabaseConnection.getInstance();

        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println("Same instance? " + (db1 == db2));

        db1.connect();
    }
}