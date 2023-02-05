package pt.visualnuts.util;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberUtilTest {

    @Test
    void printNumbersSuccess(){
        Map<String, List<Integer>> numbersMap = NumberUtil.printNumbers(100);
        assertNotNull(numbersMap);
        assertTrue(!numbersMap.isEmpty());
        assertTrue(!numbersMap.get("both").isEmpty());
        assertTrue(!numbersMap.get("five").isEmpty());
        assertTrue(!numbersMap.get("three").isEmpty());
    }

    @Test
    void printNumbersInvalidNumber(){
        Map<String, List<Integer>> numbersMap = NumberUtil.printNumbers(-100);
        assertNotNull(numbersMap);
        assertTrue(numbersMap.isEmpty());
    }

    @Test
    void printNumbersInvalidZero(){
        Map<String, List<Integer>> numbersMap = NumberUtil.printNumbers(0);
        assertNotNull(numbersMap);
        assertTrue(numbersMap.isEmpty());
    }
}