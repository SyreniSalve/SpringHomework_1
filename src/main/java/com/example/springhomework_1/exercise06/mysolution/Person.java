package com.example.springhomework_1.exercise06.mysolution;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
@Getter
@Setter
public class Person implements CommandLineRunner {

    @NotNull
    @Email
    private String email;

    private String firstName;

    @NotNull
    @Size(min = 3, max = 20)
    private String lastName;

    @NotNull
    @Pattern(regexp = "[^0-9]*") // /[a-zA-Z]+\s[0-9]+/g
    private String address;

    @NotNull
    @Min(value = 18)
    private int age;

    @NotEmpty
    private List<String> values;

    @Value("${pl.sdacademy.zad6.values}")
    private String allValues;

    @NotEmpty
    private List<String> customAttributes;

    @Value("${pl.sdacademy.zad6.custom-attributes}")
    private String allCustomAttributes;

    private void fromStringToArray(List<String> collection, String stringsLine) {
        String[] newArr = stringsLine.split(",");
        collection.addAll(Arrays.asList(newArr));
    }

    public Person(@Value("${pl.sdacademy.zad6.email}") final String email,
                  @Value("${pl.sdacademy.zad6.first-name}") final String firstName,
                  @Value("${pl.sdacademy.zad6.last-name}") final String lastName,
                  @Value("${pl.sdacademy.zad6.address}") final String address,
                  @Value("${pl.sdacademy.zad6.age}") final int age,
                  List<String> values,
                  List<String> customAttributes) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.values = values;
        this.customAttributes = customAttributes;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(email);
        log.info(firstName);
        log.info(lastName);
        log.info(address);
        log.info(String.valueOf(age));
        fromStringToArray(values, this.allValues);
        log.info(String.valueOf(values));
        fromStringToArray(customAttributes, this.allCustomAttributes);
        log.info(String.valueOf(customAttributes));

    }
}
