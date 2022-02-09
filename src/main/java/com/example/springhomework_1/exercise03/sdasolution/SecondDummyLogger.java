package com.example.springhomework_1.exercise03.sdasolution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SecondDummyLogger implements DummyLogger{

    @Override
    public void sayHello() {
        log.info("From SecondDummyLogger");
    }
}
