package com.example.springhomework_1.exercise03.mysolution;

import org.springframework.stereotype.Component;

@Component
public class SecondApple implements DummyLogger{

    @Override
    public void sayHello() {
        System.out.println("Hello I'm the second apple.");
    }
}
