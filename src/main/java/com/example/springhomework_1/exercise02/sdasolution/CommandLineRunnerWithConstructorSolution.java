package com.example.springhomework_1.exercise02.sdasolution;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor
public class CommandLineRunnerWithConstructorSolution implements CommandLineRunner {

    private DummyLoggerSolution dummyLoggerSolution;

    @Override
    public void run(String... args) throws Exception {
//        dummyLoggerSolution.sayHello();
    }
}
