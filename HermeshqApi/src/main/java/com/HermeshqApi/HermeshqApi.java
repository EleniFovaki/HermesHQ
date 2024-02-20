package com.HermeshqApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.SQLException;



@SpringBootApplication


public class HermeshqApi {
    public static void main(String[] args) {
        SpringApplication.run(HermeshqApi.class, args);
        System.out.println("Hello world");
        try (var connection =  DB.connect()){
            System.out.println("Connected to the PostgreSQL database.");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}


