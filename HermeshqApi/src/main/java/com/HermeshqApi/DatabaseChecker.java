package com.HermeshqApi;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DatabaseChecker {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void checkDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection to the database established successfully!");
            } else {
                System.out.println("Failed to establish connection to the database.");
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while trying to connect to the database: " + e.getMessage());
        }
    }
}

