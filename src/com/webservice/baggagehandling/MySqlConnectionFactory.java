package com.webservice.baggagehandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlConnectionFactory {
	public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Properties properties = new Properties();
            properties.setProperty("useSSL", "false");
            properties.setProperty("user", "root");
            properties.setProperty("password", "mysqlsindhu123");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BaggageHandlingService", properties);
            return connection;
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

            throw new RuntimeException(ex);
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
