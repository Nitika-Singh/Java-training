package com.jpmc;

import java.sql.*;

public class CRUDOperations {
    private static String connectionString = "jdbc:mysql://localhost/training";
    private static String userName = "root";
    private static String password = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, userName, password);
            //insertPerson(connection);
            //updateAge(connection);
            selectPersons(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }

    private static void selectPersons(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM persons";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);
        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            //System.out.println(id + " " + name + " age");
            System.out.println(String.format("Id: %d, Name: %s, Age: %d", id, name, age));
        }
        resultSet.close();
        statement.close();
    }

    private static void updateAge(Connection connection) throws SQLException {
        int id = 856;
        int age = 34;
        String updateQuery = "UPDATE persons set age=" + age + " WHERE id=" + id;
        Statement statement = connection.createStatement();
        int numberOfRowsUpdated = statement.executeUpdate(updateQuery);
        System.out.println("Number of rows updated: " + numberOfRowsUpdated);
        statement.close();
    }

    private static void insertPerson(Connection connection) throws SQLException {
        int id = (int)(Math.random() * 1000);
        //insert into persons values(121, 'ram', 23);
        String insertQuery = "INSERT INTO persons values(" + id + ", 'Ram', 23)";

        Statement statement = connection.createStatement();
        statement.execute(insertQuery);
        statement.close();
        System.out.println("Record inserted");
    }
}
