package com.example.springhomework_1.exercise03.mysolutionb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLoggerOne implements DummyLogger{

    @Override
    public void sayHello() {
        log.info("Hello, I'm firstDummyLogger.");
    }
}
