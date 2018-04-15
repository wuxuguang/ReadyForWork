package com.problem.algorithms.BitManipulation;

/**
 * Power of Two
 */
public class Problem231 {
    public boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }


    public static void main(String[] args) {
        Problem231 p = new Problem231();
        System.out.println(p.isPowerOfTwo(5));
    }
}
