package com.example.springhomework_1.exercise02.mysolution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DummyLogger {
    public void sayHello(){
        log.info("Hello from DummyLogger");
    }
}
