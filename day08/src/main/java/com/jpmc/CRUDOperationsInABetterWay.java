package com.jpmc;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class CRUDOperationsInABetterWay {
    private static String connectionString = "jdbc:mysql://localhost/training";
    private static String userName = "root";
    private static String password = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, userName, password);
            insertPerson(connection);
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
        String updateQuery = "UPDATE persons set age = ? where id = ?";
        PreparedStatement statement  = connection.prepareStatement(updateQuery);
        statement.setInt(1, age);
        statement.setInt(2, id);;
        int numberOfRowsUpdated = statement.executeUpdate();
        System.out.println("Number of rows updated: " + numberOfRowsUpdated);
        statement.close();
    }

    private static void insertPerson(Connection connection) throws SQLException {

        String insertQuery = "INSERT INTO persons values(?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insertQuery);

        List<String> teenagers = Arrays.asList("Joe", "Sita", "Harsha");
        for(int i = 0; i < teenagers.size(); i++) {
            int id = (int)(Math.random() * 1000);
            statement.setInt(1, id);
            statement.setString(2, teenagers.get(i));
            statement.setInt(3, 15);
            statement.execute();
            System.out.println("Record inserted");
        }
        statement.close();

    }
}
