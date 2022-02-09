package com.example.springhomework_1.exercise03.mysolutionb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SecondaryCommandLineRunner implements CommandLineRunner {

    private final DummyLogger dummyLogger;

    public SecondaryCommandLineRunner(@Qualifier("dummyLoggerTwo") final DummyLogger dummyLogger) {
        this.dummyLogger = dummyLogger;
    }

    @Override
    public void run(String... args) throws Exception {
        dummyLogger.sayHello();
    }
}
