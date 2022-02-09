package com.example.springhomework_1.exercise02.mysolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CommandLineRunnerWithFieldInjection implements CommandLineRunner {

    @Autowired
    private DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
