package com.example.springhomework_1.exercise04.mysolution;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UtilConfiguration {

    @Bean
    public DummyLoggerFour dummyLoggerFour(){
        return new DummyLoggerFour();
    }

    @Bean()
    public ListUtil listUtility(){
        return new ListUtil();
    }

    @Bean(name = "stringUtil")
    public StringUtil stringUtility(){
        return new StringUtil();
    }

}