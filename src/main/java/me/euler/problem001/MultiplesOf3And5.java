package me.euler.problem001;

/**
 * @author elric.wang
 */
public class MultiplesOf3And5 {

    private final int max;

    public MultiplesOf3And5(int max) {
        this.max = max;
    }

    public int calSumOfMultiples() {
        int multiplesOf3 = sumOfMultiplesOfNumber(3);
        int multiplesOf5 = sumOfMultiplesOfNumber(5);
        int both = 3 * 5;
        int multiplesOfBoth = sumOfMultiplesOfNumber(both);
        return multiplesOf3 + multiplesOf5 - multiplesOfBoth;
    }

    private int sumOfMultiplesOfNumber(int num) {
        int sum = 0;
        int multiples = num;
        while (multiples < max) {
            sum += multiples;
            multiples += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new MultiplesOf3And5(1000).calSumOfMultiples());
    }

}
