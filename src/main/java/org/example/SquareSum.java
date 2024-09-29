package org.example;

public class SquareSum {
    public static void main(String[] args) {
        int result = squareSum(new int[]{5,3,2});
        System.out.println(result);

    }
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += num * num;
        }
        return sum;
    }
}
