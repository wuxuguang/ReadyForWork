package com.problem.algorithms.BitManipulation;

public class Problem191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Problem191 p = new Problem191();
        System.out.println(p.hammingWeight(5));
    }
}
