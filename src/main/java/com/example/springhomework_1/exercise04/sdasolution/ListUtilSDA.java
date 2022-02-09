package com.example.springhomework_1.exercise04.sdasolution;

import java.util.List;

public class ListUtilSDA {

    public int sumElements(final List<Integer> ints){
        return ints.stream().reduce(0, Integer::sum);
    }
}
