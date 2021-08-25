package com.jpmc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBasics {
    public static void main(String[] args) throws SQLException {
        //String connectionString = "jdbc:mysql://localhost:3306/training";
        String connectionString = "jdbc:oracle:thin:@localhost:1521:xe"; //xe
        String userName = "root"; //SYSTEM
        String password = "root"; //Oracle$
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if( connection != null) {
            System.out.println("Success");
        } else {
            System.out.println("Error connecting");
        }
        connection.close();
    }
}
