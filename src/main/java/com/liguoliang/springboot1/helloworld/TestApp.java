package com.liguoliang.springboot1.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestApp implements CommandLineRunner {

    @Autowired
    Config config;

    @Value("${app.name}")
    String name;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("hi app name with prefix: " + config.getName());
        System.out.println("app name without prefix: " + config.getName());
    }
}
