package umg.principal.DaseDatos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:C:\\Users\\mario\\Downloads\\frontEnd\\BaseDatos";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}