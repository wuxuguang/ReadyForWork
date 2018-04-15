package com.problem.algorithms.BitManipulation;

/**
 * Missing Number
 */
public class Problem268 {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int r1 = 0;
        for (int i = 0; i < max + 1; i++) {
            r1 = r1 ^ i;
        }
        int r2 = 0;
        for (int i = 0; i < max; i++) {
            r2 = r2 ^ nums[i];
        }
        return r1 ^ r2;
    }

    public static void main(String[] args) {
        Problem268 p = new Problem268();
        int res = p.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(res);
    }
}
