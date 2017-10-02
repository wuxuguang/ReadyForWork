package com.problem.algorithms;

/**
 * Remove 9 Problem
 */
public class Prolem660 {
    public int newInteger(int n) {
        int extra = 0;
        while (!(9 * extra <= n && n <= 9 * extra + 8))
            extra++;
        return n + extra;
    }


    public static void main(String[] args) {
        Prolem660 p = new Prolem660();
        System.out.println(p.newInteger(38));
    }
}
