package com.problem.algorithms.BitManipulation;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class Problem136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
