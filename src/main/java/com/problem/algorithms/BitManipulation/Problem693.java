package com.problem.algorithms.BitManipulation;

/**
 * Binary Number with Alternating Bits
 */
public class Problem693 {

    public boolean hasAlternatingBits(int n) {
        int first = 0, end = 0;
        int count = 0;
        while (n != 0) {
            if (count % 2 ==0)
                first = n & 1;
            else
                end  = n & 1;
            if (count > 0 && (first ^ end) == 0)
                return false;
            count++;
            n = n >> 1;
        }
        return (first ^ end) == 1;
    }


    public static void main(String[] args) {
        Problem693 p = new Problem693();
        System.out.println(p.hasAlternatingBits(10));
    }
}
