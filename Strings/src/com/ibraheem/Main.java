package com.ibraheem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingONumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G40", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71"
        );

        List<String> gNumbers = new ArrayList<>();

        someBingONumbers.forEach(number ->{
            if(number.toUpperCase().startsWith("G")){
                gNumbers.add(number);
            }
        });
        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
        gNumbers.forEach((String s) ->System.out.println(s));
    }
}
