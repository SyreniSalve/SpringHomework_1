package com.example.springhomework_1.exercise02.sdasolution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLoggerSolution {

    public void sayHello(){
        log.info("hello from DummyLogger");
    }
}
