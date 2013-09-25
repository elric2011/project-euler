package me.euler.problem001;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @author elric.wang
 */
public class MultiplesOf3And5Test {

    private Map<Integer, Integer> inputOutputMap;

    @Before
    public void init() {
        inputOutputMap = new HashMap<Integer, Integer>();
        inputOutputMap.put(4, 3);
        inputOutputMap.put(5, 3);
        inputOutputMap.put(6, 8);
        inputOutputMap.put(10, 23);
        inputOutputMap.put(15, 23 + 10 + 12);
        inputOutputMap.put(16, 23 + 10 + 12 + 15);
    }

    @Test
    public void shouldCalculateTheSumOfMultiples() {
        for (int input : inputOutputMap.keySet()) {
            int sumOfMultiples = calMultiples(input);
            int expectedOutput = inputOutputMap.get(input);
            assertEquals(expectedOutput, sumOfMultiples);
        }
    }

    private int calMultiples(int input) {
        MultiplesOf3And5 multiplesOf3And5 = new MultiplesOf3And5(input);
        return multiplesOf3And5.calSumOfMultiples();
    }

}
