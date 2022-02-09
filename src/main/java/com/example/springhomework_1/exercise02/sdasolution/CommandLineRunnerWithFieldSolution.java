package com.example.springhomework_1.exercise02.sdasolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithFieldSolution implements CommandLineRunner {

    @Autowired
    private DummyLoggerSolution dummyLoggerSolution;

    @Override
    public void run(String... args) throws Exception {
        dummyLoggerSolution.sayHello();
    }
}
