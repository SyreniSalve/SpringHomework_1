package com.example.springhomework_1.exercise01.mysolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DummyLogger1 {

    @Autowired
    public void helloText(){
        System.out.println("Hello from task1");
    }
}
