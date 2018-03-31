package com.problem.algorithms;

/**
 * Hamming Distance
 */
public class Problem461 {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int count = 0;
        while (res != 0){
            if (res % 2 == 0)
                count++;
            res = res >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Problem461 p = new Problem461();
        int count = p.hammingDistance(1, 4);
        System.out.println(count);
    }
}
