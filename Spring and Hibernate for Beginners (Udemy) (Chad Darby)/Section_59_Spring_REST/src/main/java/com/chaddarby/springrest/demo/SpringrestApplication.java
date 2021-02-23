package com.chaddarby.springrest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.chaddarby.springrest")
public class SpringrestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringrestApplication.class, args);
    }

}
