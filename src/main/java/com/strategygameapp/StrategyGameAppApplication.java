package com.strategygameapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StrategyGameAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyGameAppApplication.class, args);
    }

}
