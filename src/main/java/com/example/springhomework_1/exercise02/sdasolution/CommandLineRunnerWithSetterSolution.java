package com.example.springhomework_1.exercise02.sdasolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterSolution implements CommandLineRunner {

    private DummyLoggerSolution dummyLoggerSolution;

    @Override
    public void run(String... args) throws Exception {
        dummyLoggerSolution.sayHello();
    }

    @Autowired
    public void setDummyLoggerSolution2(final DummyLoggerSolution dummyLoggerSolution){
        this.dummyLoggerSolution = dummyLoggerSolution;
    }
}
