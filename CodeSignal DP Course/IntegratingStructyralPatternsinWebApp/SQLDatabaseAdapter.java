package IntegratingStructyralPatternsinWebApp;

public class SQLDatabaseAdapter implements SQLDatabase {
    private NoSQLDatabase noSQLDatabase;

    // TODO: Create a constructor that takes a NoSQLDatabase object as a parameter
    // and initializes the noSQLDatabase instance variable.

    // TODO: Override the connectToSQL method. This method should call the
    // connectToNoSQL method of the noSQLDatabase instance.

    public SQLDatabaseAdapter(NoSQLDatabase noSQLDatabase) {
        this.noSQLDatabase = noSQLDatabase;
    }

    public void connectToSQL() {
        noSQLDatabase.connectToNoSQL();
    }
}