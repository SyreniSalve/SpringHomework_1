package com.example.springhomework_1.exercise04.mysolution;

import java.util.List;

public class ListUtil {

    public int sumElements(final List<Integer> ints){
        return ints.stream().reduce(0, Integer::sum);
    }
}
