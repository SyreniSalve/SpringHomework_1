package com.example.springhomework_1.exercise05.sdasolution;

import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.lang.Boolean.TRUE;

@Component
@Slf4j
public class WelcomeMessageLoggerSDA implements CommandLineRunner {

    private String text;

    private Boolean shouldLog;

    public WelcomeMessageLoggerSDA(@Value("${pl.sdacademy.welcome.text.value}") final String text,
                                   @Value("${pl.sdacademy.welcome.text.enable}") final boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

    @Override
    public void run(String... args) throws Exception {
        if (TRUE.equals(shouldLog)){
            log.info(text);
        }
    }
}
