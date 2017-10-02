package com.problem.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 78
 */
public class Subsets {
    public static List<List<Integer>> subSets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrace(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    public static void backtrace(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<Integer>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrace(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        List<List<Integer>> result = subSets(a);
    }

}
