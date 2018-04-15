package com.problem.algorithms.BitManipulation;

/**
 * find the Complement Number
 */
public class Problem476 {
    public int findComplement(int num) {
        int a = 1;
        while (num >= a){
            a = a << 1;
        }
        return a - 1 - num;
    }

    public static void main(String[] args) {
        Problem476 p = new Problem476();
//        System.out.println(p.findComplement(8));
        System.out.println(Integer.MAX_VALUE);
    }
}
