package com.example.springhomework_1.exercise01.sdasolution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLoggerSolution1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Hello from Exercise 1");
    }
}
