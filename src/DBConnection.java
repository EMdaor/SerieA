

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String USERNAME="SA";
    private static final String PASSWORD="";
    private static String connectionString = "jdbc:hsqldb:file:db-data/mydatabase";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionString, "SA", "");
    }
}
