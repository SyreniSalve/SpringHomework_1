package com.example.springhomework_1.exercise04.sdasolution;

import com.example.springhomework_1.exercise04.mysolution.DummyLoggerFour;
import com.example.springhomework_1.exercise04.mysolution.ListUtil;
import com.example.springhomework_1.exercise04.mysolution.StringUtil;
import org.springframework.context.annotation.Bean;

public class UtilConfigurationSDA {

    @Bean
    public DummyLoggerFour dummyLoggerFour(){
        return new DummyLoggerFour();
    }

    @Bean()
    public ListUtil listUtility(){
        return new ListUtil();
    }

    @Bean(name = "stringUtility")
    public StringUtil stringUtil(){
        return new StringUtil();
    }
}
