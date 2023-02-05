package pt.visualnuts.util;

import java.util.*;

public class NumberUtil {
    public static Map<String, List<Integer>> printNumbers(int pValue){

        HashMap<String, List<Integer>> numbersMap = new HashMap<>();
        List<Integer> divisibleBy3List = new ArrayList<>();
        List<Integer> divisibleBy5List = new ArrayList<>();
        List<Integer> divisibleBy3And5List = new ArrayList<>();

        if(Objects.nonNull(pValue) && Integer.signum(pValue) == 1) {

            for (int i = 1; i <= pValue; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Visual Nuts");
                    divisibleBy3And5List.add(i);
                } else if (i % 3 == 0) {
                    System.out.println("Visual");
                    divisibleBy3List.add(i);
                } else if (i % 5 == 0) {
                    System.out.println("Nuts");
                    divisibleBy5List.add(i);
                }

                numbersMap.put("both", divisibleBy3And5List);
                numbersMap.put("five", divisibleBy5List);
                numbersMap.put("three", divisibleBy3List);
            }
        }

        return numbersMap;
    }
}
