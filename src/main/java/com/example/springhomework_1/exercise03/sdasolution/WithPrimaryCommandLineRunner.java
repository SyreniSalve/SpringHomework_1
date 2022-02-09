package com.example.springhomework_1.exercise03.sdasolution;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class WithPrimaryCommandLineRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
