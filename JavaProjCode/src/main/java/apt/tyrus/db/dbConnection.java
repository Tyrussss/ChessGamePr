package apt.tyrus.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    public static Connection getConnection() {
        try {
            String dbPath = "db\\ProjectJDB.db";
            String connectionURL = "jdbc:SQLite:" + dbPath;
            return DriverManager.getConnection(connectionURL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void close(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
