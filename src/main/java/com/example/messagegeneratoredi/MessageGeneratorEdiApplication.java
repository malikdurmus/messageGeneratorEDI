package com.example.messagegeneratoredi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MessageGeneratorEdiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageGeneratorEdiApplication.class, args);
    }

}
