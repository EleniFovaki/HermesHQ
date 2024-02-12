package com.HermeshqApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.HermeshqApi.models")
@ComponentScan(basePackages = {"com.HermeshqApi.controllers"})
@ComponentScan(basePackages = "com.HermeshqApi.repositories")
public class HermeshqApi {
    public static void main(String[] args) {
        SpringApplication.run(HermeshqApi.class, args);
        System.out.println("Hello");
    }
}


