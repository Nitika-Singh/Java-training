package com.jpmc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDOperations {
    private static String connectionString = "jdbc:mysql://localhost/training";
    private static String userName = "root";
    private static String password = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, userName, password);
            int id = (int)(Math.random() * 1000);
            //insert into persons values(121, 'ram', 23);
            String insertQuery = "INSERT INTO persons values(" + id + ", 'Ram', 23)";

            Statement statement = connection.createStatement();
            statement.execute(insertQuery);
            statement.close();

            System.out.println("Record inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }

    }
}
