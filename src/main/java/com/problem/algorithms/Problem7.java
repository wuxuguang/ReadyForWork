package com.problem.algorithms;

public class Problem7 {
    public int reverse(int x) {
        long res = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (x != 0) {
            res = res * 10 + x % 10;
            if (res > max || res < min)
                return 0;
            x = x /10;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        Problem7 p = new Problem7();
        System.out.println(p.reverse(-321));
    }
}
