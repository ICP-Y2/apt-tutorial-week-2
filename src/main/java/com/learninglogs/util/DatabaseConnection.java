package com.learninglogs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    //Enter the database URL, username, and password
        private static final String DB_URL = "jdbc:mysql://localhost:3306/learning_logs";
        private static final String DB_USER = "root";
        private static final String DB_PASSWORD = "";

    // Create and return MySQL connection
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    //Close the database connection
    public static void closeConnection(Connection connection) throws SQLException, ClassNotFoundException {
        if (connection != null) connection.close();
    }
    
}
