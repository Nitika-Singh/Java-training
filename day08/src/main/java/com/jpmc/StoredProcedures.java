package com.jpmc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedures {
    private static String connectionString = "jdbc:mysql://localhost/training";
    private static String userName = "root";
    private static String password = "root";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString, userName, password);
            String storedProc = "call sp_takeABreak()";
            CallableStatement statement = connection.prepareCall(storedProc);
            statement.execute();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
}
