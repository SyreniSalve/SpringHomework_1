package com.example.springhomework_1.exercise03.mysolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerImplementation implements CommandLineRunner {

    @Autowired
    private DummyLogger firstApple;

    @Autowired
    private DummyLogger secondApple;

    @Override
    public void run(String... args) throws Exception {
        firstApple.sayHello();
        secondApple.sayHello();
    }
}
