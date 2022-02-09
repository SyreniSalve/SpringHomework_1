package com.example.springhomework_1.exercise03.sdasolution;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;

//@Component
public class WithSecondaryCommandLineRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    public WithSecondaryCommandLineRunner(@Qualifier("dummyLoggerTwo") final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
