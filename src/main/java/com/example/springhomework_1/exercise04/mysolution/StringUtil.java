package com.example.springhomework_1.exercise04.mysolution;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public String fromSentence(final List<String> words){
        return words.stream().collect(Collectors.joining(" ", "", "."));
    }
}
