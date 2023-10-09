package org.java.forloops;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ForLoopPractice {
    List<String> countries = Arrays.asList("India", "China", "Pakistan", "Srilanka", "Australia");

    @Test
    public void normalForLoop() {
        for (int i = 0; i<countries.size(); i++)
            System.out.println(countries.get(i));
    }

    @Test
    public void enhancedForLoop() {
        for (String country : countries)
            System.out.println(country);
    }

    @Test
    public void forEachLoop() {
        countries.forEach(country -> System.out.println(country));
    }
}

/*
    different for loops:
    1. normal for loop [it falls to external loops]
    2. enhanced for loop [it falls to external loops]
    3. forEach loop(introduced in Java8) [it falls to internal loops]
*/
