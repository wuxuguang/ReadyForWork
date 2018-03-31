package com.problem.algorithms.BitManipulation;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 */
public class Problem342 {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
    }


    public static void main(String[] args) {
        Problem342 p = new Problem342();
        boolean res = p.isPowerOfFour(16);
        System.out.println(res);
    }
}
