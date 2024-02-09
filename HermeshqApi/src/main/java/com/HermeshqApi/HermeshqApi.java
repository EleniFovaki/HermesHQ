package com.HermeshqApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.HermeshqApi.models")
public class HermeshqApi {
    public static void main(String[] args) {
        SpringApplication.run(HermeshqApi.class, args);
        System.out.println("Hello");
    }
}


