package com.ak4.springsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.ak4.config",
        "com.ak4.rest",
        "com.ak4.service",
        "com.ak4.facade",
        "com.ak4.repository",
        "com.ak4.mapper",
        "com.ak4.helper"
})
public class SpringSecurityJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJpaApplication.class, args);
    }

}

