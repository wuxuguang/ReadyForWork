package com.problem.algorithms;

/**
 * Divide Two Integers
 */
public class Problem29 {
    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            return dividend > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        if (divisor == -1 && dividend == Integer.MIN_VALUE)
            return Integer.MAX_VALUE;
        int sign = 1;
        if (dividend < 0 && divisor > 0)
            sign = -1;
        if (dividend > 0 && divisor < 0)
            sign = -1;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        if (a < b)
            return 0;
        int result = 0;
        while (a >= b) {
            int shift = 0;
            while (a >= (b << shift ))
                shift++;
            result += 1 << (shift - 1);
            a -= (b << (shift - 1));
        }
        return result * sign;
    }


    public static void main(String[] args) {
        Problem29 p = new Problem29();
//        System.out.println(Integer.MIN_VALUE == -2147483648);
        System.out.println(p.divide(28, 3));
    }
}
