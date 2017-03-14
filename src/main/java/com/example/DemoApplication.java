package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    String weatherType() {
        return "weather type: ";
    }


    @Bean
    String otherWeatherType() {
        return "other weather type";
    }
}
