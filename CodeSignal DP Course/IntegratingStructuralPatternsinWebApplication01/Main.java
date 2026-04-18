package IntegratingStructuralPatternsinWebApplication01;

public class Main {
    public static void main(String[] args) {
        // TODO: Create an instance of MongoDB and use the adapter to connect as an SQL
        // database.
        // This should output: "Connected to MongoDB (NoSQL) database."

        MongoDB mongoDB = new MongoDB();

        SQLDatabase sqlDatabase = new SQLDatabaseAdapter(mongoDB);

        sqlDatabase.connectToSQL();
    }
}