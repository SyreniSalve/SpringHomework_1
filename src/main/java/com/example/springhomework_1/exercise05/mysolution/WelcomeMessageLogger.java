package com.example.springhomework_1.exercise05.mysolution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@PropertySource("classpath:application.properties")
public class WelcomeMessageLogger {

    @Value("${pl.sdacademy.welcome.text.value}") // kodėl negaliu uždėti naujos vertės? Nes apllication.propertie failui
    //pirmenybė? Bandžiau "${pl.sdacademy.welcome.text.value:Hi}", bet vis tiek meta defaultinę reikšmę "none".
    private String text;

    @Value("${pl.sdacademy.welcome.text.enable}")
    private boolean shouldLog;

    public String saySomething(){
        if (shouldLog) {
            return text;
        }
            return "pl.sdacademy.welcome.text.enable is false.";
    }

//    @Scheduled(fixedDelay = 1000)
    public void greeting(){
        System.out.println(saySomething());
    }
}
